/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.List;
import model.Layanan;
import dao.DAOLayanan;
/**
 *
 * @author Feedm
 */
public class LayananControl {
    private DAOLayanan lDao = new DAOLayanan();
    
    public List<Layanan> showListLayanan(){
        List<Layanan> dataLayanan = lDao.showLayanan();
        return dataLayanan;
    }
    
    public Layanan searchIdLayanan(String namaLayanan){
        Layanan L = lDao.searchidLayanan(namaLayanan);
        return L;
    }
}
