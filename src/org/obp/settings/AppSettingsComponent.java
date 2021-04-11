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

    private final JBTextField login1 = new JBTextField();
    private final JBTextField login2 = new JBTextField();
    private final JBTextField login3 = new JBTextField();
    private final JBTextField login4 = new JBTextField();

    private final JBTextField password1 = new JBTextField();
    private final JBTextField password2 = new JBTextField();
    private final JBTextField password3 = new JBTextField();
    private final JBTextField password4 = new JBTextField();

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
        settingsPanel.add(new JBLabel("Login1 "));
        settingsPanel.add(new JBLabel("Password1"));

        settingsPanel.add(host1);
        settingsPanel.add(consumerKey1);
        settingsPanel.add(login1);
        settingsPanel.add(password1);

        settingsPanel.add(new JBLabel("Host2"));
        settingsPanel.add(new JBLabel("Consumer key 2"));
        settingsPanel.add(new JBLabel("Login2"));
        settingsPanel.add(new JBLabel("Password2"));

        settingsPanel.add(host2);
        settingsPanel.add(consumerKey2);
        settingsPanel.add(login2);
        settingsPanel.add(password2);

        settingsPanel.add(new JBLabel("Host3"));
        settingsPanel.add(new JBLabel("Consumer key 3"));
        settingsPanel.add(new JBLabel("Login3"));
        settingsPanel.add(new JBLabel("Password3"));

        settingsPanel.add(host3);
        settingsPanel.add(consumerKey3);
        settingsPanel.add(login3);
        settingsPanel.add(password3);

        settingsPanel.add(new JBLabel("Host4"));
        settingsPanel.add(new JBLabel("Consumer key 4"));
        settingsPanel.add(new JBLabel("Login4"));
        settingsPanel.add(new JBLabel("Password4"));

        settingsPanel.add(host4);
        settingsPanel.add(consumerKey4);
        settingsPanel.add(login4);
        settingsPanel.add(password4);

        componentMap.put("Host1", new ArrayList<>());
        componentMap.put("Host2", new ArrayList<>());
        componentMap.put("Host3", new ArrayList<>());
        componentMap.put("Host4", new ArrayList<>());

        componentMap.get("Host1").add(host1);
        componentMap.get("Host1").add(consumerKey1);
        componentMap.get("Host1").add(login1);
        componentMap.get("Host1").add(password1);

        componentMap.get("Host2").add(host2);
        componentMap.get("Host2").add(consumerKey2);
        componentMap.get("Host2").add(login2);
        componentMap.get("Host2").add(password2);

        componentMap.get("Host3").add(host3);
        componentMap.get("Host3").add(consumerKey3);
        componentMap.get("Host3").add(login3);
        componentMap.get("Host3").add(password3);

        componentMap.get("Host4").add(host4);
        componentMap.get("Host4").add(consumerKey4);
        componentMap.get("Host4").add(login4);
        componentMap.get("Host4").add(password4);

        mainPanel = FormBuilder.createFormBuilder()
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
    public String getLogin1() {
        return login1.getText();
    }

    @NotNull
    public String getLogin2() {
        return login2.getText();
    }

    @NotNull
    public String getLogin3() {
        return login3.getText();
    }

    @NotNull
    public String getLogin4() {
        return login4.getText();
    }


    @NotNull
    public String getPassword1(){
        return password1.getText();
    }
    @NotNull
    public String getPassword2(){
        return password2.getText();
    }
    @NotNull
    public String getPassword3(){
        return password3.getText();
    }
    @NotNull
    public String getPassword4(){
        return password4.getText();
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

    public void setPassword1(@NotNull String newText) {
        password1.setText(newText);
    }

    public void setPassword2(@NotNull String newText) {
        password2.setText(newText);
    }

    public void setPassword3(@NotNull String newText) {
        password3.setText(newText);
    }

    public void setPassword4(@NotNull String newText) {
        password4.setText(newText);
    }


    public void setLogin1(String Str) {
        login1.setText(Str);
    }
    public void setLogin2(String Str) {
        login2.setText(Str);
    }
    public void setLogin3(String Str) {
        login3.setText(Str);
    }
    public void setLogin4(String Str) {
        login4.setText(Str);
    }



    public void setHostVersion(String host) {
        hostComboBox.setSelectedItem(host);
        processEnableSelectedItem(host);
    }

    public String getHostVersion() {
        return (String) hostComboBox.getSelectedItem();
    }


}
