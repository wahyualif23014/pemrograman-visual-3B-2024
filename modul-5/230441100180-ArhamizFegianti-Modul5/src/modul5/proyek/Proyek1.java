/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5.proyek;

import modul5.proyek.Proyek;
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
public class Proyek1 {
    private final String URL = "jdbc:mysql://localhost:3306/db_m5";
    private final String USER = "root";
    private final String PASS = "";
    
    private Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL,USER,PASS);
    }
    
    public List<Proyek> getAllProyek() throws SQLException{
        List<Proyek> list_proyek = new ArrayList();
        String sql = "SELECT * FROM proyek";
        
        try (
                Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
        ){
            while (rs.next()) {
                Proyek proyek = new Proyek(
                        rs.getInt("id_proyek"),
                        rs.getString("nama_proyek"),
                        rs.getString("durasi_pengerjaan")
                );
                
                list_proyek.add(proyek);
            }
        }
        return list_proyek;
    }
    
    public void insertProyek(Proyek p_pry) throws SQLException{
        String sql = "INSERT INTO proyek (nama_proyek, durasi_pengerjaan) values (?,?)";
        
        try (
                Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
            ){
            stmt.setString(1, p_pry.getNama_proyek());
            stmt.setString(2, p_pry.getDurasi_pengerjaan());
            
            stmt.executeUpdate();
        }
    }
    
    public List<String> getidProyek() throws SQLException{
//        List<Karyawan> list_karyawan = new ArrayList();
        List<String> idP = new ArrayList<>();

        String sql = "SELECT id_proyek, nama_proyek FROM proyek";
        
        try (
                Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet resultSet = stmt.executeQuery(sql);
        ){
            while (resultSet.next()) {
                idP.add(resultSet.getString("id_proyek"));
            }
        }
        return idP;
    }
    

}
