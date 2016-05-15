/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author Hakim
 */
public class Promotion {
    
    private int idPromotion  ;
     private String nomPromotion  ;
    private int reduction ;
    private String dateDebut ;
    private String dateFin ;
    private int idProduit ;

    public Promotion() {
    }

    public Promotion(int idPromotion, String nomPromotion, int reduction, String dateDebut, String dateFin, int idProduit) {
        this.idPromotion = idPromotion;
        this.nomPromotion = nomPromotion;
        this.reduction = reduction;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.idProduit = idProduit;
    }

    public Promotion(String nomPromotion, int reduction, String dateDebut, String dateFin, int idProduit) {
        this.nomPromotion = nomPromotion;
        this.reduction = reduction;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.idProduit = idProduit;
    }

    public Promotion(int idPromotion) {
        this.idPromotion = idPromotion;
    }

   

    public int getIdPromotion() {
        return idPromotion;
    }

    public void setIdPromotion(int idPromotion) {
        this.idPromotion = idPromotion;
    }

    public int getReduction() {
        return reduction;
    }

    public void setReduction(int reduction) {
        this.reduction = reduction;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public String getNomPromotion() {
        return nomPromotion;
    }

    public void setNomPromotion(String nomPromotion) {
        this.nomPromotion = nomPromotion;
    }

    @Override
    public String toString() {
        return "Promotion{" + "idPromotion=" + idPromotion + ", nomPromotion=" + nomPromotion + ", reduction=" + reduction + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", idProduit=" + idProduit + '}';
    }

   

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.idPromotion;
        hash = 79 * hash + this.reduction;
        hash = 79 * hash + Objects.hashCode(this.dateDebut);
        hash = 79 * hash + Objects.hashCode(this.dateFin);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Promotion other = (Promotion) obj;
        if (this.idPromotion != other.idPromotion) {
            return false;
        }
        return true;
    }

   
    
    
    
}
