// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package org.obp.settings;

import com.intellij.util.ui.FormBuilder;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Supports creating and managing a {@link JPanel} for the Settings Dialog.
 */
public class AppSettingsComponent {

    private final JPanel mainPanel;
    List<ModelParams> modelParamsList = new ArrayList<ModelParams>();
    private final SettingsTableModel settingsTableModel;
    private final JTable settingsTable;

    public Integer getHostVersion   () {
        return settingsTable.getSelectedRow();
    }

    public void setHostVersion(Integer hostVersion) {
        if (modelParamsList.size()>hostVersion){
            settingsTable.setRowSelectionInterval(hostVersion,hostVersion);

        }
    }



    public AppSettingsComponent() {


        settingsTableModel = new SettingsTableModel(modelParamsList);

        settingsTable = new JTable(settingsTableModel);


        JPanel buttonsPanel = new JPanel();
        FlowLayout layout = new FlowLayout();
        buttonsPanel.setLayout(layout);
        JButton addButton = new JButton("Add");

        addButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                addEmptyParams();
            }
        });
        buttonsPanel.add(addButton);
        JButton delete = new JButton("Delete");
        buttonsPanel.add(delete);

        mainPanel = FormBuilder.createFormBuilder()
                .addComponent(new JScrollPane(settingsTable))
                .addComponent( buttonsPanel)
                .getPanel();


    }

    private void addEmptyParams() {
        modelParamsList.add(new ModelParams("", "", "", ""));
        settingsTableModel.fireTableDataChanged();
    }


    public JPanel getPanel() {
        return mainPanel;
    }

    public List<ModelParams> getModelParamsList() {
        return modelParamsList;
    }

    public void setModelParamsList(List<ModelParams> modelParamsList) {
        this.modelParamsList = modelParamsList;
        settingsTableModel.setModelParams(modelParamsList);
    }
}
