/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.*;

public class DAODataMayat {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertDataMayat(DataMayat DM){
        con = dbCon.makeConnection();

        String sql = "INSERT INTO datamayat (namaMayat, tanggalMasuk, nomorTelepon, status)"
                + "VALUES ('"
                + DM.getNamaMayat() + "', '"
                + DM.getTanggalMasuk() + "', '"
                + DM.getNoTelepon() + "', '"
                + DM.getStatus() + "')";
        
        System.out.println("Adding Data Mayat");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " data mayat");
            statement.close();
        } catch (Exception e) {
            System.out.println("Error Adding data mayat...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<DataMayat> showDataMayatAll() {
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM datamayat";
        System.out.println("Mengambil data datamayat ...");
        
        List<DataMayat> list = new ArrayList();

        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null) {
                while(rs.next()) {
                    DataMayat DM = new DataMayat (
                            rs.getInt("idMayat"),
                            rs.getString("namaMayat"),
                            rs.getString("tanggalMasuk"),
                            rs.getString("status")
                    );
                    list.add(DM);
                }
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("Error reading Data Mayat...");
            System.out.println(e);
        }
        dbCon.closeConnection();        
        return list;
    }
    
    public List<DataMayat> showDataMayatForKonsumen(int id) {
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM datamayat as DM JOIN Konsumen as K ON DM.idKonsumen = K.idKonsumen "
                + " WHERE DM.idKonsumen = " + id;
        
        System.out.println("Mengambil data datamayat ...");
        
        List<DataMayat> list = new ArrayList();

        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null) {
                while(rs.next()) {
                    DataMayat DM = new DataMayat (
                            rs.getInt("idMayat"),
                            rs.getString("namaMayat"),
                            rs.getString("tanggalMasuk"),
                            rs.getString("status")
                    );
                    list.add(DM);
                    
                }
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("Error reading Data Mayat...");
            System.out.println(e);
        }
        dbCon.closeConnection();        
        return list;
    }
    
    public void updateDataMayat(DataMayat DM){
        con = dbCon.makeConnection();
        
        //String sql = "UPDATE datamayat SET namaMayat = '" + DM.getNamaMayat() + "' WHERE id = " + DM.getIdMayat();
        
        String sql = "UPDATE datamayat SET namaMayat = '" + DM.getNamaMayat() + "', "
                + "tanggalMasuk = '" + DM.getTanggalMasuk() + "', "
                + "nomorTelepon = '" + DM.getNoTelepon() + "', "
                + "status = '" + DM.getStatus() + "' "
                + "WHERE idMayat = " + DM.getIdMayat();
        
        System.out.println("Editing Data Mayat...");

        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " Data Mayat " + DM.getIdMayat());
            statement.close();
        } catch (Exception e) {
            System.out.println("Error editing Data Mayat...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public void updateStatusDataMayat(int id, String status){
        con = dbCon.makeConnection();
        
        String sql = "UPDATE datamayat SET status = '" + status + "' WHERE idMayat = " + id + "";
        
        System.out.println("Editing Data Mayat...");

        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " Data Mayat " + id);
            statement.close();
        } catch (Exception e) {
            System.out.println("Error editing Data Mayat...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public void deleteDataMayat(int id){
         con = dbCon.makeConnection();
         
         String sql = "DELETE FROM datamayat "
                    + "WHERE (idMayat LIKE '%" + id + "%')";
         
         System.out.println("Deleting Data Mayat...");
         
         try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Deleting " + result + " Data Mayat ");
            statement.close();
        } catch (Exception e) {
            System.out.println("Error deleting data Mayat...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public DataMayat searchidDataMayat(DataMayat DM){
        con = dbCon.makeConnection();
        DataMayat M = null;
        
        List<DataMayat> list = new ArrayList();
        
        String sql = "SELECT * FROM datamayat "
            + "WHERE ( "
            + " namaMayat LIKE " + "'%" + DM.getNamaMayat() + "%'" 
            + " AND tanggalMasuk LIKE " + "'%" + DM.getTanggalMasuk() + "%'"
            + " AND nomorTelepon LIKE " + "'%" + DM.getNoTelepon() + "%'"
            + " AND status LIKE " + "'%" + DM.getStatus() + "%'"
            + " )" ;
        
        System.out.println("Searching id DataMayat");

        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
        
            if(rs!= null){
                while(rs.next()){
                    M = new DataMayat(
                            rs.getInt("idMayat"),
                            rs.getString("namaMayat"),
                            rs.getString("tanggalMasuk"),
                            rs.getString("nomorTelepon"),
                            rs.getString("status")
                    );
                    list.add(M);
                }
        }
        rs.close();
        statement.close();;
        } catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }        
        return M;
    }
}