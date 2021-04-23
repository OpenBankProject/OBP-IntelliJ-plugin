package org.obp.ui;

import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.ui.components.panels.VerticalLayout;
import org.jetbrains.annotations.Nullable;
import org.obp.scalaparsing.ScalaFunction;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MultiplySelectionDialog extends DialogWrapper {
    private final List<ScalaFunction> functions;

    public MultiplySelectionDialog(List<ScalaFunction> functions) {
        super(true);
        this.functions=functions;
        init();
        setTitle("Push OBP");
    }

    @Override
    protected @Nullable
    JComponent createCenterPanel() {
        JPanel dialogPanel = new JPanel(new VerticalLayout(1));


        JList list = new JList(functions.toArray());
        list.setCellRenderer(new MultiselectionListCellRenderer());
        dialogPanel.add(list);

        return dialogPanel;
    }
}
