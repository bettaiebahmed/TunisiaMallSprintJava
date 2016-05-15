
package utils;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import dao.boutiqueDao;
import entite.boutique;
/**
 *
 * @author Mourad
 */
public class DisplaySearchBoutique extends AbstractTableModel{

    
      List<boutique> lst;
String [] columns = {"Id","libelle","surface","cible","link"};
    public DisplaySearchBoutique(String text) {
        
        boutiqueDao dao=new boutiqueDao();
        lst=dao.find(text);
        
        
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
return lst.get(rowIndex).getId();
case 1 :
return lst.get(rowIndex).getLibelleBoutique();
case 2:
return lst.get(rowIndex).getSurfaceBoutique();
case 3 :
return lst.get(rowIndex).getcibleBoutique();
  
default: return null;}
    
    
    
    
    }
      @Override
    public String getColumnName(int i){return columns[i];}
}
