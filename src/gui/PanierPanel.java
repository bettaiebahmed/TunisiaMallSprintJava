/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Controller.Controller;
import com.sun.glass.events.KeyEvent;
import com.sun.xml.internal.ws.api.pipe.Fiber;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

/**
 *
 * @author Lenovo
 */
public class PanierPanel extends JFrame  {
 
    private JTextArea TxtArea;
    private JButton btn;
 
    private FormPanel formPanel;
    private Controller controller;
    private TablePanel tablepanel;
    private PicturesPanel picturespanel;
    
    
    
    
    public PanierPanel() {
        super("Hello World");
        setLayout(new BorderLayout());
         TxtArea = new JTextArea();
         
        controller= new Controller();
        tablepanel=new TablePanel();
        picturespanel= new PicturesPanel();
        
         btn = new JButton("Click Me!");
         
            
      
        picturespanel.setMaximumSize(new Dimension(900, 500));
        add(picturespanel,BorderLayout.CENTER);
        add(btn,BorderLayout.SOUTH);
      
       
       setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
