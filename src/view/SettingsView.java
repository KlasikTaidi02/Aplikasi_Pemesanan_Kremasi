/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author Joesenchia Santoso
 */
public class SettingsView extends javax.swing.JFrame {

    /**
     * Creates new form SettingsView
     */
    public SettingsView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CjakraLogo = new javax.swing.JLabel();
        MoreInfoLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        NotifCheckBox = new javax.swing.JCheckBox();
        ModeCheckBox = new javax.swing.JCheckBox();
        ReturnIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        CjakraLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/Cjakra 40x15@3x.png"))); // NOI18N

        MoreInfoLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/Info.png"))); // NOI18N
        MoreInfoLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MoreInfoLogoMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pengaturan");

        NotifCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        NotifCheckBox.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        NotifCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        NotifCheckBox.setText("Aktifkan Notifikasi");
        NotifCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotifCheckBoxActionPerformed(evt);
            }
        });

        ModeCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        ModeCheckBox.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        ModeCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        ModeCheckBox.setText("Aktifkan Mode Percaya Diri");
        ModeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModeCheckBoxActionPerformed(evt);
            }
        });

        ReturnIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/returnicon.png"))); // NOI18N
        ReturnIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ModeCheckBox)
                    .addComponent(NotifCheckBox)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CjakraLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MoreInfoLogo))
                    .addComponent(ReturnIcon))
                .addContainerGap(577, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(MoreInfoLogo))
                    .addComponent(CjakraLogo))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NotifCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ModeCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 375, Short.MAX_VALUE)
                .addComponent(ReturnIcon)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ReturnIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnIconMouseClicked
        this.dispose();
    }//GEN-LAST:event_ReturnIconMouseClicked

    private void MoreInfoLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoreInfoLogoMouseClicked
        AboutUsView auv = new AboutUsView();
        auv.setVisible(true);
    }//GEN-LAST:event_MoreInfoLogoMouseClicked

    private void NotifCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotifCheckBoxActionPerformed
        if (NotifCheckBox.isSelected()) {
            int getAnswer = JOptionPane.showConfirmDialog(rootPane, "Apakah anda yakin mengaktifkan menu ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

            switch(getAnswer) {
                case 0 :
                    NotifCheckBox.setSelected(true);
                    break;
                case 1 :
                    NotifCheckBox.setSelected(false);
                    break;
            }   
        } else {
            int getAnswer = JOptionPane.showConfirmDialog(rootPane, "Apakah anda yakin menonaktifkan pengaturan ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

            switch(getAnswer) {
                case 0 :
                    NotifCheckBox.setSelected(false);
                    break;
                case 1 :
                    NotifCheckBox.setSelected(true);
                    break;
            }
        }
        
    }//GEN-LAST:event_NotifCheckBoxActionPerformed

    private void ModeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModeCheckBoxActionPerformed
        if (ModeCheckBox.isSelected()) {
            int getAnswer = JOptionPane.showConfirmDialog(rootPane, "Apakah anda yakin mengaktifkan pengaturan ini?", "KONFIRMASI", JOptionPane.YES_NO_OPTION);

            switch(getAnswer) {
                case 0 :
                    JOptionPane.showConfirmDialog(rootPane, "Percaya diri anda bertambah 100 poin", "SELAMAT ANDA BERHASIL!", JOptionPane.WARNING_MESSAGE);
                    ModeCheckBox.setSelected(true);
                    break;
                case 1 :
                    JOptionPane.showConfirmDialog(rootPane, "Pikirkan terlebih dahulu", "SILAHKAN COBA LAGI!", JOptionPane.WARNING_MESSAGE);
                    ModeCheckBox.setSelected(false);
            }
        } else {
            int getAnswer = JOptionPane.showConfirmDialog(rootPane, "Apakah anda yakin menonaktifkan pengaturan ini?", "KONFIRMASI", JOptionPane.YES_NO_OPTION);

            switch(getAnswer) {
                case 0 :
                    JOptionPane.showConfirmDialog(rootPane, "Percaya diri anda berkurang 100 poin", "SAYANG SEKALI!", JOptionPane.WARNING_MESSAGE);
                    ModeCheckBox.setSelected(false);
                    break;
                case 1 :
                    JOptionPane.showConfirmDialog(rootPane, "Poin percaya diri anda tidak berkurang", "TOLONG HATI-HATI!", JOptionPane.WARNING_MESSAGE);
                    ModeCheckBox.setSelected(true);
            }   
        }
    }//GEN-LAST:event_ModeCheckBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SettingsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CjakraLogo;
    private javax.swing.JCheckBox ModeCheckBox;
    private javax.swing.JLabel MoreInfoLogo;
    private javax.swing.JCheckBox NotifCheckBox;
    private javax.swing.JLabel ReturnIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
