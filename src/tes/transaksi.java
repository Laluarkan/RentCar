
package tes;

import DAO.DAO_transaksi;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.model_transaksi;
import model.model_unit;
import service.service_transaksi;
import tabelModel.tabelMod_transaksi;
import tes.form_unit;



public class transaksi extends javax.swing.JPanel {
    
    private service_transaksi servis = new DAO_transaksi ();
    private tabelMod_transaksi tblModel = new tabelMod_transaksi();
    
    public transaksi() {
        initComponents();
        setDateToday();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t_nopol = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        box_waktu = new javax.swing.JComboBox<>();
        txt_tanggal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t_total = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t_kartuIdentitas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        t_namaPelanggan = new javax.swing.JTextField();
        btn_simpan = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        t_jumlah = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        t_id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        t_model = new javax.swing.JTextField();
        btn_pilih = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Transaksi");
        jLabel1.setPreferredSize(new java.awt.Dimension(146, 32));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("NoPol");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Waktu");

        box_waktu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Waktu -", "Bulan", "Hari", "Jam" }));

        txt_tanggal.setEditable(false);
        txt_tanggal.setBackground(new java.awt.Color(255, 255, 255));
        txt_tanggal.setForeground(new java.awt.Color(51, 51, 51));
        txt_tanggal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_tanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tanggalActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Total");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Kartu Identitas");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Nama Pelanggan");

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_batal.setText("Batal");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Jumlah");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("id");

        t_id.setEditable(false);
        t_id.setForeground(new java.awt.Color(102, 102, 102));
        t_id.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                t_idAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Model");

        btn_pilih.setText("Pilih");
        btn_pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pilihActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                        .addComponent(txt_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(t_id)
                    .addComponent(t_model)
                    .addComponent(box_waktu, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t_kartuIdentitas)
                    .addComponent(t_namaPelanggan)
                    .addComponent(t_jumlah)
                    .addComponent(t_total)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_simpan)
                                .addGap(18, 18, 18)
                                .addComponent(btn_batal))
                            .addComponent(jLabel8)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(t_nopol, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_pilih, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_nopol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pilih))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_kartuIdentitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_namaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(box_waktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_tanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tanggalActionPerformed

    private void btn_pilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pilihActionPerformed
        boolean closable = true;
        daftar_unit du = new daftar_unit(null, closable);
        du.setVisible(true);
        
        t_nopol.setText(du.monit.getNo_pol());
        t_model.setText(du.monit.getModel());
        
        
       
        t_kartuIdentitas.requestFocus();
    }//GEN-LAST:event_btn_pilihActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
       simpanData();
        loadData();   
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        resetForm ();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void t_idAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_t_idAncestorAdded
        t_id.setText(servis.nomor());
    }//GEN-LAST:event_t_idAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_waktu;
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_pilih;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField t_id;
    private javax.swing.JTextField t_jumlah;
    private javax.swing.JTextField t_kartuIdentitas;
    private javax.swing.JTextField t_model;
    private javax.swing.JTextField t_namaPelanggan;
    private javax.swing.JTextField t_nopol;
    private javax.swing.JTextField t_total;
    private javax.swing.JTextField txt_tanggal;
    // End of variables declaration//GEN-END:variables
    private void loadData(){
    List<model_transaksi> list = servis.ambiltransaksi();
    System.out.println("Data yang diambil: " + list); // Debugging
    tblModel.setData(list);
    tblModel.fireTableDataChanged();
    }
    
    private void setDateToday() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd"); // Sesuaikan format tanggal
        Date date = new Date();
        txt_tanggal.setText(formatter.format(date));
    }
    
    private void resetForm (){
        t_id.setText("");
        t_jumlah.setText("");
        t_kartuIdentitas.setText("");
        t_model.setText("");
        t_nopol.setText("");
        t_total.setText("");  
        t_namaPelanggan.setText("");
        box_waktu.setSelectedItem(0);
    }
    
    private void simpanData (){
        if(validasiInput()== true) {
                String id = t_id.getText();
                String no_pol = t_nopol.getText();
                String model = t_model.getText();
                String kartu_udentitas = t_kartuIdentitas.getText();
                String nama_pelanggan = t_namaPelanggan.getText();
                String waktu = box_waktu.getSelectedItem().toString();
                String jumlah = t_jumlah.getText();
                String total = t_total.getText();
                String tanggal_pinjam = txt_tanggal.getText();

                model_transaksi tran1 = new model_transaksi ();
                model_unit unt = new model_unit ();

                tran1.setId_transaksi(id);
                unt.setNo_pol(no_pol);
                unt.setModel(model);
                tran1.setKartu_identitas(kartu_udentitas);
                tran1.setnama_pelanggan(nama_pelanggan);
                tran1.setWaktu(waktu);
                tran1.setJumlah(jumlah);
                tran1.setTotal(total);
                tran1.setTanggal_pinjam(tanggal_pinjam);
                
                tran1.setJns_unit(unt);

                servis.tambahTransaksi(tran1);
                tblModel.tambahtransaksi(tran1);
                
                
                loadData();
                resetForm();          
        }
    }
    
    private boolean validasiInput(){
        boolean valid = false;
        if (t_id.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No. Pol tidak boleh kosong");
        } else if (box_waktu.getSelectedItem().equals(null)){
            JOptionPane.showMessageDialog(null, "No. Pol tidak boleh kosong");
        } else if (t_jumlah.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "No. Pol tidak boleh kosong");
        } else if (t_kartuIdentitas.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "No. Pol tidak boleh kosong");
        } else if (t_model.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "No. Pol tidak boleh kosong");
        } else if (t_nopol.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "No. Pol tidak boleh kosong");
        } else if (t_total.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "No. Pol tidak boleh kosong");
        } else if (t_namaPelanggan.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "No. Pol tidak boleh kosong");
        } else {
            valid = true;
        }
        return valid;
    }
}
