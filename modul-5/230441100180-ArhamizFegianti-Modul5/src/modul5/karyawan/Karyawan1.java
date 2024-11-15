/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5.karyawan;

import modul5.karyawan.Karyawan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Amira Alissiya
 */
public class Karyawan1 {
    private final String URL = "jdbc:mysql://localhost:3306/db_m5";
    private final String USER = "root";
    private final String PASS = "";
    
    private Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL,USER,PASS);
    }
    
    public List<Karyawan> getAllKaryawan() throws SQLException{
        List<Karyawan> list_karyawan = new ArrayList();
        String sql = "SELECT * FROM karyawan";
        
        try (
                Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
        ){
            while (rs.next()) {
                Karyawan karyawan = new Karyawan(
                        rs.getInt("id_karyawan"),
                        rs.getString("nama"),
                        rs.getString("jabatan"),
                        rs.getString("departemen")
                );
                
                list_karyawan.add(karyawan);
            }
        }
        return list_karyawan;
    }
    
    public void insertKaryawan(Karyawan p_kry) throws SQLException{
        String sql = "INSERT INTO karyawan (nama, jabatan, departemen) values (?,?,?)";
        
        try (
                Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
            ){
            stmt.setString(1, p_kry.getNamaK());
            stmt.setString(2, p_kry.getJab());
            stmt.setString(3, p_kry.getDep());
            
            stmt.executeUpdate();
        }
    }
    
    public List<String> getidKaryawan() throws SQLException{
//        List<Karyawan> list_karyawan = new ArrayList();
        List<String> idK = new ArrayList<>();

        String sql = "SELECT id_karyawan, nama FROM karyawan";
        
        try (
                Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet resultSet = stmt.executeQuery(sql);
        ){
            while (resultSet.next()) {
                idK.add(resultSet.getString("id_karyawan"));
            }
        }
        return idK;
    }
    
}
