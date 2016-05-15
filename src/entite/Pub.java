/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

/**
 *
 * @author Hakim
 */
public class Pub {
    
    private int idPub;
    private String nomPub;
         private String typePub;
    private String lienPub;

    public Pub(int idPub, String nomPub, String typePub, String lienPub) {
        this.idPub = idPub;
        this.nomPub = nomPub;
        this.typePub = typePub;
        this.lienPub = lienPub;
    }

    public Pub(String nomPub, String typePub, String lienPub) {
        this.nomPub = nomPub;
        this.typePub = typePub;
        this.lienPub = lienPub;
    }
    

    public Pub() {
    }

    public int getIdPub() {
        return idPub;
    }

    public void setIdPub(int idPub) {
        this.idPub = idPub;
    }

    public String getNomPub() {
        return nomPub;
    }

    public void setNomPub(String nomPub) {
        this.nomPub = nomPub;
    }

    public String getTypePub() {
        return typePub;
    }

    public void setTypePub(String typePub) {
        this.typePub = typePub;
    }

    public String getLienPub() {
        return lienPub;
    }

    public void setLienPub(String lienPub) {
        this.lienPub = lienPub;
    }

    @Override
    public String toString() {
        return "Pub{" + "idPub=" + idPub + ", nomPub=" + nomPub + ", typePub=" + typePub + ", lienPub=" + lienPub + '}';
    }


}
