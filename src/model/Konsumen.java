/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Seto
 */
public class Konsumen {
    private int idKonsumen;
    private String usernameKonsumen;
    private String passwordKonsumen;
    private String namaKonsumen;
    private String nomorTelepon;
    private int jumlahMayat;

    public Konsumen(int idKonsumen, String usernameKonsumen, String passwordKonsumen, String namaKonsumen, String nomorTelepon, int jumlahMayat) {
        this.idKonsumen = idKonsumen;
        this.usernameKonsumen = usernameKonsumen;
        this.passwordKonsumen = passwordKonsumen;
        this.namaKonsumen = namaKonsumen;
        this.nomorTelepon = nomorTelepon;
        this.jumlahMayat = jumlahMayat;
    }

    public Konsumen(String usernameKonsumen, String passwordKonsumen, String namaKonsumen, String nomorTelepon, int jumlahMayat) {
        this.usernameKonsumen = usernameKonsumen;
        this.passwordKonsumen = passwordKonsumen;
        this.namaKonsumen = namaKonsumen;
        this.nomorTelepon = nomorTelepon;
        this.jumlahMayat = jumlahMayat;
    }
    
    public int getIdKonsumen() {
        return idKonsumen;
    }

    public void setIdKonsumen(int idKonsumen) {
        this.idKonsumen = idKonsumen;
    }

    public String getUsernameKonsumen() {
        return usernameKonsumen;
    }

    public void setUsernameKonsumen(String usernameKonsumen) {
        this.usernameKonsumen = usernameKonsumen;
    }

    public String getPasswordKonsumen() {
        return passwordKonsumen;
    }

    public void setPasswordKonsumen(String passwordKonsumen) {
        this.passwordKonsumen = passwordKonsumen;
    }

    public String getNamaKonsumen() {
        return namaKonsumen;
    }

    public void setNamaKonsumen(String namaKonsumen) {
        this.namaKonsumen = namaKonsumen;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public int getJumlahMayat() {
        return jumlahMayat;
    }

    public void setJumlahMayat(int jumlahMayat) {
        this.jumlahMayat = jumlahMayat;
    }
    
    
}