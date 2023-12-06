/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Layanan;
import connection.DbConnection;

/**
 *
 * @author Feedm
 */
public class DAOLayanan {
    
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public Layanan searchidLayanan(String namaLayanan){
        con = dbCon.makeConnection();
        Layanan L = null;
        
        List<Layanan> list = new ArrayList();
        
        String sql = "SELECT * FROM layanan "
                + "WHERE namaLayanan LIKE '" + namaLayanan + "'";
        
        System.out.println("Searching id layanan");

        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
        
            if(rs!= null){
                while(rs.next()){
                    L = new Layanan(
                            rs.getInt("idLayanan"),
                            rs.getString("namaLayanan"),
                            rs.getDouble("hargaLayanan")
                    );
                    list.add(L);
                }
        }
        rs.close();
        statement.close();;
        } catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }        
        return L;
    }
    
    public List<Layanan> showLayanan(){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM layanan";
        System.out.println("Mengambil data Layanan...");
        
        List<Layanan> list = new ArrayList();
    
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
        
            if(rs!= null){
                while(rs.next()){
                    Layanan d = new Layanan(
                            Integer.parseInt(rs.getString("idLayanan")),
                            rs.getString("namaLayanan"),
                            Double.parseDouble(rs.getString("hargaLayanan"))
                    );
                    list.add(d);
                }
        }
        rs.close();
        statement.close();;
        } catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        dbCon.closeConnection();
        
        return list;
    }
}
