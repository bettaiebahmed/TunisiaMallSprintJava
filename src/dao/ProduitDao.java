/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Idao.IDao;
import entite.Produit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import utils.DataSource;

/**
 *
 * @author adouni
 */
public class ProduitDao implements IDao<Produit> {

    private Connection connection;
    private PreparedStatement pst;

    public ProduitDao() {
        //initialiser la connection
        connection = DataSource.getInstance().getConnection();
    }

    public void add(Produit t , int idmedia) {
        String req = "insert into produit (`image`, `ref`, `nomProduit`, `Description`, `TypeProduit`, `prixdetaille`, `prix`, `prixGros`, `QuantiteStock`, `nom_categorie`, `idCat`) value(?,?,?,?,?,?,?,?,?,?,?)";

        try {
            pst = connection.prepareStatement(req);
            pst.setInt(1, idmedia);
            pst.setString(2, t.getReference());
            pst.setString(3, t.getNom());
            pst.setString(4, t.getDescription());
            pst.setString(5, t.getType());
            pst.setDouble(6, t.getPrixDetaille());
            pst.setDouble(7, t.getPrix());
           pst.setDouble(8, t.getPrixGros());
           pst.setInt(9, t.getQuantite());
           pst.setString(10, t.getCategorie());
           pst.setInt(11, t.getIdCat());
            
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProduitDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 

    @Override
    public void removeByRef(String ref) {

    String req = "delete from produit where ref=?";
        try {
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setString(1, ref);
            ps.executeUpdate();
            System.out.println("Produit supprimé");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    
    }

    @Override
    public List<Produit> findAll( ) {
        String req = "select `id`, `image`, `ref`, `nomProduit`, `Description`, `TypeProduit`, `prixdetaille`,  `prix`, `prixGros`, `QuantiteStock`, `nom_categorie`, `idCat` from produit" ;
        List<Produit> listeProd = new ArrayList<Produit>();

        try {
            pst = connection.prepareStatement(req);
            ResultSet resultat = pst.executeQuery(req);
 
            while (resultat.next()) {
                Produit p = new Produit();
                p.setId(resultat.getInt(1));
                p.setImage(resultat.getInt(2));
                p.setReference(resultat.getString(3));
                p.setNom(resultat.getString(4));
                p.setDescription(resultat.getString(5));
                p.setType(resultat.getString(6));
                p.setPrixDetaille(resultat.getDouble(7));
                p.setPrix(resultat.getDouble(8));
                p.setPrixGros(resultat.getDouble(9));
                p.setQuantite(resultat.getInt(10));
                p.setCategorie(resultat.getString(11));
                p.setIdCat(resultat.getInt(12));
                listeProd.add(p);
            }
            return listeProd;
        } catch (SQLException ex) {
            System.out.println("erreur Recherche all " + ex.getMessage());
            return null;
        }

    }

    

    @Override
    public void update(Produit t) {


   String req="UPDATE  produit set image = ? , ref = ? , nomProduit = ? , Description = ? , TypeProduit = ? , prixdetaille = ? ,  prix = ? , prixGros = ? , QuantiteStock = ? , nom_categorie = ? , idCat = ? where id= ? ";
     
     try {
            pst = connection.prepareStatement(req);
            pst.setInt(1, t.getImage());
            pst.setString(2, t.getReference());
            pst.setString(3, t.getNom());
            pst.setString(4, t.getDescription());
            pst.setString(5, t.getType());
            pst.setDouble(6, t.getPrixDetaille());
            pst.setDouble(7, t.getPrix());
           pst.setDouble(8, t.getPrixGros());
           pst.setInt(9, t.getQuantite());
           pst.setString(10, t.getCategorie());
           pst.setInt(11, t.getIdCat());
           pst.setInt(12, t.getId());
            
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProduitDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    @Override
    public Produit findById(String ref) {
        
        
              Produit p = new Produit();
        String requete = "select `id`, `image`, `ref`, `nomProduit`, `Description`, `TypeProduit`, `prixdetaille`,  `prix`, `prixGros`, `QuantiteStock`, `nom_categorie`, `idCat` from produit where reference =?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setString(1,ref );
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                 
                p.setId(resultat.getInt(1));
                p.setImage(resultat.getInt(2));
                p.setReference(resultat.getString(3));
                p.setNom(resultat.getString(4));
                p.setDescription(resultat.getString(5));
                p.setType(resultat.getString(6));
                p.setPrixDetaille(resultat.getDouble(7));
                p.setPrix(resultat.getDouble(8));
                p.setPrixGros(resultat.getDouble(9));
                p.setQuantite(resultat.getInt(10));
                p.setCategorie(resultat.getString(11));
                p.setIdCat(resultat.getInt(12));
                
            }
            return p;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche d'une Produit " + ex.getMessage());
            return null;
        }
    
    
    
    
    }

    @Override
    public List<Produit> findAll2(String val) {
        
        
        String req = "select * from produits  where Nom  LIKE  '%" + val + "%' or prix like '%" + val + "%' or quantite LIKE  '%" + val + "%' or type LIKE  '%" + val + "%' or categorie LIKE  '%" + val + "%'  " ;
        List<Produit> listeProd = new ArrayList<Produit>();
        try {
            pst = connection.prepareStatement(req);
            ResultSet resultat = pst.executeQuery(req);

             while (resultat.next()) {
                Produit p = new Produit();
                p.setReference(resultat.getString(1));
                p.setNom(resultat.getString(2));
                p.setDescription(resultat.getString(3));
                p.setPrix(resultat.getDouble(4));
                p.setQuantite(resultat.getInt(5));
                p.setType(resultat.getString(6));
                p.setCategorie(resultat.getString(7));
               // p.setImage(resultat.getBytes(8));
                listeProd.add(p);
             }
            return listeProd;
        } catch (SQLException ex) {
            System.out.println("erreur Recherche all " + ex.getMessage());
            return null;
        }
    }

    public int getNbPorduitparCategorie(String categ) {
        int nb = 0;
        try {
            pst = connection.prepareStatement("SELECT COUNT(*) FROM produit where TypeProduit ='" +categ + "';");
            ResultSet resultset = pst.executeQuery();
            while (resultset.next()) {
                nb += Integer.parseInt(resultset.getString(1));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "description de l'erreur : " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);

        }
        return nb;
    }
    public ResultSet getProduit() {
        PreparedStatement stm;
        try {
            stm = connection.prepareStatement("SELECT `id`, `image`, `ref`, `nomProduit`, `Description`, `TypeProduit`, `prixdetaille`,  `prix`, `prixGros`, `QuantiteStock`, `nom_categorie`, `idCat`  FROM produit;");
            ResultSet allProduit = stm.executeQuery();
            return allProduit;
        } catch (SQLException ex) {
            Logger.getLogger(ProduitDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void add(Produit t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet getAllNameProduit() {
 try {
            pst = connection.prepareStatement("SELECT nomProduit FROM produit;");
            ResultSet allAdmin = pst.executeQuery();
            return allAdmin;
        } catch (SQLException ex) {
            Logger.getLogger(CategorieDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public int getIdOfProduit(String s) {
 try {
     String req  = "SELECT id FROM produit where nomProduit = ? ";
            pst = connection.prepareStatement(req);
            pst.setString(1, s);
            ResultSet allAdmin = pst.executeQuery();
            while (allAdmin.next())
            {
            return  allAdmin.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategorieDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1; 
    }
}


