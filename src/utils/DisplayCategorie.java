/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import dao.CategorieDao;
import entite.Categorie;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Hakim
 */
public class DisplayCategorie extends AbstractTableModel {

    List<Categorie> lst;
String [] columns = {"id","nom","type"};

    public DisplayCategorie() {
        CategorieDao catDao = new CategorieDao();
        lst=catDao.DisplayAll();
    }

    @Override
    public int getRowCount() {
return lst.size(); 
    }

    @Override
    public int getColumnCount() {
  return columns.length;    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

     switch(columnIndex){
         case 0 :
return lst.get(rowIndex).getId();
case 1 :
return lst.get(rowIndex).getNom();
case 2:
return lst.get(rowIndex).getType();
default: return null;}
    
    
    
    
    }

}
