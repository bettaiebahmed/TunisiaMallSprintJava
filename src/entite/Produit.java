/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

/**
 *
 * @author mohamed
 */
public class Produit {
    private String nomProduit;
     private String Description;
     private int image;
 private int prix;
    public Produit(String nomProduit, String Description, int image) {
        this.nomProduit = nomProduit;
        this.Description = Description;
        this.image = image;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getPrix() {
        return prix;
    }

    public Produit(String nomProduit, String Description, int image, int prix) {
        this.nomProduit = nomProduit;
        this.Description = Description;
        this.image = image;
        this.prix = prix;
    }

    public Produit() {
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
     
     
}
