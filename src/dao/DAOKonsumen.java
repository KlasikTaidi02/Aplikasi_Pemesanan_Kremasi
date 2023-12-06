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

public class DAOKonsumen {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertKonsumen(Konsumen K){
        con = dbCon.makeConnection();

        String sql = "INSERT INTO konsumen (usernameKonsumen, passwordKonsumen, namaKonsumen, nomorTelepon, jumlahMayat)"
                + "VALUES ( '"
                + K.getUsernameKonsumen() + "', '"
                + K.getPasswordKonsumen() + "', '"
                + K.getNamaKonsumen() + "', '"
                + K.getNomorTelepon() + "', "
                + K.getJumlahMayat() + ")";
        
        System.out.println("Adding Konsumen");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " data konsumen");
            statement.close();
        } catch (Exception e) {
            System.out.println("Error Adding konsumen...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public Konsumen searchForLogin(String username, String password){
        con = dbCon.makeConnection();

        Konsumen K = null;
        List<Konsumen> list = new ArrayList();
        
        String sql = "SELECT * FROM konsumen "
                + "WHERE usernameKonsumen LIKE '" + username + "' AND passwordKonsumen LIKE '" + password + "'";
        
        
        System.out.println("Searching konsumen");
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while(rs.next()){
                    K = new Konsumen(
                            rs.getInt("idKonsumen"),
                            rs.getString("usernameKonsumen"),
                            rs.getString("passwordKonsumen"),
                            rs.getString("namaKonsumen"),
                            rs.getString("nomorKonsumen"),
                            rs.getInt("jumlahMayat")
                    );
                    list.add(K);
                }
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        return K;
    }
    
    public List<Konsumen> showKonsumenForAdmin(String query){
        con = dbCon.makeConnection();
       
        String sql = "SELECT * FROM konsumen WHERE(idKonsumen LIKE"
                + "'%"+ query + "%'"
                + "OR usernameKonsumen LIKE '%" + query+ "%'"
                + "OR passwordKonsumen LIKE '%" + query +"%'"
                + "OR namaKonsumen LIKE '%" + query +"%'"
                + "OR nomorKonsumen LIKE '%" + query +"%'"
                + "OR jumlahMayat LIKE '%" + query + "%')";
        System.out.println("Mengambil data Konsumen...");
        List<Konsumen> list = new ArrayList();
       
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
           
            if(rs!= null){
                while(rs.next()){
                        Konsumen k = new Konsumen (Integer.parseInt(rs.getString("idKonsumen")),
                            rs.getString("usernameKonsumen"), rs.getString("passwordKonsumen"),
                            rs.getString("namaKonsumen"), rs.getString("nomorKonsumen"),
                            Integer.parseInt(rs.getString("jumlahMayat")));
                   
                    list.add(k);
                    
                }
                
            }
            rs.close();;
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        dbCon.closeConnection();
       
        return list;
    }
    
    public void deleteDataKonsumenById(int id){
         con = dbCon.makeConnection();
         
         String sql = "DELETE FROM konsumen WHERE idKonsumen = " + id;

         System.out.println("Deleting Konsumen...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Konsumen " + id);
            statement.close();
        }catch(Exception e){
            System.out.println("Error deleting konsumen...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public void updateJumlahMayat (int jumlah, int id) {
        con = dbCon.makeConnection();
        
        String sql = "UPDATE konsumen SET jumlahMayat = " + jumlah + " WHERE konsumen.idKonsumen = " + id + ";";
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Mengupdate " + result + " Data Mayat...");
            statement.close();
        } catch (Exception e) {
            System.out.println("Error Mengupdate Data Mayat...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
    }
}
