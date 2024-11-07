/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkg230441100169_firliana.eka.k.s_modul5;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Aplikasi extends javax.swing.JFrame {
    //inisiasi GLobal Variable
    private Connection conn;
    
    private DefaultTableModel model;
    private DefaultTableModel model1;
    private DefaultTableModel model2;
    
    class NonEditableTableModel extends DefaultTableModel {
    @Override
    public boolean isCellEditable(int row, int column) {
        return false; // Semua sel tidak dapat diedit
    }
    }

    
    public Aplikasi() {
        initComponents();
        
    // Inisialisasi koneksi database terlebih dahulu
        conn = koneksi.getConnection();

        // Pastikan koneksi berhasil sebelum memuat data ComboBox
        if (conn == null) {
            System.out.println("Koneksi database belum diinisialisasi.");
            javax.swing.JOptionPane.showMessageDialog(this, "Gagal terhubung ke database.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            System.out.println("Koneksi ke database berhasil.");
            loadComboBoxData(); // Memanggil setelah inisialisasi `conn`
        }
        
    tblKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        tblKaryawanMouseClicked(evt);
    }
});
    tblProyek.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        tblProyekMouseClicked(evt);
    }
});
    tblTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        tblTransaksiMouseClicked(evt);
    }
});    
   conn = koneksi.getConnection();

    model = new NonEditableTableModel();
    tblKaryawan.setModel(model);
    

    model.addColumn("Id");
    model.addColumn("Nama");
    model.addColumn("Jabatan");
    model.addColumn("Departemen");

    loadData();
    
    model1 = new NonEditableTableModel();
    tblProyek.setModel(model1);
    

    model1.addColumn("ID");
    model1.addColumn("Nama_proyek");
    model1.addColumn("Durasi_pengerjaan");
   
    loadData1();
    
    model2 = new NonEditableTableModel();
    tblTransaksi.setModel(model2);
   
    model2.addColumn("nama_karyawan");
    model2.addColumn("nama_proyek");
    model2.addColumn("peran");

    loadData2();
   
    
    }
    
    //Load Data karyawan
    private void loadData() {
      
      model.setRowCount(0);

      try {
          String sql = "SELECT * FROM karyawan";
          PreparedStatement ps = conn.prepareStatement(sql);//menyiapkan query 
          ResultSet rs = ps.executeQuery();//menyimpan data
          while (rs.next()) {
             // Menambahkan baris ke dalam model tabel
             model.addRow(new Object[]{
             rs.getInt("id"),
             rs.getString("nama"),
             rs.getString("jabatan"),
             rs.getString("departemen")
           });
          }
      } catch (SQLException e) {
         System.out.println("Error Save Data" + e.getMessage());
       }
    }
    
    //Load Data proyek
    private void loadData1() {
      model1.setRowCount(0);

      try {
          String sql = "SELECT * FROM proyek";
          PreparedStatement ps = conn.prepareStatement(sql);//menyiapkan query 
          ResultSet rs = ps.executeQuery();//menyimpan data
          while (rs.next()) {
             // Menambahkan baris ke dalam model tabel
             model1.addRow(new Object[]{
             rs.getInt("id"),
             rs.getString("nama_proyek"),
             rs.getInt("durasi_pengerjaan")
           });
          }
      } catch (SQLException e) {
         System.out.println("Error Save Data" + e.getMessage());
       }
    }
    
    //Load Data transaski
    private void loadData2() {
        if (conn == null) {
        System.out.println("Database connection not initialized.");
        return;
    }

    try {
        String sql = """
            SELECT t.nama_karyawan, t.nama_proyek, t.peran
            FROM transaksii t
            JOIN karyawan k ON t.nama_karyawan = k.nama
            JOIN proyek p ON t.nama_proyek = p.nama_proyek;
        """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        // Clear the table before loading new data
        DefaultTableModel model = (DefaultTableModel) tblTransaksi.getModel();
        model.setRowCount(0); // Pastikan data lama dihapus
        tblTransaksi.repaint(); // Meminta refresh tabel untuk memperbarui tampilan

        // Add data to the table model
        while (rs.next()) {
            String namaKaryawan = rs.getString("nama_karyawan");
            String namaProyek = rs.getString("nama_proyek");
            String peran = rs.getString("peran");

            model.addRow(new Object[]{namaKaryawan, namaProyek, peran});
        }

        model.fireTableDataChanged(); // Memastikan data diperbarui secara visual
        System.out.println("Data transaksi berhasil dimuat ulang.");

    } catch (SQLException e) {
        System.out.println("Error loading transaction data: " + e.getMessage());
    }

    }
