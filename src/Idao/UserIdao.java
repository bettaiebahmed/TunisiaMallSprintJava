/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Idao;

import java.util.List;

/**
 *
 * @author mohamed
 */
public interface UserIdao <T> {
    boolean add(T t);

    void update(T t);

    void removeById(int id);

    List<T> findAll();

    float getrole(String username);
     float getlocked(String username);
      float getvalide(String username);
    
    void login (String username , String password,String locked, String valide);

}

