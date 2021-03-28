package org.obp.settings;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.editor.Caret;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.pom.Navigatable;

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
        PushCodeDialog pushCodeDialog = new PushCodeDialog(selectedText);

        if (pushCodeDialog.showAndGet()) {


            try {
                JSONObject json = new JSONObject();
                json.put("method_name", "checkExternalUserExists").put("method_body", "hello()");
                Unirest.setTimeouts(0, 0);
                HttpResponse<String> response = Unirest.put("https://test.openbankproject.com/obp/v4.0.0/management/connector-methods/ca34ff25-25f0-4c62-be2d-b3627e96d356")
                        .header("Authorization", "DirectLogintoken=eyJhbGciOiJIUzI1NiJ9.eyIiOiIifQ.xe95UT3ZvjUC-BXjtk6rGQuUeJfyyIS1Ha5XsUaRdr0")
                        .header("Content-Type", "application/json")
                        .header("Cookie", "JSESSIONID=node0umackg1zhun41xye364x7ghtl10069.node0")
                        .body(json.put("method_name", "getBank").put("method_body", "println(\"Hello, world\")").toString())
                        .asString();


                Messages.showMessageDialog(currentProject, "response:" + response.getBody(), dlgTitle, Messages.getInformationIcon());
            } catch (UnirestException e) {
                Messages.showMessageDialog(currentProject, e.getStackTrace().toString(), dlgTitle, Messages.getInformationIcon());
            }
        }


    }


}
