/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author ariel
 */
public class IconRenderer extends DefaultTableCellRenderer {

    public IconRenderer() {
        super();
    }

    @Override
    public void setValue(Object value) {
        if (value == null) {
            setText("");
        } else {
            setIcon((Icon) value);
        }
    }
}
