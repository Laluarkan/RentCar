
package tabelModel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.model_karyawan;

public class tabelMod_karyawan extends AbstractTableModel {

    private List<model_karyawan> list =new ArrayList<>();
    
    private final String[] columnName = {"No","Id","Nama","Alamat","No. HP","Jabatan","Username","Password"};
    
    public void tambahkaryawan(model_karyawan mdl_karyawan){
        list.add(mdl_karyawan);
        fireTableRowsInserted(list.size()-1,list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambah");
    }
    
    public void hapuskaryawan(int index){
        list.remove(index);
        fireTableRowsDeleted(index, index);
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
    }
    
    public void clear(){
        list.clear();
        fireTableDataChanged();
    }
    
    public void setData (List<model_karyawan> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData (int index, model_karyawan mdl_karyawan){
        list.set(index, mdl_karyawan);
        fireTableRowsUpdated(index, index);
    }
    public model_karyawan getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return columnName.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {     
        if (columnIndex == 0){
                return "   " + (rowIndex + 1);
            } else { 
            switch (columnIndex - 1){
                    case 0: return list.get(rowIndex).getId_karyawan();
                    case 1: return list.get(rowIndex).getNama();
                    case 2: return list.get(rowIndex).getAlamat();
                    case 3: return list.get(rowIndex).getNo_hp();
                    case 4: return list.get(rowIndex).getJabatan();
                    case 5: return list.get(rowIndex).getUsername(); 
                    case 6: return list.get(rowIndex).getPassword();

                    default: return null;
                } 
        }
        
    }
    
    public String getColumnName (int column){
        if (column == 0) {
            return "   " + columnName[column];
        } else {
            return columnName[column];
        }
    }
    
}
