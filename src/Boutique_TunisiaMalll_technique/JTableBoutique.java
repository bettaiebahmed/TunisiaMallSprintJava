/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boutique_TunisiaMalll_technique;


import java.util.ArrayList;
import java.util.List;
import javax.swing.event.EventListenerList;
import javax.swing.table.AbstractTableModel;
import dao.*;
import entite.*;

/**
 *
 * @author Mourad
 */
public class JTableBoutique extends AbstractTableModel {
    boutique b;
    private String entete[] = {"Libelle","Cible","Surface","Link"};
    private List<boutique> Listb = new ArrayList<>();

    public JTableBoutique() {
        
        boutiqueDao bdao = new boutiqueDao();
        Listb = bdao.findAll();
    }

    public JTableBoutique(List<boutique> Listb) {

        this.Listb = Listb;
    }

    public String[] getEntete() {
        return entete;
    }

    public void setEntete(String[] entete) {
        this.entete = entete;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public void setListenerList(EventListenerList listenerList) {
        this.Listb = Listb;
    }

    public int getIdBoutique(int rowIndex) {
        boutique b = null;
        for (boutique bq : Listb) {
            b = Listb.get(rowIndex);
        }
        return b.getId();
    }

    @Override
    public int getRowCount() {
        return Listb.size();
    }

    @Override
    public int getColumnCount() {
        return entete.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        switch (columnIndex) {
              case 0:
                 return Listb.get(rowIndex).getLibelleBoutique();
             case 1:
                 return Listb.get(rowIndex).getcibleBoutique();
             case 2:
                 return Listb.get(rowIndex).getSurfaceBoutique();
             case 3:
                 return Listb.get(rowIndex).getLink();
            default:
                return null;
        }
    }

    public List<boutique> getListboutique() {
        return Listb;
    }

    public void setListBoutique(List<boutique> Listres) {
        this.Listb = Listres;
    }
      @Override
   public String getColumnName(int column)  {
       return entete[column];
   }

}
