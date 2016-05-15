/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import model.Database;
import model.Produit;
/**
 *
 * @author Lenovo
 */
public class Pidev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    new MainFrame();
                } catch (MessagingException ex) {
                    Logger.getLogger(Pidev.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    

    }
    
}

// Database db = new Database();
//                
//                try {
//                    ArrayList<Produit> p1 = db.getProduit();
//                    for (Produit p :p1)
//        {
//            System.out.println(p.getNomArticle());
//        }
//                    
//                } catch (Exception ex) {
//                    Logger.getLogger(Pidev.class.getName()).log(Level.SEVERE, null, ex);
//                }
