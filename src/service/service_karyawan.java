
package service;

import java.util.List;
import model.model_karyawan;

public interface service_karyawan {
    void tambahkaryawan(model_karyawan mdl_karyawan);
    void hapuskaryawan(model_karyawan mdl_karyawan);
    
    List<model_karyawan> ambiltkaryawan();
   
    List<model_karyawan> pencarian(String id);
  
    String nomor();
}
