/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Seto
 */
public class Layanan {
    private int idLayanan;
    private String namaLayanan;
    private double hargaLayanan;

    public Layanan(int idLayanan, String namaLayanan, double hargaLayanan) {
        this.idLayanan = idLayanan;
        this.namaLayanan = namaLayanan;
        this.hargaLayanan = hargaLayanan;
    }

    public int getIdLayanan() {
        return idLayanan;
    }

    public void setIdLayanan(int idLayanan) {
        this.idLayanan = idLayanan;
    }

    public String getNamaLayanan() {
        return namaLayanan;
    }

    public void setNamaLayanan(String namaLayanan) {
        this.namaLayanan = namaLayanan;
    }

    public double getHargaLayanan() {
        return hargaLayanan;
    }

    public void setHargaLayanan(double hargaLayanan) {
        this.hargaLayanan = hargaLayanan;
    }
    
    @Override
    public String toString(){
        return namaLayanan;
    }
}