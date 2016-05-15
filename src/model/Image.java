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
public class Image {
    private int id;
    private String name;
    private String path;
    float prixAchat;
                String nomArticle; 
                String TypeArticle; 
                String genreArticle; 
             

    public Image() {
    }

    public Image(int id, String path, float prixAchat, String nomArticle, String TypeArticle, String genreArticle) {
        this.id = id;
        this.path = path;
        this.prixAchat = prixAchat;
        this.nomArticle = nomArticle;
        this.TypeArticle = TypeArticle;
        this.genreArticle = genreArticle;
    }

    public float getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(float prixAchat) {
        this.prixAchat = prixAchat;
    }

    public String getNomArticle() {
        return nomArticle;
    }

    public void setNomArticle(String nomArticle) {
        this.nomArticle = nomArticle;
    }

    public String getTypeArticle() {
        return TypeArticle;
    }

    public void setTypeArticle(String TypeArticle) {
        this.TypeArticle = TypeArticle;
    }

    public String getGenreArticle() {
        return genreArticle;
    }

    public void setGenreArticle(String genreArticle) {
        this.genreArticle = genreArticle;
    }
    

    public Image(int id, String name, String path) {
        this.id = id;
        this.name = name;
        this.path = path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    
}
