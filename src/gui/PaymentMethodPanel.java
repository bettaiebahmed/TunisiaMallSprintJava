/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

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

/**
 *
 * @author Lenovo
 */
public class PaymentMethodPanel extends JPanel {

    private JLabel nameLabel;
    private JLabel occupationLabel;
    private JTextField nameField;
    private JTextField occupationField;
    private JButton okBtn;
    private FormListener formListener;
    private JList ageList;
    private JComboBox comboBox;
    private JLabel ageLabel;
    private JLabel employementLabel;
    private JCheckBox country;
    private JLabel countryLabel;
    private JLabel gouvernementLabel;
    private JTextField gouvernement;
    private JRadioButton online;
    private JRadioButton livraison;
    private ButtonGroup paymentGroup;
    private JLabel sexLabel;
    private Controller controller;
    private JLabel numerocarte;
    private JLabel password;

    private JLabel adresseLabel;
    private JLabel codePostaleLabel;
    private JLabel GouvernementLabel;

    private JTextField numcarte;
    private JTextField pass;

    private JTextField adresse;
    private JTextField codepostale;
    private JTextField gov;

    public PaymentMethodPanel(ArrayList<Panier> panier) {
        Dimension dim = getPreferredSize();
        dim.width = 250;
        setPreferredSize(dim);
        //Labels
        nameLabel = new JLabel("ID : ");
        sexLabel = new JLabel("Method :");
        controller = new Controller();
        numerocarte = new JLabel("Numero carte : ");
        password = new JLabel("Password");

        //Payment par livraision 
        adresseLabel = new JLabel("Adresse : ");
        codePostaleLabel = new JLabel("Code Postale : ");
        GouvernementLabel = new JLabel("Gouvernement : ");

        //Fields
        nameField = new JTextField(10);
        numcarte = new JTextField(10);
        pass = new JTextField(10);
        
        adresse = new JTextField(10);
        codepostale = new JTextField(10);
        gov = new JTextField(10);


        //Radio
        online = new JRadioButton("Payment Online");
        livraison = new JRadioButton("Livraison ");
        online.setActionCommand("Payment Online");
        livraison.setActionCommand("Payment par Livraison");
        paymentGroup = new ButtonGroup();

        //Setting Radio Group
        paymentGroup.add(online);
        paymentGroup.add(livraison);

        //Set and disabale TextField:
        okBtn = new JButton("Payer");

        

        TitledBorder innerBorder = BorderFactory.createTitledBorder("Payer");
        javax.swing.border.Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();

        ///////////////////Firs ROW ////////////
        gc.weightx = 1;
        gc.weighty = 2.0;
        gc.gridx = 0;
        gc.gridy = 0;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_END;
        add(nameLabel, gc);

        gc.gridx = 1;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_START;
        add(nameField, gc);

        //////////////////Sex Row /////////////
        gc.weightx = 0;
        gc.weighty = 2.0;
        gc.gridx = 0;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.LINE_END;
        add(sexLabel, gc);
        gc.gridx = 1;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(online, gc);
        gc.gridx = 1;
        gc.gridy = 2;
        gc.anchor = GridBagConstraints.LINE_START;
        add(livraison, gc);
        online.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                //////////////////Fifth Row /////////////

                gc.weightx = 0.1;
                gc.weighty = 0;
                gc.gridx = 0;
                gc.gridy = 3;
                gc.anchor = GridBagConstraints.LINE_END;
                add(numerocarte, gc);
                gc.weightx = 0.1;
                gc.weighty = 0;
                gc.gridx = 1;
                gc.gridy = 3;
                gc.anchor = GridBagConstraints.LINE_START;
                add(numcarte, gc);
                gc.weightx = 0.11;
                gc.weighty = 0;
                gc.gridx = 0;
                gc.gridy = 4;
                gc.anchor = GridBagConstraints.LINE_END;
                add(password, gc);
                gc.weightx = 1;
                gc.weighty = 0;
                gc.gridx = 1;
                gc.gridy = 4;
                gc.anchor = GridBagConstraints.LINE_START;
                add(pass, gc);

            }
        });
        livraison.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                //////////////////Fifth Row /////////////

                gc.weightx = 0.1;
                gc.weighty = 0;
                gc.gridx = 0;
                gc.gridy = 3;
                gc.anchor = GridBagConstraints.LINE_END;
                add(adresseLabel, gc);
                gc.weightx = 0.1;
                gc.weighty = 0;
                gc.gridx = 1;
                gc.gridy = 3;
                gc.anchor = GridBagConstraints.LINE_START;
                add(adresse, gc);
                
                gc.weightx = 0.11;
                gc.weighty = 0;
                gc.gridx = 0;
                gc.gridy = 4;
                gc.anchor = GridBagConstraints.LINE_END;
                add(codePostaleLabel, gc);
                gc.weightx = 1;
                gc.weighty = 0;
                gc.gridx = 1;
                gc.gridy = 4;
                gc.anchor = GridBagConstraints.LINE_START;
                add(codepostale, gc);
                
                gc.weightx = 0.11;
                gc.weighty = 0;
                gc.gridx = 0;
                gc.gridy = 5;
                gc.anchor = GridBagConstraints.LINE_END;
                add(GouvernementLabel, gc);
                gc.weightx = 1;
                gc.weighty = 0;
                gc.gridx = 1;
                gc.gridy = 5;
                gc.anchor = GridBagConstraints.LINE_START;
                add(gov, gc);

            }
        });
        okBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
             for (Panier p :panier)
        {
            Achat a = new Achat(p.getNomArticle(), p.getPrix(), nameField.getText(), adresse.getText()+","+codepostale.getText()+","+gov.getText(), numcarte.getText());
            Database db = new Database();
                 try {
                     db.addProduct(a);
                 } catch (Exception ex) {
                     Logger.getLogger(PaymentMethodPanel.class.getName()).log(Level.SEVERE, null, ex);
                 }
        }
            }
        });
        //////////////////Fifth Row /////////////
        gc.weightx = 0.1;
        gc.weighty = 0;
        gc.gridx = 1;
        gc.gridy = 8;
        gc.anchor = GridBagConstraints.LINE_START;
        add(okBtn, gc);

    }

    public void setFormListener(FormListener listener) {
        this.formListener = listener;
    }

}
