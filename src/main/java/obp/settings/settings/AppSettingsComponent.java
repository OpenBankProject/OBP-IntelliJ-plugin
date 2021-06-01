// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package obp.settings.settings;

import com.intellij.util.ui.FormBuilder;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

import java.awt.*;
import java.util.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * Supports creating and managing a {@link JPanel} for the Settings Dialog.
 */
public class AppSettingsComponent {

    private final JPanel mainPanel;
    List<AppSettingsState.ModelParams> modelParamsList = new ArrayList<AppSettingsState.ModelParams>();
    private final SettingsTableModel settingsTableModel;
    private final JTable settingsTable;

    public Integer getHostVersion() {
        return settingsTable.getSelectedRow();
    }

    public void setHostVersion(Integer hostVersion) {
        if (modelParamsList.size() > 0 && modelParamsList.size() > hostVersion) {
            settingsTable.setRowSelectionInterval(hostVersion, hostVersion);

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
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeSelected();
            }
        });
        buttonsPanel.add(delete);

        mainPanel = FormBuilder.createFormBuilder()
                .addComponent(new JScrollPane(settingsTable))
                .addComponent(buttonsPanel)
                .getPanel();


    }

    private int parseParamNumber(String id){
        return Integer.parseInt(id.split("_")[1]);
    }
    private void addEmptyParams() {

        modelParamsList.add(AppSettingsState.createModelParams("", "", "", ""));
        settingsTableModel.fireTableDataChanged();
        if (settingsTable.getSelectedRow()<0){
            settingsTable.setRowSelectionInterval(0,0);
        }
    }

    private int getEmptyParamID() {
        int paramNumber=0;
        Optional<AppSettingsState.ModelParams> max = modelParamsList.stream().max(Comparator.comparingInt(mp -> parseParamNumber(mp.getId().split("_")[1])));
        if (!max.isEmpty()){
            paramNumber=Integer.parseInt(max.get().getId().split("_")[1]);
        }
        return paramNumber;
    }

    private void removeSelected() {
        int selectedRow = settingsTable.getSelectedRow();
        if (selectedRow >= 0) {
            modelParamsList.remove(selectedRow);
            selectedRow = (selectedRow > 0) ? selectedRow - 1 : 0;


        } else if (modelParamsList.size() > 0) {
            AppSettingsState.ModelParams remove = modelParamsList.remove(modelParamsList.size() - 1);
            AppSettingsState.removeModelParams(remove);
        }


        settingsTableModel.fireTableDataChanged();
        if (selectedRow >= 0 && modelParamsList.size() > 0) {
            settingsTable.setRowSelectionInterval(selectedRow, selectedRow);

        }
    }

    public JPanel getPanel() {
        return mainPanel;
    }

    public void setModelParamsList(List<AppSettingsState.ModelParams> modelParamsList) {
        this.modelParamsList = modelParamsList;
        settingsTableModel.setModelParams(modelParamsList);
    }

    public List<AppSettingsState.ModelParams> getModelParamsList() {
        return settingsTableModel.getModelParams();
    }
}
