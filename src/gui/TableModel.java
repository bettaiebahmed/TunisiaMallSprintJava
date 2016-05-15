/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import dao.ProduitDao;
import entite.Produit;
import java.awt.Image;
import java.util.List;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author adouni
 */
public class TableModel extends AbstractTableModel {

    // ProduitDao produitdao = new ProduitDao();
    private String[] nomColonnes = new String[]{"Reference", "Nom", "description", "prix", "quntite", "type", "categorie"};
    private List<Produit> rows =null;

    public TableModel( List<Produit> vt) {
        
       this.rows=vt; 
    }

    
    @Override
    public int getRowCount() {
        return rows.size();

    }

    @Override
    public int getColumnCount() {
        return nomColonnes.length;
    }

    public String getColumnName(int nom_col) {
        return nomColonnes[nom_col];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        //  return rows.get(rowIndex)[columnIndex];
        switch (columnIndex) {

            case 0:
                return rows.get(rowIndex).getReference();

            case 1:
                return rows.get(rowIndex).getNom();

            case 2:
                return rows.get(rowIndex).getDescription();

            case 3:
                return rows.get(rowIndex).getPrix();
            case 4:
                return rows.get(rowIndex).getQuantite();
            case 5:
                return rows.get(rowIndex).getType();
            case 6:
                return rows.get(rowIndex).getCategorie();
             case 7:
                return rows.get(rowIndex).getImage();
                 
     
            
            default:
                return null;

        }

    }
/*
    public void loadData(List<Produit> prods) {
      //  rows = new Vector<String[]>();
        for (Produit p : prods) {
    //        rows.add(new String[]{
                p.getReference(),
                p.getNom(),
                p.getDescription(),
                String.valueOf(p.getPrix()),
                String.valueOf(p.getQuantite()),
                p.getType(),
                p.getCategorie()

            });
            fireTableChanged(null);
        }
    }*/
}
