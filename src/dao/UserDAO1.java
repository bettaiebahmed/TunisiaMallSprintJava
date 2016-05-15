/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Idao.*;
import utils.*;
import entite.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hakim
 */
public class UserDAO1 implements Iuser{

        private Connection connection;
        public UserDAO1() {
        connection = DataSource.getInstance().getConnection();
    }

    @Override
    public void adduser(user1 user) {
    
        try {
            String req = "INSERT INTO personne(id,nom) VALUES (?,?)";

            PreparedStatement ps = connection.prepareStatement(req);
            ps.setInt(1, user.getId());
            ps.setString(2, user.getNom());

           

            ps.executeUpdate();
            System.out.println("l'ajout d'agent effectué avec succes");

        } catch (SQLException ex) {
            Logger.getLogger(UserDAO1.class.getName()).log(Level.ALL.SEVERE, null, ex);
        }
    }

    
    
    
    
    
}
