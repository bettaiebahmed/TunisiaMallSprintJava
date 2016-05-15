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
public interface  IPromotion {
     void addPromotion(Promotion promo);

    void updatePromotion(Promotion promo);
    
    public List<Promotion> find(String text);

    void removePromotionById(int id);

    void removePromotionByNom(String nom);

  //  List<Promotion> findAll();
public List<Promotion> DisplayAll();
    Pub findPromotionById(int id);

    Pub findPromotionByNom(String nom);
    
}
