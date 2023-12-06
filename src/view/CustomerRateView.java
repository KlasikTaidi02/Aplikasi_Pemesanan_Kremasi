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

public class CustomerRateView extends javax.swing.JFrame {

    private Konsumen konsumenGlobal = null;
    private Layanan layananGlobal = null;
    private Kremasi kremasiGlobal = null;
    
    public CustomerRateView(Konsumen parseK, Layanan parseL) {
        initComponents();
        
        konsumenGlobal = parseK;
        layananGlobal = parseL;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TampilanBtnGroup = new javax.swing.ButtonGroup();
        PelayananBtnGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        CjakraLogo = new javax.swing.JLabel();
        MoreInfoLogo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ReturnIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        SangatBurukRadioBtn = new javax.swing.JRadioButton();
        CukupBurukRadioBtn = new javax.swing.JRadioButton();
        StandarRadioBtn = new javax.swing.JRadioButton();
        CukupBaikRadioBtn = new javax.swing.JRadioButton();
        SangatBaikRadioBtn = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        KritikSaranTxtArea = new javax.swing.JTextArea();
        CreateBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        SangatBurukRadioBtn2 = new javax.swing.JRadioButton();
        CukupBurukRadioBtn2 = new javax.swing.JRadioButton();
        StandarRadioBtn2 = new javax.swing.JRadioButton();
        CukupBaikRadioBtn2 = new javax.swing.JRadioButton();
        SangatBaikRadioBtn2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        CjakraLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/Cjakra 40x15@3x.png"))); // NOI18N

        MoreInfoLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/Info.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Poppins", 1, 32)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Penilaian");

        ReturnIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/returnicon.png"))); // NOI18N
        ReturnIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnIconMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tampilan Aplikasi");

        SangatBurukRadioBtn.setBackground(new java.awt.Color(0, 0, 0));
        TampilanBtnGroup.add(SangatBurukRadioBtn);
        SangatBurukRadioBtn.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        SangatBurukRadioBtn.setForeground(new java.awt.Color(255, 255, 255));
        SangatBurukRadioBtn.setText("Sangat Buruk");

        CukupBurukRadioBtn.setBackground(new java.awt.Color(0, 0, 0));
        TampilanBtnGroup.add(CukupBurukRadioBtn);
        CukupBurukRadioBtn.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        CukupBurukRadioBtn.setForeground(new java.awt.Color(255, 255, 255));
        CukupBurukRadioBtn.setText("Cukup Buruk");

        StandarRadioBtn.setBackground(new java.awt.Color(0, 0, 0));
        TampilanBtnGroup.add(StandarRadioBtn);
        StandarRadioBtn.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        StandarRadioBtn.setForeground(new java.awt.Color(255, 255, 255));
        StandarRadioBtn.setText("Standar");

        CukupBaikRadioBtn.setBackground(new java.awt.Color(0, 0, 0));
        TampilanBtnGroup.add(CukupBaikRadioBtn);
        CukupBaikRadioBtn.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        CukupBaikRadioBtn.setForeground(new java.awt.Color(255, 255, 255));
        CukupBaikRadioBtn.setText("Cukup Baik");

        SangatBaikRadioBtn.setBackground(new java.awt.Color(0, 0, 0));
        TampilanBtnGroup.add(SangatBaikRadioBtn);
        SangatBaikRadioBtn.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        SangatBaikRadioBtn.setForeground(new java.awt.Color(255, 255, 255));
        SangatBaikRadioBtn.setText("Sangat Baik");

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kritik dan Saran");

        KritikSaranTxtArea.setColumns(20);
        KritikSaranTxtArea.setRows(5);
        jScrollPane1.setViewportView(KritikSaranTxtArea);

