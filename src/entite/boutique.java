/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

import java.util.Objects;

/**
 *
 * @author Mourad
 */
public class boutique {
    
    private int id;
    private String cibleBoutique;
    private int surfaceBoutique;
    private String libelleBoutique;
    private String link;

    public boutique() {
    }

    public boutique(int id, String cibleBoutique, int surfaceBoutique, String libelleBoutique, String link) {
        this.id = id;
        this.cibleBoutique = cibleBoutique;
        this.surfaceBoutique = surfaceBoutique;
        this.libelleBoutique = libelleBoutique;
        this.link = link;
    }

    public boutique(String cibleBoutique, int surfaceBoutique, String libelleBoutique, String link) {
        this.cibleBoutique = cibleBoutique;
        this.surfaceBoutique = surfaceBoutique;
        this.libelleBoutique = libelleBoutique;
        this.link = link;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getcibleBoutique() {
        return cibleBoutique;
    }

    public void setcibleBoutique(String nomBoutique) {
        this.cibleBoutique = nomBoutique;
    }

    public int getSurfaceBoutique() {
        return surfaceBoutique;
    }

    public void setSurfaceBoutique(int surfaceBoutique) {
        this.surfaceBoutique = surfaceBoutique;
    }

    public String getLibelleBoutique() {
        return libelleBoutique;
    }

    public void setLibelleBoutique(String libelleBoutique) {
        this.libelleBoutique = libelleBoutique;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.id;
        hash = 71 * hash + Objects.hashCode(this.cibleBoutique);
        hash = 71 * hash + this.surfaceBoutique;
        hash = 71 * hash + Objects.hashCode(this.libelleBoutique);
        hash = 71 * hash + Objects.hashCode(this.link);
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
        final boutique other = (boutique) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.cibleBoutique, other.cibleBoutique)) {
            return false;
        }
        if (this.surfaceBoutique != other.surfaceBoutique) {
            return false;
        }
        if (!Objects.equals(this.libelleBoutique, other.libelleBoutique)) {
            return false;
        }
        if (!Objects.equals(this.link, other.link)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "boutique{" + "id=" + id + ", nomBoutique=" + cibleBoutique + ", surfaceBoutique=" + surfaceBoutique + ", libelleBoutique=" + libelleBoutique + ", link=" + link + '}';
    }
    
    
    
    
}
