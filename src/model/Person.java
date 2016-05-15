/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lenovo
 */
public class Person {
    private static int count;
    private int id;
    private String age;
    private String name;
    private String occupation;
    private String employement;
    private String gov;
    private String gender;

    public Person( String age, String name, String occupation, String employement, String gov, String gender) {
       
        this.age = age;
        this.name = name;
        this.occupation = occupation;
        this.employement = employement;
        this.gov = gov;
        this.gender = gender;
        this.id=count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getEmployement() {
        return employement;
    }

    public void setEmployement(String employement) {
        this.employement = employement;
    }

    public String getGov() {
        return gov;
    }

    public void setGov(String gov) {
        this.gov = gov;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
}
