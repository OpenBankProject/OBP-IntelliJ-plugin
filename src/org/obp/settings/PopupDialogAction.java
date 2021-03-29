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
        String escapeCode= null;
        try {
            escapeCode = URIUtil.encodeQuery("def hello = println(\"Hello, world!\")");
        } catch (URIException e) {
            e.printStackTrace();
        }

        PushCodeDialog pushCodeDialog = new PushCodeDialog(escapeCode);

        if (pushCodeDialog.showAndGet()) {


            try {
                Unirest.setTimeouts(0, 0);
                HttpResponse<String> tokenResponce = Unirest.post("https://test.openbankproject.com/my/logins/direct")
                        .header("Content-Type", "application/json")
                        .header("Authorization", " DirectLogin username=\"vkozhaev\",password=\"Sexboxjazz123!\",consumer_key=\"5esz2enpwpvnismdff5gppkux403b21zd35vigw2\"")
                        .header("Cookie", "JSESSIONID=node04oiowjti87aa3z7iksnpkg619930.node0")
                        .asString();

                JSONObject jsonToken =  new JSONObject(tokenResponce.getBody().toString());

                String token= (String) jsonToken.get("token");
                JSONObject json=new JSONObject();
                json.put("method_name", "checkExternalUserExists").put("method_body", "%20%20%20%20%20%20Future.successful%28%0A%20%20%20%20%20%20%20%20Full%28%28BankCommons%28%0A%20%20%20%20%20%20%20%20%20%20BankId%28%22Hello%20bank%20id%22%29%2C%0A%20%20%20%20%20%20%20%20%20%20%221%22%2C%0A%20%20%20%20%20%20%20%20%20%20%221%22%2C%0A%20%20%20%20%20%20%20%20%20%20%221%22%2C%0A%20%20%20%20%20%20%20%20%20%20%221%22%2C%0A%20%20%20%20%20%20%20%20%20%20%221%22%2C%0A%20%20%20%20%20%20%20%20%20%20%221%22%2C%0A%20%20%20%20%20%20%20%20%20%20%221%22%2C%0A%20%20%20%20%20%20%20%20%20%20%228%22%0A%20%20%20%20%20%20%20%20%29%2C%20None%29%29%0A%20%20%20%20%20%20%29");


                HttpResponse<String> putMethodResponce = Unirest.put("https://test.openbankproject.com/obp/v4.0.0/management/connector-methods/ca34ff25-25f0-4c62-be2d-b3627e96d356")
                        .header("Authorization", "DirectLogintoken="+ token)
                        .header("Content-Type", "application/json")
                        .header("Cookie", "JSESSIONID=node0umackg1zhun41xye364x7ghtl10069.node0")
                        .body(json.put("method_name", "getBank").put("method_body", escapeCode).toString())
                        .asString();


                Messages.showMessageDialog(currentProject, "response:" + putMethodResponce.getBody(), dlgTitle, Messages.getInformationIcon());
            } catch (UnirestException e) {
                Messages.showMessageDialog(currentProject, e.getStackTrace().toString(), dlgTitle, Messages.getInformationIcon());
            }
        }


    }


}
