/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import control.*;
import java.sql.SQLException;
import model.*;
import exception.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CustomerCreateView extends javax.swing.JFrame {

    List<Layanan> listLayanan;
    private LayananControl LC;
    private KonsumenControl KC;
    private DataMayatControl DMC;
    private KremasiControl KRC;
    private PembayaranControl PC;
    
    private Konsumen konsumenGlobal = null;
    private Layanan layananGlobal = null;
    private DataMayat dataMayatGlobal = null;
    private Pembayaran pembayaranGlobal = null;   
    
    private String action = null;
    private String jenisKelamin = null;
    
    public CustomerCreateView(Konsumen K) {
        initComponents();
        setComponent(false);
        
        konsumenGlobal = K;
        
        LC = new LayananControl();
        KC = new KonsumenControl();
        DMC = new DataMayatControl();
        KRC = new KremasiControl();
        PC = new PembayaranControl();
        
        clearRadioButton(false);
        clearText();
        LayananComboBox();
        setCurrentTanggal();
        defaultNoHP(K);
        notaDefault();
    }
    
    public void setComponent(boolean value){
        CreateBtn.setEnabled(value);
    }
    
    public void clearText(){
        InputNama.setText("");
        InputNoHP.setText("");
        InputTglMasuk.setText("");
        notaText.setEditable(false);
    }
    
      public void setCurrentTanggal()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date()); // Using today's date
        
        String output = sdf.format(c.getTime());
        System.out.println("aaaa");
        System.out.println(output);
        InputTglMasuk.setText(output);
        InputTglMasuk.setEnabled(false);

    }
    
    public void defaultNoHP(Konsumen K){
        InputNoHP.setText(konsumenGlobal.getNomorTelepon());
    }
    
    public void clearRadioButton(boolean value){
        PriaRadioBtn.setSelected(value);
        WanitaRadioBtn.setSelected(value);
        TidakJelasRadioBtn.setSelected(value);
    }
    
    public void LayananComboBox(){
        listLayanan = LC.showListLayanan();
        
        for(int i=0; i<listLayanan.size(); i++){
            LayananComboBox.addItem(listLayanan.get(i));
        }
    }

    public void InputKosongException() throws inputKosongException{
        if(InputNama.getText().isEmpty() || InputNoHP.getText().isEmpty() || InputTglMasuk.getText().isEmpty()){
            throw new inputKosongException();
        }
    }
    
    public void notaDefault(){
        int selectedIndex = LayananComboBox.getSelectedIndex();
        Layanan selectedLayanan = listLayanan.get(selectedIndex);
        Layanan showNota = LC.searchIdLayanan(selectedLayanan.getNamaLayanan());

        notaText.setText(Double.toString(showNota.getHargaLayanan()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JenisKelaminRadioGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        CjakraLogo = new javax.swing.JLabel();
        MoreInfoLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        InputNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        InputTglMasuk = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        InputNoHP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PriaRadioBtn = new javax.swing.JRadioButton();
        TidakJelasRadioBtn = new javax.swing.JRadioButton();
        WanitaRadioBtn = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        LayananComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        ReturnIcon = new javax.swing.JLabel();
        CreateBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        notaText = new javax.swing.JTextField();

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
        jLabel1.setText("Buat");

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama");

        InputNama.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        InputNama.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tanggal Masuk");

        InputTglMasuk.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        InputTglMasuk.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No HP Keluarga (Aktif)");

        InputNoHP.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        InputNoHP.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Jenis Kelamin");

        PriaRadioBtn.setBackground(new java.awt.Color(0, 0, 0));
        JenisKelaminRadioGroup.add(PriaRadioBtn);
        PriaRadioBtn.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        PriaRadioBtn.setForeground(new java.awt.Color(255, 255, 255));
        PriaRadioBtn.setText("Pria");
        PriaRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriaRadioBtnActionPerformed(evt);
            }
        });

        TidakJelasRadioBtn.setBackground(new java.awt.Color(0, 0, 0));
        JenisKelaminRadioGroup.add(TidakJelasRadioBtn);
        TidakJelasRadioBtn.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        TidakJelasRadioBtn.setForeground(new java.awt.Color(255, 255, 255));
        TidakJelasRadioBtn.setText("Tidak Jelas");
        TidakJelasRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TidakJelasRadioBtnActionPerformed(evt);
            }
        });

        WanitaRadioBtn.setBackground(new java.awt.Color(0, 0, 0));
        JenisKelaminRadioGroup.add(WanitaRadioBtn);
        WanitaRadioBtn.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        WanitaRadioBtn.setForeground(new java.awt.Color(255, 255, 255));
        WanitaRadioBtn.setText("Wanita");
        WanitaRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WanitaRadioBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pilih Layanan");

        LayananComboBox.setBackground(new java.awt.Color(255, 255, 255));
        LayananComboBox.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        LayananComboBox.setForeground(new java.awt.Color(0, 0, 0));
        LayananComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LayananComboBoxActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Upload Foto :");

        ReturnIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/returnicon.png"))); // NOI18N
        ReturnIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnIconMouseClicked(evt);
            }
        });

        CreateBtn.setBackground(new java.awt.Color(0, 0, 0));
        CreateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/createbtn.png"))); // NOI18N
        CreateBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(166, 124, 0), 2, true));
        CreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nota Pembayaran");

        notaText.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        notaText.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(InputTglMasuk, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                            .addComponent(InputNama))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(LayananComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ReturnIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CreateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CjakraLogo)
                                .addGap(18, 18, 18)
                                .addComponent(MoreInfoLogo))
                            .addComponent(jLabel1)
                            .addComponent(InputNoHP, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PriaRadioBtn)
                                .addGap(55, 55, 55)
                                .addComponent(WanitaRadioBtn))
                            .addComponent(TidakJelasRadioBtn)
                            .addComponent(jLabel8)
                            .addComponent(notaText))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(MoreInfoLogo)
                    .addComponent(CjakraLogo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LayananComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputTglMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputNoHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PriaRadioBtn)
                    .addComponent(WanitaRadioBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TidakJelasRadioBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ReturnIcon, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CreateBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        CustomerMainView mv = new CustomerMainView(konsumenGlobal, layananGlobal);
        this.dispose();
        mv.setVisible(true);
    }//GEN-LAST:event_ReturnIconMouseClicked

    private void CreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateBtnActionPerformed
        int selectedIndex = LayananComboBox.getSelectedIndex();
            Layanan selectedLayanan = listLayanan.get(selectedIndex);
            Layanan searchIdDatabase = LC.searchIdLayanan(selectedLayanan.getNamaLayanan());
        
            if(PriaRadioBtn.isSelected()){
                jenisKelamin = "Pria";
            }else if(WanitaRadioBtn.isSelected()){
                jenisKelamin = "Wanita";
            }else if(TidakJelasRadioBtn.isSelected()){
                jenisKelamin = "Tidak Diketahui";
            }

            DataMayat DM = new DataMayat(InputNama.getText(), InputTglMasuk.getText(), InputNoHP.getText(), "Belum Membayar");
            
            
            
            
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Calendar c = Calendar.getInstance();
            
            //exception handling
            try {
                c.setTime(sdf.parse(InputTglMasuk.getText())); // Menggunakan tanggal dari input tanggal masuk
            } catch (ParseException ex) {
                Logger.getLogger(CustomerCreateView.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            c.add(Calendar.DATE, 5); // tambah 5 hari
            String tglPembayaran = sdf.format(c.getTime());
           
            
            Pembayaran P = new Pembayaran(tglPembayaran);
            
            DMC.insertDataMayat(DM); PC.insertPembayaran(P);
            
            dataMayatGlobal = DMC.searchOnlyId(DM);
            pembayaranGlobal = PC.searchOnlyId(tglPembayaran);

            Kremasi KRS = new Kremasi(dataMayatGlobal.getIdMayat(), konsumenGlobal.getIdKonsumen(), pembayaranGlobal.getIdPembayaran(), 0, searchIdDatabase.getIdLayanan(), "-");
            KRC.insertDataKremasi(KRS);
            
            
            System.out.println(konsumenGlobal.getJumlahMayat());
            KC.updateJumlahMayat(konsumenGlobal.getJumlahMayat()+1, konsumenGlobal.getIdKonsumen());
            
            
            
            layananGlobal = searchIdDatabase;
            
            clearText();
            InputTglMasuk.setText(konsumenGlobal.getNomorTelepon());
            JOptionPane.showMessageDialog(null, "Data berhasil dibuat!");
            CustomerMainView mv = new CustomerMainView(konsumenGlobal, layananGlobal);
            this.dispose();
            mv.setVisible(true);
    }//GEN-LAST:event_CreateBtnActionPerformed

    private void PriaRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriaRadioBtnActionPerformed
        setComponent(true);
    }//GEN-LAST:event_PriaRadioBtnActionPerformed

    private void WanitaRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WanitaRadioBtnActionPerformed
        setComponent(true);
    }//GEN-LAST:event_WanitaRadioBtnActionPerformed

    private void TidakJelasRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TidakJelasRadioBtnActionPerformed
        setComponent(true);
    }//GEN-LAST:event_TidakJelasRadioBtnActionPerformed

    private void MoreInfoLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoreInfoLogoMouseClicked
        AboutUsView auv = new AboutUsView();
        auv.setVisible(true); 
    }//GEN-LAST:event_MoreInfoLogoMouseClicked

    private void LayananComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LayananComboBoxActionPerformed
        notaDefault();
    }//GEN-LAST:event_LayananComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerCreateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerCreateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerCreateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerCreateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Konsumen KC = null;
                
                new CustomerCreateView(KC).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CjakraLogo;
    private javax.swing.JButton CreateBtn;
    private javax.swing.JTextField InputNama;
    private javax.swing.JTextField InputNoHP;
    private javax.swing.JTextField InputTglMasuk;
    private javax.swing.ButtonGroup JenisKelaminRadioGroup;
    private javax.swing.JComboBox<Layanan> LayananComboBox;
    private javax.swing.JLabel MoreInfoLogo;
    private javax.swing.JRadioButton PriaRadioBtn;
    private javax.swing.JLabel ReturnIcon;
    private javax.swing.JRadioButton TidakJelasRadioBtn;
    private javax.swing.JRadioButton WanitaRadioBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField notaText;
    // End of variables declaration//GEN-END:variables
}
