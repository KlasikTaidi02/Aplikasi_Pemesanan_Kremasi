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
import exception.*;

public class EmployeeMainView extends javax.swing.JFrame {

    private Pegawai pegawaiGlobal = null;
    private Konsumen konsumenGlobal = null;
    
    int selectedId = -1;
    
    private PegawaiControl PC;
    private KremasiControl KRC;
    private DataMayatControl DMC;
    private KonsumenControl KC;
    
    private int idKremasiGlobal = -1;
    private int idPegawaiGlobal = 0;
    
    public EmployeeMainView(Pegawai parseP) {
        initComponents();
        pegawaiGlobal = parseP;
        
        PC = new PegawaiControl();
        KRC = new KremasiControl();
        DMC = new DataMayatControl();
        KC = new KonsumenControl();
        
        showTableKremasi();
    }
    
    public void showTableKremasi(){
        try{
            tableKremasi.setModel(KRC.showTabelKremasiForPegawai(""));
        }catch(Exception e){
            System.out.println("Ini error : " + e.getMessage());
        }
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
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableKremasi = new javax.swing.JTable();
        InputSearchCustomer = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        SearchCustomerBtn = new javax.swing.JButton();
        CjakraLogo = new javax.swing.JLabel();
        MoreInfoLogo = new javax.swing.JLabel();
        AgreePanel = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DisagreePanel = new keeptoo.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ResignPanel = new keeptoo.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PengaturanPanel = new javax.swing.JLayeredPane();
        SettingsIcon = new javax.swing.JLabel();
        PengaturanLabel = new javax.swing.JLabel();
        KeluarPanel = new javax.swing.JLayeredPane();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        UpdatePanel = new keeptoo.KGradientPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        BackgroundPanel.setBackground(new java.awt.Color(0, 0, 0));
        BackgroundPanel.setForeground(new java.awt.Color(0, 0, 0));

        kGradientPanel1.setkEndColor(new java.awt.Color(49, 49, 49));
        kGradientPanel1.setkGradientFocus(100);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 0, 0));

        tableKremasi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableKremasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKremasiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableKremasi);

        InputSearchCustomer.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        InputSearchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputSearchCustomerActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Data Customer");

        SearchCustomerBtn.setBackground(new java.awt.Color(0, 0, 0));
        SearchCustomerBtn.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        SearchCustomerBtn.setForeground(new java.awt.Color(255, 255, 255));
        SearchCustomerBtn.setText("Cari");
        SearchCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchCustomerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(InputSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchCustomerBtn)))
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchCustomerBtn)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        CjakraLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/Cjakra 40x15@3x.png"))); // NOI18N

        MoreInfoLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/Info.png"))); // NOI18N
        MoreInfoLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MoreInfoLogoMouseClicked(evt);
            }
        });

        AgreePanel.setkEndColor(new java.awt.Color(49, 49, 49));
        AgreePanel.setkStartColor(new java.awt.Color(49, 49, 49));
        AgreePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgreePanelMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Setuju");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/createicon.png"))); // NOI18N

        javax.swing.GroupLayout AgreePanelLayout = new javax.swing.GroupLayout(AgreePanel);
        AgreePanel.setLayout(AgreePanelLayout);
        AgreePanelLayout.setHorizontalGroup(
            AgreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgreePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );
        AgreePanelLayout.setVerticalGroup(
            AgreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(jLabel1)
                .addComponent(jLabel2))
        );

        DisagreePanel.setkEndColor(new java.awt.Color(49, 49, 49));
        DisagreePanel.setkStartColor(new java.awt.Color(49, 49, 49));
        DisagreePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DisagreePanelMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tidak Setuju");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/deleteicon.png"))); // NOI18N

        javax.swing.GroupLayout DisagreePanelLayout = new javax.swing.GroupLayout(DisagreePanel);
        DisagreePanel.setLayout(DisagreePanelLayout);
        DisagreePanelLayout.setHorizontalGroup(
            DisagreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisagreePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );
        DisagreePanelLayout.setVerticalGroup(
            DisagreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisagreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(jLabel3)
                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
        );

        ResignPanel.setkEndColor(new java.awt.Color(49, 49, 49));
        ResignPanel.setkStartColor(new java.awt.Color(49, 49, 49));
        ResignPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResignPanelMouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/detailicon.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Resign");

        javax.swing.GroupLayout ResignPanelLayout = new javax.swing.GroupLayout(ResignPanel);
        ResignPanel.setLayout(ResignPanelLayout);
        ResignPanelLayout.setHorizontalGroup(
            ResignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResignPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );
        ResignPanelLayout.setVerticalGroup(
            ResignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(jLabel8)
                .addComponent(jLabel7))
        );

        PengaturanPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PengaturanPanelMouseClicked(evt);
            }
        });

        SettingsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/settingsicon.png"))); // NOI18N

        PengaturanLabel.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        PengaturanLabel.setForeground(new java.awt.Color(255, 255, 255));
        PengaturanLabel.setText("Pengaturan");

        PengaturanPanel.setLayer(SettingsIcon, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PengaturanPanel.setLayer(PengaturanLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout PengaturanPanelLayout = new javax.swing.GroupLayout(PengaturanPanel);
        PengaturanPanel.setLayout(PengaturanPanelLayout);
        PengaturanPanelLayout.setHorizontalGroup(
            PengaturanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PengaturanPanelLayout.createSequentialGroup()
                .addComponent(SettingsIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PengaturanLabel)
                .addGap(0, 219, Short.MAX_VALUE))
        );
        PengaturanPanelLayout.setVerticalGroup(
            PengaturanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SettingsIcon)
            .addComponent(PengaturanLabel, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        KeluarPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KeluarPanelMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Keluar");

        jLabel9.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/logouticon.png"))); // NOI18N

        KeluarPanel.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        KeluarPanel.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout KeluarPanelLayout = new javax.swing.GroupLayout(KeluarPanel);
        KeluarPanel.setLayout(KeluarPanelLayout);
        KeluarPanelLayout.setHorizontalGroup(
            KeluarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KeluarPanelLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap(254, Short.MAX_VALUE))
        );
        KeluarPanelLayout.setVerticalGroup(
            KeluarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KeluarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(jLabel9)
                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING))
        );

        UpdatePanel.setkEndColor(new java.awt.Color(49, 49, 49));
        UpdatePanel.setkStartColor(new java.awt.Color(49, 49, 49));
        UpdatePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdatePanelMouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/updateicon.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Update");

        javax.swing.GroupLayout UpdatePanelLayout = new javax.swing.GroupLayout(UpdatePanel);
        UpdatePanel.setLayout(UpdatePanelLayout);
        UpdatePanelLayout.setHorizontalGroup(
            UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );
        UpdatePanelLayout.setVerticalGroup(
            UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(jLabel5)
                .addComponent(jLabel6))
        );

        javax.swing.GroupLayout BackgroundPanelLayout = new javax.swing.GroupLayout(BackgroundPanel);
        BackgroundPanel.setLayout(BackgroundPanelLayout);
        BackgroundPanelLayout.setHorizontalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BackgroundPanelLayout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(BackgroundPanelLayout.createSequentialGroup()
                                    .addComponent(CjakraLogo)
                                    .addGap(18, 18, 18)
                                    .addComponent(MoreInfoLogo))
                                .addComponent(AgreePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DisagreePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PengaturanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(KeluarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(UpdatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BackgroundPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ResignPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundPanelLayout.setVerticalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CjakraLogo)
                    .addGroup(BackgroundPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(MoreInfoLogo)))
                .addGap(46, 46, 46)
                .addComponent(AgreePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(DisagreePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UpdatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ResignPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170)
                .addComponent(PengaturanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(KeluarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void InputSearchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputSearchCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputSearchCustomerActionPerformed

    private void MoreInfoLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoreInfoLogoMouseClicked
        AboutUsView auv = new AboutUsView();
        auv.setVisible(true);
    }//GEN-LAST:event_MoreInfoLogoMouseClicked

    private void PengaturanPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PengaturanPanelMouseClicked
        SettingsView sv = new SettingsView();
        this.dispose();
        sv.setVisible(true);
    }//GEN-LAST:event_PengaturanPanelMouseClicked

    private void ResignPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResignPanelMouseClicked
        EmployeeResignView erv = new EmployeeResignView(pegawaiGlobal);
        this.dispose();
        erv.setVisible(true);
    }//GEN-LAST:event_ResignPanelMouseClicked

    private void UpdatePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdatePanelMouseClicked
        if (idKremasiGlobal!=-1) {
            EmployeeUpdateView euv = new EmployeeUpdateView(pegawaiGlobal, konsumenGlobal, idKremasiGlobal);
            this.dispose();
            euv.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Silahkan Pilih Data","Pemberitahuan", JOptionPane.DEFAULT_OPTION);
        }
    }//GEN-LAST:event_UpdatePanelMouseClicked

    private void SearchCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchCustomerBtnActionPerformed
        try {
            TabelKremasiForPegawai TK = KRC.showTabelKremasiForPegawai(InputSearchCustomer.getText());
//            tableKremasi.setModel(KRC.showTabelKremasiForPegawai(""));
            
            if (tableKremasi.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan","Konfirmasi", JOptionPane.DEFAULT_OPTION);
            } else {
                tableKremasi.setModel(TK);
            }
            
            idKremasiGlobal = -1;
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        }
    }//GEN-LAST:event_SearchCustomerBtnActionPerformed

    private void AgreePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgreePanelMouseClicked
        String status = "Dikonfirmasi oleh " + pegawaiGlobal.getNamaPegawai();
        
        DMC.updateStatusDataMayat(status, selectedId); showTableKremasi();
        KRC.updateKremasiPegawai(idKremasiGlobal, idPegawaiGlobal);
    }//GEN-LAST:event_AgreePanelMouseClicked

    private void tableKremasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKremasiMouseClicked
        int clickedRow = tableKremasi.getSelectedRow();
        TableModel tableModel = tableKremasi.getModel();
        
        selectedId = Integer.parseInt(tableModel.getValueAt(clickedRow, 9).toString());
        idKremasiGlobal = Integer.parseInt(tableModel.getValueAt(clickedRow, 7).toString());
        idPegawaiGlobal = pegawaiGlobal.getIdPegawai();
        konsumenGlobal = KC.searchForLogin(tableModel.getValueAt(clickedRow, 13).toString(), tableModel.getValueAt(clickedRow, 14).toString());
    }//GEN-LAST:event_tableKremasiMouseClicked

    private void DisagreePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisagreePanelMouseClicked
        String status = "Ditolak konfirmasi oleh " + pegawaiGlobal.getNamaPegawai();
        
        DMC.updateStatusDataMayat(status, selectedId); showTableKremasi();
        KRC.updateKremasiPegawai(idKremasiGlobal, idPegawaiGlobal);
    }//GEN-LAST:event_DisagreePanelMouseClicked

    private void KeluarPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KeluarPanelMouseClicked
        LoginView lv = new LoginView();
        this.dispose();
        lv.setVisible(true);
    }//GEN-LAST:event_KeluarPanelMouseClicked

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
            java.util.logging.Logger.getLogger(EmployeeMainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeMainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeMainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeMainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Pegawai P = null;
                
                new EmployeeMainView(P).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KGradientPanel AgreePanel;
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JLabel CjakraLogo;
    private keeptoo.KGradientPanel DisagreePanel;
    private javax.swing.JTextField InputSearchCustomer;
    private javax.swing.JLayeredPane KeluarPanel;
    private javax.swing.JLabel MoreInfoLogo;
    private javax.swing.JLabel PengaturanLabel;
    private javax.swing.JLayeredPane PengaturanPanel;
    private keeptoo.KGradientPanel ResignPanel;
    private javax.swing.JButton SearchCustomerBtn;
    private javax.swing.JLabel SettingsIcon;
    private keeptoo.KGradientPanel UpdatePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tableKremasi;
    // End of variables declaration//GEN-END:variables
}
