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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
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
public class MainFrame extends JFrame  {
 
    private JTextArea TxtArea;
    private JButton btn;
 
    private FormPanel formPanel;
    private Controller controller;
    private TablePanel tablepanel;
    private PicturesPanel picturespanel;
    private ReclamationForm rec;
    
    
    
    
    public MainFrame() throws MessagingException {
        super("Hello World");
        setLayout(new BorderLayout());
         TxtArea = new JTextArea();
         
         formPanel = new FormPanel();
         setJMenuBar(createMenuBar());
        controller= new Controller();
        tablepanel=new TablePanel();
        picturespanel= new PicturesPanel();
         rec = new ReclamationForm();
         btn = new JButton("Click Me!");
         
       
      
        add(formPanel,BorderLayout.WEST);
        picturespanel.setMaximumSize(new Dimension(900, 500));
        add(picturespanel,BorderLayout.CENTER);
        add(btn,BorderLayout.SOUTH);
      
       
       setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
 private JMenuBar createMenuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
       
        //Les items dans File
        JMenuItem exitItem = new JMenuItem("Exit");
        JMenuItem reclamationItem = new JMenuItem("Reclamation");
        fileMenu.add(reclamationItem);
        fileMenu.add(exitItem);
        
        //Les items dans à propos
        JMenu windowMenu = new JMenu("A propos");
        //Les items dans à propos
        JMenuItem versionItem = new JMenuItem("Version");
        windowMenu.add(versionItem);
        //Ajouter dans le menu
        menuBar.add(fileMenu);
        menuBar.add(windowMenu);
        reclamationItem.setMnemonic(KeyEvent.VK_R);
        reclamationItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.CTRL_MASK));
        reclamationItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                
                try {
                    ReclamationFrame rec = new ReclamationFrame();
                    rec.setVisible(true);
                } catch (MessagingException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
             
            }
        });
        exitItem.setMnemonic(KeyEvent.VK_X);
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
        exitItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
             int action=   JOptionPane.showConfirmDialog(MainFrame.this,"Do you want quit ","Confirm Exit",JOptionPane.OK_CANCEL_OPTION);
                
             if (action == JOptionPane.OK_OPTION)
             {System.exit(0);}
            }
        });
        return menuBar;
    }
}
