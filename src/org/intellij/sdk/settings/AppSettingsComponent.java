// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package org.intellij.sdk.settings;

import com.intellij.ui.components.JBCheckBox;
import com.intellij.ui.components.JBLabel;
import com.intellij.ui.components.JBTextField;
import com.intellij.ui.components.panels.HorizontalBox;
import com.intellij.ui.components.panels.VerticalBox;
import com.intellij.util.ui.FormBuilder;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;

/**
 * Supports creating and managing a {@link JPanel} for the Settings Dialog.
 */
public class AppSettingsComponent {

    private final JPanel mainPanel;
    private final JBTextField host1 = new JBTextField();
    private final JBTextField host2 = new JBTextField();
    private final JBTextField host3 = new JBTextField();
    private final JBTextField host4 = new JBTextField();
    private final JBTextField consumerKey1 = new JBTextField();
    private final JBTextField consumerKey2 = new JBTextField();

    private final JBTextField consumerKey3 = new JBTextField();
    private final JBTextField consumerKey4 = new JBTextField();


    private final JBTextField secret1 = new JBTextField();
    private final JBTextField secret2 = new JBTextField();
    private final JBTextField secret3 = new JBTextField();
    private final JBTextField secret4 = new JBTextField();

    private final JBTextField login = new JBTextField();
    private final JBTextField password = new JBTextField();


    public AppSettingsComponent() {


        JPanel loginPasswordPanel = new JPanel();
        loginPasswordPanel.setLayout(new GridLayout(2, 2));
        loginPasswordPanel.add(new JBLabel("Login"));
        loginPasswordPanel.add(new JBLabel("Password"));
        loginPasswordPanel.add(login);
        loginPasswordPanel.add(password);


        JPanel settingsPanel = new JPanel();

        settingsPanel.setLayout(new GridLayout(8, 3));
        settingsPanel.add(new JBLabel("Host1"));
        settingsPanel.add(new JBLabel("Consumer key 1"));
        settingsPanel.add(new JBLabel("Consumer secret 1"));
        settingsPanel.add(host1);
        settingsPanel.add(consumerKey1);
        settingsPanel.add(secret1);
        settingsPanel.add(new JBLabel("Host2"));
        settingsPanel.add(new JBLabel("Consumer key 2"));
        settingsPanel.add(new JBLabel("Consumer secret 2"));
        settingsPanel.add(host2);
        settingsPanel.add(consumerKey2);
        settingsPanel.add(secret2);

        settingsPanel.add(new JBLabel("Host3"));
        settingsPanel.add(new JBLabel("Consumer key 3"));
        settingsPanel.add(new JBLabel("Consumer secret 3"));
        settingsPanel.add(host3);
        settingsPanel.add(consumerKey3);
        settingsPanel.add(secret3);
        settingsPanel.add(new JBLabel("Host4"));
        settingsPanel.add(new JBLabel("Consumer key 4"));
        settingsPanel.add(new JBLabel("Consumer secret 4"));
        settingsPanel.add(host4);
        settingsPanel.add(consumerKey4);
        settingsPanel.add(secret4);

        mainPanel = FormBuilder.createFormBuilder()
                .addLabeledComponent(new JBLabel("Login: "), login, 1, false)
                .addLabeledComponent(new JBLabel("Password: "), password, 1, false)
                .addComponent(settingsPanel, 1)
                .getPanel();


    }

    public JPanel getPanel() {
        return mainPanel;
    }

    public JComponent getPreferredFocusedComponent() {
        return host1;
    }

    @NotNull
    public String getUserNameText() {
        return host1.getText();
    }

    public void setUserNameText(@NotNull String newText) {
        host1.setText(newText);
    }


}
