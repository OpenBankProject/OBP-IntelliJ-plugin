package org.obp.settings;


import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Caret;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.pom.Navigatable;


import org.apache.commons.httpclient.util.URIUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import org.json.JSONArray;
import org.json.JSONObject;
import org.obp.util.ParsingUtil;

public class PopupDialogAction extends AnAction {

    @Override
    public void update(AnActionEvent event) {
        // Set the availability based on whether a project is open
        Project project = event.getProject();
        @Nullable Navigatable nav = event.getData(CommonDataKeys.NAVIGATABLE);
        AppSettingsState instance = AppSettingsState.getInstance();

        // Get all the required data from data keys
        final Editor editor = event.getRequiredData(CommonDataKeys.EDITOR);


        // Work off of the primary caret to get the selection info
        Caret primaryCaret = editor.getCaretModel().getPrimaryCaret();



        String selectedText = primaryCaret.getSelectedText();
        event.getPresentation().setEnabledAndVisible(selectedText != null);
    }



    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {
        // Using the event, create and show a dialog
        Project currentProject = event.getProject();

        String dlgTitle = event.getPresentation().getDescription();
        // If an element is selected in the editor, add info about it.
        @Nullable Navigatable nav = event.getData(CommonDataKeys.NAVIGATABLE);
        AppSettingsState instance = AppSettingsState.getInstance();

        // Get all the required data from data keys
        final Editor editor = event.getRequiredData(CommonDataKeys.EDITOR);


        // Work off of the primary caret to get the selection info
        Caret primaryCaret = editor.getCaretModel().getPrimaryCaret();



        String selectedText = ParsingUtil.removeOverrideKeyWord(primaryCaret.getSelectedText());

        PushCodeDialog pushCodeDialog = new PushCodeDialog(selectedText);

        if (pushCodeDialog.showAndGet()) {


            try {
                String escapeCode = null;
                escapeCode = URIUtil.encodePath(selectedText);

                Unirest.setTimeouts(0, 0);
                ModelParams modelParams = AppSettingsState.getInstance().getModelParams();

                HttpResponse<String> tokenResponce = Unirest.post(modelParams.getHost() + "/my/logins/direct")
                        .header("Content-Type", "application/json")
                        .header("Authorization", " DirectLogin username=\"" + modelParams.getLogin() + "\",password=\"" + modelParams.getPassword() + "\",consumer_key=\"" + modelParams.getConsumerKey() + "\"")
                        .asString();


                JSONObject jsonToken = new JSONObject(tokenResponce.getBody().toString());
                if (tokenResponce.getStatus() != 201) {
                    Messages.showMessageDialog(currentProject, String.valueOf(jsonToken.get("message")), dlgTitle, Messages.getInformationIcon());
                    return;
                }

                String token = (String) jsonToken.get("token");

                HttpResponse<String> methodIDResponce = Unirest.get(modelParams.getHost()+"/obp/v4.0.0/management/connector-methods")
                        .header("Authorization", "DirectLogintoken="+token)
                        .header("Content-Type", "application/json")
                        .asString();

                if (methodIDResponce.getStatus()!=200){
                    Messages.showMessageDialog(currentProject, String.valueOf(jsonToken.get("message")), dlgTitle, Messages.getInformationIcon());
                    return;
                }

                JSONObject methodIDJson=new JSONObject(methodIDResponce.getBody());
                JSONArray connector_methods = methodIDJson.getJSONArray("connector_methods");
                JSONObject connectorIDJson = (JSONObject) connector_methods.get(0);
                String connector_method_id = (String) connectorIDJson.get("connector_method_id");
                JSONObject json = new JSONObject();
                json.put("method_name", pushCodeDialog.getFunctionName()).put("method_body", escapeCode);


                HttpResponse<String> putMethodResponse = Unirest.put(modelParams.getHost() + "/obp/v4.0.0/management/connector-methods/"+connector_method_id)
                        .header("Authorization", "DirectLogintoken=" + token)
                        .header("Content-Type", "application/json")
                        .body(json.toString())
                        .asString();


                Messages.showMessageDialog(currentProject, putMethodResponse.getBody(), dlgTitle, Messages.getInformationIcon());


            } catch (Exception e) {
                Messages.showMessageDialog(currentProject, e.getMessage(), dlgTitle, Messages.getInformationIcon());

            }
        }
    }
}