//    load data untuk memunculkan ID di comboBox transaski
    private void loadComboBoxData() {
        if (conn == null) {
    System.out.println("Database connection not initialized.");
    return;
}

try {
    // Load ComboBox for Karyawan
    String sqlKaryawan = "SELECT id, nama FROM karyawan";
    PreparedStatement psKaryawan = conn.prepareStatement(sqlKaryawan);
    ResultSet rsKaryawan = psKaryawan.executeQuery();
    
    cbKaryawan.removeAllItems();
    while (rsKaryawan.next()) {
        cbKaryawan.addItem(rsKaryawan.getInt("id") + " - " + rsKaryawan.getString("nama"));
    }

    // Load ComboBox for Proyek
    String sqlProyek = "SELECT id, nama_proyek FROM proyek";
    PreparedStatement psProyek = conn.prepareStatement(sqlProyek);
    ResultSet rsProyek = psProyek.executeQuery();
    
    cbProyek.removeAllItems();
    while (rsProyek.next()) {
        cbProyek.addItem(rsProyek.getInt("id") + " - " + rsProyek.getString("nama_proyek"));
    }

} catch (SQLException e) {
    System.out.println("Error loading ComboBox data: " + e.getMessage());
}

}
    //tambah data di karyawan
    private void saveData() {
        if (conn == null) {
        System.out.println("Koneksi belum diinisialisasi.");
        return;
    }

    try {
        String sql = "INSERT INTO karyawan (nama, jabatan, departemen) VALUES (?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, tfNama.getText());
        ps.setString(2, tfJabatan.getText());
        ps.setString(3, tfDepartemen.getText());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(this, "Data saved successfully");
        
        loadData();  // Reload data in the table
        loadComboBoxData(); // Update the ComboBox with the new data
    } catch (SQLException e) {
        System.out.println("Error Save Data: " + e.getMessage());
    }
     }
    
    //Update Data
    private void updateData() {
        if (conn == null) {
        System.out.println("Database connection not initialized.");
        return;
    }

    int selectedRow = tblKaryawan.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data yang ingin diedit pada tabel.");
        return;
    }

    int id = (int) tblKaryawan.getValueAt(selectedRow, 0); // Ambil ID dari kolom pertama
    String oldNamaKaryawan = (String) tblKaryawan.getValueAt(selectedRow, 1); // Nama karyawan sebelum di-update

    try {
        // Update tabel karyawan
        String sql = "UPDATE karyawan SET nama = ?, jabatan = ?, departemen = ? WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, tfNama.getText());
        ps.setString(2, tfJabatan.getText());
        ps.setString(3, tfDepartemen.getText());
        ps.setInt(4, id);
        int rowsAffectedKaryawan = ps.executeUpdate();
        System.out.println("Rows affected in karyawan: " + rowsAffectedKaryawan);

        // Update nama_karyawan di tabel transaksii
        String sqlUpdateTransaksi = "UPDATE transaksii SET nama_karyawan = ? WHERE nama_karyawan = ?";
        PreparedStatement psTransaksi = conn.prepareStatement(sqlUpdateTransaksi);
        psTransaksi.setString(1, tfNama.getText()); // Nama baru
        psTransaksi.setString(2, oldNamaKaryawan); // Nama lama
        int rowsAffectedTransaksi = psTransaksi.executeUpdate();
        System.out.println("Rows affected in transaksii (karyawan): " + rowsAffectedTransaksi);

        JOptionPane.showMessageDialog(this, "Data karyawan dan transaksi diperbarui dengan sukses.");

        loadData(); // Memuat ulang data karyawan
        loadComboBoxData(); // Memuat ulang data transaksi untuk menampilkan perubahan
        loadData2();
    } catch (SQLException e) {
        System.out.println("Error Update Data: " + e.getMessage());
    }
     }
