/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Idao;

import entite.*;
import java.util.List;

/**
 *
 * @author Hakim
 */
public interface IPub {
     void addPub(Pub publicite);

    void updatePub(Pub publicite);
    public List<Pub> DisplayAll();

    void removePubById(int id);

    void removePubByNom(String nom);
    public List<Pub> find(String text);

  // List<Pub> findAll();

    Pub findPubById(int id);

    Pub findPubByNom(String nom);
    
}
