
package utils;

import java.util.List;
import javax.swing.table.AbstractTableModel;

import dao.boutiqueDao;
import entite.boutique;
import java.util.ArrayList;

/**
 *
 * @author Mourad
 */
public class DisplayBoutique  extends AbstractTableModel
{     List<boutique> lst ;
String [] columns = {"Id","cibleBoutique","surfaceBoutique","libelleBoutique","link"};
    public DisplayBoutique() {
        
        boutiqueDao dao=new boutiqueDao();
        lst=dao.findAll();
        
        
    }

    @Override
    public int getRowCount() {
return lst.size();    }

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
case 4 :
return lst.get(rowIndex).getLink();

default: return null;}    }
}