//    hapus data karyawan
    private void deleteData() {
        if (conn == null) {
        System.out.println("Koneksi belum diinisialisasi.");
        return;
    }

    int selectedRow = tblKaryawan.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus pada tabel.");
        return;
    }

    int id = (int) tblKaryawan.getValueAt(selectedRow, 0); // Ambil ID dari kolom pertama

    try {
        String sql = "DELETE FROM karyawan WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(this, "Data deleted successfully");
        loadData(); // Memuat ulang data proyek
    } catch (SQLException e) {
        System.out.println("Error Delete Data: " + e.getMessage());
    }
    }
//    memunculkan hasil di tabel 
    private void tblKaryawanMouseClicked(java.awt.event.MouseEvent evt) {
    int selectedRow = tblKaryawan.getSelectedRow();
    if (selectedRow != -1) {
        tfID1.setText(tblKaryawan.getValueAt(selectedRow, 0).toString()); // Untuk ID, meskipun hanya untuk referensi
        tfNama.setText(tblKaryawan.getValueAt(selectedRow, 1).toString());
        tfJabatan.setText(tblKaryawan.getValueAt(selectedRow, 2).toString());
        tfDepartemen.setText(tblKaryawan.getValueAt(selectedRow, 3).toString());
    }
    }
    private void tblProyekMouseClicked(java.awt.event.MouseEvent evt) {
    int selectedRow = tblProyek.getSelectedRow(); // Use tblProyek here
    if (selectedRow != -1) {
        tfID.setText(tblProyek.getValueAt(selectedRow, 0).toString());
        tfNamaProyek.setText(tblProyek.getValueAt(selectedRow, 1).toString());
        tfDurasi.setText(tblProyek.getValueAt(selectedRow, 2).toString());
    }
}
    private void tblTransaksiMouseClicked(java.awt.event.MouseEvent evt) {
    int selectedRow = tblTransaksi.getSelectedRow();

    if (selectedRow != -1) {
        String namaKaryawan = (String) tblTransaksi.getValueAt(selectedRow, 0);
        String namaProyek = (String) tblTransaksi.getValueAt(selectedRow, 1);
        String peran = (String) tblTransaksi.getValueAt(selectedRow, 2);

        tfPeran.setText(peran);
        cbKaryawan.setSelectedItem(namaKaryawan);
        cbProyek.setSelectedItem(namaProyek);
    }
}
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKaryawan = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfID1 = new javax.swing.JTextField();
        tfDepartemen = new javax.swing.JTextField();
        tfNama = new javax.swing.JTextField();
        tfJabatan = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnTambah1 = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        tfNamaProyek = new javax.swing.JTextField();
        tfDurasi = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnTambah2 = new javax.swing.JButton();
        btnUpdate2 = new javax.swing.JButton();
        btnDelete2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProyek = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbKaryawan = new javax.swing.JComboBox<>();
        cbProyek = new javax.swing.JComboBox<>();
        tfPeran = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        btnTambah3 = new javax.swing.JButton();
        btnUpdate3 = new javax.swing.JButton();
        btnDelete3 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblTransaksi = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("   APLIKASI MANAJEMEN KARYAWAN DAN PROYEK");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jTabbedPane2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jPanel5.setBackground(new java.awt.Color(255, 153, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblKaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Jabatan", "Departemen"
            }
        ));
        jScrollPane1.setViewportView(tblKaryawan);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 370, 140));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("ID :");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Nama :");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Jabatan :");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 50, 20));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("Departemen :");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 20));
        jPanel5.add(tfID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 220, -1));
        jPanel5.add(tfDepartemen, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 220, -1));
        jPanel5.add(tfNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 220, -1));
        jPanel5.add(tfJabatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 220, -1));

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        btnTambah1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnTambah1.setText("Tambah");
        btnTambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnTambah1, new java.awt.GridBagConstraints());

        btnUpdate1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnUpdate1.setText("Update");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate1, new java.awt.GridBagConstraints());

        btnDelete1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnDelete1.setText("Delete");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete1, new java.awt.GridBagConstraints());

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 220, 50));

        jTabbedPane2.addTab(" Form Karyawan", jPanel5);

        jPanel3.setBackground(new java.awt.Color(255, 153, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("ID :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Nama Proyek :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Durasi Pengerjaan :");

        jPanel6.setBackground(new java.awt.Color(255, 204, 255));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        btnTambah2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnTambah2.setText("Tambah");
        btnTambah2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah2ActionPerformed(evt);
            }
        });
        jPanel6.add(btnTambah2, new java.awt.GridBagConstraints());

        btnUpdate2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnUpdate2.setText("Update");
        btnUpdate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate2ActionPerformed(evt);
            }
        });
        jPanel6.add(btnUpdate2, new java.awt.GridBagConstraints());

        btnDelete2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnDelete2.setText("Delete");
        btnDelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete2ActionPerformed(evt);
            }
        });
        jPanel6.add(btnDelete2, new java.awt.GridBagConstraints());

        tblProyek.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nama Proyek", "Durasi Pengerjaan"
            }
        ));
        jScrollPane2.setViewportView(tblProyek);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfNamaProyek, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfDurasi, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNamaProyek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDurasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(32, 32, 32)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Form Proyek", jPanel3);

        jPanel8.setBackground(new java.awt.Color(255, 153, 255));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Nama Karyawan :");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("Nama Proyek :");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("Peran / Durasi :");

        jPanel7.setBackground(new java.awt.Color(255, 204, 255));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        btnTambah3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnTambah3.setText("Tambah");
        btnTambah3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah3ActionPerformed(evt);
            }
        });
        jPanel7.add(btnTambah3, new java.awt.GridBagConstraints());

        btnUpdate3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnUpdate3.setText("Update");
        btnUpdate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate3ActionPerformed(evt);
            }
        });
        jPanel7.add(btnUpdate3, new java.awt.GridBagConstraints());

        btnDelete3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnDelete3.setText("Delete");
        btnDelete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete3ActionPerformed(evt);
            }
        });
        jPanel7.add(btnDelete3, new java.awt.GridBagConstraints());

        tblTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nama Karyawan", "Nama Proyek", "Peran"
            }
        ));
        jScrollPane5.setViewportView(tblTransaksi);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbProyek, 0, 214, Short.MAX_VALUE)
                            .addComponent(cbKaryawan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfPeran)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 66, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbProyek, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfPeran)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Form Transaksi", jPanel8);

        jPanel1.add(jTabbedPane2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// tambah data proyek
    private void btnTambah2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah2ActionPerformed
        if (conn == null) {
        System.out.println("Koneksi belum diinisialisasi.");
        return;
    }

    try {
        String sql = "INSERT INTO proyek (nama_proyek, durasi_pengerjaan) VALUES (?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, tfNamaProyek.getText());
        ps.setInt(2, Integer.parseInt(tfDurasi.getText()));
        ps.executeUpdate();
        JOptionPane.showMessageDialog(this, "Proyek saved successfully");
        
        loadData1(); // Reload data in the table
        loadComboBoxData(); // Update the ComboBox with the new data
    } catch (SQLException e) {
        System.out.println("Error Save Data: " + e.getMessage());
    }        // TODO add your handling code here:
    }//GEN-LAST:event_btnTambah2ActionPerformed
