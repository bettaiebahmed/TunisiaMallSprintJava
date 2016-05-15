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
public class Produit {
    private int id;
    private int image;
    private String nomArticle;
    private float prixAchat;
    private float prixVenteDetail;
    private float prixVenteGros;
    private String typeArticle;
    private String genreArticle;
    private int qte;

    public Produit(int id, int image, String nomArticle, float prixAchat, float prixVenteDetail, float prixVenteGros, String typeArticle, String genreArticle,int qte) {
        this.id = id;
        this.image = image;
        this.nomArticle = nomArticle;
        this.prixAchat = prixAchat;
        this.prixVenteDetail = prixVenteDetail;
        this.prixVenteGros = prixVenteGros;
        this.typeArticle = typeArticle;
        this.genreArticle = genreArticle;
        this.qte=qte;
    }
    

    public Produit() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNomArticle() {
        return nomArticle;
    }

    public void setNomArticle(String nomArticle) {
        this.nomArticle = nomArticle;
    }

    public float getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(float prixAchat) {
        this.prixAchat = prixAchat;
    }

    public float getPrixVenteDetail() {
        return prixVenteDetail;
    }

    public void setPrixVenteDetail(float prixVenteDetail) {
        this.prixVenteDetail = prixVenteDetail;
    }

    public float getPrixVenteGros() {
        return prixVenteGros;
    }

    public void setPrixVenteGros(float prixVenteGros) {
        this.prixVenteGros = prixVenteGros;
    }

    public String getTypeArticle() {
        return typeArticle;
    }

    public void setTypeArticle(String typeArticle) {
        this.typeArticle = typeArticle;
    }

    public String getGenreArticle() {
        return genreArticle;
    }

    public void setGenreArticle(String genreArticle) {
        this.genreArticle = genreArticle;
    }
    
}
