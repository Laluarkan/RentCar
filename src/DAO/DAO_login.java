package DAO;

import tes.Menu_Utama;
import config.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.model_login;
import service.service_login;
import tes.login;

public class DAO_login implements service_login {
    
    private Connection conn;
    
    public DAO_login(){
        conn = koneksi.getConnection();
    }

    @Override
    public void prosesLogin(model_login mod_login) {
        PreparedStatement st = null;
        ResultSet rs = null;
        String Id = null;
        String Nama = null;
        String Level2 = null;
        String sql = "SELECT * FROM karyawan WHERE (id_karyawan = '" 
                + mod_login.getId_pengguna() + 
                "' OR username = '" + mod_login.getUsername() + "') AND password = '" 
                + mod_login.getPassword() + "'";
                System.out.println("SQL Query: " + sql);
        
        try {
            st = conn.prepareStatement (sql);
            rs = st.executeQuery();
            if(rs.next()){
                Id = rs.getString("id_karyawan");
                Nama = rs.getString("nama");
                Level2 = rs.getString("jabatan");
                
                Menu_Utama menu = new Menu_Utama ("Id", "Nama", "Jabatan");
                menu.setVisible(true);
                
                login lg = new login ();
                lg.tutup = true;
            } else {
                JOptionPane.showMessageDialog(null, "Userame dan Password salah", "pesan", JOptionPane.INFORMATION_MESSAGE);
                login lg = new login();
                lg.tutup = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger( DAO_login.class.getName()).log(Level.SEVERE,null,  ex);
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch(SQLException ex){
                    Logger.getLogger(DAO_login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } 
    }  
}
