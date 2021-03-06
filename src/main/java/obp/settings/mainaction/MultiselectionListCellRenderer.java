package obp.settings.mainaction;

import obp.settings.scalaparsing.ScalaFunction;
import org.jdesktop.swingx.VerticalLayout;


import javax.swing.*;
import java.awt.*;

public class MultiselectionListCellRenderer extends DefaultListCellRenderer {
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        JPanel jpanel=new JPanel();
        jpanel.setLayout(new VerticalLayout());
        ScalaFunction scalaFunction= (ScalaFunction) value;
        jpanel.add(new JLabel(scalaFunction.getFunctionName()));
        jpanel.add(new JTextArea(scalaFunction.getCodeText()));
        return jpanel;
    }
}
