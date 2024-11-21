
package service;

import java.util.List;
import model.model_unit;

public interface service_unit {
    void tambahUnit(model_unit mdl_unit);
    void hapusUnit(model_unit mdl_unit);
    
    model_unit getByid (String id);
    
    List<model_unit> ambiltUnit();
    List<model_unit> ambiltUnit2();
    
    List<model_unit> pencarian(String id);
    List<model_unit> pencarian2();
    List<model_unit> pencarian3();
   
}
