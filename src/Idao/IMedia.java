/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Idao;

import entite.Categorie;
import entite.Media;
import java.sql.ResultSet;

/**
 *
 * @author Hakim
 */
public interface IMedia {
    public void addMedia(Media med);
    public ResultSet getAllIdMedia();
    
}
