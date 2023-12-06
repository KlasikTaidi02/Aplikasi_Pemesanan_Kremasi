/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.DAOPembayaran;
import java.util.List;
import model.Pembayaran;

public class PembayaranControl {
    private DAOPembayaran pDAO = new DAOPembayaran();
    
    public void insertPembayaran(Pembayaran P){
        pDAO.insertPembayaran(P);
    }
    
    public void updateDataPembayaran(Pembayaran P){
        pDAO.updateDataPembayaran(P);
    }
    
    public void deleteDataPembayaran(int id){
        pDAO.deleteDataPembayaran(id);
    }
    
    public Pembayaran searchOnlyId(String query){
        return pDAO.searchOnlyId(query);
    }
}
