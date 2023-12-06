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
import model.*;

public class DAOKremasi {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertkremasi(Kremasi k){
        con = dbCon.makeConnection();
                
        String sql = "INSERT INTO kremasi (idMayat,idKonsumen,idPembayaran, idPegawai, idLayanan, waktuKremasi) " + "VALUES ('" +
                 k.getIdMayat() + "','"+ k.getIdKonsumen() + "','" + k.getIdPembayaran()+
               "','" + k.getIdPegawai()+ "','" + k.getIdLayanan() + "','" + k.getWaktuKremasi() + "')";
               
        System.out.println("Adding Data Kremasi...");
        
        try {
            Statement statement = con.createStatement(); 
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result +" Data Kremasi" );
            statement.close();
        } catch (SQLException e) {
            System.out.println("Error adding Peminjaman Ruangan...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    
    
    public void updateDataKremasi(Kremasi k){
        con = dbCon.makeConnection();
                
        String sql = "UPDATE kremasi SET idMayat = " + k.getIdMayat()
                + ", idKonsumen = " + k.getIdKonsumen()
                + ", idPembayaran = " + k.getIdPembayaran()
                + ", idPegawai = " + k.getIdPegawai()
                + ", idLayanan = " + k.getIdLayanan()
                + ", waktuKremasi = '" + k.getWaktuKremasi() + "' "
                + "WHERE idKremasi = " + k.getIdKremasi();
        
        //String sql = "UPDATE datamayat SET namaMayat = '" + DM.getNamaMayat() + "' WHERE id = " + DM.getIdMayat();
        //(idMayat, idKonsumen, idPembayaran, idPegawai, idLayanan, waktuKremasi)
        
        System.out.println("Adding Data Kremasi...");
        
        try {
            Statement statement = con.createStatement(); 
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " Data Kremasi" );
            statement.close();
        } catch (SQLException e) {
            System.out.println("Error adding Peminjaman Ruangan...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
     
    public List<Kremasi> showKremasi(String query) {
        con = dbCon.makeConnection();
        
        String sql = "SELECT kr.*, l.*, ko.*, p.*, d.*, pe.* FROM kremasi kr JOIN layanan as l on kr.idLayanan = l.idLayanan "
        + "JOIN konsumen as ko on kr.idKonsumen = ko.idKonsumen " 
        + "JOIN pegawai as p on kr.idPegawai = p.idPegawai "
        + "JOIN datamayat as d on kr.idMayat = d.idMayat "  
        + "JOIN pembayaran as pe on kr.idPembayaran = pe.idPembayaran "  
                
        + "WHERE ("
//        + "d.idMayat LIKE " + "'%" + query + "%'" 
//        + "OR kr.idKremasi LIKE " + "'%" + query + "%'"
        + " ko.idKonsumen LIKE " + "'%" + query + "%'"    
//        + "OR l.idLayanan LIKE " + "'%" + query + "%'"
//        + "OR p.idPegawai LIKE " + "'%" + query + "%'"
        + ")" ;
        
        System.out.println("Mengambil data Kremasi...");
        
        List<Kremasi> list = new ArrayList();
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
                if (rs != null) {
                    while (rs.next()) {
                        Konsumen ko = new Konsumen(
                                rs.getInt("ko.idKonsumen"),
                                rs.getString("ko.usernameKonsumen"),
                                rs.getString("ko.passwordKonsumen"),
                                
                                rs.getString("ko.namaKonsumen") ,
                                rs.getString("ko.nomorKonsumen"),
                                rs.getInt("ko.jumlahMayat")      
                        );
                        DataMayat d = new  DataMayat(
                                rs.getInt("d.idMayat"),
                                rs.getString("d.namaMayat"),
                                rs.getString("d.tanggalMasuk"),
                                rs.getString("d.nomorTelepon"),
                                rs.getString("d.status")
                        );       
                        Pegawai pe = new Pegawai(
                                rs.getInt("p.idPegawai"),
                                rs.getString("p.usernamePegawai"),
                                rs.getString("p.passwordPegawai"),
                                rs.getString("p.namaPegawai"),
                                rs.getString("p.noHp"),
                                rs.getString("p.tanggalMasuk")      
                        );
                        Layanan l = new Layanan(
                                rs.getInt("l.idLayanan"),
                                rs.getString("l.namaLayanan"),
                                rs.getDouble("l.hargaLayanan")
                        ); 
                        Pembayaran pb = new Pembayaran(
                                rs.getInt("pe.idPembayaran"),
                                rs.getString("pe.tanggalPembayaran")
                        );                        
                        Kremasi k = new Kremasi(
                                rs.getInt("kr.idKremasi"),
                                rs.getInt("d.idMayat"),
                                rs.getInt("ko.idKonsumen"),
                                rs.getInt("pe.idPembayaran"),
                                rs.getInt("p.idPegawai"),
                                rs.getInt("l.idLayanan"),
                                rs.getString("kr.waktuKremasi"),
                                ko,
                                pb,
                                l,
                                pe,
                                d
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
        dbCon.closeConnection();
        return list;
    }

     public List<Kremasi> showKremasiInEmployee(String query) {
        con = dbCon.makeConnection();
        
        String sql = "SELECT kr.*, l.*, ko.*, p.*, d.*, pe.* FROM kremasi kr JOIN layanan as l on kr.idLayanan = l.idLayanan "
        + "JOIN konsumen as ko on kr.idKonsumen = ko.idKonsumen " 
        + "JOIN pegawai as p on kr.idPegawai = p.idPegawai "
        + "JOIN datamayat as d on kr.idMayat = d.idMayat "  
        + "JOIN pembayaran as pe on kr.idPembayaran = pe.idPembayaran "  
                
        + "WHERE ("
        + "d.namaMayat LIKE " + "'%" + query + "%'" 
        + "OR l.namaLayanan LIKE " + "'%" + query + "%'"
        + " OR d.status LIKE " + "'%" + query + "%'"    
        + "OR d.nomorTelepon LIKE " + "'%" + query + "%'"
        + "OR l.hargaLayanan LIKE " + "'%" + query + "%'"
        + ")" ;
        
        System.out.println("Mengambil data Kremasi...");
        
        List<Kremasi> list = new ArrayList();
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
                if (rs != null) {
                    while (rs.next()) {
                        Konsumen ko = new Konsumen(
                                rs.getInt("ko.idKonsumen"),
                                rs.getString("ko.usernameKonsumen"),
                                rs.getString("ko.passwordKonsumen"),
                                
                                rs.getString("ko.namaKonsumen") ,
                                rs.getString("ko.nomorKonsumen"),
                                rs.getInt("ko.jumlahMayat")      
                        );
                        DataMayat d = new  DataMayat(
                                rs.getInt("d.idMayat"),
                                rs.getString("d.namaMayat"),
                                rs.getString("d.tanggalMasuk"),
                                rs.getString("d.nomorTelepon"),
                                rs.getString("d.status")
                        );       
                        Pegawai pe = new Pegawai(
                                rs.getInt("p.idPegawai"),
                                rs.getString("p.usernamePegawai"),
                                rs.getString("p.passwordPegawai"),
                                rs.getString("p.namaPegawai"),
                                rs.getString("p.noHp"),
                                rs.getString("p.tanggalMasuk")      
                        );
                        Layanan l = new Layanan(
                                rs.getInt("l.idLayanan"),
                                rs.getString("l.namaLayanan"),
                                rs.getDouble("l.hargaLayanan")
                        ); 
                        Pembayaran pb = new Pembayaran(
                                rs.getInt("pe.idPembayaran"),
                                rs.getString("pe.tanggalPembayaran")
                        );                        
                        Kremasi k = new Kremasi(
                                rs.getInt("kr.idKremasi"),
                                rs.getInt("d.idMayat"),
                                rs.getInt("ko.idKonsumen"),
                                rs.getInt("pe.idPembayaran"),
                                rs.getInt("p.idPegawai"),
                                rs.getInt("l.idLayanan"),
                                rs.getString("kr.waktuKremasi"),
                                ko,
                                pb,
                                l,
                                pe,
                                d
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
        dbCon.closeConnection();
        return list;
    }
     
     public Kremasi searchKremasiById(String query) {
        con = dbCon.makeConnection();
        Kremasi K = null;
        
        String sql = "SELECT kr.*, l.*, ko.*, p.*, d.*, pe.* FROM kremasi kr JOIN layanan as l on kr.idLayanan = l.idLayanan "
        + "JOIN konsumen as ko on kr.idKonsumen = ko.idKonsumen " 
        + "JOIN pegawai as p on kr.idPegawai = p.idPegawai "
        + "JOIN datamayat as d on kr.idMayat = d.idMayat "  
        + "JOIN pembayaran as pe on kr.idPembayaran = pe.idPembayaran "  
                
        + "WHERE ("
//        + "d.idMayat LIKE " + "'%" + query + "%'" 
        + " kr.idKremasi LIKE " + "'%" + query + "%'"
//        + " ko.idKonsumen LIKE " + "'%" + query + "%'"    
//        + "OR l.idLayanan LIKE " + "'%" + query + "%'"
//        + "OR p.idPegawai LIKE " + "'%" + query + "%'"
        + ")" ;
        
        System.out.println("Mengambil data Kremasi...");
        
        List<Kremasi> list = new ArrayList();
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
                if (rs != null) {
                    while (rs.next()) {
                        Konsumen ko = new Konsumen(
                                rs.getInt("ko.idKonsumen"),
                                rs.getString("ko.usernameKonsumen"),
                                rs.getString("ko.passwordKonsumen"),
                                
                                rs.getString("ko.namaKonsumen") ,
                                rs.getString("ko.nomorKonsumen"),
                                rs.getInt("ko.jumlahMayat")      
                        );
                        DataMayat d = new  DataMayat(
                                rs.getInt("d.idMayat"),
                                rs.getString("d.namaMayat"),
                                rs.getString("d.tanggalMasuk"),
                                rs.getString("d.nomorTelepon"),
                                rs.getString("d.status")
                        );       
                        Pegawai pe = new Pegawai(
                                rs.getInt("p.idPegawai"),
                                rs.getString("p.usernamePegawai"),
                                rs.getString("p.passwordPegawai"),
                                rs.getString("p.namaPegawai"),
                                rs.getString("p.noHp"),
                                rs.getString("p.tanggalMasuk")      
                        );
                        Layanan l = new Layanan(
                                rs.getInt("l.idLayanan"),
                                rs.getString("l.namaLayanan"),
                                rs.getDouble("l.hargaLayanan")
                        ); 
                        Pembayaran pb = new Pembayaran(
                                rs.getInt("pe.idPembayaran"),
                                rs.getString("pe.tanggalPembayaran")
                        );                        
                        Kremasi k = new Kremasi(
                                rs.getInt("kr.idKremasi"),
                                rs.getInt("d.idMayat"),
                                rs.getInt("ko.idKonsumen"),
                                rs.getInt("pe.idPembayaran"),
                                rs.getInt("p.idPegawai"),
                                rs.getInt("l.idLayanan"),
                                rs.getString("kr.waktuKremasi"),
                                ko,
                                pb,
                                l,
                                pe,
                                d
                        );
                        K = k;
                        list.add(k);
                    }   
                }
                rs.close();
                statement.close();
        } catch (Exception e) {
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        dbCon.closeConnection();
        return K;
    }
     
  public void updatekremasi(Kremasi k)  {
        con = dbCon.makeConnection();
        
        String sql = "UPDATE SET status = '" + k.getDataMayat().getStatus()                    
                    + "' WHERE id = " + k.getIdKremasi();
     
        System.out.println("Editing Kremasi...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " Kremasi " + k.getIdKremasi());
            statement.close();       
        } catch (SQLException e) {
            System.out.println("Error Update Kremasi ...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }          
     
    public void deleteKremasi(int id) {
        con = dbCon.makeConnection();
        
        String sql = "DELETE FROM kremasi WHERE idKremasi = '" + id + "'";
        System.out.println("Hapus Data Kremasi  ...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Hapus " + result + " Data Kremasi " + id);           
        } catch (Exception e) {
            System.out.println("Error Hapus Kremasi...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }      
    
    public void updatekremasipegawai(int idKremasi, int idPegawai)  {
        con = dbCon.makeConnection();
        
        String sql = "UPDATE kremasi SET idPegawai = '" + idPegawai + "' WHERE idKremasi = '" + idKremasi + "'";
     
        System.out.println("Editing Kremasi...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " Kremasi " + idKremasi);
            statement.close();       
        } catch (SQLException e) {
            System.out.println("Error Update Kremasi ...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
}