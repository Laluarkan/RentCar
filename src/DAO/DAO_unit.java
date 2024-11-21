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
import java.util.ArrayList;
import java.util.List;
import model.model_unit;
import service.service_unit;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author lalun
 */
public class DAO_unit implements service_unit {
    
    private java.sql.Connection conn;
    
    public DAO_unit(){
        conn = koneksi.getConnection();
    }

    @Override
    public void tambahUnit(model_unit mod_unit) {
        String sql = "INSERT INTO unit (no_pol, merek, model, tipe, tahun_produksi, warna) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, mod_unit.getNo_pol());
            st.setString(2, mod_unit.getMerek());
            st.setString(3, mod_unit.getModel());
            st.setString(4, mod_unit.getTipe());
            st.setString(5, mod_unit.getTahun_produksi());
            st.setString(6, mod_unit.getWarna());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_unit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void hapusUnit(model_unit mdl_unit) {
         String sql = "DELETE FROM unit WHERE no_pol = ?";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, mdl_unit.getNo_pol());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_unit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public model_unit getByid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<model_unit> ambiltUnit() {
       List<model_unit> list = new ArrayList<>();
        String sql = "SELECT * FROM unit";
        try (PreparedStatement st = conn.prepareStatement(sql);
             ResultSet rs = st.executeQuery()) {
            while (rs.next()) {
                model_unit monit = new model_unit();
                monit.setNo_pol(rs.getString("No_Pol"));
                monit.setMerek(rs.getString("Merek"));
                monit.setModel(rs.getString("Model"));
                monit.setTipe(rs.getString("Tipe"));
                monit.setTahun_produksi(rs.getString("Tahun_Produksi"));
                monit.setWarna(rs.getString("Warna"));
                list.add(monit);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_unit.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<model_unit> ambiltUnit2() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<model_unit> pencarian(String id) {
        List<model_unit> list = new ArrayList<>();
        String sql = "SELECT * FROM unit where no_pol like '%"+id+"%' or model like '%"+id+"%' or merek like '%"+id+"%'";
        try (PreparedStatement st = conn.prepareStatement(sql);
             ResultSet rs = st.executeQuery()) {
            while (rs.next()) {
                model_unit monit = new model_unit();
                monit.setNo_pol(rs.getString("No_Pol"));
                monit.setMerek(rs.getString("Merek"));
                monit.setModel(rs.getString("Model"));
                monit.setTipe(rs.getString("Tipe"));
                monit.setTahun_produksi(rs.getString("Tahun_Produksi"));
                monit.setWarna(rs.getString("Warna"));
                list.add(monit);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_unit.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<model_unit> pencarian2() {
        List<model_unit> list = new ArrayList<>();
        String sql = " SELECT * FROM unit order by model asc;";
        try (PreparedStatement st = conn.prepareStatement(sql);
             ResultSet rs = st.executeQuery()) {
            while (rs.next()) {
                model_unit monit = new model_unit();
                monit.setNo_pol(rs.getString("No_Pol"));
                monit.setMerek(rs.getString("Merek"));
                monit.setModel(rs.getString("Model"));
                monit.setTipe(rs.getString("Tipe"));
                monit.setTahun_produksi(rs.getString("Tahun_Produksi"));
                monit.setWarna(rs.getString("Warna"));
                list.add(monit);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_unit.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }   
    
    @Override
    public List<model_unit> pencarian3() {
        List<model_unit> list = new ArrayList<>();
        String sql = " SELECT * FROM unit order by model desc;";
        try (PreparedStatement st = conn.prepareStatement(sql);
             ResultSet rs = st.executeQuery()) {
            while (rs.next()) {
                model_unit monit = new model_unit();
                monit.setNo_pol(rs.getString("No_Pol"));
                monit.setMerek(rs.getString("Merek"));
                monit.setModel(rs.getString("Model"));
                monit.setTipe(rs.getString("Tipe"));
                monit.setTahun_produksi(rs.getString("Tahun_Produksi"));
                monit.setWarna(rs.getString("Warna"));
                list.add(monit);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_unit.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }   
}
