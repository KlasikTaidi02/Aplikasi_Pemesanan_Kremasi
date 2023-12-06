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

public class DAOPegawai {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertPegawai(Pegawai P){
        con = dbCon.makeConnection();

        //String usernamePegawai, String passwordPegawai, String namaPegawai, String noHP, String tanggalMasuk
        
        String sql = "INSERT INTO pegawai (usernamePegawai, passwordPegawai, namaPegawai, noHP, tanggalMasuk)"
                + "VALUES ('"
                + P.getUsernamePegawai() + "', '"
                + P.getPasswordPegawai() + "', '"
                + P.getNamaPegawai() + "', '"
                + P.getNoHP() + "', '"
                + P.getTanggalMasuk() + "')";
        
        System.out.println("Adding Pegawai");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " pegawai");
            statement.close();
        } catch (Exception e) {
            System.out.println("Error Adding pegawai...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public Pegawai searchForLogin(String username, String password){
        con = dbCon.makeConnection();

        Pegawai P = null;
        List<Pegawai> list = new ArrayList();
        
        String sql = "SELECT * FROM pegawai "
                + "WHERE usernamePegawai LIKE '" + username + "' AND passwordPegawai LIKE '" + password + "'";
        
        System.out.println("Searching pegawai");
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while(rs.next()){
                    P = new Pegawai(
                            rs.getInt("idPegawai"),
                            rs.getString("usernamePegawai"),
                            rs.getString("passwordPegawai"),
                            rs.getString("namaPegawai"),
                            rs.getString("noHP"),
                            rs.getString("tanggalMasuk")
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
    
    public List<Pegawai> showPegawaiForAdmin(String query){
        con = dbCon.makeConnection();

        Pegawai P = null;
        List<Pegawai> list = new ArrayList();
        
        String sql = "SELECT * FROM pegawai WHERE ("
                + "idPegawai LIKE '%" + query + "%'"
                + "OR usernamePegawai LIKE '%" + query + "%'"
                + "OR passwordPegawai LIKE '%" + query + "%'"
                + "OR namaPegawai LIKE '%" + query + "%'"
                + "OR noHP LIKE '%" + query + "%'"
                + "OR tanggalMasuk LIKE '%" + query + "%')";
        
        System.out.println("Mengambil data Pegawai ...");
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    P = new Pegawai(
                            rs.getInt("idPegawai"),
                            rs.getString("usernamepegawai"),
                            rs.getString("passwordPegawai"),
                            rs.getString("namaPegawai"),
                            rs.getString("noHP"),
                            rs.getString("tanggalMasuk")                           
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
        dbCon.closeConnection();
        
        return list;
    }
    
    public Pegawai searchOnlyId(String query){
        con = dbCon.makeConnection();

        Pegawai P = null;
        List<Pegawai> list = new ArrayList();
        
        String sql = "SELECT * FROM pegawai WHERE (idPegawai LIKE '" + query + "')";
        
        System.out.println("Mengambil data Pegawai ...");

        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    P = new Pegawai(
                            rs.getInt("idPegawai"),
                            rs.getString("usernamePegawai"),
                            rs.getString("passwordPegawai"),
                            rs.getString("namaPegawai"),
                            rs.getString("noHP"),
                            rs.getString("tanggalMasuk")
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
        dbCon.closeConnection();
        
        return P;
    }
    
    public void updatePegawai(Pegawai P, int id){
        con = dbCon.makeConnection();
        
        String sql = "UPDATE pegawai SET usernamePegawai = '" + P.getUsernamePegawai() + "', "
                + "passwordPegawai = '" + P.getPasswordPegawai() +  "', "
                + "namaPegawai = '" + P.getNamaPegawai() + "', "
                + "noHP = '" + P.getNoHP() + "', "
                + "tanggalMasuk = '" + P.getTanggalMasuk() + "' "
                + "WHERE idPegawai = " + id;

        System.out.println("MASUK SINI PAK BUAMBANG : ID " + id);

        System.out.println("Editing Pegawai ...");
                
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " Pegawai " + id);
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public void deleteDataPegawaiById(int id){
         con = dbCon.makeConnection();
         
         String sql = "DELETE FROM pegawai WHERE idPegawai = " + id;

         System.out.println("Deleting Pegawai...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Pegawai " + id);
            statement.close();
        }catch(Exception e){
            System.out.println("Error deleting pegawai...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
}
