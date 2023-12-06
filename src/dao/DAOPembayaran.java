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

public class DAOPembayaran {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertPembayaran(Pembayaran P){
        con = dbCon.makeConnection();

        String sql = "INSERT INTO pembayaran (TanggalPembayaran)"
                + "VALUES ('"
                + P.getTanggalPembayaran() + "')";
        
        System.out.println("Adding Pembayaran");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " data pembayaran");
            statement.close();
        } catch (Exception e) {
            System.out.println("Error Adding data pembayaran...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<Pembayaran> showDataPembayaran() {
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM pembayaran";
        System.out.println("Mengambil data pembayaran ...");
        
        List<Pembayaran> list = new ArrayList();

        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null) {
                while(rs.next()) {
                    Pembayaran P = new Pembayaran (
                            rs.getInt("idPembayaran"),
                            rs.getString("tanggalPembayaran")
                    );
                    list.add(P);
                }
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("Error reading Pembayaran ...");
            System.out.println(e);
        }
        dbCon.closeConnection();        
        return list;
    }
    
    public void updateDataPembayaran(Pembayaran P){
        con = dbCon.makeConnection();
        
        String sql = "UPDATE pembayaran SET tanggalPembayaran = '" + P.getTanggalPembayaran() + "' WHERE idPembayaran = " + P.getIdPembayaran();
        
        System.out.println("Editing Pembayaran...");

        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " Pembayaran " + P.getIdPembayaran());
            statement.close();
        } catch (Exception e) {
            System.out.println("Error editing Pembayaran...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public void deleteDataPembayaran(int id){
         con = dbCon.makeConnection();
         
         String sql = "DELETE FROM pembayaran "
                    + "WHERE (idPembayaran LIKE '%" + id + "%')";
         
         System.out.println("Deleting data Pembayaran...");
         
         try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Deleting " + result + " Data Pembayaran ");
            statement.close();
        } catch (Exception e) {
            System.out.println("Error deleting data Pembayaran...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public Pembayaran searchOnlyId(String query){
        con = dbCon.makeConnection();
        
        Pembayaran P = null;
        List<Pembayaran> list = new ArrayList();
        
        String sql = "SELECT * FROM pembayaran "
                + "WHERE tanggalPembayaran LIKE '%" + query + "%'";
        
        System.out.println("Searching pembayaran");
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while(rs.next()){
                    P = new Pembayaran(
                            rs.getInt("idPembayaran"),
                            rs.getString("tanggalPembayaran")
                    );
                    list.add(P);
                }
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        return P;
    }
}