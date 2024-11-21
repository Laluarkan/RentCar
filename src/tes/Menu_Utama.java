
package tes;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu_Utama extends javax.swing.JFrame {

    public Menu_Utama(String Id, String Nama, String Jabatan) {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
     
        execute();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pn_navbar = new javax.swing.JPanel();
        pn_sidebar = new javax.swing.JPanel();
        pn_menu = new javax.swing.JPanel();
        pn_content = new javax.swing.JPanel();
        pn_utama = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KanssRide Retal Mobil");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pn_navbar.setBackground(new java.awt.Color(32, 221, 255));
        pn_navbar.setPreferredSize(new java.awt.Dimension(671, 50));
        pn_navbar.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));
        getContentPane().add(pn_navbar, java.awt.BorderLayout.PAGE_START);

        pn_sidebar.setPreferredSize(new java.awt.Dimension(500, 415));

        pn_menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        pn_menu.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pn_sidebarLayout = new javax.swing.GroupLayout(pn_sidebar);
        pn_sidebar.setLayout(pn_sidebarLayout);
        pn_sidebarLayout.setHorizontalGroup(
            pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pn_menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pn_sidebarLayout.setVerticalGroup(
            pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
            .addGroup(pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pn_menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE))
        );

        getContentPane().add(pn_sidebar, java.awt.BorderLayout.LINE_START);

        pn_utama.setBackground(new java.awt.Color(255, 255, 255));
        pn_utama.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        pn_utama.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pn_contentLayout = new javax.swing.GroupLayout(pn_content);
        pn_content.setLayout(pn_contentLayout);
        pn_contentLayout.setHorizontalGroup(
            pn_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
        );
        pn_contentLayout.setVerticalGroup(
            pn_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
        );

        getContentPane().add(pn_content, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(910, 545));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pn_utama.add(new gambar_pnUtama());
        pn_utama.repaint();
        pn_utama.revalidate();
        
        pn_menu.add(new gambar_menu());
        pn_menu.repaint();
        pn_menu.revalidate();
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Utama("Id", "Nama", "Jabatan").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pn_content;
    private javax.swing.JPanel pn_menu;
    private javax.swing.JPanel pn_navbar;
    private javax.swing.JPanel pn_sidebar;
    private javax.swing.JPanel pn_utama;
    // End of variables declaration//GEN-END:variables

    private void execute() {
          
         ImageIcon iconMenu = new ImageIcon(getClass().getResource("/img/home.png"));
         ImageIcon iconMasuk = new ImageIcon(getClass().getResource("/img/masuk.png"));
         ImageIcon iconKeluar = new ImageIcon(getClass().getResource("/img/unit keluar.png"));
         ImageIcon iconUnit = new ImageIcon(getClass().getResource("/img/unit.png"));
         ImageIcon iconTransaksi = new ImageIcon(getClass().getResource("/img/transaksi tes.png"));
         ImageIcon iconKaryawan = new ImageIcon(getClass().getResource("/img/gambar_karyawan.png"));
        
         MenuItem menuHome = new MenuItem(iconMenu, false, null,"Home", new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                pn_utama.removeAll();
                pn_utama.add(new gambar_pnUtama());
                pn_utama.repaint();
                pn_utama.revalidate();   
                
                pn_menu.removeAll();
                pn_menu.add(new gambar_menu());
                pn_menu.repaint();
                pn_menu.revalidate();
             }
         });
         MenuItem unitTersedia = new MenuItem(iconUnit, false, null,"Unit", new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                pn_utama.removeAll();
                pn_utama.add(new form_unit());
                pn_utama.repaint();
                pn_utama.revalidate();
                
                pn_menu.removeAll();
                pn_menu.add(new tambah());
                pn_menu.repaint();
                pn_menu.revalidate();
             }
         });
         MenuItem transaksi = new MenuItem(iconTransaksi, false, null,"Transaksi", new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                pn_menu.removeAll();
                pn_menu.add(new transaksi());
                pn_menu.repaint();
                pn_menu.revalidate();
                
                pn_utama.removeAll();
                pn_utama.add(new riwayat_transaksi());
                pn_utama.repaint();
                pn_utama.revalidate();
             }
         });
          MenuItem karyawan = new MenuItem(iconKaryawan, false, null,"Karyawan", new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                pn_utama.removeAll();
                pn_utama.add(new form_karyawan());
                pn_utama.repaint();
                pn_utama.revalidate();   
                
                pn_menu.removeAll();
                pn_menu.add(new tambah_karyawan());
                pn_menu.repaint();
                pn_menu.revalidate();
             }
         });
         
         addMenu(menuHome, unitTersedia, transaksi, karyawan);         
    }
    
    private void addMenu(MenuItem... menu){
        for (int i = 0; i < menu.length; i++) {
            pn_navbar.add(menu[i]);
            /*ArrayList<MenuItem> subMenu = menu [i].getSubMenu();
            for (MenuItem m : subMenu){
                addMenu (m);
            }*/
        }
        pn_navbar.revalidate();
    }   
}
