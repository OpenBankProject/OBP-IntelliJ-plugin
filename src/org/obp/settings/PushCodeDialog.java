package org.obp.settings;

import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.ui.components.panels.VerticalLayout;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

public class PushCodeDialog extends DialogWrapper {

    private String functionBodyText;
    private JTextField functionNameTF;

    private PushCodeDialog() {
        super(true);

    }

    public PushCodeDialog(String fbText) {
        super(true); // use current window as parent
        this.functionBodyText = fbText;
        init();
        setTitle("Push OBP");
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        JPanel dialogPanel = new JPanel(new VerticalLayout(1));

        SpringLayout sl = new SpringLayout();
        JPanel functionNamePanel = new JPanel(sl);
        JLabel label = new JLabel("Function Name:");
        functionNamePanel.add(label);
        functionNameTF = new JTextField();
        functionNamePanel.add(functionNameTF);

        sl.putConstraint(SpringLayout.WEST, label, 6, SpringLayout.WEST, functionNamePanel);
        sl.putConstraint(SpringLayout.NORTH, label, 6, SpringLayout.NORTH, functionNamePanel);
        sl.putConstraint(SpringLayout.WEST, functionNameTF, 6, SpringLayout.EAST, label);
        sl.putConstraint(SpringLayout.NORTH, functionNameTF, 6, SpringLayout.NORTH, functionNamePanel);
        sl.putConstraint(SpringLayout.EAST, functionNamePanel, 6, SpringLayout.EAST, functionNameTF);
        sl.putConstraint(SpringLayout.SOUTH, functionNamePanel, 6, SpringLayout.SOUTH, functionNameTF);
        dialogPanel.add(functionNamePanel);
        JPanel functionBodyPanel = new JPanel();
        JTextArea functionBodyTextArea = new JTextArea();
        functionBodyTextArea.setPreferredSize(new Dimension(300, 200));
        functionBodyTextArea.setEnabled(false);
        functionBodyTextArea.setText(functionBodyText);
        functionBodyPanel.add(functionBodyTextArea);
        dialogPanel.add(functionBodyPanel);
        return dialogPanel;
    }

    public String getFunctionName() {
        return functionNameTF.getText();
    }
}
