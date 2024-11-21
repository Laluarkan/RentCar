
package tes;

import DAO.DAO_karyawan;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.model_karyawan;
import service.service_karyawan;
import tabelModel.tabelMod_karyawan;

public class tambah_karyawan extends javax.swing.JPanel {

    private service_karyawan servis = new DAO_karyawan ();
    private tabelMod_karyawan tblModel = new tabelMod_karyawan();
    
    public tambah_karyawan() {
        initComponents();
        setDateToday();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        txt_tanggal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        t_nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        t_alamat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t_nohp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t_jabatan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        t_username = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        t_password = new javax.swing.JTextField();
        t_id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Tambah Karyawan");
        jLabel1.setPreferredSize(new java.awt.Dimension(146, 32));

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

        txt_tanggal.setEditable(false);
        txt_tanggal.setBackground(new java.awt.Color(255, 255, 255));
        txt_tanggal.setForeground(new java.awt.Color(51, 51, 51));
        txt_tanggal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_tanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tanggalActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Alamat");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("No. HP");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Jabatan");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Username");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Password");

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
        t_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_idActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Id");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                        .addComponent(txt_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(t_id)
                    .addComponent(t_nama)
                    .addComponent(t_alamat)
                    .addComponent(t_nohp)
                    .addComponent(t_jabatan)
                    .addComponent(t_username)
                    .addComponent(t_password)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_simpan)
                                .addGap(18, 18, 18)
                                .addComponent(btn_batal))
                            .addComponent(jLabel8)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_tanggal)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_nohp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_jabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        simpanData();
        loadData();
        
        
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        resetForm ();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void t_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_idActionPerformed
       
    }//GEN-LAST:event_t_idActionPerformed

    private void t_idAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_t_idAncestorAdded
         t_id.setText(servis.nomor());
    }//GEN-LAST:event_t_idAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField t_alamat;
    private javax.swing.JTextField t_id;
    private javax.swing.JTextField t_jabatan;
    private javax.swing.JTextField t_nama;
    private javax.swing.JTextField t_nohp;
    private javax.swing.JTextField t_password;
    private javax.swing.JTextField t_username;
    private javax.swing.JTextField txt_tanggal;
    // End of variables declaration//GEN-END:variables
    private void setDateToday() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd"); // Sesuaikan format tanggal
        Date date = new Date();
        txt_tanggal.setText(formatter.format(date));
    }
    
    private void resetForm (){
        t_nama.setText("");
        t_alamat.setText("");
        t_nohp.setText("");
        t_jabatan.setText("");
        t_username.setText("");
        t_password.setText("");             
    }
    
    private void simpanData (){
        if(validasiInput()== true) {
            String id = t_id.getText();
            String nama = t_nama.getText();
            String alamat = t_alamat.getText();
            String no_hp = t_nohp.getText();
            String jabatan= t_jabatan.getText();
            String username = t_username.getText();
            String password = t_password.getText();
            
            model_karyawan karyawan = new model_karyawan ();
            
            karyawan.setId_karyawan(id);
            karyawan.setNama(nama);
            karyawan.setAlamat(alamat);
            karyawan.setNo_hp(no_hp);
            karyawan.setJabatan(jabatan);
            karyawan.setUsername(username);
            karyawan.setPassword(password);
            
             
            servis.tambahkaryawan(karyawan);
            tblModel.tambahkaryawan(karyawan);
            loadData();
            resetForm();          
        }
    }
    
    private void loadData(){
        List<model_karyawan> list = servis.ambiltkaryawan();
        tblModel.setData(list);
    }
    
    private boolean validasiInput(){
        boolean valid = false;
        if (t_nama.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No. Pol tidak boleh kosong");
        } else if (t_alamat.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "No. Pol tidak boleh kosong");
        } else if (t_nohp.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "No. Pol tidak boleh kosong");
        } else if (t_jabatan.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "No. Pol tidak boleh kosong");
        } else if (t_username.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "No. Pol tidak boleh kosong");
        } else if (t_password.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "No. Pol tidak boleh kosong");
        } else {
            valid = true;
        }
        return valid;
    }
}