        CreateBtn.setBackground(new java.awt.Color(0, 0, 0));
        CreateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/Submit.png"))); // NOI18N
        CreateBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(166, 124, 0), 2, true));
        CreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pelayanan");

        SangatBurukRadioBtn2.setBackground(new java.awt.Color(0, 0, 0));
        PelayananBtnGroup.add(SangatBurukRadioBtn2);
        SangatBurukRadioBtn2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        SangatBurukRadioBtn2.setForeground(new java.awt.Color(255, 255, 255));
        SangatBurukRadioBtn2.setText("Sangat Buruk");

        CukupBurukRadioBtn2.setBackground(new java.awt.Color(0, 0, 0));
        PelayananBtnGroup.add(CukupBurukRadioBtn2);
        CukupBurukRadioBtn2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        CukupBurukRadioBtn2.setForeground(new java.awt.Color(255, 255, 255));
        CukupBurukRadioBtn2.setText("Cukup Buruk");

        StandarRadioBtn2.setBackground(new java.awt.Color(0, 0, 0));
        PelayananBtnGroup.add(StandarRadioBtn2);
        StandarRadioBtn2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        StandarRadioBtn2.setForeground(new java.awt.Color(255, 255, 255));
        StandarRadioBtn2.setText("Standar");

        CukupBaikRadioBtn2.setBackground(new java.awt.Color(0, 0, 0));
        PelayananBtnGroup.add(CukupBaikRadioBtn2);
        CukupBaikRadioBtn2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        CukupBaikRadioBtn2.setForeground(new java.awt.Color(255, 255, 255));
        CukupBaikRadioBtn2.setText("Cukup Baik");

        SangatBaikRadioBtn2.setBackground(new java.awt.Color(0, 0, 0));
        PelayananBtnGroup.add(SangatBaikRadioBtn2);
        SangatBaikRadioBtn2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        SangatBaikRadioBtn2.setForeground(new java.awt.Color(255, 255, 255));
        SangatBaikRadioBtn2.setText("Sangat Baik");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ReturnIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CreateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SangatBaikRadioBtn2)
                            .addComponent(CukupBaikRadioBtn2)
                            .addComponent(StandarRadioBtn2)
                            .addComponent(CukupBurukRadioBtn2)
                            .addComponent(SangatBurukRadioBtn2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CjakraLogo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(MoreInfoLogo))
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(SangatBaikRadioBtn)
                                    .addComponent(CukupBaikRadioBtn)
                                    .addComponent(StandarRadioBtn)
                                    .addComponent(CukupBurukRadioBtn)
                                    .addComponent(SangatBurukRadioBtn))
                                .addGap(256, 256, 256)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CreateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(MoreInfoLogo))
                            .addComponent(CjakraLogo))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SangatBurukRadioBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CukupBurukRadioBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(StandarRadioBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CukupBaikRadioBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SangatBaikRadioBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SangatBurukRadioBtn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CukupBurukRadioBtn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StandarRadioBtn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CukupBaikRadioBtn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SangatBaikRadioBtn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addComponent(ReturnIcon)))
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
    }// </editor-fold>//GEN-END:initComponents

    private void ReturnIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnIconMouseClicked
        CustomerMainView cmv = new CustomerMainView(konsumenGlobal, layananGlobal);
        this.dispose();
        cmv.setVisible(true);
    }//GEN-LAST:event_ReturnIconMouseClicked

    private void CreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateBtnActionPerformed
        CustomerMainView cmv = new CustomerMainView(konsumenGlobal, layananGlobal);
        JOptionPane.showConfirmDialog(rootPane, "Tarimakasih untuk masukan anda", "TERIMA KASIH", JOptionPane.WARNING_MESSAGE);
        this.dispose();
        cmv.setVisible(true);
    }//GEN-LAST:event_CreateBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerRateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerRateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerRateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerRateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Konsumen parseK = null; 
                Layanan parseL = null;
                
                new CustomerRateView(parseK, parseL).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CjakraLogo;
    private javax.swing.JButton CreateBtn;
    private javax.swing.JRadioButton CukupBaikRadioBtn;
    private javax.swing.JRadioButton CukupBaikRadioBtn2;
    private javax.swing.JRadioButton CukupBurukRadioBtn;
    private javax.swing.JRadioButton CukupBurukRadioBtn2;
    private javax.swing.JTextArea KritikSaranTxtArea;
    private javax.swing.JLabel MoreInfoLogo;
    private javax.swing.ButtonGroup PelayananBtnGroup;
    private javax.swing.JLabel ReturnIcon;
    private javax.swing.JRadioButton SangatBaikRadioBtn;
    private javax.swing.JRadioButton SangatBaikRadioBtn2;
    private javax.swing.JRadioButton SangatBurukRadioBtn;
    private javax.swing.JRadioButton SangatBurukRadioBtn2;
    private javax.swing.JRadioButton StandarRadioBtn;
    private javax.swing.JRadioButton StandarRadioBtn2;
    private javax.swing.ButtonGroup TampilanBtnGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
