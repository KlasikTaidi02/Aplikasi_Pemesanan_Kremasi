/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.DAOKonsumen;
import java.util.List;
import model.Konsumen;
import tabel.TabelKonsumen;

public class KonsumenControl {
    private DAOKonsumen pDAO = new DAOKonsumen();
    
    public void insertKonsumen(Konsumen K){
        pDAO.insertKonsumen(K);
    }
    
    public Konsumen searchForLogin(String username, String password){
        Konsumen K = pDAO.searchForLogin(username, password);
        
        return K;
    }
        
    public TabelKonsumen showTableForAdmin(String query){
        List<Konsumen> dataKonsumen = pDAO.showKonsumenForAdmin(query);
        TabelKonsumen table = new TabelKonsumen(dataKonsumen);
        
        return table;
    }
    
    public void deleteDataKonsumenById(int id){
        pDAO.deleteDataKonsumenById(id);
    }
    
    public void updateJumlahMayat(int jumlah, int id){
        pDAO.updateJumlahMayat(jumlah, id);
    }
}
