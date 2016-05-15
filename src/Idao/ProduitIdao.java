/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Idao;

import java.util.List;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author mohamed
 */
public interface ProduitIdao <T>{
    
     List<T> findproduit(String ch);
}
