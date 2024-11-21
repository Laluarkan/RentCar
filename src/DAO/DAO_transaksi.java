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
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.model_transaksi;
import model.model_unit;
import service.service_transaksi;

/**
 *
 * @author lalun
 */
public class DAO_transaksi implements service_transaksi {
    
    private java.sql.Connection conn;
    
    public DAO_transaksi(){
        conn = koneksi.getConnection();
    }

    @Override
    public void tambahTransaksi(model_transaksi mdl_transaksi) {
        String sql = "INSERT INTO transaksi (id_transaksi, no_pol, kartu_identitas, nama_pelanggan, waktu, jumlah, total, tanggal_pinjam) VALUES (?, ?, ? , ?, ?, ?, ?, ?)";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, mdl_transaksi.getId_transaksi());
            st.setString(2, mdl_transaksi.getJns_unit().getNo_pol());
            st.setString(3, mdl_transaksi.getKartu_identitas());
            st.setString(4, mdl_transaksi.getnama_pelanggan());
            
            st.setString(5, mdl_transaksi.getWaktu());
            String jumlahDenganHari = mdl_transaksi.getJumlah() + " hari";
            
            st.setString(6, jumlahDenganHari);
            st.setString(7,mdl_transaksi.getTotal());
            st.setString(8,mdl_transaksi.getTanggal_pinjam());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void hapusTRansaksi(model_transaksi mdl_transaksi) {
        String sql = "DELETE FROM transaksi WHERE id_transaksi = ?";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, mdl_transaksi.getId_transaksi());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public model_transaksi getByid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<model_transaksi> ambiltransaksi() {
        List<model_transaksi> list = new ArrayList<>();
        String sql = "SELECT tr.id_transaksi, tr.no_pol, unt.model, tr.kartu_identitas, tr.nama_pelanggan, tr.waktu, tr.jumlah, tr.total, tr.tanggal_pinjam FROM transaksi tr INNER JOIN unit unt ON unt.no_pol=tr.no_pol;";

        try (PreparedStatement st = conn.prepareStatement(sql);
             ResultSet rs = st.executeQuery()) {
            while (rs.next()) {
                model_transaksi motra = new model_transaksi();
                model_unit monit = new model_unit();
                
                motra.setId_transaksi(rs.getString("id_transaksi"));
                monit.setNo_pol(rs.getString("no_pol"));
                monit.setModel(rs.getString("model"));
                motra.setKartu_identitas(rs.getString("kartu_identitas"));
                motra.setnama_pelanggan(rs.getString("nama_pelanggan"));
                motra.setWaktu(rs.getString("waktu"));
                motra.setJumlah(rs.getString("jumlah"));
                motra.setTotal(rs.getString("total"));
                motra.setTanggal_pinjam(rs.getString("tanggal_pinjam"));
                
                motra.setJns_unit(monit);
                
                list.add(motra);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<model_transaksi> pencarian(String id) {
        List<model_transaksi> list = new ArrayList<>();
        String sql = "SELECT tr.id_transaksi, tr.no_pol, unt.model, tr.kartu_identitas, tr.nama_pelanggan, tr.waktu, tr.jumlah, tr.total, tr.tanggal_pinjam FROM transaksi tr INNER JOIN unit unt ON unt.no_pol=tr.no_pol where tr.no_pol like '%"+id+"%' or nama_pelanggan like '%"+id+"%' or tanggal_pinjam  like '%"+id+"%';";
        try (PreparedStatement st = conn.prepareStatement(sql);
             ResultSet rs = st.executeQuery()) {
            while (rs.next()) {
                model_transaksi motra = new model_transaksi();
                model_unit monit = new model_unit();
                
                motra.setId_transaksi(rs.getString("id_transaksi"));
                monit.setNo_pol(rs.getString("no_pol"));
                monit.setModel(rs.getString("model"));
                motra.setKartu_identitas(rs.getString("kartu_identitas"));
                motra.setnama_pelanggan(rs.getString("nama_pelanggan"));
                motra.setWaktu(rs.getString("waktu"));
                motra.setJumlah(rs.getString("jumlah"));
                motra.setTotal(rs.getString("total"));
                motra.setTanggal_pinjam(rs.getString("tanggal_pinjam"));
                
                motra.setJns_unit(monit);
                
                list.add(motra);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_unit.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public String nomor() {
        PreparedStatement st = null;
        ResultSet rs = null;
        String urutan = null;
        
        Date now = new Date();
        SimpleDateFormat tanggal = new SimpleDateFormat ("yyyy-mm-dd");
        SimpleDateFormat noformat = new SimpleDateFormat ("yyMM");
        String tgl = tanggal.format(now);
        String no = noformat.format(now);
        
        String sql ="SELECT RIGHT (id_transaksi, 3) AS nomor " + "FROM transaksi " +
                "WHERE id_transaksi LIKE 'T%' " + 
                "ORDER BY id_transaksi DESC " + "LIMIT 1";
        
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            
            if (rs.next()){
                int nomor = Integer.parseInt(rs.getString("nomor"));
                nomor++;
                urutan = "T" + no + String.format("%03d", nomor);
            } else {
                urutan = "T" + no + "001";
            }
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_transaksi.class.getName()).log(Level.SEVERE,null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    Logger.getLogger(DAO_transaksi.class.getName()).log(Level.SEVERE,null, ex);
                }
            }
        }
        return urutan;        
    }
    
    @Override
    public List<model_transaksi> pencarian2() {
        List<model_transaksi> list = new ArrayList<>();
        String sql = "SELECT tr.id_transaksi, tr.no_pol, unt.model, tr.kartu_identitas, tr.nama_pelanggan, tr.waktu, tr.jumlah, tr.total, tr.tanggal_pinjam FROM transaksi tr INNER JOIN unit unt ON unt.no_pol=tr.no_pol order by total asc;";
        try (PreparedStatement st = conn.prepareStatement(sql);
             ResultSet rs = st.executeQuery()) {
            while (rs.next()) {
                model_transaksi motra = new model_transaksi();
                model_unit monit = new model_unit();
                
                motra.setId_transaksi(rs.getString("id_transaksi"));
                monit.setNo_pol(rs.getString("no_pol"));
                monit.setModel(rs.getString("model"));
                motra.setKartu_identitas(rs.getString("kartu_identitas"));
                motra.setnama_pelanggan(rs.getString("nama_pelanggan"));
                motra.setWaktu(rs.getString("waktu"));
                motra.setJumlah(rs.getString("jumlah"));
                motra.setTotal(rs.getString("total"));
                motra.setTanggal_pinjam(rs.getString("tanggal_pinjam"));
                
                motra.setJns_unit(monit);
                
                list.add(motra);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_unit.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    @Override
    public List<model_transaksi> pencarian3() {
        List<model_transaksi> list = new ArrayList<>();
        String sql = "SELECT tr.id_transaksi, tr.no_pol, unt.model, tr.kartu_identitas, tr.nama_pelanggan, tr.waktu, tr.jumlah, tr.total, tr.tanggal_pinjam FROM transaksi tr INNER JOIN unit unt ON unt.no_pol=tr.no_pol order by total desc;";
        try (PreparedStatement st = conn.prepareStatement(sql);
             ResultSet rs = st.executeQuery()) {
            while (rs.next()) {
                model_transaksi motra = new model_transaksi();
                model_unit monit = new model_unit();
                
                motra.setId_transaksi(rs.getString("id_transaksi"));
                monit.setNo_pol(rs.getString("no_pol"));
                monit.setModel(rs.getString("model"));
                motra.setKartu_identitas(rs.getString("kartu_identitas"));
                motra.setnama_pelanggan(rs.getString("nama_pelanggan"));
                motra.setWaktu(rs.getString("waktu"));
                motra.setJumlah(rs.getString("jumlah"));
                motra.setTotal(rs.getString("total"));
                motra.setTanggal_pinjam(rs.getString("tanggal_pinjam"));
                
                motra.setJns_unit(monit);
                
                list.add(motra);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_unit.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
}
