/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Idao.IMedia;
import entite.Media;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.DataSource;

/**
 *
 * @author Hakim
 */
public class MediaDao implements IMedia {

    private Connection connection;
    private PreparedStatement pst;

    public MediaDao() {
        connection = DataSource.getInstance().getConnection();
    }

    @Override
    public void addMedia(Media med) {
        String req = "insert into media( `name`, `path`) values (?,?)";
        try {
            pst = connection.prepareStatement(req);

            //pst.setDate(1, (Date) med.getUploadAt());
            pst.setString(1, med.getName());
            pst.setString(2, med.getPath());

            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategorieDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public ResultSet getAllIdMedia() {
        try {
            pst = connection.prepareStatement("SELECT id FROM media;");
            ResultSet allid = pst.executeQuery();
            return allid;
        } catch (SQLException ex) {
            Logger.getLogger(MediaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public Integer getDernierId(){
        int dernierId=0;
         try {
            pst = connection.prepareStatement("SELECT MAX(id) FROM media");
            ResultSet resultat = pst.executeQuery();

           if (resultat.next()) {
                 dernierId = resultat.getInt(1);
            }
           // Integer dernierId =(Integer)resultat.getObject("MAX(id)");
             System.out.println(""+dernierId);
            return dernierId ;
    }catch (SQLException ex) {
            Logger.getLogger(MediaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         return null ;

    }
}