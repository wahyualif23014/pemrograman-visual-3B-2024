package aplikasikantor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

public class KantorDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/db_manajemen";
    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("terkoneksi");
        } catch (SQLException e) {
            System.out.println("error bang : " + e.getMessage());
        }
        return conn;
    }
    
    public static void main(String[] args) {
        getConnection();
    }

    public void insertKaryawan(Karyawan karyawan) throws SQLException {
        String query = "INSERT INTO tb_karyawan (nama, jabatan, departemen) VALUES (?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, karyawan.getNama());
            stmt.setString(2, karyawan.getJabatan());
            stmt.setString(3, karyawan.getDepartemen());
            stmt.executeUpdate();
        }
    }

    public List<Karyawan> getAllKaryawan() throws SQLException {
        List<Karyawan> karyawanList = new ArrayList<>();
        String query = "SELECT * FROM tb_karyawan ORDER BY id";
        
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                Karyawan karyawan = new Karyawan(
                    rs.getInt("id"), 
                    rs.getString("nama"), 
                    rs.getString("jabatan"), 
                    rs.getString("departemen")
                );
                karyawanList.add(karyawan);
            }
        } catch (SQLException e) {
            throw new SQLException("Error retrieving employee data: " + e.getMessage(), e);
        }
        
        return karyawanList;
    }
    
    public void deleteKaryawan(int id) throws SQLException {
        String query = "DELETE FROM tb_karyawan WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
    
    public void updateKaryawan(Karyawan karyawan) throws SQLException {
        String query = "UPDATE tb_karyawan SET nama = ?, jabatan = ?, departemen = ? WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, karyawan.getNama());
            stmt.setString(2, karyawan.getJabatan());
            stmt.setString(3, karyawan.getDepartemen());
            stmt.setInt(4, karyawan.getId());
            stmt.executeUpdate();
        }
    }

    public void insertProyek(Proyek proyek) throws SQLException {
        String query = "INSERT INTO tb_proyek (nama_proyek, durasi_pengerjaan) VALUES (?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, proyek.getNama_proyek());
            stmt.setInt(2, proyek.getDurasi_pengerjaan());
            stmt.executeUpdate();
        }
    }

    public void EditProyek(Proyek proyek) throws SQLException {
        String query = "UPDATE tb_proyek SET nama_proyek = ?, durasi_pengerjaan = ? WHERE id2 = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, proyek.getNama_proyek());
            stmt.setInt(2, proyek.getDurasi_pengerjaan());
            stmt.setInt(3, proyek.getId2());
            stmt.executeUpdate();
        }
    }

    public void HapusProyek(int id) throws SQLException {
        String query = "DELETE FROM tb_proyek WHERE id2 = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    public List<Proyek> getProyek() throws SQLException {
        List<Proyek> proyekList = new ArrayList<>();
        String query = "SELECT * FROM tb_proyek";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Proyek proyek = new Proyek(
                    rs.getInt("id2"),
                    rs.getString("nama_proyek"),
                    rs.getInt("durasi_pengerjaan")
                );
                proyekList.add(proyek);
            }
        }
        return proyekList;
    }

    public static boolean updateTransaksi(int idTransaksi, int karyawanId, int proyekId, String peran) throws SQLException {
        String sql = "UPDATE tb_transaksi2 SET id_karyawan = ?, id_proyek = ?, peran = ? WHERE id_transaksi = ?";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, karyawanId);
            pstmt.setInt(2, proyekId);
            pstmt.setString(3, peran);
            pstmt.setInt(4, idTransaksi); 
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0; 
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
