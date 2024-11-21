
package tabelModel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.model_transaksi;

public class tabelMod_transaksi extends AbstractTableModel{
    private List<model_transaksi> list =new ArrayList<>();
    
    private final String[] columnName = {"No","Id","No.Pol", "Model","Kartu Identitas","Nama Pelanggan ","Waktu","Jumlah", "Total", "Tanggal Pinjam"}; 
    
    public void tambahtransaksi(model_transaksi mdl_transaksi){
        list.add(mdl_transaksi);
        fireTableRowsInserted(list.size()-1,list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambah");
    }
    
    public void hapustransaksi(int index){
        list.remove(index);
        fireTableRowsDeleted(index, index);
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
    }
    
    public void clear(){
        list.clear();
        fireTableDataChanged();
    }
    
    public void setData (List<model_transaksi> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData (int index, model_transaksi mdl_transaksi){
        list.set(index, mdl_transaksi);
        fireTableRowsUpdated(index, index);
    }
    public model_transaksi getData(int index){
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
                case 0: return list.get(rowIndex).getId_transaksi();
                case 1: return list.get(rowIndex).getJns_unit().getNo_pol();
                case 2: return list.get(rowIndex).getJns_unit().getModel();
                case 3: return list.get(rowIndex).getKartu_identitas();
                case 4: return list.get(rowIndex).getnama_pelanggan();
                case 5: return list.get(rowIndex).getWaktu();
                case 6: return list.get(rowIndex).getJumlah(); 
                case 7: return list.get(rowIndex).getTotal();
                case 8: return list.get(rowIndex).getTanggal_pinjam();

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
