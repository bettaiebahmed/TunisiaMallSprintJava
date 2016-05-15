/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class TablePanel extends JPanel {
    private JTable table;
    private PersonTableModel tableModel;
    String[] columnNames = {"User name", "Email", "Password", "Country"};

    public TablePanel() {
        table= new JTable(tableModel);
        tableModel= new PersonTableModel();
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
        table.setModel(model);
        
        setLayout(new BorderLayout());
        add(table,BorderLayout.CENTER);
    }

}

