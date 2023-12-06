/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.List;
import tabel.TabelKremasiForKonsumen;
import tabel.TabelKremasiForPembayaran;
import tabel.TabelKremasiForPegawai;
import dao.DAOKremasi;
import model.Kremasi;

public class KremasiControl {
    private DAOKremasi kDAO = new DAOKremasi();
    
    public void insertDataKremasi(Kremasi K){
        kDAO.insertkremasi(K);
    }
    
    public void updateDataKremasi(Kremasi K){
        kDAO.updateDataKremasi(K);
    }
    
    public TabelKremasiForKonsumen showTableForKremasi(String query){
        List<Kremasi> dataKremasi = kDAO.showKremasi(query);
        TabelKremasiForKonsumen table = new TabelKremasiForKonsumen(dataKremasi);
        
        return table;
    }
    
    public TabelKremasiForPembayaran showTabelKremasiForPembayaran(String query){
        List<Kremasi> dataKremasi = kDAO.showKremasi(query);
        TabelKremasiForPembayaran table = new TabelKremasiForPembayaran(dataKremasi);
        
        return table;
    }
    
    public TabelKremasiForPegawai showTabelKremasiForPegawai(String query){
        List<Kremasi> dataKremasi = kDAO.showKremasiInEmployee(query);
        TabelKremasiForPegawai table = new TabelKremasiForPegawai(dataKremasi);
        
        return table;
    }
    
    public Kremasi searchKremasiById(String query){
        return kDAO.searchKremasiById(query);
    }
    
    public void updateKremasiPegawai (int idKremasi, int intPegawai) {
        kDAO.updatekremasipegawai(idKremasi, intPegawai);
    }
}