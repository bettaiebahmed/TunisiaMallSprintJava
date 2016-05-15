/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import gui.*;
import Idao.UserIdao;
import entite.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import utils.DataSource;

/**
 *
 * @author mohamed
 */
public class UserDao implements UserIdao<User> {

  
    private String ch1 = "test";
    private String ch2 = "test";
  private Connection connection;
    private PreparedStatement pst;
    private ResultSet rs;
    public UserDao() {
        connection = DataSource.getInstance().getConnection();
    }

    @Override
    public boolean add(User t) {
        boolean test = true;
        List<User> h = new ArrayList<User>();
        if (h.contains(t)) {
            h.add(t);
            test = false;
        }
        String req = "insert into user (username,password,email,locked,valide) values (?,?,?,0,invalide)";
        if (test) {
            try {
                pst = connection.prepareStatement(req);
                pst.setString(1, t.getUsername());
                pst.setString(2, t.getPassword());
                pst.setString(3, t.getEmail());
                pst.setString(4, t.getLocked());
                pst.setString(5, t.getValide());
                pst.executeUpdate();
                System.err.println("Succcess");
                return true;
            } catch (SQLException ex) {
                Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;

    }

    @Override
    public void update(User t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getrole(String username) {
        int x = 5;
        User user = new User();
        String req = "SELECT roles FROM `fos_user` where username='" + username + "'";
        try {
            pst = connection.prepareStatement(req);
            rs = pst.executeQuery();
            // user.setRoles(rs.getString(1));
            if (rs.next()) {
                String ch = rs.getString(1).toLowerCase();
                System.out.println(ch);
                if (ch.equals("admin")) {
                    x = 0;
                } else if (ch.equals("responsable")) {
                    x = 1;
                } else {
                    x = 2;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }
// Authentifcation suivant login mot de passe role

    @Override
    public void login(String username, String password, String locked, String valide) {

        String req = "SELECT * FROM `fos_user` where username=? and password=? and locked=? and valide=? ";
        try {
            pst = connection.prepareStatement(req);
            pst.setString(1, username);
            pst.setString(2, password);
            pst.setString(3, locked);
            pst.setString(4, valide);

            rs = pst.executeQuery();

            //   String ch = rs.getString(1).toLowerCase();
            if (rs.next()) {

                ch1 = rs.getString(3).toLowerCase();
                ch2 = rs.getString(4).toLowerCase();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String getCh1() {
        return ch1;
    }

    public String getCh2() {
        return ch2;
    }

    @Override
    public float getlocked(String username) {
        int x = 5;
        User user = new User();
        String req = "SELECT locked FROM `fos_user` where username='" + username + "'";
        try {
            pst = connection.prepareStatement(req);
            rs = pst.executeQuery();
            // user.setRoles(rs.getString(1));
            if (rs.next()) {
                String ch = rs.getString(1).toLowerCase();
                System.out.println(ch);
                if (ch.equals("0")) {
                    x = 1;
                } else 
                    x = 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }

    @Override
    public float getvalide(String username) {
        int x = 5;
        User user = new User();
        String req = "SELECT valide FROM `fos_user` where username='" + username + "'";
        try {
            pst = connection.prepareStatement(req);
            rs = pst.executeQuery();
            // user.setRoles(rs.getString(1));
            if (rs.next()) {
                String ch = rs.getString(1).toLowerCase();
                System.out.println(ch);
                if (ch.equals("valide")) {
                    x = 0;
                } else 
                    x = 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }


}


