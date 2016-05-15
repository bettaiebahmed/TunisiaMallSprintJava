/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Idao;

import entite.Produit;
import java.sql.ResultSet;
import java.util.List;

public interface IDao<T> {

    void add(T t);

    void update( Produit t );

    public void removeByRef(String ref);

    List<T> findAll();
   List<T> findAll2(String val );
    T findById(String ref);
    public ResultSet getAllNameProduit();
    public int getIdOfProduit(String s);

}
