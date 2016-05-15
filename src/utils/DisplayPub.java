/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import dao.PubDAO;
import entite.Pub;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Hakim
 */
public class DisplayPub extends AbstractTableModel{
    List<Pub> lst;
String [] columns = {"Id","nom","type","lien"};
    public DisplayPub() {
        
        PubDAO dao=new PubDAO();
        lst=dao.DisplayAll();
        
        
    }



    @Override
    public int getRowCount() {
    return lst.size();
    }

    @Override
    public int getColumnCount() {
    return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
   
    
     switch(columnIndex){
         case 0 :
return lst.get(rowIndex).getIdPub();
case 1 :
return lst.get(rowIndex).getNomPub();
case 2:
return lst.get(rowIndex).getTypePub();
case 3 :
return lst.get(rowIndex).getLienPub();

default: return null;}
    
    
    
    
    }
      @Override
    public String getColumnName(int i){return columns[i];}
}
