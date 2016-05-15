/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import Idao.*;
import entite.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.DataSource;

/**
 *
 * @author mohamed
 */
public class ProduitDao implements ProduitIdao<Produit>{
    
    private PreparedStatement pst;
    private ResultSet rs;
      private Connection connection;
      
    public ProduitDao() {
        connection = DataSource.getInstance().getConnection();
    }
    
    

    @Override
    public List<Produit> findproduit( String libelleB) {
       ArrayList Listeuser = new ArrayList<Produit>();
        String req = "select Description , NomProduit , Image,prix  from produit where libelle_boutique= '" + libelleB + "'";
        try {
            pst = connection.prepareStatement(req);
            ResultSet Resultat = pst.executeQuery();
            while (Resultat.next()) {
                Produit p = new Produit();
                p.setDescription(Resultat.getString(2));
                p.setNomProduit(Resultat.getString(1));
                p.setImage(Resultat.getInt(3));
                p.setPrix(Resultat.getInt(4));
                System.out.println(Resultat);
                Listeuser.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Listeuser;
    }
    }
    
