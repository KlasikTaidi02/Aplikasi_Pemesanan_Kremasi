/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Seto
 */
public class Pembayaran {
   private int idPembayaran;
   private String tanggalPembayaran;

    public Pembayaran(int idPembayaran, String tanggalPembayaran) {
        this.idPembayaran = idPembayaran;
        this.tanggalPembayaran = tanggalPembayaran;
    }

    public Pembayaran(String tanggalPembayaran) {
        this.tanggalPembayaran = tanggalPembayaran;
    }
    
    public int getIdPembayaran() {
        return idPembayaran;
    }

    public void setIdPembayaran(int idPembayaran) {
        this.idPembayaran = idPembayaran;
    }

    public String getTanggalPembayaran() {
        return tanggalPembayaran;
    }

    public void setTanggalPembayaran(String tanggalPembayaran) {
        this.tanggalPembayaran = tanggalPembayaran;
    }
}