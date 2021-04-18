package org.obp.settings;


import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Caret;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogBuilder;
import com.intellij.openapi.ui.Messages;
import com.intellij.pom.Navigatable;


import com.mashape.unirest.http.exceptions.UnirestException;
import org.apache.commons.httpclient.util.URIUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import org.json.JSONArray;
import org.json.JSONObject;
import org.obp.ui.PushCodeDialog;
import org.obp.util.ParsingUtil;

import javax.swing.*;

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


        String selectedMethodBody = ParsingUtil.removeMethodSignature(primaryCaret.getSelectedText());

        PushCodeDialog pushCodeDialog = new PushCodeDialog(primaryCaret.getSelectedText());

        if (pushCodeDialog.showAndGet()) {


            try {
                String methodBodyEscapedCode = URIUtil.encodePath(selectedMethodBody);
                String connectorMethodName = pushCodeDialog.getFunctionName();

                Unirest.setTimeouts(0, 0);
                ModelParams modelParams = AppSettingsState.getInstance().getModelParams();
                String host = modelParams.getHost();
                String login = modelParams.getLogin();
                String password = modelParams.getPassword();


                HttpResponse<String> directLoginTokenResponse = getLoginTokenResponse(modelParams, host, login, password);

                if (directLoginTokenResponse.getStatus() != 201) {
                    Messages.showMessageDialog(currentProject, String.valueOf(directLoginTokenResponse.getBody()), dlgTitle, Messages.getInformationIcon());
                    return;
                }

                JSONObject jsonToken = new JSONObject(directLoginTokenResponse.getBody());
                String directLoginToken = (String) jsonToken.get("token");


                HttpResponse<String> connectionMethodResponse = getIfMethodExistsResponse(host, directLoginToken);

                if (connectionMethodResponse.getStatus() != 200) {
                    Messages.showMessageDialog(currentProject, connectionMethodResponse.getBody(), dlgTitle, Messages.getInformationIcon());
                    return;
                }

                JSONObject connectorMethodsJson = new JSONObject(connectionMethodResponse.getBody());
                JSONArray connectorMethodsJonArray = connectorMethodsJson.getJSONArray("connector_methods");


                String connectorMethodId = ParsingUtil.getConnectorMethodIdFromJSONArray(connectorMethodName, connectorMethodsJonArray);

                //If the connectorMethodId isEmpty, we will create the new connector method 
                if (connectorMethodId.isEmpty()) {
                    HttpResponse<String> postConnectorMethodResponse = putNewConnectionMethod(methodBodyEscapedCode, connectorMethodName, host, directLoginToken);

                    Messages.showMessageDialog(currentProject, postConnectorMethodResponse.getBody(), dlgTitle, Messages.getInformationIcon());
                } else { //if the connectorMethodId is existing, we will update the current connector method.
                    HttpResponse<String> putConnectorMethodResponse = updateExistingMethodResponse(methodBodyEscapedCode, host, directLoginToken, connectorMethodId);

                    String responseBodyStr = putConnectorMethodResponse.getBody();
                    JSONObject responseBodyJson = new JSONObject(responseBodyStr);
                    if (putConnectorMethodResponse.getStatus() == 200) {
                        String successfulMethodName = (String) responseBodyJson.get("method_name");

                        Messages.showMessageDialog(currentProject, "Method " + successfulMethodName + " is loaded successful", dlgTitle, Messages.getInformationIcon());

                    } else {
                        JTextArea showMessageTextArea = createProblemDialog(responseBodyJson);
                        DialogBuilder db = new DialogBuilder();

                        db.setCenterPanel(showMessageTextArea);
                        db.setTitle("Problem");
                        db.removeAllActions();
                        db.addOkAction();
                        db.show();

                    }
                }

            } catch (Exception e) {
                Messages.showMessageDialog(currentProject, e.getMessage(), dlgTitle, Messages.getInformationIcon());

            }
        }
    }

    private HttpResponse<String> updateExistingMethodResponse(String methodBodyEscapedCode, String host, String directLoginToken, String connectorMethodId) throws UnirestException {
        JSONObject json = new JSONObject();
        json.put("method_body", methodBodyEscapedCode);

        HttpResponse<String> putConnectorMethodResponse = Unirest.put(host + "/obp/v4.0.0/management/connector-methods/" + connectorMethodId)
                .header("Authorization", "DirectLogintoken=" + directLoginToken)
                .header("Content-Type", "application/json")
                .body(json.toString())
                .asString();
        return putConnectorMethodResponse;
    }

    private HttpResponse<String> putNewConnectionMethod(String methodBodyEscapedCode, String connectorMethodName, String host, String directLoginToken) throws UnirestException {
        JSONObject json = new JSONObject();
        json.put("method_name", connectorMethodName).put("method_body", methodBodyEscapedCode);

        HttpResponse<String> postConnectorMethodResponse = Unirest.post(host + "/obp/v4.0.0/management/connector-methods")
                .header("Authorization", "DirectLogintoken=" + directLoginToken)
                .header("Content-Type", "application/json")
                .body(json.toString())
                .asString();
        return postConnectorMethodResponse;
    }

    private HttpResponse<String> getIfMethodExistsResponse(String host, String directLoginToken) throws UnirestException {
        return Unirest.get(host + "/obp/v4.0.0/management/connector-methods")
                .header("Authorization", "DirectLogintoken=" + directLoginToken)
                .header("Content-Type", "application/json")
                .asString();
    }

    private HttpResponse<String> getLoginTokenResponse(ModelParams modelParams, String host, String login, String password) throws UnirestException {
        return Unirest.post(host + "/my/logins/direct")
                .header("Content-Type", "application/json")
                .header("Authorization", " DirectLogin username=\"" + login + "\",password=\"" + password + "\",consumer_key=\"" + modelParams.getConsumerKey() + "\"")
                .asString();
    }

    @NotNull
    private JTextArea createProblemDialog(JSONObject responseBodyJson) {
        JTextArea showMessageTextArea = new JTextArea();

        showMessageTextArea.setEditable(false);
        String message = (String) responseBodyJson.get("message");
        showMessageTextArea.setText(message);
        return showMessageTextArea;
    }
}
