
package tabelModel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.model_unit;
        
public class tabelMod_unit extends AbstractTableModel {
    
    private List<model_unit> list =new ArrayList<>();
     
    
    public void tambahUnit(model_unit mdl_unit){
        list.add(mdl_unit);
        fireTableRowsInserted(list.size()-1,list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambah");
    }
    
    public void hapusUnit(int index){
        list.remove(index);
        fireTableRowsDeleted(index, index);
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
    }
    
    public void clear(){
        list.clear();
        fireTableDataChanged();
    }
    
    public void setData (List<model_unit> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData (int index, model_unit mdl_unit){
        list.set(index, mdl_unit);
        fireTableRowsUpdated(index, index);
    }
    public model_unit getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    private final String[] columnName = {"no","No_Pol","Merek","Model","Tipe","Tahun Produksi","Warna"}; 
    
    public int getColumnCount(){
        return columnName.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0){
            return "   " + (rowIndex + 1);
        } else {
            switch (columnIndex -1){
                case 0: return list.get(rowIndex).getNo_pol();
                case 1: return list.get(rowIndex).getMerek();
                case 2: return list.get(rowIndex).getModel();
                case 3: return list.get(rowIndex).getTipe();
                case 4: return list.get(rowIndex).getTahun_produksi();
                case 5: return list.get(rowIndex).getWarna();         
            
            default: return null;
            }
        }               
    }
    
    @Override
    public String getColumnName(int column){
        if (column == 0) {
            return "   " + columnName[column];
        } else {
            return columnName[column];
        }
    }       
}