// update data proyek
    private void btnUpdate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate2ActionPerformed
        if (conn == null) {
        System.out.println("Koneksi belum diinisialisasi.");
        return;
    }

    int selectedRow = tblProyek.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data yang ingin diedit pada tabel.");
        return;
    }

    int id = (int) tblProyek.getValueAt(selectedRow, 0); // Ambil ID dari kolom pertama
    String oldNamaProyek = (String) tblProyek.getValueAt(selectedRow, 1); // Nama proyek sebelum di-update

    try {
        // Update tabel proyek
        String sql = "UPDATE proyek SET nama_proyek = ?, durasi_pengerjaan = ? WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, tfNamaProyek.getText());
        ps.setInt(2, Integer.parseInt(tfDurasi.getText()));
        ps.setInt(3, id);
        int rowsAffectedProyek = ps.executeUpdate();
        System.out.println("Rows affected in proyek: " + rowsAffectedProyek);

        // Update nama_proyek di tabel transaksii
        String sqlUpdateTransaksi = "UPDATE transaksii SET nama_proyek = ? WHERE nama_proyek = ?";
        PreparedStatement psTransaksi = conn.prepareStatement(sqlUpdateTransaksi);
        psTransaksi.setString(1, tfNamaProyek.getText()); // Nama proyek baru
        psTransaksi.setString(2, oldNamaProyek); // Nama proyek lama
        int rowsAffectedTransaksiProyek = psTransaksi.executeUpdate();
        System.out.println("Rows affected in transaksii (proyek): " + rowsAffectedTransaksiProyek);

        JOptionPane.showMessageDialog(this, "Data proyek dan transaksi diperbarui dengan sukses.");

        loadData1(); // Memuat ulang data proyek
        loadComboBoxData(); // Memuat ulang data transaksi untuk menampilkan perubahan
        loadData2();
    } catch (SQLException e) {
        System.out.println("Error Update Data: " + e.getMessage());
    } catch (NumberFormatException e) {
        System.out.println("Error: Format angka salah. " + e.getMessage());
    }       // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdate2ActionPerformed
