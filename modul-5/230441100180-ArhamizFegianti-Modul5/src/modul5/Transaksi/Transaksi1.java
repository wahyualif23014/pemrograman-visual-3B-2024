/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transaksi;

import Transaksi.Transaksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modul5.proyek.Proyek;

/**
 *
 * @author Amira Alissiya
 */
public class Transaksi1 {
    private final String URL = "jdbc:mysql://localhost:3306/db_m5";
    private final String USER = "root";
    private final String PASS = "";
    
    private Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL,USER,PASS);
    }
    
    public List<Transaksi> getAllTransaksi() throws SQLException{
        List<Transaksi> list_transaksi = new ArrayList();
        String sql = "SELECT * FROM transaksi";
        
        try (
                Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
        ){
            while (rs.next()) {
                Transaksi transaksi = new Transaksi(
                        rs.getInt("id_karyawan"),
                        rs.getInt("id_proyek"),
                        rs.getString("peran")
//                        rs.getInt("durasi")
                );
                
                list_transaksi.add(transaksi);
            }
        }
        return list_transaksi;
    }
    
    public void insertTransaksi(Transaksi p_trs) throws SQLException{
        String sql = "INSERT INTO transaksi (id_karyawan, id_proyek, peran) values (?,?,?)";
        
        try (
                Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
            ){
            stmt.setInt(1, p_trs.getId_karyawan());
            stmt.setInt(2, p_trs.getId_proyek());
            stmt.setString(3, p_trs.getPeran());
//            stmt.setInt(4, p_trs.getDurasi());
            
            stmt.executeUpdate();
        }
    }
    
    
}
