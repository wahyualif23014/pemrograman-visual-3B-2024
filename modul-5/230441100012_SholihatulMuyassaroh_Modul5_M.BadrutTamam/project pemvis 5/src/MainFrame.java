/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/**
 *
 * @author User
 */
public class MainFrame extends javax.swing.JFrame {
    // global variabel
    Connection conn;
    private DefaultTableModel modelKaryawan, modelProyek, modelTransaksi;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() throws SQLException {
        initComponents();
        
        conn = DatabaseConnection.getConnection();

        // Model untuk tabel Karyawan
        modelKaryawan = new DefaultTableModel();
        tbkaryawan.setModel(modelKaryawan);
        modelKaryawan.addColumn("ID Karyawan");
        modelKaryawan.addColumn("Nama");
        modelKaryawan.addColumn("Jabatan");
        modelKaryawan.addColumn("Departemen");
        loadDataKaryawan();

        // Model untuk tabel Proyek
        modelProyek = new DefaultTableModel();
        tbproyek.setModel(modelProyek);
        modelProyek.addColumn("ID Proyek");
        modelProyek.addColumn("Nama Proyek");
        modelProyek.addColumn("Durasi Pengerjaan");
        loadDataProyek();

        // Model untuk tabel Transaksi
        modelTransaksi = new DefaultTableModel();
        tbtransaksi.setModel(modelTransaksi);
        modelTransaksi.addColumn("Karyawan");
        modelTransaksi.addColumn("Proyek");
        modelTransaksi.addColumn("Peran");
        
        tbkaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tbkaryawan.getSelectedRow();
                    if (row != -1) {
                        tfidkyw.setText(String.valueOf(modelKaryawan.getValueAt(row, 0)));
                        tfnamakyw.setText((String) modelKaryawan.getValueAt(row, 1));
                        tfjabatan.setText((String) modelKaryawan.getValueAt(row, 2));
                        tfdepartemen.setText((String) modelKaryawan.getValueAt(row, 3));
                    }
                }
        });
    
        tbproyek.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    int row = tbproyek.getSelectedRow();
                    if (row != -1) {
                        tfidpry.setText(String.valueOf(modelProyek.getValueAt(row, 0)));
                        tfnamapry.setText((String) modelProyek.getValueAt(row, 1));
                        tfdurasi.setText((String) modelProyek.getValueAt(row, 2));
                    }
                }
        });
        
        tbtransaksi.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tbtransaksi.getSelectedRow();
                if (row != -1) {
                    cbkyw.setSelectedItem(modelTransaksi.getValueAt(row, 0));
                    cbpry.setSelectedItem(modelTransaksi.getValueAt(row, 1));
                    tfperan1.setText((String) modelTransaksi.getValueAt(row, 2));
                }
            }
        });
        
        loadComboBoxKaryawan();
        loadComboBoxProyek();
        
        cbpry.addActionListener(e -> {
            String selectedProyek = (String) cbpry.getSelectedItem();
            if (selectedProyek != null) {
                try {
                    String sql = "SELECT durasi_pengerjaan FROM tb_proyek WHERE nama_proyek = ?";
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.setString(1, selectedProyek);
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                        tfdurasit.setText(rs.getString("durasi_pengerjaan") + " minggu");
                    } else {
                        tfdurasit.setText(""); // Kosongkan jika tidak ditemukan
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        
        loadDataTransaksi();
        startComboBoxUpdater();
        
        tfdurasi.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent e) {
                String durasiInput = tfdurasi.getText();
                if (!isNumeric(durasiInput)) {
                    JOptionPane.showMessageDialog(null, "Durasi harus berupa angka.", "Kesalahan Input", JOptionPane.ERROR_MESSAGE);
                    tfdurasit.requestFocus(); // Kembali fokus ke field durasi
                }
            }
        });
    }
    
    private void startComboBoxUpdater() {
        Timer timer = new Timer(5000, new ActionListener() { // Setiap 5 detik
        @Override
        public void actionPerformed(ActionEvent e) {
            // Simpan nilai 
            Object selectedKaryawan = cbkyw.getSelectedItem(); 
            Object selectedProyek = cbpry.getSelectedItem(); 
            
            
            loadComboBoxKaryawan();
            loadComboBoxProyek();
            
            // Mengatur kembali nilai 
            if (selectedKaryawan != null) {
                cbkyw.setSelectedItem(selectedKaryawan);
            }
            if (selectedProyek != null) {
                cbpry.setSelectedItem(selectedProyek);
            }
        }
    });
    timer.start(); 
    }
    
     // Load Data Karyawan
    private void loadDataKaryawan() {
        modelKaryawan.setRowCount(0);
        try {
            String sql = "SELECT * FROM tb_karyawan";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                modelKaryawan.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("nama"),
                    rs.getString("jabatan"),
                    rs.getString("departemen")
                });
            }
        } catch (SQLException e) {
            System.out.println("Error Load Data Karyawan: " + e.getMessage());
        }
    }
    
    // Simpan Data Karyawan
    private void saveDataKaryawan() {
        if (tfnamakyw.getText().isEmpty() || tfjabatan.getText().isEmpty() || tfdepartemen.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Isi data Karyawan terlebih dahulu", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String sql = "INSERT INTO tb_karyawan (nama, jabatan, departemen) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tfnamakyw.getText());
            ps.setString(2, tfjabatan.getText());
            ps.setString(3, tfdepartemen.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Karyawan berhasil disimpan");
            loadDataKaryawan();
        } catch (SQLException e) {
            System.out.println("Error Save Data Karyawan: " + e.getMessage());
        }
    }

    // Update Data Karyawan
    private void updateDataKaryawan() {
        if (tfidkyw.getText().isEmpty() || tfnamakyw.getText().isEmpty() || tfjabatan.getText().isEmpty() || tfdepartemen.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Pilih data Karyawan yang akan diupdate", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String sql = "SELECT COUNT(*) FROM tb_karyawan WHERE id = ?";
            PreparedStatement psCheck = conn.prepareStatement(sql);
            psCheck.setInt(1, Integer.parseInt(tfidkyw.getText()));
            ResultSet rsCheck = psCheck.executeQuery();

            if (rsCheck.next() && rsCheck.getInt(1) == 0) {
                JOptionPane.showMessageDialog(this, "Data ini tidak ada di tabel", "Error", JOptionPane.ERROR_MESSAGE);
                tfidkyw.setText("");
                tfnamakyw.setText("");
                tfjabatan.setText("");
                tfdepartemen.setText("");
                return;
            }

            String updateSql = "UPDATE tb_karyawan SET nama = ?, jabatan = ?, departemen = ? WHERE id = ?";
            PreparedStatement psUpdate = conn.prepareStatement(updateSql);
            psUpdate.setString(1, tfnamakyw.getText());
            psUpdate.setString(2, tfjabatan.getText());
            psUpdate.setString(3, tfdepartemen.getText());
            psUpdate.setInt(4, Integer.parseInt(tfidkyw.getText()));
            psUpdate.executeUpdate();

            JOptionPane.showMessageDialog(this, "Data Karyawan berhasil diupdate");
            loadDataKaryawan();
            loadDataTransaksi(); 
        } catch (SQLException e) {
            System.out.println("Error Update Data Karyawan: " + e.getMessage());
        }
    }

    // Delete Data Karyawan
    private void deleteDataKaryawan() {
        if (tfidkyw.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Pilih data Karyawan yang akan dihapus", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

        int confirm = JOptionPane.showConfirmDialog(this, "Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                String sql = "DELETE FROM tb_karyawan WHERE id = ?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1, Integer.parseInt(tfidkyw.getText()));
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data Karyawan berhasil dihapus");
                loadDataKaryawan();
                loadDataTransaksi(); 
            } catch (SQLException e) {
                System.out.println("Error Delete Data Karyawan: " + e.getMessage());
            }
        }
    }

    // Load Data Proyek
    private void loadDataProyek() {
            modelProyek.setRowCount(0);
            try {
                String sql = "SELECT * FROM tb_proyek";
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    modelProyek.addRow(new Object[]{
                        rs.getInt("id"),
                        rs.getString("nama_proyek"),
                        rs.getString("durasi_pengerjaan")
                    });
                }
            } catch (SQLException e) {
                System.out.println("Error Load Data Proyek: " + e.getMessage());
            }
        }

    // Simpan Data Proyek
    private void saveDataProyek() {
        if (tfnamapry.getText().isEmpty() || tfdurasi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Isi data Proyek terlebih dahulu", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String sql = "INSERT INTO tb_proyek (nama_proyek, durasi_pengerjaan) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tfnamapry.getText());
            ps.setString(2, tfdurasi.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Proyek berhasil disimpan");
            loadDataProyek();
        } catch (SQLException e) {
            System.out.println("Error Save Data Proyek: " + e.getMessage());
        }
    }

    // Update Data Proyek
    private void updateDataProyek() {
        if (tfidpry.getText().isEmpty() || tfnamapry.getText().isEmpty() || tfdurasi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Pilih data Proyek yang akan diupdate", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String sql = "SELECT COUNT(*) FROM tb_proyek WHERE id = ?";
            PreparedStatement psCheck = conn.prepareStatement(sql);
            psCheck.setInt(1, Integer.parseInt(tfidpry.getText()));
            ResultSet rsCheck = psCheck.executeQuery();

            if (rsCheck.next() && rsCheck.getInt(1) == 0) {
                JOptionPane.showMessageDialog(this, "Data ini tidak ada di tabel", "Error", JOptionPane.ERROR_MESSAGE);
                tfidpry.setText("");
                tfnamapry.setText("");
                tfdurasi.setText("");
                return;
            }

            String updateSql = "UPDATE tb_proyek SET nama_proyek = ?, durasi_pengerjaan = ? WHERE id = ?";
            PreparedStatement psUpdate = conn.prepareStatement(updateSql);
            psUpdate.setString(1, tfnamapry.getText());
            psUpdate.setString(2, tfdurasi.getText());
            psUpdate.setInt(3, Integer.parseInt(tfidpry.getText()));
            psUpdate.executeUpdate();

            JOptionPane.showMessageDialog(this, "Data Proyek berhasil diupdate");
            loadDataProyek();
            loadDataTransaksi(); 
        } catch (SQLException e) {
            System.out.println("Error Update Data Proyek: " + e.getMessage());
        }
    }

    // Delete Data Proyek
    private void deleteDataProyek() {
        if (tfidpry.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Pilih data Proyek yang akan dihapus", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

        int confirm = JOptionPane.showConfirmDialog(this, "Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                String sql = "DELETE FROM tb_proyek WHERE id = ?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1, Integer.parseInt(tfidpry.getText()));
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data Proyek berhasil dihapus");
                loadDataProyek();
                loadDataTransaksi(); 
            } catch (SQLException e) {
                System.out.println("Error Delete Data Proyek: " + e.getMessage());
            }
        }
    }

