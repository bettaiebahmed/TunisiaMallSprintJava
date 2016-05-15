/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Idao;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author mohamed
 */
public interface AdminIdao<T> {

//    void add(T t);
    public void executeSQlQuery(String query, String message) ;

//    void showuserinjtable();

//    void update(T t);
//
//    void removeById(int id);

    ArrayList<T> getlistuser();
    
    void unlock(String username);
     void lock(String username);
     void validate(String username);
     

}
