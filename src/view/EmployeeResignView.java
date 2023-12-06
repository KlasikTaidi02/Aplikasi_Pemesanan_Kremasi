/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import control.*;
import java.sql.SQLException;
import model.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import tabel.*;

public class EmployeeResignView extends javax.swing.JFrame {

    private PegawaiControl PC;
    
    private Pegawai pegawaiGlobal = null;
    
    public EmployeeResignView(Pegawai parseP) {
        initComponents();
        setComponent(true);
        
        PC = new PegawaiControl();
        pegawaiGlobal = parseP;
    }
    
    public void setComponent(boolean value){
        ResignBtn.setEnabled(value);
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
        ReturnIcon = new javax.swing.JLabel();
        ResignBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        usernameInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        konfirmasiPasswordInput = new javax.swing.JPasswordField();
        passwordInput = new javax.swing.JPasswordField();
        kebijakanCheckBox = new javax.swing.JCheckBox();
        keputusanCheckBox = new javax.swing.JCheckBox();

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
        jLabel1.setText("Konfirmasi Resign");

        ReturnIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/returnicon.png"))); // NOI18N
        ReturnIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnIconMouseClicked(evt);
            }
        });

        ResignBtn.setBackground(new java.awt.Color(0, 0, 0));
        ResignBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/Resign.png"))); // NOI18N
        ResignBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(166, 124, 0), 2, true));
        ResignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResignBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");

        usernameInput.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        usernameInput.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Konfirmasi Password");

        konfirmasiPasswordInput.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        passwordInput.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        kebijakanCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        kebijakanCheckBox.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        kebijakanCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        kebijakanCheckBox.setText("Saya telah membaca Kebijakan Cjaka");
        kebijakanCheckBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kebijakanCheckBoxMouseClicked(evt);
            }
        });

        keputusanCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        keputusanCheckBox.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        keputusanCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        keputusanCheckBox.setText("Saya sadar dengan keputusan saya");
        keputusanCheckBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keputusanCheckBoxMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(keputusanCheckBox)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(usernameInput)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(konfirmasiPasswordInput, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                        .addComponent(passwordInput))
                    .addComponent(kebijakanCheckBox))
                .addContainerGap(492, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(ReturnIcon)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ResignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(CjakraLogo)
                                    .addGap(18, 18, 18)
                                    .addComponent(MoreInfoLogo))
                                .addComponent(jLabel1))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(konfirmasiPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(keputusanCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kebijakanCheckBox)
                .addContainerGap(218, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(MoreInfoLogo)
                        .addComponent(CjakraLogo))
                    .addGap(12, 12, 12)
                    .addComponent(jLabel1)
                    .addGap(409, 409, 409)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ReturnIcon, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ResignBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

    private void MoreInfoLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoreInfoLogoMouseClicked
        AboutUsView auv = new AboutUsView();
        auv.setVisible(true);
    }//GEN-LAST:event_MoreInfoLogoMouseClicked

    private void keputusanCheckBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keputusanCheckBoxMouseClicked
        if(keputusanCheckBox.isSelected() && kebijakanCheckBox.isSelected()){
            setComponent(true);
        }else{
            setComponent(false);
        }
    }//GEN-LAST:event_keputusanCheckBoxMouseClicked

    private void kebijakanCheckBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kebijakanCheckBoxMouseClicked
        if(keputusanCheckBox.isSelected() && kebijakanCheckBox.isSelected()){
            setComponent(true);
        }else{
            setComponent(false);
        }
    }//GEN-LAST:event_kebijakanCheckBoxMouseClicked

    private void ResignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResignBtnActionPerformed
        if(konfirmasiPasswordInput.getText().equals(passwordInput.getText())){
            if(usernameInput.getText().equals(pegawaiGlobal.getUsernamePegawai()) && passwordInput.getText().equals(pegawaiGlobal.getPasswordPegawai())){
                PC.deleteDataPegawaiById(pegawaiGlobal.getIdPegawai());
                JOptionPane.showMessageDialog(null, "TERIMA KASIH ATAS PELAYANANNYA \n SEMOGA SUKSES DI PEKERJAAN BERIKUTNYA !!");
                this.dispose();
                LoginView lv = new LoginView();
                lv.setVisible(true);
            }else{
                JOptionPane.showConfirmDialog(rootPane, "Data Tidak Sesuai", "Pemberitahuan", JOptionPane.YES_OPTION);
            }            
        }else{
            JOptionPane.showConfirmDialog(rootPane, "Password Tidak Sesuai", "Pemberitahuan", JOptionPane.YES_OPTION);
        }
    }//GEN-LAST:event_ResignBtnActionPerformed

    private void ReturnIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnIconMouseClicked
        EmployeeMainView emv = new EmployeeMainView(pegawaiGlobal);
        this.dispose();
        emv.setVisible(true);
    }//GEN-LAST:event_ReturnIconMouseClicked

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
            java.util.logging.Logger.getLogger(EmployeeResignView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeResignView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeResignView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeResignView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Pegawai P = null;
                
                new EmployeeResignView(P).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CjakraLogo;
    private javax.swing.JLabel MoreInfoLogo;
    private javax.swing.JButton ResignBtn;
    private javax.swing.JLabel ReturnIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox kebijakanCheckBox;
    private javax.swing.JCheckBox keputusanCheckBox;
    private javax.swing.JPasswordField konfirmasiPasswordInput;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JTextField usernameInput;
    // End of variables declaration//GEN-END:variables
}
