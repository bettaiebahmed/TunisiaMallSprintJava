/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entite.Categorie;
import entite.Produit;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utils.DataSource;


/**
 *
 * @author Hakim
 */
public class CategorieDao implements Idao.ICategorie{

    
    private Connection connection;
    private PreparedStatement pst;

    public CategorieDao() {
         connection = DataSource.getInstance().getConnection();
    }
    
       
    @Override
    public void addCategorie(Categorie cat) {

    String req = "insert into categorie(nom,type) values (?,?)";
        try {
            pst = connection.prepareStatement(req);
            
            pst.setString(1, cat.getNom());
            pst.setString(2, cat.getType());
           
            
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategorieDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    @Override
    public void updateCategorie(Categorie cat) {
String req = "UPDATE categorie SET  nom = ? , type = ?   WHERE id =? ";     
try {
            pst = connection.prepareStatement(req);
            
            pst.setString(1, cat.getNom());
            pst.setString(2, cat.getType());
           pst.setInt(3, cat.getId());
            
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategorieDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    @Override
    public List<Categorie> find(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeCategorieById(int id) {
String requete = "delete from categorie where id=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("promotion supprimé");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }     }

    @Override
    public void removeCategorieByNom(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Categorie> DisplayAll() {
  List<Categorie> myList = new ArrayList<>();
       String requete = "SELECT * FROM categorie";
        try {
            Statement st =  connection.createStatement();
            ResultSet rs = st.executeQuery(requete);
            while(rs.next()){
                Categorie cat = new Categorie();
                cat.setId(rs.getInt("id"));
                cat.setNom(rs.getString("nom"));
                cat.setType(rs.getString("type"));
               
                
                myList.add(cat);

                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CategorieDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       return myList;
    }

    @Override
    public Categorie findCategorieById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Categorie findCategorieByNom(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<String> DisplayAllName() {
List<String> myList = new ArrayList<>();
       String requete = "SELECT * FROM categorie";
        try {
            Statement st =  connection.createStatement();
            ResultSet rs = st.executeQuery(requete);
            while(rs.next()){
                
              
                myList.add(rs.getString("nom"));

                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CategorieDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       return myList;    }

    public ResultSet getAllNameCat() {
        try {
            pst = connection.prepareStatement("SELECT nom FROM categorie;");
            ResultSet allAdmin = pst.executeQuery();
            return allAdmin;
        } catch (SQLException ex) {
            Logger.getLogger(CategorieDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public Categorie findCategorieByNon(String nomCat)
    {
   
        Categorie cat=new Categorie();
        String requete="select * from categorie where nom =?";
        try {
           pst = connection.prepareStatement(requete);
            pst.setString(1, nomCat);
            ResultSet resultat = pst.executeQuery();
         
            while (resultat.next())
            {
                cat.setId(resultat.getInt(1));
                 cat.setNom(resultat.getString(2));
                cat.setType(resultat.getString(3));
               
            }
            return cat;
            
            
        } catch (SQLException ex) {
               System.out.println("erreur lors de la recherche du prest "+ex.getMessage());
               return null; 
        }
    }
}
