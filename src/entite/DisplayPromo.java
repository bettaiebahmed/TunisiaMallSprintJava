/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

import utils.*;
import dao.*;
import entite.*;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Hakim
 */
public class DisplayPromo extends AbstractTableModel{
    List<Promotion> lst;
String [] columns = {"Id","nom","reduction","id produit","date debut","date fin"};
    public DisplayPromo() {
        
        PromotionDAO dao=new PromotionDAO();
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
return lst.get(rowIndex).getIdPromotion();
case 1 :
return lst.get(rowIndex).getNomPromotion();
case 2:
return lst.get(rowIndex).getReduction();
case 3 :
return lst.get(rowIndex).getIdProduit();
    case 4 :
return lst.get(rowIndex).getDateDebut();
        case 5 :
return lst.get(rowIndex).getDateFin();

default: return null;}
    
    
    
    
    }
      @Override
    public String getColumnName(int i){return columns[i];}
}
