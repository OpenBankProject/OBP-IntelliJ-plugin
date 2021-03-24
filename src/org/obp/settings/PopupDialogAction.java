package org.obp.settings;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.Caret;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.pom.Navigatable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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


        Messages.showMessageDialog(currentProject, "Host Version is:" + instance.getHostVersion() +
                "\nSelected Text:" + selectedText, dlgTitle, Messages.getInformationIcon());
    }


}
