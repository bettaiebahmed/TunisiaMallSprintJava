/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import model.Panier;

/**
 *
 * @author Lenovo
 */
public class ReclamationForm extends JPanel{
    private JLabel nomLabel;
    private JLabel sujetLabel;
    private JLabel messageLabel;
    
    public  JTextField nom;
    public JTextField sujet;
    public JTextArea message;
    
    private JButton send;
      private static String USER_NAME = "ahmedbenadelbettaieb1994@gmail.com";  // GMail user name (just the part before "@gmail.com")
    private static String PASSWORD = "dayerlehya2012"; // GMail password
    private static String RECIPIENT = "ahmedbenadelbettaieb1994@gmail.com";

    public ReclamationForm() throws MessagingException {
        nomLabel = new JLabel("Votre nom : ");
        sujetLabel = new JLabel("Sujet : ");
        messageLabel = new JLabel("Message : ");
        
        nom = new JTextField(10);
        sujet = new JTextField(10);
        message = new JTextArea(null,10,10);
        
        send = new JButton("Envoyer");
         String from = USER_NAME;
        String pass = PASSWORD;
        String[] to = { RECIPIENT }; // list of recipient email addresses
       
        send.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                try {
                     String subject = sujet.getText()+" From "+nom.getText();
        String body = message.getText();
                System.out.println(subject);
                    sendFromGMail(from, pass, to, subject, body);
                } catch (MessagingException ex) {
                    Logger.getLogger(ReclamationForm.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        TitledBorder innerBorder = BorderFactory.createTitledBorder("Payer");
        javax.swing.border.Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();

        ///////////////////Nom ROW ////////////
        gc.weightx = 1;
        gc.weighty = 2.0;
        gc.gridx = 0;
        gc.gridy = 0;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_END;
        add(nomLabel, gc);

        gc.gridx = 1;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_START;
        add(nom, gc);
        ///////////////////Sujet ROW ////////////
        gc.weightx = 1;
        gc.weighty = 2.0;
        gc.gridx = 0;
        gc.gridy = 1;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_END;
        add(sujetLabel, gc);

        gc.gridx = 1;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(sujet, gc);
        ///////////////////Message ROW ////////////
        gc.weightx = 1;
        gc.weighty = 2.0;
        gc.gridx = 0;
        gc.gridy = 2;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_END;
        add(messageLabel, gc);

        gc.gridx = 1;
        gc.gridy = 2;
        gc.anchor = GridBagConstraints.LINE_START;
        add(message, gc);
        
         gc.weightx = 1;
        gc.weighty = 2.0;
        gc.gridx = 0;
        gc.gridy = 3;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_END;
        add(send, gc);

        
        
        
    }
      private static void sendFromGMail(String from, String pass, String[] to, String subject, String body) throws MessagingException {
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", pass);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(from));
            InternetAddress[] toAddress = new InternetAddress[to.length];

            // To get the array of addresses
            for( int i = 0; i < to.length; i++ ) {
                toAddress[i] = new InternetAddress(to[i]);
            }

            for( int i = 0; i < toAddress.length; i++) {
                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
            }

            message.setSubject(subject);
            message.setText(body);
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }
        catch (AddressException ae) {
            ae.printStackTrace();
        }
        catch (MessagingException me) {
            me.printStackTrace();
        }
    }
}
    
    
    

