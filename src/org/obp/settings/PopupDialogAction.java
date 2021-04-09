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
        event.getPresentation().setEnabledAndVisible(selectedText!=null);
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
                String methodBodyEscapedCode = URIUtil.encodePath(selectedText);
                String connectorMethodName = pushCodeDialog.getFunctionName(); 

                Unirest.setTimeouts(0, 0);
                ModelParams modelParams = AppSettingsState.getInstance().getModelParams();

                HttpResponse<String> directLoginTokenResponse = Unirest.post(modelParams.getHost() + "/my/logins/direct")
                        .header("Content-Type", "application/json")
                        .header("Authorization", " DirectLogin username=\"" + modelParams.getLogin() + "\",password=\"" + modelParams.getPassword() + "\",consumer_key=\"" + modelParams.getConsumerKey() + "\"")
                        .asString();

                if (directLoginTokenResponse.getStatus() != 201) {
                    Messages.showMessageDialog(currentProject, String.valueOf(directLoginTokenResponse.getBody()), dlgTitle, Messages.getInformationIcon());
                    return;
                }
                
                JSONObject jsonToken = new JSONObject(directLoginTokenResponse.getBody());
                String directLoginToken = (String) jsonToken.get("token");
                

                HttpResponse<String> getAllConnectorMethodsResponse = Unirest.get(modelParams.getHost()+"/obp/v4.0.0/management/connector-methods")
                        .header("Authorization", "DirectLogintoken="+directLoginToken)
                        .header("Content-Type", "application/json")
                        .asString();

                if (getAllConnectorMethodsResponse.getStatus()!=200){
                    Messages.showMessageDialog(currentProject, getAllConnectorMethodsResponse.getBody(), dlgTitle, Messages.getInformationIcon());
                    return;
                }

                JSONObject connectorMethodsJson=new JSONObject(getAllConnectorMethodsResponse.getBody());
                JSONArray connectorMethodsJonArray = connectorMethodsJson.getJSONArray("connector_methods");
                
                
                String connectorMethodId = ParsingUtil.getConnectorMethodIdFromJSONArray(connectorMethodName, connectorMethodsJonArray);
                
                //If the connectorMethodId isEmpty, we will create the new connector method 
                if(connectorMethodId.isEmpty()){
                    JSONObject json = new JSONObject();
                    json.put("method_name", connectorMethodName).put("method_body", methodBodyEscapedCode);

                    HttpResponse<String> postConnectorMethodResponse = Unirest.post(modelParams.getHost() + "/obp/v4.0.0/management/connector-methods")
                            .header("Authorization", "DirectLogintoken=" + directLoginToken)
                            .header("Content-Type", "application/json")
                            .body(json.toString())
                            .asString();

                    Messages.showMessageDialog(currentProject, postConnectorMethodResponse.getBody(), dlgTitle, Messages.getInformationIcon()); 
                } else { //if the connectorMethodId is existing, we will update the current connector method.
                    JSONObject json = new JSONObject();
                    json.put("method_body", methodBodyEscapedCode);

                    HttpResponse<String> putConnectorMethodResponse = Unirest.put(modelParams.getHost() + "/obp/v4.0.0/management/connector-methods/" + connectorMethodId)
                            .header("Authorization", "DirectLogintoken=" + directLoginToken)
                            .header("Content-Type", "application/json")
                            .body(json.toString())
                            .asString();

                    Messages.showMessageDialog(currentProject, putConnectorMethodResponse.getBody(), dlgTitle, Messages.getInformationIcon());
                }

            } catch (Exception e) {
                Messages.showMessageDialog(currentProject, e.getMessage(), dlgTitle, Messages.getInformationIcon());

            }
        }
    }
}
