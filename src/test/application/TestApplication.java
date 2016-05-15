/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.application;

import GUI.Responsable;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import dao.CategorieDao;
import dao.MediaDao;
import dao.ProduitDao;
import entite.Categorie;
import entite.Media;
import entite.Produit;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author adouni
 */
public class TestApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
     /* List<String> ls = new ArrayList<>();
      CategorieDao c = new CategorieDao(); 
      ls = c.DisplayAllName(); 
        for (int i = 0; i < ls.size(); i++) {
            System.out.println(ls.get(i).toString());
            
        }*/
        
        Produit p = new Produit(6,"prod", "test", "ss", 4, 4, 4, 10, "test", 1, "test", 12);
       // Produit p1 = new Produit(8,"prod2", "test2", "sJJJ", 4.5, 4, 4, 10, "test", 1, "test", 14);
        Produit P2 = new Produit("te", "eeee", "eeee", 4.5, 5.6, 5.5, 5, "errt", 1, "ddld", 18);
   Date d = new java.sql.Date(2016, 1, 5);
   Media med = new Media(d,"test", "test");
        MediaDao medao = new MediaDao();
         List<Produit> listeProd = new ArrayList<Produit>();
        ProduitDao dao = new ProduitDao();
        Produit p3;
        medao.addMedia(med);
      // dao.add(P2);
   // listeProd= dao.findAll();
       // System.out.println(listeProd);
       ///p.setImage(5555);
        //p.setNom("produit test");
        //p.setPrix(100);
        //dao.update(p);
       // dao.removeById(6);
      // p3 = dao.findById("te");
       // System.out.println(p3.toString());
    }
    
}
