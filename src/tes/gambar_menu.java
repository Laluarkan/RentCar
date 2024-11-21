
package tes;

import javax.swing.JPanel;

public class gambar_menu extends javax.swing.JPanel {

    public gambar_menu() {
        initComponents();
    }

     public JPanel getPnLogo() {
    return pn_logo;
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_logo = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(500, 487));

        pn_logo.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout pn_logoLayout = new javax.swing.GroupLayout(pn_logo);
        pn_logo.setLayout(pn_logoLayout);
        pn_logoLayout.setHorizontalGroup(
            pn_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        pn_logoLayout.setVerticalGroup(
            pn_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pn_logo;
    // End of variables declaration//GEN-END:variables
}
