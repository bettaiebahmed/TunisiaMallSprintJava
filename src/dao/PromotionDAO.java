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
public class PromotionDAO implements IPromotion{
    
    
    private Connection connection;
    private PreparedStatement pst;

    public PromotionDAO() {
        //initialiser la connection
        connection = DataSource.getInstance().getConnection();

    }

    @Override
    public void addPromotion(Promotion p) {
 String req = "insert into promotion(nomPromotion,dateDebut,dateFin,reduction,idProduit ) values (?,?,?,?,?)";
        try {
            pst = connection.prepareStatement(req);
            
            pst.setString(1, p.getNomPromotion());
            pst.setString(2, p.getDateDebut());
            pst.setString(3, p.getDateFin());
            pst.setInt(4, p.getReduction());
            pst.setInt(5, p.getIdProduit());
            
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PromotionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
     @Override
    public List<Promotion> DisplayAll() {
        List<Promotion> myList = new ArrayList<>();
       String requete = "SELECT * FROM promotion";
        try {
            Statement st =  connection.createStatement();
            ResultSet rs = st.executeQuery(requete);
            while(rs.next()){
                Promotion promo = new Promotion();
                promo.setIdPromotion(rs.getInt("idPromotion"));
                promo.setNomPromotion(rs.getString("nomPromotion"));
                promo.setDateDebut(rs.getString("dateDebut"));
                promo.setDateFin(rs.getString("dateFin"));
                promo.setReduction(rs.getInt("reduction"));
                promo.setIdProduit(rs.getInt("idProduit"));
                
                myList.add(promo);

                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PromotionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return myList;
    }

    @Override
    public void updatePromotion(Promotion promo) {
String req = "UPDATE promotion SET  nomPromotion = ? , reduction = ? , idProduit = ?, dateDebut = ?, dateFin = ? WHERE idPromotion =? ";
        try {
            pst = connection.prepareStatement(req);
            pst.setString(1, promo.getNomPromotion());
            pst.setInt(2, promo.getReduction());
            pst.setInt(3, promo.getIdProduit());
            pst.setString(4, promo.getDateDebut());
            pst.setString(5, promo.getDateFin());
            pst.setInt(6, promo.getIdPromotion());

            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PromotionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }    }
    
    
    @Override
    public List<Promotion> find(String text) {
        List<Promotion> myList = new ArrayList<>();
       String requete = "SELECT * from promotion where idPromotion like'"+text+"%' or nomPromotion like'"+text+"%' or reduction like'"+text+"%' or idProduit like'"+text+"%' or dateDebut like'"+text+"%' or dateFin like'"+text+"%' ";
        try {
            PreparedStatement ps =  connection.prepareStatement(requete);
           // ps.setString(1, name);
            
            ResultSet rs = ps.executeQuery(requete);
            System.out.println("*******"+rs);
            while(rs.next()){
                Promotion promo = new Promotion();
                promo.setIdPromotion(rs.getInt("idPromotion"));
                promo.setNomPromotion(rs.getString("nomPromotion"));
                promo.setReduction(rs.getInt("reduction"));
                promo.setDateDebut(rs.getString("dateDebut"));
                promo.setDateFin(rs.getString("dateFin"));
                promo.setIdProduit(rs.getInt("idProduit"));
                
                myList.add(promo);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PubDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    return myList;
        
    }

    @Override
    public void removePromotionById(int id) {
String requete = "delete from promotion where idPromotion=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("promotion supprimé");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }    }

    @Override
    public void removePromotionByNom(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pub findPromotionById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pub findPromotionByNom(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