// delete data proyek
    private void btnDelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete2ActionPerformed
        if (conn == null) {
        System.out.println("Koneksi belum diinisialisasi.");
        return;
    }

    int selectedRow = tblProyek.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus pada tabel.");
        return;
    }

    int id = (int) tblProyek.getValueAt(selectedRow, 0); // Ambil ID dari kolom pertama

    try {
        String sql = "DELETE FROM proyek WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(this, "Data deleted successfully");
        loadData1(); // Memuat ulang data proyek
    } catch (SQLException e) {
        System.out.println("Error Delete Data: " + e.getMessage());
    }        // TODO add your handling code here:
    }//GEN-LAST:event_btnDelete2ActionPerformed

    private void btnTambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah1ActionPerformed
        saveData();        // TODO add your handling code here:
    }//GEN-LAST:event_btnTambah1ActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        updateData();        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        deleteData();        // TODO add your handling code here:
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnTambah3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah3ActionPerformed
        if (conn == null) {
        System.out.println("Database connection not initialized.");
        return;
    }

    try {
        String sql = "INSERT INTO transaksii (nama_karyawan, nama_proyek, peran) VALUES (?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);

        // Extract names only (after the ID and hyphen)
        String namaKaryawan = cbKaryawan.getSelectedItem().toString().split(" - ")[1];
        String namaProyek = cbProyek.getSelectedItem().toString().split(" - ")[1];

        ps.setString(1, namaKaryawan);
        ps.setString(2, namaProyek);
        ps.setString(3, tfPeran.getText());

        ps.executeUpdate();
        JOptionPane.showMessageDialog(this, "Data successfully");

        loadData2();
    } catch (SQLException e) {
        System.out.println("Error adding transaction data: " + e.getMessage());
    }

    }//GEN-LAST:event_btnTambah3ActionPerformed

    private void btnUpdate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate3ActionPerformed
        if (conn == null) {
        System.out.println("Database connection not initialized.");
        return;
    }

    int selectedRow = tblKaryawan.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data yang ingin diedit pada tabel.");
        return;
    }

    int id = (int) tblKaryawan.getValueAt(selectedRow, 0); // Ambil ID dari kolom pertama
    String oldNamaKaryawan = (String) tblKaryawan.getValueAt(selectedRow, 1); // Nama karyawan sebelum di-update

    try {
        // Update tabel karyawan
        String sql = "UPDATE karyawan SET nama = ?, jabatan = ?, departemen = ? WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, tfNama.getText());
        ps.setString(2, tfJabatan.getText());
        ps.setString(3, tfDepartemen.getText());
        ps.setInt(4, id);
        int rowsAffectedKaryawan = ps.executeUpdate();
        System.out.println("Rows affected in karyawan: " + rowsAffectedKaryawan);

        // Update nama_karyawan di tabel transaksii jika nama berubah
        String newNamaKaryawan = tfNama.getText();
        if (!oldNamaKaryawan.equals(newNamaKaryawan)) {
            String sqlUpdateTransaksi = "UPDATE transaksii SET nama_karyawan = ? WHERE nama_karyawan = ?";
            PreparedStatement psTransaksi = conn.prepareStatement(sqlUpdateTransaksi);
            psTransaksi.setString(1, newNamaKaryawan); // Nama baru
            psTransaksi.setString(2, oldNamaKaryawan); // Nama lama
            int rowsAffectedTransaksi = psTransaksi.executeUpdate();
            System.out.println("Rows affected in transaksii (karyawan): " + rowsAffectedTransaksi);
        }

        JOptionPane.showMessageDialog(this, "Data karyawan dan transaksi diperbarui dengan sukses.");
        loadData2(); // Memuat ulang data karyawan
        loadComboBoxData(); // Memuat ulang data transaksi untuk menampilkan perubahan
    } catch (SQLException e) {
        System.out.println("Error Update Data: " + e.getMessage());
    }      // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdate3ActionPerformed

    private void btnDelete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete3ActionPerformed
        if (conn == null) {
        System.out.println("Database connection not initialized.");
        return;
    }

    int selectedRow = tblTransaksi.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "Select data to delete in the table.");
        return;
    }

    try {
        String sql = "DELETE FROM transaksii WHERE nama_karyawan = ? AND nama_proyek = ?";
        PreparedStatement ps = conn.prepareStatement(sql);

        String namaKaryawan = cbKaryawan.getSelectedItem().toString().split(" - ")[1];
        String namaProyek = cbProyek.getSelectedItem().toString().split(" - ")[1];

        ps.setString(1, namaKaryawan);
        ps.setString(2, namaProyek);

        int rowsAffected = ps.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Data deleted successfully");
        } else {
            JOptionPane.showMessageDialog(null, "No data deleted. Name not found.");
        }

        loadData2();
    } catch (SQLException e) {
        System.out.println("Error deleting data: " + e.getMessage());
    }
                

    }//GEN-LAST:event_btnDelete3ActionPerformed

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
            java.util.logging.Logger.getLogger(Aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplikasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnDelete2;
    private javax.swing.JButton btnDelete3;
    private javax.swing.JButton btnTambah1;
    private javax.swing.JButton btnTambah2;
    private javax.swing.JButton btnTambah3;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JButton btnUpdate2;
    private javax.swing.JButton btnUpdate3;
    private javax.swing.JComboBox<String> cbKaryawan;
    private javax.swing.JComboBox<String> cbProyek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblKaryawan;
    private javax.swing.JTable tblProyek;
    private javax.swing.JTable tblTransaksi;
    private javax.swing.JTextField tfDepartemen;
    private javax.swing.JTextField tfDurasi;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfID1;
    private javax.swing.JTextField tfJabatan;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNamaProyek;
    private javax.swing.JTextField tfPeran;
    // End of variables declaration//GEN-END:variables
}
