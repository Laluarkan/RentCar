/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import config.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.model_karyawan;
import service.service_karyawan;

public class DAO_karyawan implements service_karyawan{
     
    private java.sql.Connection conn;
    
    public DAO_karyawan(){
        conn = koneksi.getConnection();
    }
    
    @Override
    public void tambahkaryawan(model_karyawan mod_karyawan) {
        String sql = "INSERT INTO karyawan (id_karyawan, nama, alamat, no_hp, jabatan, username, password) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, mod_karyawan.getId_karyawan());
            st.setString(2, mod_karyawan.getNama());
            st.setString(3, mod_karyawan.getAlamat());
            st.setString(4, mod_karyawan.getNo_hp());
            st.setString(5, mod_karyawan.getJabatan());
            st.setString(6, mod_karyawan.getUsername());
            st.setString(7, mod_karyawan.getPassword());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_karyawan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void hapuskaryawan(model_karyawan mod_karyawan) {
        String sql = "DELETE FROM karyawan WHERE id_karyawan = ?";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, mod_karyawan.getId_karyawan());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_karyawan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<model_karyawan> ambiltkaryawan() {
        List<model_karyawan> list = new ArrayList<>();
        String sql = "SELECT * FROM karyawan";
        try (PreparedStatement st = conn.prepareStatement(sql);
             ResultSet rs = st.executeQuery()) {
            while (rs.next()) {
                model_karyawan mokar = new model_karyawan();
                mokar.setId_karyawan(rs.getString("id_karyawan"));
                mokar.setNama(rs.getString("nama"));
                mokar.setAlamat(rs.getString("alamat"));
                mokar.setNo_hp(rs.getString("no_hp"));
                mokar.setJabatan(rs.getString("jabatan"));
                mokar.setUsername(rs.getString("username"));
                mokar.setPassword(rs.getString("password"));
                list.add(mokar);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_karyawan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<model_karyawan> pencarian(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String nomor() {
        PreparedStatement st = null;
        ResultSet rs = null;
        String urutan = null;
        
        Date now = new Date();
        SimpleDateFormat tanggal = new SimpleDateFormat ("yyyy-mm-dd");
        SimpleDateFormat noformat = new SimpleDateFormat ("yy");
        String tgl = tanggal.format(now);
        String no = noformat.format(now);
        
        String sql ="SELECT RIGHT (id_karyawan, 3) AS nomor " + "FROM karyawan " +
                "WHERE id_karyawan LIKE 'F1B0%' " + 
                "ORDER BY id_karyawan DESC " + "LIMIT 1";
        
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            
            if (rs.next()){
                int nomor = Integer.parseInt(rs.getString("nomor"));
                nomor++;
                urutan = "F1B0" + no + String.format("%02d", nomor);
            } else {
                urutan = "F1B0" + no + "001";
            }
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_karyawan.class.getName()).log(Level.SEVERE,null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    Logger.getLogger(DAO_karyawan.class.getName()).log(Level.SEVERE,null, ex);
                }
            }
        }
        return urutan;        
    }
}
