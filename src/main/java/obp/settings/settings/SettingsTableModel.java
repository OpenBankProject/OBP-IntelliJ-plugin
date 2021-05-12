package obp.settings.settings;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class SettingsTableModel extends AbstractTableModel {
    List<ModelParams> modelParams;

    public SettingsTableModel(List<ModelParams> modelParams) {
        this.modelParams = modelParams;
    }

    public List<ModelParams> getModelParams() {
        return modelParams;
    }

    public void setModelParams(List<ModelParams> modelParams) {
        this.modelParams = modelParams;
    }

    @Override
    public int getRowCount() {
        return modelParams.size();
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Login";
            case 1:
                return "Password";
            case 2:
                return "Host";
            default:
                return "Consumer Key";
        }
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ModelParams modelParams = this.modelParams.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return modelParams.getLog();
            case 1:
                return modelParams.getPas();
            case 2:
                return modelParams.getHost();
            default:
                return modelParams.getConsumerKey();
        }

    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        ModelParams mp = this.modelParams.get(rowIndex);
        ModelParams modelParams = this.modelParams.get(rowIndex);
        switch (columnIndex) {
            case 0:
                modelParams.setLog((String) aValue);
            case 1:
                modelParams.setPas((String) aValue);
            case 2:
                modelParams.setHost((String) aValue);
            default:
                modelParams.setConsumerKey((String) aValue);
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
}
