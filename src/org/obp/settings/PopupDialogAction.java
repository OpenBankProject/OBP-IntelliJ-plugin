package org.obp.settings;


import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Caret;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.pom.Navigatable;


import org.apache.commons.httpclient.URIException;
import org.apache.commons.httpclient.util.URIUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

public class PopupDialogAction extends AnAction {

    @Override
    public void update(AnActionEvent e) {
        // Set the availability based on whether a project is open
        Project project = e.getProject();
        e.getPresentation().setEnabledAndVisible(project != null);
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



        String selectedText = primaryCaret.getSelectedText();
        PushCodeDialog pushCodeDialog = new PushCodeDialog(selectedText);

        if (pushCodeDialog.showAndGet()) {


            try {
                String escapeCode = null;
                escapeCode = URIUtil.encodeQuery(selectedText);
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

                HttpResponse<String> methodIDResponce = Unirest.get("https://test.openbankproject.com/obp/v4.0.0/management/connector-methods")
                        .header("Authorization", "DirectLogintoken=eyJhbGciOiJIUzI1NiJ9.eyIiOiIifQ.xe95UT3ZvjUC-BXjtk6rGQuUeJfyyIS1Ha5XsUaRdr0")
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
                json.put("method_name", pushCodeDialog.getFunctionNameText()).put("method_body", escapeCode);


                HttpResponse<String> putMethodResponce = Unirest.put(modelParams.getHost() + "/obp/v4.0.0/management/connector-methods/"+connector_method_id)
                        .header("Authorization", "DirectLogintoken=" + token)
                        .header("Content-Type", "application/json")
                        .body(json.toString())
                        .asString();


                Messages.showMessageDialog(currentProject, putMethodResponce.getBody(), dlgTitle, Messages.getInformationIcon());


            } catch (Exception e) {
                Messages.showMessageDialog(currentProject, e.getMessage(), dlgTitle, Messages.getInformationIcon());

            }
        }


    }


}
