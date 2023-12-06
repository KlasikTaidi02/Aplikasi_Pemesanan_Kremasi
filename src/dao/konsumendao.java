/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;


import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Konsumen;
/**

 * @author User
 */
public class konsumendao {
    
        
    private  DbConnection dbcon = new DbConnection();
    private Connection con;
    
     // method untuk menyimpan data konsumen
    public void insertKonsumen(Konsumen k) {
        con = dbcon.makeConnection();
                
        String sql = "INSERT INTO konsumen (idKonsumen, usernameKonsumen, passwordKonsumen, namaKonsumen , nomorTelepon, jumlahMayat) " + "VALUES ('" 
                + k.getIdKonsumen() + "','" + k.getUsernameKonsumen()+ "','"+ k.getPasswordKonsumen()+ "','" + k.getNamaKonsumen()+ "','" + k.getNomorTelepon()+ "','"  + k.getJumlahMayat()+ "')";
        
        System.out.println("Adding Konsumen...");
        
        try {
            Statement statement = con.createStatement(); 
                int result = statement.executeUpdate(sql);
                System.out.println("Added " + result + " Konsumen");
                statement.close();
                
        } catch (SQLException e) {
            System.out.println("Error adding Konsumen...");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
    
      public List<Konsumen> showKonsumen() {
        con = dbcon.makeConnection();
        
        String sql = "SELECT * FROM konsumen";
        System.out.println("Mengambil data Konsumen...");
        
        List<Konsumen> list = new ArrayList();
        
        try {
                Statement statement = con.createStatement();
                ResultSet rs = statement.executeQuery(sql);
                
                if (rs != null) {
                    
                    while (rs.next()) {
                        
                        Konsumen k = new Konsumen(
                                rs.getInt("idKonsumen"),
                                rs.getString("usernameKonsumen"),
                                rs.getString("passwordKonsumen"),
                                rs.getString("namaKonsumen"),
                                rs.getString("nomorTelepon"),
                                rs.getInt("jumlahMayat")
                                
                        );
                        list.add(k);
                    }
                    
                }
                
                rs.close();
                statement.close();
            
        } catch (Exception e) {
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        dbcon.closeConnection();
        return list;
    }
    
    // method untuk menampilkan data Konsumen  berdasarkan nomor id
    public Konsumen searchKaryawan(Konsumen k) {
        con = dbcon.makeConnection();
        
        String sql = "SELECT * FROM karyawan WHERE idKonsumen = '"
                + k.getIdKonsumen() + "'" + "OR usernameKonsumen = '"+ k.getUsernameKonsumen()+ "'" ;
        System.out.println("Searching Id...");
        
        
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if (rs != null) {
                
                while (rs.next()) {
                    
                    k =  new Konsumen(
                                rs.getInt("idKonsumen"),
                                rs.getString("usernameKonsumen"),
                                rs.getString("passwordKonsumen"),
                                rs.getString("namaKonsumen"),
                                rs.getString("nomorTelepon"),
                                rs.getInt("jumlahMayat")     
                     );
                    
                }
                
            }
            rs.close();
            statement.close();
            
        } catch (Exception e) {
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        dbcon.closeConnection();
        return k;
    }  
      
     // method untuk mengubah data konsumen
    public void updateKonsumen(Konsumen k, String id) {
        con = dbcon.makeConnection();
        
        String sql = "UPDATE konsumen SET usernameKonsumen = '" + k.getUsernameKonsumen()+ "'," + "passwordKonsumen = '" + k.getPasswordKonsumen() + "',"  + "namaKonsumen = " + k.getNamaKonsumen() + ","+ "nomorTelepon = '"  + k.getNomorTelepon() + "',"+ "jumlahMayat = '" + k.getJumlahMayat() +"' WHERE idKonsumen = '" + id + "'";
                   
                System.out.println("Editing Konsumen...");
        
        try {
                Statement statement = con.createStatement();
                System.out.println("tes");
                int result = statement.executeUpdate(sql);
                System.out.println("Edited " + result + " Konsumen" + id);
                statement.close();
                
        } catch (SQLException e) {
            System.out.println("Error editing Konsumen...");
            System.out.println(e);
        }
        
        dbcon.closeConnection();
        
    }
    
   
    
     // method untuk menghapus data Konsumen
    public void deleteKonsumen(Konsumen k) {
        
        con = dbcon.makeConnection();
        
        String sql = "DELETE FROM konsumen WHERE idKonsumen = '" + k.getIdKonsumen() + "'"+ "OR usernameKonsumen = '"+ k.getUsernameKonsumen()+ "'" ;
        System.out.println("Deleting Konsumen..");
        
        try {
                Statement statement = con.createStatement();
                int result = statement.executeUpdate(sql);
                System.out.println("Delete " + result + " Konsumen " + k.getIdKonsumen() );
            
        } catch (Exception e) {
            System.out.println("Error deleting Konsumen...");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
    
}