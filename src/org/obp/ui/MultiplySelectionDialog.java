package org.obp.ui;

import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.ui.components.panels.VerticalLayout;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MultiplySelectionDialog  extends DialogWrapper {
    public MultiplySelectionDialog(boolean canBeParent) {
        super(canBeParent);
    }

    @Override
    protected @Nullable JComponent createCenterPanel() {
        JPanel dialogPanel = new JPanel(new VerticalLayout(1));
        List<String> arrayList=new ArrayList<String>();
        JList list=new JList(arrayList.toArray());
        dialogPanel.add(list);
        return dialogPanel;
    }
}
