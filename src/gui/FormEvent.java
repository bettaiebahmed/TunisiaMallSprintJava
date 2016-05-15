/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.EventObject;

/**
 *
 * @author Lenovo
 */
public class FormEvent extends EventObject {
    private String age;
    private String name;
    private String occupation;
    private String employement;
    private String gov;
    private String gender;
    

    public FormEvent(Object o) {
        super(o);
    }

    public FormEvent(String name, String occupation, Object o,String age,String employement,String gov,String gender) {
        super(o);
        this.name = name;
        this.occupation = occupation;
        this.age=age;
        this.employement=employement;
        this.gov=gov;
        this.gender=gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGov() {
        return gov;
    }

    public void setGov(String gov) {
        this.gov = gov;
    }

    public String getEmployement() {
        return employement;
    }

    public void setEmployement(String employement) {
        this.employement = employement;
    }
    

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
}
