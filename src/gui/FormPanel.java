/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import tunisiamalltest.Pidev;
import Controller.Controller;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import model.Achat;
import model.Database;
import model.Panier;
import model.Produit;

/**
 *
 * @author Lenovo
 */
public class FormPanel extends JPanel {

    private JButton okBtn;
    private JButton buy;
    private JButton delete;
    private FormListener formListener;
    private JList ageList;
    private JList achat;
    private JLabel achatLabel;
    private Database db;
    private Panier basket;
    private ArrayList<Panier> panier;
    private JLabel sommeLabel;
    private JTextField somme;
    private static float totale = 0;
    private JLabel ageLabel;
    private Controller controller;
    private JButton payerBtn;
    private PaymentFrame paymentFrame;
    private static String bought="";
    private Achat a;
    
   
    public FormPanel() {
        Dimension dim = getPreferredSize();
        dim.width = 250;
        setPreferredSize(dim);
        ageLabel = new JLabel("Choisir un produit : ");
        achatLabel = new JLabel("Votre Panier : ");
        sommeLabel = new JLabel("Somme : ");
        ArrayList<Panier> panier = new ArrayList<Panier>();
        ArrayList<Achat> achats= new ArrayList<Achat>();
        controller = new Controller();
        db = new Database();
        ageList = new JList();
        achat = new JList();
        somme = new JTextField(8);
        payerBtn= new JButton("Payer");
        DefaultListModel ageModel = new DefaultListModel();
        DefaultListModel achatModel = new DefaultListModel();
        Database db = new Database();
        Panier pan = new Panier();
        try {
            ArrayList<Produit> p1 = db.getProduit();
            for (Produit p : p1) {
                ageModel.addElement(p.getNomArticle());
            }
        } catch (Exception ex) {
            Logger.getLogger(Pidev.class.getName()).log(Level.SEVERE, null, ex);
        }
          somme.setPreferredSize(new Dimension(120, 30));
        ageList.setModel(ageModel);
        ageList.setPreferredSize(new Dimension(110, 66));
        ageList.setSelectedIndex(0);
        ageList.setBorder(BorderFactory.createEtchedBorder());
        okBtn = new JButton("ajouter à Panier");
        delete = new JButton("Supprimer de panier");
        okBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    totale = totale + db.getPrix(ageList.getSelectedValue().toString());
                    sommeLabel.setText("Totale : " + totale+"DT");
                } catch (Exception ex) {
                    Logger.getLogger(FormPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                achatModel.addElement(ageList.getSelectedValue());
                achat.setModel(achatModel);
                achat.setPreferredSize(new Dimension(110, 66));
                achat.setSelectedIndex(0);
                achat.setBorder(BorderFactory.createEtchedBorder());
            }
        });
        delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
              totale = totale - db.getPrix(achat.getSelectedValue().toString());
              sommeLabel.setText("Totale : " + totale+"DT");
                } 
                catch (Exception ex) {
                    Logger.getLogger(FormPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                achatModel.remove(achat.getSelectedIndex());
              achat.setModel(achatModel);
              achat.setPreferredSize(new Dimension(110, 66));
              achat.setSelectedIndex(0);
              achat.setBorder(BorderFactory.createEtchedBorder());
            }
        });
        payerBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               for (int i=0;i<achatModel.getSize();i++)
               {
                   bought=bought+"-"+achatModel.getElementAt(i);
               }
               basket = new Panier(bought, totale);
               panier.add(basket);
              paymentFrame = new PaymentFrame(panier);
            }
        });
        
        
        TitledBorder innerBorder = BorderFactory.createTitledBorder("Ajouter à la panier");
        javax.swing.border.Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        ///////////////////Firs ROW ///////////////
        gc.weightx = 1;
        gc.weighty = 2.0;
        gc.gridx = 0;
        gc.gridy = 0;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_END;
        add(ageLabel, gc);
        gc.gridx = 1;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_START;
        add(ageList, gc);
        //////////////////Second Row /////////////
        gc.weightx = 1;
        gc.weighty = 2.0;
        gc.gridx = 0;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.LINE_END;
        add(okBtn, gc);
        gc.weightx = 1;
        gc.weighty = 2.0;
        gc.gridx = 1;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.LINE_END;
        add(delete, gc);
        //////////////////Third Row /////////////
        gc.weightx = 1;
        gc.weighty = 2.0;
        gc.gridx = 0;
        gc.gridy = 2;
        gc.anchor = GridBagConstraints.LINE_END;
        add(achatLabel, gc);
        gc.gridx = 1;
        gc.gridy = 2;
        gc.anchor = GridBagConstraints.LINE_START;
        add(achat, gc);
        //////////////////Fouth Row /////////////
        gc.weightx = 1;
        gc.weighty = 2.0;
        gc.gridx = 0;
        gc.gridy = 3;
        gc.anchor = GridBagConstraints.LINE_END;
        add(sommeLabel, gc);
        //////////////////Fifth Row /////////////
        gc.weightx = 1;
        gc.weighty = 2.0;
        gc.gridx = 0;
        gc.gridy = 4;
        gc.anchor = GridBagConstraints.LINE_END;
        add(payerBtn, gc);
    }
    public void setFormListener(FormListener listener) {
        this.formListener = listener;
    }
}
