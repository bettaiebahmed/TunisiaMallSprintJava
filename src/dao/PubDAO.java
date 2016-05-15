/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Idao.IPub;
import utils.DataSource;
import entite.Pub;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hakim
 */
public class PubDAO implements IPub {

    private Connection connection;
    private PreparedStatement pst;

    public PubDAO() {
        //initialiser la connection
        connection = DataSource.getInstance().getConnection();

    }

    @Override
    public void addPub(Pub publicite) {
        String req = "insert into Pub (idPub,nomPub, typePub,lienPub) values (?,?,?,?)";
        try {
            pst = connection.prepareStatement(req);
            pst.setInt(1, publicite.getIdPub());
            pst.setString(2, publicite.getNomPub());
            pst.setString(3, publicite.getTypePub());
            pst.setString(4, publicite.getLienPub());

            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PubDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updatePub(Pub publicite) {
        String req = "UPDATE Pub SET  nompub = ? , typePub = ? , lienpub = ? WHERE idPub =? ";
        try {
            pst = connection.prepareStatement(req);
            pst.setString(1, publicite.getNomPub());
            pst.setString(2, publicite.getTypePub());
            pst.setString(3, publicite.getLienPub());
            pst.setInt(4, publicite.getIdPub());

            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PubDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void removePubById(int id) {
        String requete = "delete from Pub where idPub=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Publicité supprimé");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }

    @Override
    public void removePubByNom(String nom) {
String requete = "delete from Pub where nomPub=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setString(1, nom);
            ps.executeUpdate();
            System.out.println("Publicité supprimé");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }    }

    @Override
    public Pub findPubById(int id) {
        Pub p = new Pub();
        String requete = "select * from Pub where idPub=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                p.setIdPub(resultat.getInt(1));
                p.setNomPub(resultat.getString(2));
                p.setTypePub(resultat.getString(3));
                p.setLienPub(resultat.getString(4));

            }
            return p;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche d'une Personne " + ex.getMessage());
            return null;
        }
    }
        @Override
    public List<Pub> DisplayAll() {
        List<Pub> myList = new ArrayList<>();
       String requete = "SELECT * FROM pub";
        try {
            Statement st =  connection.createStatement();
            ResultSet rs = st.executeQuery(requete);
            while(rs.next()){
                Pub pub = new Pub();
                pub.setIdPub(rs.getInt("idPub"));
                pub.setNomPub(rs.getString("nomPub"));
                pub.setTypePub(rs.getString("typePub"));
                pub.setLienPub(rs.getString("lienPub"));
                
                myList.add(pub);

                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PubDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return myList;
    }

    @Override
    public List<Pub> find(String text) {
        List<Pub> myList = new ArrayList<>();
       String requete = "SELECT * from pub where idPub like'"+text+"%' or nomPub like'"+text+"%' or typePub like'"+text+"%' or lienPub like'"+text+"%' ";
        try {
            PreparedStatement ps =  connection.prepareStatement(requete);
           // ps.setString(1, name);
            
            ResultSet rs = ps.executeQuery(requete);
            System.out.println("*******"+rs);
            while(rs.next()){
                Pub pub = new Pub();
                pub.setIdPub(rs.getInt("idPub"));
                pub.setNomPub(rs.getString("nomPub"));
                pub.setTypePub(rs.getString("typePub"));
                pub.setLienPub(rs.getString("lienPub"));
                
                myList.add(pub);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PubDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    return myList;
        
    }
@Override
        public Pub findPubByNom(String nom) {
 Pub p = new Pub();
        String requete = "select * from Pub where nomPub=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setString(1, nom);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                p.setIdPub(resultat.getInt(1));
                p.setNomPub(resultat.getString(2));
                p.setTypePub(resultat.getString(3));
                p.setLienPub(resultat.getString(4));

            }
            return p;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche d'une Personne " + ex.getMessage());
            return null;
        }    }
    
}
