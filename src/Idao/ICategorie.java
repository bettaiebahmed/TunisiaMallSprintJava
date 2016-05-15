/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Idao;

import entite.Categorie;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Hakim
 */
public interface ICategorie {
    
    void addCategorie(Categorie cat);

    void updateCategorie(Categorie cat);
    
    public List<Categorie> find(String text);

    void removeCategorieById(int id);

    void removeCategorieByNom(String nom);

  //  List<Promotion> findAll();
public List<Categorie> DisplayAll();
    Categorie  findCategorieById(int id);

    Categorie  findCategorieByNom(String nom);
     public List<String> DisplayAllName();
     public ResultSet getAllNameCat();
    
}
