package org.obp.ui;

import org.jdesktop.swingx.HorizontalLayout;
import org.jdesktop.swingx.VerticalLayout;
import org.obp.scalaparsing.ScalaFunction;

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
