/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Seto
 */
public class Pegawai {
    private int idPegawai;
    private String usernamePegawai;
    private String passwordPegawai;
    private String namaPegawai;
    private String noHP;
    private String tanggalMasuk;

    public Pegawai(int idPegawai, String usernamePegawai, String passwordPegawai, String namaPegawai, String noHP, String tanggalMasuk) {
        this.idPegawai = idPegawai;
        this.usernamePegawai = usernamePegawai;
        this.passwordPegawai = passwordPegawai;
        this.namaPegawai = namaPegawai;
        this.noHP = noHP;
        this.tanggalMasuk = tanggalMasuk;
    }
    
    public Pegawai(String usernamePegawai, String passwordPegawai, String namaPegawai, String noHP, String tanggalMasuk) {
        this.usernamePegawai = usernamePegawai;
        this.passwordPegawai = passwordPegawai;
        this.namaPegawai = namaPegawai;
        this.noHP = noHP;
        this.tanggalMasuk = tanggalMasuk;
    }

    public int getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(int idPegawai) {
        this.idPegawai = idPegawai;
    }

    public String getUsernamePegawai() {
        return usernamePegawai;
    }

    public void setUsernamePegawai(String usernamePegawai) {
        this.usernamePegawai = usernamePegawai;
    }

    public String getPasswordPegawai() {
        return passwordPegawai;
    }

    public void setPasswordPegawai(String passwordPegawai) {
        this.passwordPegawai = passwordPegawai;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    public String getTanggalMasuk() {
        return tanggalMasuk;
    }

    public void setTanggalMasuk(String tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }


}
