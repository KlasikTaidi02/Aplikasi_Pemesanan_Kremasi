/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Seto
 */
public class DataMayat {
    private int idMayat;
    private String namaMayat;
    private String tanggalMasuk;
    private String noTelepon;
    private String status;
    private Konsumen konsumen;

    public DataMayat(String namaMayat, String tanggalMasuk, String noTelepon) {
        this.namaMayat = namaMayat;
        this.tanggalMasuk = tanggalMasuk;
        this.noTelepon = noTelepon;
    }

    public DataMayat(int idMayat, String namaMayat, String tanggalMasuk, String noTelepon, String status) {
        this.idMayat = idMayat;
        this.namaMayat = namaMayat;
        this.tanggalMasuk = tanggalMasuk;
        this.noTelepon = noTelepon;
        this.status = status;
    }

    public DataMayat(int idMayat, String namaMayat, String tanggalMasuk, String status) {
        this.idMayat = idMayat;
        this.namaMayat = namaMayat;
        this.tanggalMasuk = tanggalMasuk;
        this.status = status;
    }

    public DataMayat(String namaMayat, String tanggalMasuk, String noTelepon, String status) {
        this.namaMayat = namaMayat;
        this.tanggalMasuk = tanggalMasuk;
        this.noTelepon = noTelepon;
        this.status = status;
    }

    public int getIdMayat() {
        return idMayat;
    }

    public void setIdMayat(int idMayat) {
        this.idMayat = idMayat;
    }

    public String getNamaMayat() {
        return namaMayat;
    }

    public void setNamaMayat(String namaMayat) {
        this.namaMayat = namaMayat;
    }

    public String getTanggalMasuk() {
        return tanggalMasuk;
    }

    public void setTanggalMasuk(String tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Konsumen getKonsumen() {
        return konsumen;
    }

    public void setKonsumen(Konsumen konsumen) {
        this.konsumen = konsumen;
    }
}