package obp.settings.mainaction;


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
import obp.settings.scalaparsing.FoundMethodsVisitor;
import obp.settings.scalaparsing.ScalaFunction;
import obp.settings.settings.AppSettingsState;
import obp.settings.settings.ModelParams;
import obp.settings.util.ParsingUtil;
import org.apache.commons.httpclient.util.URIUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import org.json.JSONArray;
import org.json.JSONObject;



import javax.swing.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PopupDialogAction extends AnAction {
    private Map<MethodSendingType, IProcessMessagesStrategy> MESSAGE_TYPE_TO_METHOD_MAPPING = new HashMap<MethodSendingType, IProcessMessagesStrategy>();

    public PopupDialogAction() {

        MESSAGE_TYPE_TO_METHOD_MAPPING.put(MethodSendingType.METHOD_IS_SENDING_SUCCESSFUL, (MethodSendingResult result) -> {
            showMethodSuccessfullyAddedDialog(result.getProject(), result.getTitle(), result.getMessage());
        });
        MESSAGE_TYPE_TO_METHOD_MAPPING.put(MethodSendingType.METHOD_COMPILATION_ERROR, (MethodSendingResult result) -> {
            showMethodCompilationErrorDialog(result.getTitle(), result.getMessage());
        });
        MESSAGE_TYPE_TO_METHOD_MAPPING.put(MethodSendingType.UNSUCCESSFUL_PROCESS, (MethodSendingResult result) -> {
            showTheProblemMessage(result.getProject(), result.getTitle(), result.getMessage());
        });
    }

    @Override
    public void update(AnActionEvent event) {
        
    }


    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {
        // Using the event, create and show a dialog
        Project currentProject = event.getProject();

        String title = event.getPresentation().getDescription();
        // If an element is selected in the editor, add info about it.
        @Nullable Navigatable nav = event.getData(CommonDataKeys.NAVIGATABLE);
        AppSettingsState instance = AppSettingsState.getInstance();

        // Get all the required data from data keys
        final Editor editor = event.getRequiredData(CommonDataKeys.EDITOR);


        // Work off of the primary caret to get the selection info
        Caret primaryCaret = editor.getCaretModel().getPrimaryCaret();
        try {
            List<ScalaFunction> scalaFunctions = FoundMethodsVisitor.parseScalaFunction(primaryCaret.getSelectedText());
            ModelParams modelParams = AppSettingsState.getInstance().getModelParams();
            String host = modelParams.getHost();
            String login = modelParams.getLog();
            String password = modelParams.getPas();
            String consumerKey = modelParams.getConsumerKey();


            if (scalaFunctions.size() <= 1) {
                String selectedMethodBody = ParsingUtil.removeMethodSignature(primaryCaret.getSelectedText());

                PushCodeDialog pushCodeDialog = new PushCodeDialog(primaryCaret.getSelectedText());

                if (pushCodeDialog.showAndGet()) {
                    String connectorMethodName = pushCodeDialog.getFunctionName();
                    MethodSendingResult methodSendingResult = processSendingSelectedCode(currentProject, title, host, login, password, consumerKey, connectorMethodName, selectedMethodBody);
                    MESSAGE_TYPE_TO_METHOD_MAPPING.get(methodSendingResult.getMethodSendingType()).processMessage(methodSendingResult);
                }

            } else {
                if (new MultiplySelectionDialog(scalaFunctions).showAndGet()) {
                    scalaFunctions.stream().map(scalaFunction -> processSendingSelectedCode(currentProject, title, host,
                            login, password, consumerKey,
                            scalaFunction.getFunctionName(), scalaFunction.getCodeText())).
                            forEach(mse -> MESSAGE_TYPE_TO_METHOD_MAPPING
                                    .get(mse.getMethodSendingType()).processMessage(mse));

                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private MethodSendingResult processSendingSelectedCode(Project project, String title, String host, String login, String password, String consumerKey, String connectorMethodName, String selectedMethodBody) {
        try {
            String methodBodyEscapedCode = URIUtil.encodePath(selectedMethodBody);
            Unirest.setTimeouts(0, 0);
            HttpResponse<String> directLoginTokenResponse = getLoginTokenResponse(host, login, password, consumerKey);

            if (directLoginTokenResponse.getStatus() != 201) {
                //showTheProblemMessage(project, title, String.valueOf(directLoginTokenResponse.getBody()));
                return new MethodSendingResult(MethodSendingType.UNSUCCESSFUL_PROCESS, String.valueOf(directLoginTokenResponse.getBody()), title, project);
            }

            JSONObject jsonToken = new JSONObject(directLoginTokenResponse.getBody());
            String directLoginToken = (String) jsonToken.get("token");


            HttpResponse<String> connectionMethodResponse = getIfMethodExistsResponse(host, directLoginToken);

            if (connectionMethodResponse.getStatus() != 200) {
                //showTheProblemMessage(project, title, connectionMethodResponse.getBody());
                return new MethodSendingResult(MethodSendingType.UNSUCCESSFUL_PROCESS, String.valueOf(directLoginTokenResponse.getBody()), title, project);
            }

            JSONObject connectorMethodsJson = new JSONObject(connectionMethodResponse.getBody());
            JSONArray connectorMethodsJonArray = connectorMethodsJson.getJSONArray("connector_methods");


            String connectorMethodId = ParsingUtil.getConnectorMethodIdFromJSONArray(connectorMethodName, connectorMethodsJonArray);

            //If the connectorMethodId isEmpty, we will create the new connector method
            if (connectorMethodId.isEmpty()) {
                HttpResponse<String> postConnectorMethodResponse = putNewConnectionMethod(methodBodyEscapedCode, connectorMethodName, host, directLoginToken);
                String responseBodyStr = postConnectorMethodResponse.getBody();
                JSONObject responseBodyJson = new JSONObject(responseBodyStr);

                if (postConnectorMethodResponse.getStatus() == 200) {
                    String successfulMethodName = (String) responseBodyJson.get("method_name");
                    //showMethodSuccessfullyAddedDialog(project, title, successfulMethodName);
                    return new MethodSendingResult(MethodSendingType.METHOD_IS_SENDING_SUCCESSFUL, successfulMethodName, title, project);

                } else {
                    String message = (String) responseBodyJson.get("message");
                    //showMethodCompilationErrorDialog(title, message);
                    return new MethodSendingResult(MethodSendingType.METHOD_COMPILATION_ERROR, message, title, project);

                }
                //    showTheProblemMessage(project, title, postConnectorMethodResponse.getBody());
                //    return new MethodSendingResult(MethodSendingType.UNSUCCESSFUL_PROCESS,String.valueOf(directLoginTokenResponse.getBody()),title);
            } else { //if the connectorMethodId is existing, we will update the current connector method.
                HttpResponse<String> putConnectorMethodResponse = updateExistingMethodResponse(methodBodyEscapedCode, host, directLoginToken, connectorMethodId);

                String responseBodyStr = putConnectorMethodResponse.getBody();
                JSONObject responseBodyJson = new JSONObject(responseBodyStr);
                if (putConnectorMethodResponse.getStatus() == 200) {
                    String successfulMethodName = (String) responseBodyJson.get("method_name");
                    //showMethodSuccessfullyAddedDialog(project, title, successfulMethodName);
                    return new MethodSendingResult(MethodSendingType.METHOD_IS_SENDING_SUCCESSFUL, successfulMethodName, title, project);

                } else {
                    String message = (String) responseBodyJson.get("message");
                    //showMethodCompilationErrorDialog(title, message);
                    return new MethodSendingResult(MethodSendingType.METHOD_COMPILATION_ERROR, message, title, project);

                }
            }

        } catch (Exception e) {
            showTheProblemMessage(project, title, e.getMessage());
            return new MethodSendingResult(MethodSendingType.UNSUCCESSFUL_PROCESS, e.getMessage(), title, project);
        }

    }

    private void showMethodSuccessfullyAddedDialog(Project currentProject, String dlgTitle, String methodName) {


        Messages.showMessageDialog(currentProject, "Method " + methodName + " is loaded successful", dlgTitle, Messages.getInformationIcon());
    }

    private void showMethodCompilationErrorDialog(String title, String message) {

        JTextArea showMessageTextArea = createProblemDialog(message);
        DialogBuilder db = new DialogBuilder();

        db.setCenterPanel(showMessageTextArea);
        db.setTitle("Problem");
        db.removeAllActions();
        db.addOkAction();
        db.show();
    }

    private void showTheProblemMessage(Project currentProject, String title, String message) {
        Messages.showMessageDialog(currentProject, message, title, Messages.getInformationIcon());
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

    private HttpResponse<String> getLoginTokenResponse(String host, String login, String password, String consumerKey) throws UnirestException {
        return Unirest.post(host + "/my/logins/direct")
                .header("Content-Type", "application/json")
                .header("Authorization", " DirectLogin username=\"" + login + "\",password=\"" + password + "\",consumer_key=\"" + consumerKey + "\"")
                .asString();
    }

    @NotNull
    private JTextArea createProblemDialog(String message) {
        JTextArea showMessageTextArea = new JTextArea();

        showMessageTextArea.setEditable(false);

        showMessageTextArea.setText(message);
        return showMessageTextArea;
    }
}