//        load transaksi
    private void loadDataTransaksi() {
        try {
            String sql = "SELECT k.nama AS karyawan, p.nama_proyek AS proyek, t.peran " + // Ganti 'p.nama' dengan 'p.nama_proyek'
                         "FROM tb_transaksi t " +
                         "JOIN tb_karyawan k ON t.id_karyawan = k.id " +
                         "JOIN tb_proyek p ON t.id_proyek = p.id";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            // Menghapus data lama dari tabel
            DefaultTableModel model = (DefaultTableModel) tbtransaksi.getModel(); // Ganti 'yourTable' dengan nama JTable Anda
            model.setRowCount(0); // Menghapus semua baris

            while (rs.next()) {
                Object[] row = {
                    rs.getString("karyawan"), // Nama karyawan
                    rs.getString("proyek"), // Nama proyek
                    rs.getString("peran") // Peran
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            System.out.println("Error Load Data Transaksi: " + e.getMessage());
        }
    }

    // load cbkaryawan
    private void loadComboBoxKaryawan() {
       try {
           String sql = "SELECT nama FROM tb_karyawan";
           PreparedStatement ps = conn.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();

           cbkyw.removeAllItems(); 
           cbkyw.addItem("Pilih Karyawan"); 
           while (rs.next()) {
               cbkyw.addItem(rs.getString("nama"));
           }
       } catch (SQLException e) {
           System.out.println("Error Load ComboBox Karyawan: " + e.getMessage());
       }
   }

   private void loadComboBoxProyek() {
       try {
           String sql = "SELECT nama_proyek FROM tb_proyek";
           PreparedStatement ps = conn.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();

           cbpry.removeAllItems(); 
           cbpry.addItem("Pilih Proyek"); 
           while (rs.next()) {
               cbpry.addItem(rs.getString("nama_proyek"));
           }
       } catch (SQLException e) {
           System.out.println("Error Load ComboBox Proyek: " + e.getMessage());
       }
   }

    private int getKaryawanIdByName(String karyawanName) {
        int karyawanId = -1; // jika tidak ada
        try {
            String sql = "SELECT id FROM tb_karyawan WHERE nama = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, karyawanName);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                karyawanId = rs.getInt("id");
            }
        } catch (SQLException e) {
            System.out.println("Error Get Karyawan ID: " + e.getMessage());
        }
        return karyawanId;
    }

    private int getProyekIdByName(String proyekName) {
        int proyekId = -1; //  jika tdk ada 
        try {
            String sql = "SELECT id FROM tb_proyek WHERE nama_proyek = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, proyekName);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                proyekId = rs.getInt("id");
            }
        } catch (SQLException e) {
            System.out.println("Error Get Proyek ID: " + e.getMessage());
        }
        return proyekId;
    }

    // Simpan Data Transaksi
    private void saveDataTransaksi() {
        if (cbkyw.getSelectedIndex() == 0 || cbpry.getSelectedIndex() == 0 || tfdurasit.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Isi data Transaksi terlebih dahulu", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String karyawanName = (String) cbkyw.getSelectedItem();
            String proyekName = (String) cbpry.getSelectedItem();

            int karyawanId = getKaryawanIdByName(karyawanName);
            int proyekId = getProyekIdByName(proyekName);

            String sql = "INSERT INTO tb_transaksi (id_karyawan, id_proyek, peran) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, karyawanId);
            ps.setInt(2, proyekId);
            ps.setString(3, tfperan1.getText());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Data Transaksi berhasil disimpan");
            loadDataTransaksi(); 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error Save Data Transaksi: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    // Update Data Transaksi
    private void updateDataTransaksi() {
        if (cbkyw.getSelectedIndex() == 0 || cbpry.getSelectedIndex() == 0 || tfdurasit.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Pilih data Transaksi yang akan diupdate", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int karyawanId = getKaryawanIdByName((String) cbkyw.getSelectedItem());
            int proyekId = getProyekIdByName((String) cbpry.getSelectedItem());

            String sql = "SELECT COUNT(*) FROM tb_transaksi WHERE id_karyawan = ? AND id_proyek = ?";
            PreparedStatement psCheck = conn.prepareStatement(sql);
            psCheck.setInt(1, karyawanId);
            psCheck.setInt(2, proyekId);

            ResultSet rsCheck = psCheck.executeQuery();
            if (rsCheck.next() && rsCheck.getInt(1) == 0) {
                JOptionPane.showMessageDialog(this, "Data ini tidak ada di tabel", "Error", JOptionPane.ERROR_MESSAGE);
                cbkyw.setSelectedIndex(0);
                cbpry.setSelectedIndex(0);
                tfperan1.setText("");
                tfdurasit.setText("");
                return;
            }

            String updateSql = "UPDATE tb_transaksi SET peran = ? WHERE id_karyawan = ? AND id_proyek = ?";
            PreparedStatement psUpdate = conn.prepareStatement(updateSql);
            psUpdate.setString(1, tfperan1.getText()); 
            psUpdate.setInt(2, karyawanId);
            psUpdate.setInt(3, proyekId);
            psUpdate.executeUpdate();

            JOptionPane.showMessageDialog(this, "Data Transaksi berhasil diupdate");
            loadDataTransaksi(); 
        } catch (SQLException e) {
            System.out.println("Error Update Data Transaksi: " + e.getMessage());
        }
    }


    // Delete Data Transaksi
    private void deleteDataTransaksi() {
        if (tfdurasit.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Pilih data Transaksi yang akan dihapus", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
        
        int confirm = JOptionPane.showConfirmDialog(this, "Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    String karyawanName = (String) cbkyw.getSelectedItem();
                    String proyekName = (String) cbpry.getSelectedItem();

                    int karyawanId = getKaryawanIdByName(karyawanName);
                    int proyekId = getProyekIdByName(proyekName);

                    String sql = "DELETE FROM tb_transaksi WHERE id_karyawan = ? AND id_proyek = ?";
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.setInt(1, karyawanId);
                    ps.setInt(2, proyekId);
                    ps.executeUpdate();

                    JOptionPane.showMessageDialog(this, "Data Transaksi berhasil dihapus");
                    loadDataTransaksi(); 
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error Delete Data Transaksi: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
        }
    }

//        reset karyawan
    private void resetKaryawan() {
        int confirm = JOptionPane.showConfirmDialog(this, "Anda yakin ingin mereset halaman ini?", "Konfirmasi Reset", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            tfidkyw.setText("");
            tfnamakyw.setText("");
            tfjabatan.setText("");
            tfdepartemen.setText("");
        }
    }

//        reset proyek
    private void resetProyek() {
        int confirm = JOptionPane.showConfirmDialog(this, "Anda yakin ingin mereset halaman ini?", "Konfirmasi Reset", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            tfidpry.setText("");
            tfnamapry.setText("");
            tfdurasi.setText("");
        }
    }

//        reset transaksi
    private void resetTransaksi() {
        int confirm = JOptionPane.showConfirmDialog(this, "Anda yakin ingin mereset halaman ini?", "Konfirmasi Reset", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            cbkyw.setSelectedIndex(0);
            cbpry.setSelectedIndex(0);
            tfperan1.setText("");
            tfdurasit.setText("");
        }
    }
    
    // Metode untuk memeriksa  angka
private boolean isNumeric(String str) {
    if (str == null || str.isEmpty()) {
        return false;
    }
    try {
        Integer.parseInt(str); 
    } catch (NumberFormatException e) {
        return false; 
    }
    return true;
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        KaryawanPanel = new javax.swing.JPanel();
        tengah = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        bttambahk = new javax.swing.JButton();
        bteditk = new javax.swing.JButton();
        bthapusk = new javax.swing.JButton();
        btreset1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btkeluar1 = new javax.swing.JButton();
        atas = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tfidkyw = new javax.swing.JTextField();
        tfnamakyw = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfjabatan = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfdepartemen = new javax.swing.JTextField();
        bawah = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbkaryawan = new javax.swing.JTable();
        ProyekPanel = new javax.swing.JPanel();
        tengah1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        bttambahp = new javax.swing.JButton();
        bteditp = new javax.swing.JButton();
        bthapusp = new javax.swing.JButton();
        btreset2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btkeluar2 = new javax.swing.JButton();
        bawah1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbproyek = new javax.swing.JTable();
        atas1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        tfidpry = new javax.swing.JTextField();
        tfnamapry = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tfdurasi = new javax.swing.JTextField();
        TransaksiPanel = new javax.swing.JPanel();
        tengah2 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        bttambaht = new javax.swing.JButton();
        bteditt = new javax.swing.JButton();
        bthapust = new javax.swing.JButton();
        btreset3 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btkeluar3 = new javax.swing.JButton();
        bawah2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbtransaksi = new javax.swing.JTable();
        atas2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        tfdurasit = new javax.swing.JTextField();
        cbpry = new javax.swing.JComboBox<>();
        cbkyw = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        tfperan1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(242, 157, 36));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("________________________________________________________________________________\n");

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 1, 19)); // NOI18N
        jLabel1.setText("Aplikasi Manajemen Karyawan dan Proyek");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/jdl.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/jdll.png"))); // NOI18N

        jTabbedPane1.setBackground(new java.awt.Color(239, 154, 35));

        KaryawanPanel.setBackground(new java.awt.Color(240, 219, 136));
        KaryawanPanel.setLayout(new java.awt.BorderLayout());

        tengah.setBackground(new java.awt.Color(242, 217, 137));
        tengah.setLayout(new javax.swing.BoxLayout(tengah, javax.swing.BoxLayout.LINE_AXIS));

        jLabel12.setText("           ");
        tengah.add(jLabel12);

        bttambahk.setText("Tambah");
        bttambahk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttambahkActionPerformed(evt);
            }
        });
        tengah.add(bttambahk);

        bteditk.setText("Update");
        bteditk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditkActionPerformed(evt);
            }
        });
        tengah.add(bteditk);

        bthapusk.setText("Hapus");
        bthapusk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthapuskActionPerformed(evt);
            }
        });
        tengah.add(bthapusk);

        btreset1.setText("Reset");
        btreset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btreset1ActionPerformed(evt);
            }
        });
        tengah.add(btreset1);

        jLabel13.setText("               ");
        tengah.add(jLabel13);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/karyawan.png"))); // NOI18N
        tengah.add(jLabel11);

        jLabel14.setText("          ");
        tengah.add(jLabel14);

        btkeluar1.setText("Keluar");
        btkeluar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkeluar1ActionPerformed(evt);
            }
        });
        tengah.add(btkeluar1);

        KaryawanPanel.add(tengah, java.awt.BorderLayout.CENTER);

        atas.setBackground(new java.awt.Color(242, 217, 137));
        atas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("ID Karyawan:");
        atas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 14, -1, -1));

        tfidkyw.setEditable(false);
        atas.add(tfidkyw, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 36, 212, -1));
        atas.add(tfnamakyw, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 212, -1));

        jLabel8.setText("Nama:");
        atas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel9.setText("Jabatan:");
        atas.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 14, -1, -1));
        atas.add(tfjabatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 36, 250, -1));

        jLabel10.setText("Departemen:");
        atas.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));
        atas.add(tfdepartemen, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 250, -1));

        KaryawanPanel.add(atas, java.awt.BorderLayout.PAGE_START);

        bawah.setBackground(new java.awt.Color(242, 217, 137));

        tbkaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Karyawan", "Nama ", "Jabatan", "Departemen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbkaryawan);

        javax.swing.GroupLayout bawahLayout = new javax.swing.GroupLayout(bawah);
        bawah.setLayout(bawahLayout);
        bawahLayout.setHorizontalGroup(
            bawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bawahLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bawahLayout.setVerticalGroup(
            bawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        );

        KaryawanPanel.add(bawah, java.awt.BorderLayout.PAGE_END);

        jTabbedPane1.addTab("Karyawan", KaryawanPanel);

        ProyekPanel.setBackground(new java.awt.Color(242, 219, 137));
        ProyekPanel.setLayout(new java.awt.BorderLayout());

        tengah1.setBackground(new java.awt.Color(242, 217, 137));
        tengah1.setLayout(new javax.swing.BoxLayout(tengah1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel18.setText("           ");
        tengah1.add(jLabel18);

        bttambahp.setText("Tambah");
        bttambahp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttambahpActionPerformed(evt);
            }
        });
        tengah1.add(bttambahp);

        bteditp.setText("Update");
        bteditp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditpActionPerformed(evt);
            }
        });
        tengah1.add(bteditp);

        bthapusp.setText("Hapus");
        bthapusp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthapuspActionPerformed(evt);
            }
        });
        tengah1.add(bthapusp);

        btreset2.setText("Reset");
        btreset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btreset2ActionPerformed(evt);
            }
        });
        tengah1.add(btreset2);

        jLabel19.setText("               ");
        tengah1.add(jLabel19);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/proyek.png"))); // NOI18N
        tengah1.add(jLabel20);

        btkeluar2.setText("Keluar");
        btkeluar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkeluar2ActionPerformed(evt);
            }
        });
        tengah1.add(btkeluar2);

        ProyekPanel.add(tengah1, java.awt.BorderLayout.CENTER);

        bawah1.setBackground(new java.awt.Color(242, 217, 137));

        tbproyek.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Proyek", "Nama Proyek", "Durasi Pengerjaan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbproyek);

        javax.swing.GroupLayout bawah1Layout = new javax.swing.GroupLayout(bawah1);
        bawah1.setLayout(bawah1Layout);
        bawah1Layout.setHorizontalGroup(
            bawah1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bawah1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bawah1Layout.setVerticalGroup(
            bawah1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        );

        ProyekPanel.add(bawah1, java.awt.BorderLayout.PAGE_END);

        atas1.setBackground(new java.awt.Color(242, 217, 137));
        atas1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setText("ID Proyek:");
        atas1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 14, -1, -1));

        tfidpry.setEditable(false);
        atas1.add(tfidpry, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 36, 212, -1));
        atas1.add(tfnamapry, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 212, -1));

        jLabel22.setText("Nama Proyek:");
        atas1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel23.setText("Durasi Pengerjaan ( Minggu ) :");
        atas1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 14, -1, -1));
        atas1.add(tfdurasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 36, 250, -1));

        ProyekPanel.add(atas1, java.awt.BorderLayout.PAGE_START);

        jTabbedPane1.addTab("Proyek", ProyekPanel);

        TransaksiPanel.setBackground(new java.awt.Color(242, 219, 137));
        TransaksiPanel.setLayout(new java.awt.BorderLayout());

        tengah2.setBackground(new java.awt.Color(242, 217, 137));
        tengah2.setLayout(new javax.swing.BoxLayout(tengah2, javax.swing.BoxLayout.LINE_AXIS));

        jLabel24.setText("           ");
        tengah2.add(jLabel24);

        bttambaht.setText("Tambah");
        bttambaht.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttambahtActionPerformed(evt);
            }
        });
        tengah2.add(bttambaht);

        bteditt.setText("Update");
        bteditt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btedittActionPerformed(evt);
            }
        });
        tengah2.add(bteditt);

        bthapust.setText("Hapus");
        bthapust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthapustActionPerformed(evt);
            }
        });
        tengah2.add(bthapust);

        btreset3.setText("Reset");
        btreset3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btreset3ActionPerformed(evt);
            }
        });
        tengah2.add(btreset3);

        jLabel25.setText("               ");
        tengah2.add(jLabel25);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/transaksi.png"))); // NOI18N
        tengah2.add(jLabel26);

        btkeluar3.setText("Keluar");
        btkeluar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkeluar3ActionPerformed(evt);
            }
        });
        tengah2.add(btkeluar3);

        TransaksiPanel.add(tengah2, java.awt.BorderLayout.CENTER);

        bawah2.setBackground(new java.awt.Color(242, 217, 137));

        tbtransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Karyawan", "Proyek", "Peran"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbtransaksi);

        javax.swing.GroupLayout bawah2Layout = new javax.swing.GroupLayout(bawah2);
        bawah2.setLayout(bawah2Layout);
        bawah2Layout.setHorizontalGroup(
            bawah2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bawah2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bawah2Layout.setVerticalGroup(
            bawah2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        );

        TransaksiPanel.add(bawah2, java.awt.BorderLayout.PAGE_END);

        atas2.setBackground(new java.awt.Color(242, 217, 137));
        atas2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setText("Karyawan:");
        atas2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel28.setText("Proyek:");
        atas2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel29.setText("Durasi:");
        atas2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        tfdurasit.setEditable(false);
        atas2.add(tfdurasit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 250, -1));

        cbpry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbpry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbpryActionPerformed(evt);
            }
        });
        atas2.add(cbpry, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 250, -1));

        cbkyw.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbkyw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbkywActionPerformed(evt);
            }
        });
        atas2.add(cbkyw, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 250, -1));

        jLabel30.setText("Peran:");
        atas2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 14, -1, -1));
        atas2.add(tfperan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 36, 250, -1));

        TransaksiPanel.add(atas2, java.awt.BorderLayout.PAGE_START);

        jTabbedPane1.addTab("Transaksi", TransaksiPanel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttambahkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttambahkActionPerformed
        // TODO add your handling code here:
        saveDataKaryawan();
        tfidkyw.setText("");
        tfnamakyw.setText("");
        tfjabatan.setText("");
        tfdepartemen.setText("");
    }//GEN-LAST:event_bttambahkActionPerformed

    private void bteditkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditkActionPerformed
        // TODO add your handling code here:
        updateDataKaryawan();
        tfidkyw.setText("");
        tfnamakyw.setText("");
        tfjabatan.setText("");
        tfdepartemen.setText("");
    }//GEN-LAST:event_bteditkActionPerformed

    private void bthapuskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthapuskActionPerformed
        // TODO add your handling code here:
        deleteDataKaryawan();
        tfidkyw.setText("");
        tfnamakyw.setText("");
        tfjabatan.setText("");
        tfdepartemen.setText("");
    }//GEN-LAST:event_bthapuskActionPerformed

    private void bttambahpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttambahpActionPerformed
        // TODO add your handling code here:
        saveDataProyek();
        tfidpry.setText("");
        tfnamapry.setText("");
        tfdurasi.setText("");
    }//GEN-LAST:event_bttambahpActionPerformed

    private void bteditpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditpActionPerformed
        // TODO add your handling code here:
        updateDataProyek();
        tfidpry.setText("");
        tfnamapry.setText("");
        tfdurasi.setText("");
    }//GEN-LAST:event_bteditpActionPerformed

    private void bthapuspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthapuspActionPerformed
        // TODO add your handling code here:
        deleteDataProyek();
        tfidpry.setText("");
        tfnamapry.setText("");
        tfdurasi.setText("");
    }//GEN-LAST:event_bthapuspActionPerformed

    private void bttambahtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttambahtActionPerformed
        // TODO add your handling code here:
        saveDataTransaksi();
        cbkyw.setSelectedIndex(0);
        cbpry.setSelectedIndex(0);
        tfperan1.setText("");
        tfdurasit.setText("");
    }//GEN-LAST:event_bttambahtActionPerformed

    private void btedittActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btedittActionPerformed
        // TODO add your handling code here:
        updateDataTransaksi();
        cbkyw.setSelectedIndex(0);
        cbpry.setSelectedIndex(0);
        tfperan1.setText("");
        tfdurasit.setText("");
    }//GEN-LAST:event_btedittActionPerformed

    private void bthapustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthapustActionPerformed
        // TODO add your handling code here:
        deleteDataTransaksi();
        cbkyw.setSelectedIndex(0);
        cbpry.setSelectedIndex(0);
        tfperan1.setText("");
        tfdurasit.setText("");
    }//GEN-LAST:event_bthapustActionPerformed

    private void btreset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btreset1ActionPerformed
        // TODO add your handling code here:
        resetKaryawan();
    }//GEN-LAST:event_btreset1ActionPerformed

    private void btreset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btreset2ActionPerformed
        // TODO add your handling code here:
        resetProyek();
    }//GEN-LAST:event_btreset2ActionPerformed

    private void btreset3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btreset3ActionPerformed
        // TODO add your handling code here:
        resetTransaksi();
    }//GEN-LAST:event_btreset3ActionPerformed

    private void btkeluar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkeluar3ActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Anda yakin akan keluar dari halaman ini?", "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            dispose(); 
        }
    }//GEN-LAST:event_btkeluar3ActionPerformed

    private void btkeluar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkeluar1ActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Anda yakin akan keluar dari halaman ini?", "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            dispose(); 
        }
    }//GEN-LAST:event_btkeluar1ActionPerformed

    private void btkeluar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkeluar2ActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Anda yakin akan keluar dari halaman ini?", "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            dispose(); 
        }
    }//GEN-LAST:event_btkeluar2ActionPerformed

    private void cbpryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbpryActionPerformed

    private void cbkywActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbkywActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbkywActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainFrame().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel KaryawanPanel;
    private javax.swing.JPanel ProyekPanel;
    private javax.swing.JPanel TransaksiPanel;
    private javax.swing.JPanel atas;
    private javax.swing.JPanel atas1;
    private javax.swing.JPanel atas2;
    private javax.swing.JPanel bawah;
    private javax.swing.JPanel bawah1;
    private javax.swing.JPanel bawah2;
    private javax.swing.JButton bteditk;
    private javax.swing.JButton bteditp;
    private javax.swing.JButton bteditt;
    private javax.swing.JButton bthapusk;
    private javax.swing.JButton bthapusp;
    private javax.swing.JButton bthapust;
    private javax.swing.JButton btkeluar1;
    private javax.swing.JButton btkeluar2;
    private javax.swing.JButton btkeluar3;
    private javax.swing.JButton btreset1;
    private javax.swing.JButton btreset2;
    private javax.swing.JButton btreset3;
    private javax.swing.JButton bttambahk;
    private javax.swing.JButton bttambahp;
    private javax.swing.JButton bttambaht;
    private javax.swing.JComboBox<String> cbkyw;
    private javax.swing.JComboBox<String> cbpry;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbkaryawan;
    private javax.swing.JTable tbproyek;
    private javax.swing.JTable tbtransaksi;
    private javax.swing.JPanel tengah;
    private javax.swing.JPanel tengah1;
    private javax.swing.JPanel tengah2;
    private javax.swing.JTextField tfdepartemen;
    private javax.swing.JTextField tfdurasi;
    private javax.swing.JTextField tfdurasit;
    private javax.swing.JTextField tfidkyw;
    private javax.swing.JTextField tfidpry;
    private javax.swing.JTextField tfjabatan;
    private javax.swing.JTextField tfnamakyw;
    private javax.swing.JTextField tfnamapry;
    private javax.swing.JTextField tfperan1;
    // End of variables declaration//GEN-END:variables

    private void updateDataTransaksi(int transaksiId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void deleteDataTransaksi(int transaksiId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
