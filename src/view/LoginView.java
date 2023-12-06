/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import control.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.*;

public class LoginView extends javax.swing.JFrame {

    int indexUtama = 0;
    private KonsumenControl KC;
    private PegawaiControl PC;
    
    private Layanan layananGlobal = null;
    
    public LoginView() {
        initComponents();
        setComponent(false);
        clearText();
        
        KC = new KonsumenControl();
        PC = new PegawaiControl();
    }
    
    public void setComponent(boolean value){
        setEULA(value);
        setLoginBtn(value);
    }
    
    public void setEULA(boolean value){
        termsCheckBox.setSelected(value);
        privacyCheckBox.setSelected(value);
    }
    
    public void setLoginBtn(boolean value){
        LoginBtn.setEnabled(value);
    }
    
    public void clearText(){
        InputUsername.setText("");
        InputPassword.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPanel = new javax.swing.JPanel();
        CjakraLogo = new javax.swing.JLabel();
        MoreInfoLogo = new javax.swing.JLabel();
        BtflyElmnt = new javax.swing.JLabel();
        Deskripsi = new javax.swing.JLabel();
        LoginPanel = new javax.swing.JLayeredPane();
        jLabel5 = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        InputUsername = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        InputPassword = new javax.swing.JPasswordField();
        LoginBtn = new javax.swing.JButton();
        termsCheckBox = new javax.swing.JCheckBox();
        privacyCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        BackgroundPanel.setBackground(new java.awt.Color(0, 0, 0));
        BackgroundPanel.setForeground(new java.awt.Color(0, 0, 0));

        CjakraLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/Cjakra 40x15@3x.png"))); // NOI18N

        MoreInfoLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/Info.png"))); // NOI18N
        MoreInfoLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MoreInfoLogoMouseClicked(evt);
            }
        });

        BtflyElmnt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/Btfly_Elmnt2@3x.png"))); // NOI18N

        Deskripsi.setBackground(new java.awt.Color(255, 255, 255));
        Deskripsi.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        Deskripsi.setForeground(new java.awt.Color(255, 255, 255));
        Deskripsi.setText("Aplikasi Kematian Pertama di Indonesia");

        LoginPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(166, 124, 0), 4, true));
        LoginPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Masuk/Log In");

        Username.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setText("Username");

        InputUsername.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        InputUsername.setBorder(null);

        Password.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setText("Password");

        InputPassword.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        InputPassword.setBorder(null);

        LoginBtn.setBackground(new java.awt.Color(0, 0, 0));
        LoginBtn.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        LoginBtn.setText("Masuk");
        LoginBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(166, 124, 0), 5, true));
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });

        termsCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        termsCheckBox.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        termsCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        termsCheckBox.setText("I have read Cjaka Terms of Service");
        termsCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                termsCheckBoxActionPerformed(evt);
            }
        });

        privacyCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        privacyCheckBox.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        privacyCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        privacyCheckBox.setText("I have read Cjaka Privacy Policy");
        privacyCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                privacyCheckBoxActionPerformed(evt);
            }
        });

        LoginPanel.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        LoginPanel.setLayer(Username, javax.swing.JLayeredPane.DEFAULT_LAYER);
        LoginPanel.setLayer(InputUsername, javax.swing.JLayeredPane.DEFAULT_LAYER);
        LoginPanel.setLayer(Password, javax.swing.JLayeredPane.DEFAULT_LAYER);
        LoginPanel.setLayer(InputPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        LoginPanel.setLayer(LoginBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        LoginPanel.setLayer(termsCheckBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        LoginPanel.setLayer(privacyCheckBox, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Username)
                            .addComponent(Password)
                            .addComponent(InputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(termsCheckBox)
                            .addComponent(privacyCheckBox))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                        .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(Username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(termsCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(privacyCheckBox)
                .addGap(35, 35, 35)
                .addComponent(LoginBtn)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout BackgroundPanelLayout = new javax.swing.GroupLayout(BackgroundPanel);
        BackgroundPanel.setLayout(BackgroundPanelLayout);
        BackgroundPanelLayout.setHorizontalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CjakraLogo)
                .addGap(18, 18, 18)
                .addComponent(MoreInfoLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Deskripsi)
                    .addComponent(BtflyElmnt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        BackgroundPanelLayout.setVerticalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(MoreInfoLogo)
                    .addComponent(CjakraLogo))
                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundPanelLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(BtflyElmnt)
                        .addGap(30, 30, 30)
                        .addComponent(Deskripsi))
                    .addGroup(BackgroundPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void termsCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_termsCheckBoxActionPerformed
        if(privacyCheckBox.isSelected() && termsCheckBox.isSelected()){
            setLoginBtn(true);
        }else{
            setLoginBtn(false);
        }
    }//GEN-LAST:event_termsCheckBoxActionPerformed

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
       try{
            if(InputUsername.getText().equalsIgnoreCase("admin") && InputPassword.getText().equalsIgnoreCase("admin")){
                System.out.println("ADMIN");
                AdminMainView amv = new AdminMainView();
                this.dispose();
                amv.setVisible(true);            
            }else{
                Konsumen K = KC.searchForLogin(InputUsername.getText(), InputPassword.getText());
                Pegawai P = PC.searchForLogin(InputUsername.getText(), InputPassword.getText());

                if(K != null){
                    CustomerMainView MVV = new CustomerMainView(K, layananGlobal);
                    this.dispose();
                    MVV.setVisible(true);
                }else if(P != null){
                    EmployeeMainView EMV = new EmployeeMainView(P);
                    this.dispose();
                    EMV.setVisible(true);
                }else{
                    ErrorView EV = new ErrorView();
                    EV.setVisible(true);
                }
            }            
        }catch(Exception e){            
            String error = "Akun tersebut tidak terdata dalam database";
            ErrorView ev = new ErrorView();
            ev.setVisible(true);
        }
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void privacyCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_privacyCheckBoxActionPerformed
        if(privacyCheckBox.isSelected() && termsCheckBox.isSelected()){
            setLoginBtn(true);
        }else{
            setLoginBtn(false);
        }
    }//GEN-LAST:event_privacyCheckBoxActionPerformed

    private void MoreInfoLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoreInfoLogoMouseClicked
        AboutUsView mv = new AboutUsView();
        mv.setVisible(true); 
    }//GEN-LAST:event_MoreInfoLogoMouseClicked

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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JLabel BtflyElmnt;
    private javax.swing.JLabel CjakraLogo;
    private javax.swing.JLabel Deskripsi;
    private javax.swing.JPasswordField InputPassword;
    private javax.swing.JTextField InputUsername;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JLayeredPane LoginPanel;
    private javax.swing.JLabel MoreInfoLogo;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Username;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JCheckBox privacyCheckBox;
    private javax.swing.JCheckBox termsCheckBox;
    // End of variables declaration//GEN-END:variables
}
