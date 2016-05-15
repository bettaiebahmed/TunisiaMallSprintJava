package dao;

import Idao.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import utils.*;
import entite.*;

/**
 *
 * @author Mourad
 */
public class boutiqueDao implements IDao<boutique> {

    private Connection connection;
    private PreparedStatement pst;

    public boutiqueDao() {

        connection = DataSource.getInstance().getConnection();

    }

    @Override
    public void add(boutique t) {
        String req = "insert into boutique (cible, Surface, libelle, link) values (?,?,?,?)";
        try {
            pst = connection.prepareStatement(req);
            pst.setString(1, t.getcibleBoutique());
            pst.setInt(2, t.getSurfaceBoutique());
            pst.setString(3, t.getLibelleBoutique());
            pst.setString(4, t.getLink());

            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(boutiqueDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(boutique t) {
        System.out.println("3.1");
        String req = "UPDATE boutique SET cible = ?, libelle = ?, Surface=?, link=?  WHERE id =? ";
        try {
            pst = connection.prepareStatement(req);
            pst.setString(1, t.getcibleBoutique());
            pst.setString(2, t.getLibelleBoutique());
            pst.setInt(3, t.getSurfaceBoutique());
            pst.setString(4, t.getLink());
            pst.setInt(5, t.getId());
            System.out.println("3.2");
            pst.executeUpdate();
            System.out.println("3.3");
        } catch (SQLException ex) {
            Logger.getLogger("mise a jour impossible").log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void removeById(int id) {
        String requete = "delete from boutique where id=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Boutique supprimé");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }

    @Override
    public List<boutique> findAll() {
        List<boutique> listeboutique = new ArrayList<>();
        String req = "select * from boutique";
        try {
            pst = connection.prepareStatement(req);
            ResultSet resultat = pst.executeQuery(req);
            while (resultat.next()) {
                boutique t = new boutique();
                t.setId(resultat.getInt(1));
                t.setLibelleBoutique(resultat.getString(2));
                t.setcibleBoutique(resultat.getString(3));

                t.setSurfaceBoutique(resultat.getInt(4));
                t.setLink(resultat.getString(5));
                listeboutique.add(t);
            }
            return listeboutique;
        } catch (SQLException ex) {
            System.out.println("erreur Recherche all " + ex.getMessage());
            return null;
        }
    }

    @Override
    public List<boutique> find(String text) {
        List<boutique> myList = new ArrayList<>();
        String requete = "SELECT * from boutique where id like'" + text + "%' or libelle like'" + text + "%' or Surface like'" + text + "%' or Cible like'" + text + "%' ";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
           // ps.setString(1, name);

            ResultSet rs = ps.executeQuery(requete);
            System.out.println("*******" + rs);
            while (rs.next()) {
                boutique pub = new boutique();
                pub.setId(rs.getInt("id"));
                pub.setLibelleBoutique(rs.getString("libelle"));
                pub.setSurfaceBoutique(rs.getInt("Surface"));
                pub.setcibleBoutique(rs.getString("Cible"));

                myList.add(pub);
            }

        } catch (SQLException ex) {
            Logger.getLogger(boutiqueDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return myList;

    }

    @Override
    public boutique findById(int id) {
        boutique t = new boutique();
        String requete = "select * from boutique where id=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                t.setId(resultat.getInt(1));
                t.setLibelleBoutique(resultat.getString(2));
                t.setSurfaceBoutique(resultat.getInt(3));
                t.setcibleBoutique(resultat.getString(4));
                t.setLink(resultat.getString(5));
            }
            return t;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche d'une boutique " + ex.getMessage());
            return null;
        }
    }

    @Override
    public List<boutique> find() {
        ArrayList Listeuser = new ArrayList<boutique>();
        String req = "select libelle , cible from boutique";
        try {
            pst = connection.prepareStatement(req);
            ResultSet Resultat = pst.executeQuery();
            while (Resultat.next()) {
                boutique p = new boutique();
                p.setLibelleBoutique(Resultat.getString(1));
                p.setcibleBoutique(Resultat.getString(2));
                Listeuser.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Listeuser;
    }

    /**
     *
     * @return
     */
    
    
    
}
