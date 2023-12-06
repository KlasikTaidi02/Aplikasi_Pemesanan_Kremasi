/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Seto
 */
public class Kremasi {
    private int idKremasi;
    private int idMayat;
    private int idKonsumen;
    private int idPembayaran;
    private int idPegawai;
    private int idLayanan;
    private String waktuKremasi;
    private Konsumen konsumen;
    private Pembayaran pembayaran;
    private Layanan layanan;
    private Pegawai pegawai;
    private DataMayat dataMayat;

    public Kremasi(int idKremasi, int idMayat, int idKonsumen, int idPembayaran, int idPegawai, int idLayanan, String waktuKremasi, Konsumen konsumen, Pembayaran pembayaran, Layanan layanan, Pegawai pegawai, DataMayat dataMayat) {
        this.idKremasi = idKremasi;
        this.idMayat = idMayat;
        this.idKonsumen = idKonsumen;
        this.idPembayaran = idPembayaran;
        this.idPegawai = idPegawai;
        this.idLayanan = idLayanan;
        this.waktuKremasi = waktuKremasi;
        this.konsumen = konsumen;
        this.pembayaran = pembayaran;
        this.layanan = layanan;
        this.pegawai = pegawai;
        this.dataMayat = dataMayat;
    }

    public Kremasi(int idMayat, int idKonsumen, int idPembayaran, int idPegawai, int idLayanan, String waktuKremasi, Konsumen konsumen, Pembayaran pembayaran, Layanan layanan, Pegawai pegawai, DataMayat dataMayat) {
        this.idMayat = idMayat;
        this.idKonsumen = idKonsumen;
        this.idPembayaran = idPembayaran;
        this.idPegawai = idPegawai;
        this.idLayanan = idLayanan;
        this.waktuKremasi = waktuKremasi;
        this.konsumen = konsumen;
        this.pembayaran = pembayaran;
        this.layanan = layanan;
        this.pegawai = pegawai;
        this.dataMayat = dataMayat;
    }

    public Kremasi(int idMayat, int idKonsumen, int idPembayaran, int idPegawai, int idLayanan, String waktuKremasi){
        this.idMayat = idMayat;
        this.idKonsumen = idKonsumen;
        this.idPembayaran = idPembayaran;
        this.idPegawai = idPegawai;
        this.idLayanan = idLayanan;
        this.waktuKremasi = waktuKremasi;
    }

    public Kremasi(int idKremasi, int idMayat, int idKonsumen, int idPembayaran, int idPegawai, int idLayanan, String waktuKremasi) {
        this.idKremasi = idKremasi;
        this.idMayat = idMayat;
        this.idKonsumen = idKonsumen;
        this.idPembayaran = idPembayaran;
        this.idPegawai = idPegawai;
        this.idLayanan = idLayanan;
        this.waktuKremasi = waktuKremasi;
    }

    public int getIdKremasi() {
        return idKremasi;
    }

    public void setIdKremasi(int idKremasi) {
        this.idKremasi = idKremasi;
    }

    public int getIdMayat() {
        return idMayat;
    }

    public void setIdMayat(int idMayat) {
        this.idMayat = idMayat;
    }

    public int getIdKonsumen() {
        return idKonsumen;
    }

    public void setIdKonsumen(int idKonsumen) {
        this.idKonsumen = idKonsumen;
    }

    public int getIdPembayaran() {
        return idPembayaran;
    }

    public void setIdPembayaran(int idPembayaran) {
        this.idPembayaran = idPembayaran;
    }

    public int getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(int idPegawai) {
        this.idPegawai = idPegawai;
    }

    public int getIdLayanan() {
        return idLayanan;
    }

    public void setIdLayanan(int idLayanan) {
        this.idLayanan = idLayanan;
    }

    public String getWaktuKremasi() {
        return waktuKremasi;
    }

    public void setWaktuKremasi(String waktuKremasi) {
        this.waktuKremasi = waktuKremasi;
    }

    public Konsumen getKonsumen() {
        return konsumen;
    }

    public void setKonsumen(Konsumen konsumen) {
        this.konsumen = konsumen;
    }

    public Pembayaran getPembayaran() {
        return pembayaran;
    }

    public void setPembayaran(Pembayaran pembayaran) {
        this.pembayaran = pembayaran;
    }

    public Layanan getLayanan() {
        return layanan;
    }

    public void setLayanan(Layanan layanan) {
        this.layanan = layanan;
    }

    public Pegawai getPegawai() {
        return pegawai;
    }

    public void setPegawai(Pegawai pegawai) {
        this.pegawai = pegawai;
    }

    public DataMayat getDataMayat() {
        return dataMayat;
    }

    public void setDataMayat(DataMayat dataMayat) {
        this.dataMayat = dataMayat;
    }


}