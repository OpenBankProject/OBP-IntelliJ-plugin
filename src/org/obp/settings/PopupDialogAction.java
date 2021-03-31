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
        String escapeCode = null;
        try {
            escapeCode = URIUtil.encodeQuery("def hello = println(\"Hello, world!\")");
        } catch (URIException e) {
            e.printStackTrace();
        }

        PushCodeDialog pushCodeDialog = new PushCodeDialog(escapeCode);

        if (pushCodeDialog.showAndGet()) {


            try {
                Unirest.setTimeouts(0, 0);
                ModelParams modelParams = AppSettingsState.getInstance().getModelParams();

                HttpResponse<String> tokenResponce = Unirest.post(modelParams.getHost() + "/my/logins/direct")
                        .header("Content-Type", "application/json")
                        .header("Authorization", " DirectLogin username=\"" + modelParams.getLogin() + "\",password=\"" + modelParams.getPassword() + "\",consumer_key=\"" + modelParams.getConsumerKey() + "\"")
                        //  .header("Cookie", "JSESSIONID=node04oiowjti87aa3z7iksnpkg619930.node0")
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
                json.put("method_name", "checkExternalUserExists").put("method_body", "%20%20%20%20%20%20Future.successful%28%0A%20%20%20%20%20%20%20%20Full%28%28BankCommons%28%0A%20%20%20%20%20%20%20%20%20%20BankId%28%22Hello%20bank%20id%22%29%2C%0A%20%20%20%20%20%20%20%20%20%20%221%22%2C%0A%20%20%20%20%20%20%20%20%20%20%221%22%2C%0A%20%20%20%20%20%20%20%20%20%20%221%22%2C%0A%20%20%20%20%20%20%20%20%20%20%221%22%2C%0A%20%20%20%20%20%20%20%20%20%20%221%22%2C%0A%20%20%20%20%20%20%20%20%20%20%221%22%2C%0A%20%20%20%20%20%20%20%20%20%20%221%22%2C%0A%20%20%20%20%20%20%20%20%20%20%228%22%0A%20%20%20%20%20%20%20%20%29%2C%20None%29%29%0A%20%20%20%20%20%20%29");


                HttpResponse<String> putMethodResponce = Unirest.put(modelParams.getHost() + "/obp/v4.0.0/management/connector-methods/"+connector_method_id)
                        .header("Authorization", "DirectLogintoken=" + token)
                        .header("Content-Type", "application/json")
                        //.header("Cookie", "JSESSIONID=node0umackg1zhun41xye364x7ghtl10069.node0")
                        .body(json.toString())
                        .asString();


                Messages.showMessageDialog(currentProject, putMethodResponce.getBody(), dlgTitle, Messages.getInformationIcon());


            } catch (UnirestException e) {
                Messages.showMessageDialog(currentProject, e.getMessage(), dlgTitle, Messages.getInformationIcon());
            } catch (RuntimeException re) {
                Messages.showMessageDialog(currentProject, re.getMessage(), dlgTitle, Messages.getInformationIcon());

            }
        }


    }


}
