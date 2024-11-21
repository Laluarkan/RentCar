
package service;

import java.util.List;
import model.model_transaksi;

public interface service_transaksi {
    void tambahTransaksi (model_transaksi mdl_transaksi);
    void hapusTRansaksi (model_transaksi mdl_transaksi);
    
    model_transaksi getByid (String id);
    
    List<model_transaksi> ambiltransaksi(); 
    
    List<model_transaksi> pencarian(String id);
    List<model_transaksi> pencarian2();
    List<model_transaksi> pencarian3();
    
    String nomor();
}
