/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.List;
import model.Pegawai;
import dao.DAOPegawai;
import tabel.TabelTampilPegawai;

public class PegawaiControl {
    private DAOPegawai pDAO = new DAOPegawai();
    
    public Pegawai searchForLogin(String username, String password){
        Pegawai P = pDAO.searchForLogin(username, password);
        
        return P;
    }
    
    public TabelTampilPegawai showTableForAdmin(String query){
        TabelTampilPegawai table = null;
        try{
            List<Pegawai> dataPegawai = pDAO.showPegawaiForAdmin(query);
            table = new TabelTampilPegawai(dataPegawai);

        }catch(Exception e){
            System.out.println("Ini Error : " + e.getMessage());
        }
        return table;
    }
    
    public Pegawai searchOnlyId(String id){
        Pegawai P = pDAO.searchOnlyId(id);
        
        return P;
    }
    
    public void updatePegawai(Pegawai P, int id){
        pDAO.updatePegawai(P, id);
    }
    
    public void deleteDataPegawaiById(int id){
        pDAO.deleteDataPegawaiById(id);
    }
    
    public void insertPegawai(Pegawai P){
        pDAO.insertPegawai(P);
    }
}
