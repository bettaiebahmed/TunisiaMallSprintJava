/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import gui.FormEvent;
import java.util.ArrayList;
import model.Database;
import model.Person;
import model.Produit;

/**
 *
 * @author Lenovo
 */
public class Controller {
    Database db = new Database();
     public ArrayList<Produit> getProduit() throws Exception
     {
         return db.getProduit();
     }
    public void addPerson(FormEvent ev) throws Exception
    {
        String name = ev.getName();
        String occupation= ev.getOccupation();
        String age = ev.getAge();
        String employement=ev.getEmployement();
        String gender = ev.getGender();
        String gov=ev.getGov();
        Person person = new Person(age, name, occupation, employement, gov, gender);
            
    }
}
