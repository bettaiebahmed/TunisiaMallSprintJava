/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import gui.*;
import Idao.AdminIdao;
import entite.*;
import java.awt.BorderLayout;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utils.DataSource;

/**
 *
 * @author mohamed
 */
public class AdminDao implements AdminIdao<User> {

    private JTable jTable_Display_Users;
    private Connection connection;
    private PreparedStatement pst;
    private ResultSet rs;
    private Object tabel;

    public AdminDao() {

        connection = DataSource.getInstance().getConnection();

    }

    @Override
    public ArrayList<User> getlistuser() {
        ArrayList Listeuser = new ArrayList<User>();
        String req = "SELECT username,password,email,roles,locked,valide FROM `fos_user`";
        try {
            pst = connection.prepareStatement(req);
            ResultSet Resultat = pst.executeQuery();
            while (Resultat.next()) {
                User p = new User();
                p.setUsername(Resultat.getString(1));
                p.setPassword(Resultat.getString(2));
                p.setEmail(Resultat.getString(3));
                p.setRoles(Resultat.getString(4));
                p.setLocked(Resultat.getString(5));
                p.setValide(Resultat.getString(6));
                Listeuser.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Listeuser;
    }

//    @Override
//    public void showuserinjtable() {
//        ArrayList<User> list = getlistuser();
//         DefaultTableModel model = new DefaultTableModel();
//        //DefaultTableModel model =  (DefaultTableModel) jTable_Display_Users.getModel();
//        Object[] row = new Object[4];
//        for (User list1 : list) {
//            row[0] = list1.getUsername();
//            row[1] = list1.getPassword();
//            row[2] = list1.getEmail();
//            row[3] = list1.getRoles();
//            model.addRow(row);
//        }
//           jTable_Display_Users.setModel(model);
//    }
    private void add(JScrollPane scroll) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void executeSQlQuery(String query, String message) {

        try {
            pst = connection.prepareStatement(query);
            if ((pst.executeUpdate(query)) == 1) {
                JOptionPane.showMessageDialog(null, "Data " + message + " Succefully");
            } else {
                JOptionPane.showMessageDialog(null, "Data Not " + message);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Username Exist");
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void unlock(String username) {
       
        String req = " UPDATE fos_user SET locked = '0' WHERE  username='" + username + "'";
        try {
            pst = connection.prepareStatement(req);
            if ((pst.executeUpdate(req)) == 1) {
                JOptionPane.showMessageDialog(null, "Account Unlocked");
            } 
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(null, "Account not Unlocked");
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void lock(String username) {
        String req = " UPDATE fos_user SET locked = '1' WHERE  username='" + username + "'";
        try {
            pst = connection.prepareStatement(req);
            if ((pst.executeUpdate(req)) == 1) {
                JOptionPane.showMessageDialog(null, "Account locked");
            } 
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(null, "Account not locked");
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void validate(String username) {
        String req = " UPDATE fos_user SET valide = 'valide' WHERE  username='" + username + "'";
        try {
            pst = connection.prepareStatement(req);
            if ((pst.executeUpdate(req)) == 1) {
                JOptionPane.showMessageDialog(null, "Account Validated");
            } 
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(null, "Account not Validated");
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   

   

}
