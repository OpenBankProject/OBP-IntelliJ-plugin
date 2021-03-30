// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package org.obp.settings;

import com.intellij.ui.components.JBLabel;
import com.intellij.ui.components.JBTextField;
import com.intellij.util.ui.FormBuilder;
import org.jetbrains.annotations.NotNull;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JComponent;

import java.util.ArrayList;
import java.util.List;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

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
    private final JComboBox hostComboBox;
    private Map<String, List<JComponent>> componentMap = new HashMap<>();

    public AppSettingsComponent() {

        String[] items = {
                "Host1",
                "Host2",
                "Host3",
                "Host4"
        };

        hostComboBox = new JComboBox(items);

        hostComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) hostComboBox.getSelectedItem();


                processEnableSelectedItem(selectedItem);
            }
        });


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

        componentMap.put("Host1", new ArrayList<>());
        componentMap.put("Host2", new ArrayList<>());
        componentMap.put("Host3", new ArrayList<>());
        componentMap.put("Host4", new ArrayList<>());

        componentMap.get("Host1").add(host1);
        componentMap.get("Host1").add(consumerKey1);
        componentMap.get("Host1").add(secret1);

        componentMap.get("Host2").add(host2);
        componentMap.get("Host2").add(consumerKey2);
        componentMap.get("Host2").add(secret2);

        componentMap.get("Host3").add(host3);
        componentMap.get("Host3").add(consumerKey3);
        componentMap.get("Host3").add(secret3);

        componentMap.get("Host4").add(host4);
        componentMap.get("Host4").add(consumerKey4);
        componentMap.get("Host4").add(secret4);

        mainPanel = FormBuilder.createFormBuilder()
                .addLabeledComponent(new JBLabel("Login: "), login, 1, false)
                .addLabeledComponent(new JBLabel("Password: "), password, 1, false)
                .addLabeledComponent(new JBLabel("Host"), hostComboBox)
                .addComponent(settingsPanel, 1)
                .getPanel();


    }

    private void processEnableSelectedItem(String selectedItem) {
        componentMap.values().stream().flatMap(container -> container.stream()).forEach(x -> x.setEnabled(false));
        componentMap.get(selectedItem).stream().forEach(x -> x.setEnabled(true));
    }

    public JPanel getPanel() {
        return mainPanel;
    }

    public JComponent getPreferredFocusedComponent() {
        return host1;
    }

    @NotNull
    public String getHost1Text() {
        return host1.getText();
    }

    @NotNull
    public String getHost2Text() {
        return host2.getText();
    }

    @NotNull
    public String getHost3Text() {
        return host3.getText();
    }

    @NotNull
    public String getHost4Text() {
        return host4.getText();
    }

    @NotNull
    public String getConsumer1Text() {
        return consumerKey1.getText();
    }

    @NotNull
    public String getConsumer2Text() {
        return consumerKey2.getText();
    }

    @NotNull
    public String getConsumer3Text() {
        return consumerKey3.getText();
    }

    @NotNull
    public String getConsumer4Text() {
        return consumerKey4.getText();
    }


    @NotNull
    public String getSecret1Text() {
        return secret1.getText();
    }

    @NotNull
    public String getSecret2Text() {
        return secret2.getText();
    }

    @NotNull
    public String getSecret3Text() {
        return secret3.getText();
    }

    @NotNull
    public String getSecret4Text() {
        return secret4.getText();
    }

    public String getLogin(){
        return login.getText();
    }

    public String getPassword(){
        return password.getText();
    }

    public void setHost1(@NotNull String newText) {
        host1.setText(newText);
    }

    public void setHost2(@NotNull String newText) {
        host2.setText(newText);
    }

    public void setHost3(@NotNull String newText) {
        host3.setText(newText);
    }

    public void setHost4(@NotNull String newText) {
        host4.setText(newText);
    }

    public void setConsumerKey1(@NotNull String newText) {
        consumerKey1.setText(newText);
    }

    public void setConsumerKey2(@NotNull String newText) {
        consumerKey2.setText(newText);
    }

    public void setConsumerKey3(@NotNull String newText) {
        consumerKey3.setText(newText);
    }

    public void setConsumerKey4(@NotNull String newText) {
        consumerKey4.setText(newText);
    }

    public void setSecret1(@NotNull String newText) {
        secret1.setText(newText);
    }

    public void setSecret2(@NotNull String newText) {
        secret2.setText(newText);
    }

    public void setSecret3(@NotNull String newText) {
        secret3.setText(newText);
    }

    public void setSecret4(@NotNull String newText) {
        secret4.setText(newText);
    }


    public void setLogin(String Str) {
        login.setText(Str);
    }

    public void setPassword(String passwordStr) {
        password.setText(passwordStr);
    }

    public void setHostVersion(String host) {
        hostComboBox.setSelectedItem(host);
        processEnableSelectedItem(host);
    }

    public String getHostVersion() {
        return (String) hostComboBox.getSelectedItem();
    }


}
