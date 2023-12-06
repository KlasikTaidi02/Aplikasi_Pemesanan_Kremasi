/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import java.util.List;
import dao.DAODataMayat;
import model.DataMayat;

public class DataMayatControl {
    private DAODataMayat dDao = new DAODataMayat();
    
    public void insertDataMayat(DataMayat DM){
        dDao.insertDataMayat(DM);
    }
    
    public void updateDataMayat(DataMayat DM){
        dDao.updateDataMayat(DM);
    }
    
    public void deleteDataMayat(int id){
        dDao.deleteDataMayat(id);
    }
    
    public DataMayat searchOnlyId(DataMayat DM){
        return dDao.searchidDataMayat(DM);
    }
    
    public void updateStatusDataMayat(String status, int id){
        dDao.updateStatusDataMayat(id, status);
    }
}
