/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AplikasiMenejemen extends javax.swing.JFrame {
    Connection conn;
    private DefaultTableModel modelKaryawan;
    private DefaultTableModel modelproyek;
    private DefaultTableModel modelTransaksiProyek;
    
    public AplikasiMenejemen() {
        conn = Koneksi.getConnection();
        initComponents();
        initTableModels();
        loadData();
    }
    
    //untuk menginisialisasi dan menyimpan
    private void initTableModels() {
        modelKaryawan = new DefaultTableModel(new String[] { "ID", "Nama", "Jabatan", "Departemen" }, 0);
        Jtkaryawan.setModel(modelKaryawan);

        modelproyek = new DefaultTableModel(new String[] { "ID", "Nama Proyek", "Pengerjaan Mingguan" }, 0);
        jtproyek.setModel(modelproyek);

        modelTransaksiProyek = new DefaultTableModel(new String[] { "ID Karyawan", "ID Proyek", "Nama Karyawan", "Peran",  "Nama Proyek", "Durasi Kerja Mingguan" }, 0);
        tabletransaksi.setModel(modelTransaksiProyek);
    }
    
    //menyimpan data
    private void loadData() {
        loadDataKaryawan();
        loadDataProyek();
        loadDataTransaksi();
        loadComboBoxKaryawan();
        loadComboBoxProyek();
    }

    private void loadDataKaryawan(){
        modelKaryawan.setRowCount(0);
    try {
        String sql ="SELECT *FROM karyawan"; //mengambil nilai
        PreparedStatement ps = conn.prepareStatement(sql); //koneksi
        ResultSet rs = ps.executeQuery(); //menampung data setiap query
        while (rs.next()){
            modelKaryawan.addRow(new Object[]{
            rs.getInt("ID"),
            rs.getString("nama"),
            rs.getString("jabatan"),
            rs.getString("departemen")         
            });
        }
    }catch (SQLException e){
        System.out.print("Eror save Data + getMessage");
        }
    }

    private void loadDataProyek() {
        modelproyek.setRowCount(0);  
    try {
      String sql = "SELECT * FROM proyek";//mengambil
      PreparedStatement ps = conn .prepareStatement(sql);
      //menampung data setiap query
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
         // Menambahkan baris ke dalam model tabel
         modelproyek.addRow(new Object[]{
         rs.getInt("id"),
         rs.getString("nama_proyek"),
         rs.getInt("durasi_pengerjaan")
       });
      }
      //menangani setiap kesalhan
    } catch (SQLException e) {
        System.out.println("Error Save Data" + e.getMessage());
        }
    }
    
    //untuk menampilkan data dari table
   private void loadDataTransaksi() {
            modelTransaksiProyek.setRowCount(0);
            try {
                String sql = "SELECT t.id_karyawan, t.id_proyek, t.peran, " +
                             "k.nama AS nama, p.nama_proyek AS nama_proyek, " +
                             "p.durasi_pengerjaan " +
                             "FROM transaksi t " +
                             "JOIN karyawan k ON t.id_karyawan = k.id " +
                             "JOIN proyek p ON t.id_proyek = p.id";
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery(); //mengambil data dari setiap query

                while (rs.next()) {
                    modelTransaksiProyek.addRow(new Object[]{
                        rs.getInt("id_karyawan"),
                        rs.getInt("id_proyek"),
                        rs.getString("nama"),
                        rs.getString("peran"),
                        rs.getString("nama_proyek"),
                        rs.getInt("durasi_pengerjaan")
                    });
                }
            } catch (SQLException e) {
                System.out.println("Error Load Data Transaksi: " + e.getMessage());
                JOptionPane.showMessageDialog(this, "Gagal memuat data transaksi: " + e.getMessage());
            }
        }

   //mengambil nilai dari database dan ditampilkan dalam combobox
    private void loadComboBoxKaryawan() {
    cbkaryawan.removeAllItems();
    try {
        String sql = "SELECT id, nama, jabatan, departemen FROM karyawan";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String tampilan = String.format("ID: %d - %s (%s, %s)", 
                rs.getInt("id"),
                rs.getString("nama"),
                rs.getString("jabatan"),
                rs.getString("departemen")
            );
           cbkaryawan.addItem(tampilan);
        }
    } catch (SQLException e) {
        System.out.println("Kesalahan Memuat Data Karyawan: " + e.getMessage());
    }
}

    private void loadComboBoxProyek() {
    cbproyek.removeAllItems();
    try {
        String sql = "SELECT id, nama_proyek, durasi_pengerjaan FROM proyek";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String tampilan = String.format("ID: %d - %s (%s)", 
                rs.getInt("id"),
                rs.getString("nama_proyek"),
                rs.getString("durasi_pengerjaan")
            );
           cbproyek.addItem(tampilan);
        }
    } catch (SQLException e) {
        System.out.println("Kesalahan Memuat Data Proyek: " + e.getMessage());
    } 
    
}
    //mengambil nilai id yang ada di combobox
    private int getSelectedId(String textComboBox) {
    if (textComboBox == null) return -1;
    try {
        String idPart = textComboBox.substring(textComboBox.indexOf("ID: ") + 4);
        return Integer.parseInt(idPart.substring(0, idPart.indexOf(" -")));
    } catch (Exception e) {
        System.out.println("Error parsing ID: " + e.getMessage());
        return -1;
    }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLID = new javax.swing.JLabel();
        jLNAMA = new javax.swing.JLabel();
        jLJABATAN = new javax.swing.JLabel();
        jLDEPARTEMEN = new javax.swing.JLabel();
        tfid = new javax.swing.JTextField();
        tfNama = new javax.swing.JTextField();
        tfJabatan = new javax.swing.JTextField();
        tfDepartemen = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btambah = new javax.swing.JButton();
        bedit = new javax.swing.JButton();
        bdelete = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Jtkaryawan = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLid = new javax.swing.JLabel();
        jLdurasi = new javax.swing.JLabel();
        jLnamaproyek = new javax.swing.JLabel();
        id_proyek = new javax.swing.JTextField();
        durasi_pengerjaan = new javax.swing.JTextField();
        nama_proyek = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        tambah = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtproyek = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLdrspengerjaan = new javax.swing.JLabel();
        txtdurasipengerjaan = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        btntmbh = new javax.swing.JButton();
        btnedt = new javax.swing.JButton();
        btndlt = new javax.swing.JButton();
        cbproyek = new javax.swing.JComboBox<>();
        cbkaryawan = new javax.swing.JComboBox<>();
        nama_karyawan = new javax.swing.JLabel();
        nam_proyek = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabletransaksi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("APLIKASI MENAJEMEN KARYAWAN DAN PROYEK");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\lailiilhami\\OneDrive\\Pictures\\logo karyawan 2.png")); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, -1));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jLID.setText("ID:");

        jLNAMA.setText("NAMA:");

        jLJABATAN.setText("JABATAN:");

        jLDEPARTEMEN.setText("DEPARTEMEN:");

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        btambah.setText("TAMBAH");
        btambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btambahActionPerformed(evt);
            }
        });
        jPanel5.add(btambah);

        bedit.setText("EDIT");
        bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditActionPerformed(evt);
            }
        });
        jPanel5.add(bedit);

        bdelete.setText("DELETE");
        bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdeleteActionPerformed(evt);
            }
        });
        jPanel5.add(bdelete);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jtkaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NAMA", "JABATAN", "DAPARTEMEN"
            }
        ));
        jScrollPane2.setViewportView(Jtkaryawan);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 230));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLNAMA)
                    .addComponent(jLID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfid, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(tfNama))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLJABATAN)
                    .addComponent(jLDEPARTEMEN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfDepartemen, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(tfJabatan))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLID)
                    .addComponent(jLJABATAN)
                    .addComponent(tfid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNAMA)
                            .addComponent(jLDEPARTEMEN)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDepartemen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Karyawan", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));

        jLid.setText("ID:");

        jLdurasi.setText("DURASI PENGERJAAN:");

        jLnamaproyek.setText("NAMA PROYEK:");

        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        tambah.setText("TAMBAH");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        jPanel7.add(tambah);

        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel7.add(edit);

        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel7.add(delete);

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtproyek.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NAMA PROYEK", "DURASI PENGERJAAN"
            }
        ));
        jScrollPane1.setViewportView(jtproyek);

        jPanel8.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 230));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLnamaproyek)
                            .addGap(59, 59, 59)
                            .addComponent(nama_proyek, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLdurasi)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(durasi_pengerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLid)
                        .addGap(128, 128, 128)
                        .addComponent(id_proyek, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(id_proyek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLid)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLnamaproyek)
                    .addComponent(nama_proyek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLdurasi)
                    .addComponent(durasi_pengerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Proyek", jPanel3);

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));

        jLdrspengerjaan.setText("Peran");

        jPanel10.setLayout(new java.awt.GridLayout(1, 0));

        btntmbh.setText("TAMBAH");
        btntmbh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntmbhActionPerformed(evt);
            }
        });
        jPanel10.add(btntmbh);

        btnedt.setText("EDIT");
        btnedt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnedtActionPerformed(evt);
            }
        });
        jPanel10.add(btnedt);

        btndlt.setText("DELETE");
        btndlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndltActionPerformed(evt);
            }
        });
        jPanel10.add(btndlt);

        nama_karyawan.setText("Nama:");

        nam_proyek.setText("Proyek");

        tabletransaksi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tabletransaksi);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nama_karyawan)
                    .addComponent(nam_proyek)
                    .addComponent(jLdrspengerjaan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cbproyek, javax.swing.GroupLayout.Alignment.TRAILING, 0, 197, Short.MAX_VALUE)
                        .addComponent(cbkaryawan, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtdurasipengerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(295, 295, 295))
            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane4)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama_karyawan)
                    .addComponent(cbkaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nam_proyek)
                    .addComponent(cbproyek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLdrspengerjaan)
                    .addComponent(txtdurasipengerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Transaksi proyek", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//delete karyawan
    private void bdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdeleteActionPerformed
    try  {
          String sql = "DELETE FROM karyawan WHERE id = ?";
          PreparedStatement ps = conn.prepareStatement(sql);
          ps.setInt(1, Integer.parseInt(tfid.getText()));
          ps.executeUpdate();
          JOptionPane.showMessageDialog(this, "Data karyawan berhasil dihapus");
          loadDataKaryawan();
     } catch (SQLException e) {
          System.out.println("Error Save Data" + e.getMessage());
      }
    
    }//GEN-LAST:event_bdeleteActionPerformed

    //delete proyek
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
     try  {
          String sql = "DELETE FROM proyek WHERE id = ?";
          PreparedStatement ps = conn.prepareStatement(sql);
          ps.setInt(1, Integer.parseInt(id_proyek.getText()));
          ps.executeUpdate();
          JOptionPane.showMessageDialog(this, "Dataproyek berhasil dihapus");
         loadDataProyek();
     } catch (SQLException e) {
          System.out.println("Error Save Data" + e.getMessage());
      }
    }//GEN-LAST:event_deleteActionPerformed

    //edit transaksi
    private void btnedtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnedtActionPerformed
      if (txtdurasipengerjaan.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Peran tidak boleh kosong.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return; 
        }
               PreparedStatement ps = null; 
    try {
        String sql = "UPDATE transaksi SET peran = ? WHERE id_karyawan = ? AND id_proyek = ?";
        ps = conn.prepareStatement(sql);

        int idKaryawan = getSelectedId(cbkaryawan.getSelectedItem().toString());
        int idProyek = getSelectedId(cbproyek.getSelectedItem().toString());

        ps.setString(1, txtdurasipengerjaan.getText().trim());
        ps.setInt(2, idKaryawan);
        ps.setInt(3, idProyek);

        int affectedRows = ps.executeUpdate(); 
        if (affectedRows > 0) {
            JOptionPane.showMessageDialog(this, "Data Transaksi berhasil diperbarui");
            loadDataTransaksi();
        } else {
            JOptionPane.showMessageDialog(this, "Tidak ada data transaksi yang diperbarui. Pastikan ID karyawan dan proyek benar.", 
            "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Kesalahan Memperbarui Data Transaksi: " + e.getMessage(), 
        "Kesalahan", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (ps != null) ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Kesalahan saat menutup PreparedStatement: " + e.getMessage(), 
            "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_btnedtActionPerformed

    //delete transaksi
    private void btndltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndltActionPerformed
     if (cbkaryawan.getSelectedItem() == null || cbproyek.getSelectedItem() == null) {
        JOptionPane.showMessageDialog(this, "Silakan pilih karyawan dan proyek sebelum menghapus transaksi.", 
        "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }
    PreparedStatement ps = null; 
    try {
        String sql = "DELETE FROM transaksi WHERE id_karyawan = ? AND id_proyek = ?";
        ps = conn.prepareStatement(sql);
        
        int idKaryawan = getSelectedId(cbkaryawan.getSelectedItem().toString());
        int idProyek = getSelectedId(cbproyek.getSelectedItem().toString());
        
        ps.setInt(1, idKaryawan);
        ps.setInt(2, idProyek);
        
        int affectedRows = ps.executeUpdate(); 
        if (affectedRows > 0) {
            JOptionPane.showMessageDialog(this, "Data Transaksi berhasil dihapus.");
            loadDataTransaksi();
        } else {
            JOptionPane.showMessageDialog(this, "Tidak ada transaksi yang dihapus. Pastikan ID karyawan dan proyek benar.", 
            "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Kesalahan Menghapus Data Transaksi: " + e.getMessage(), 
        "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (ps != null) ps.close();
        } catch (SQLException e) {
            System.out.println("Kesalahan saat menutup PreparedStatement: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_btndltActionPerformed
//tambah proyek
    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
    try{
         String sql = "INSERT INTO proyek (nama_proyek, durasi_pengerjaan) VALUES (?, ?)";
         PreparedStatement ps = conn.prepareStatement(sql);
         ps.setString(1, nama_proyek.getText());
         ps.setInt(2, Integer.parseInt(durasi_pengerjaan.getText()));
         ps.executeUpdate();
         JOptionPane.showMessageDialog(this, "Data proyek berhasil ditambah");
         loadDataProyek();
         loadComboBoxProyek();
       } catch (SQLException e) {
         System.out.println("Error Save Data" + e.getMessage());
       }    // TODO add your handling code here:
    }//GEN-LAST:event_tambahActionPerformed

    //tambah karyawan
    private void btambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btambahActionPerformed
    try{
         String sql = "INSERT INTO karyawan (nama, jabatan, departemen) VALUES (?, ?, ?)";
         PreparedStatement ps = conn.prepareStatement(sql);
         ps.setString(1, tfNama.getText());
         ps.setString(2, tfJabatan.getText());
         ps.setString(3, tfDepartemen.getText());
         ps.executeUpdate();
         JOptionPane.showMessageDialog(this, "Data karyawan berhasil ditambah");
         loadDataKaryawan();
         loadComboBoxKaryawan();
       } catch (SQLException e) {
         System.out.println("Error Save Data" + e.getMessage());
       }  
    }//GEN-LAST:event_btambahActionPerformed

    //edit proyek
    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
      try {
          String sql = "UPDATE proyek SET nama_proyek = ?, durasi_pengerjaan = ? WHERE id = ?";
          PreparedStatement ps = conn.prepareStatement(sql);
          ps.setString(1, nama_proyek.getText());
          ps.setString(2, durasi_pengerjaan.getText());
          ps.setInt(3, Integer.parseInt(id_proyek.getText()));
          ps.executeUpdate();
          JOptionPane.showMessageDialog(this, "Data proyek berhasil diperbarui");
          loadDataProyek();
      }  catch (SQLException e) {
          System.out.println("Error Save Data" + e.getMessage());
      }
    }//GEN-LAST:event_editActionPerformed

    //edit karyawan
    private void beditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditActionPerformed
   try {
          String sql = "UPDATE karyawan SET nama = ?, jabatan = ?, departemen = ? WHERE id = ?";
          PreparedStatement ps = conn.prepareStatement(sql);
          ps.setString(1, tfNama.getText());
          ps.setString(2, tfJabatan.getText());
          ps.setString(3, tfDepartemen.getText());
          ps.setInt(4, Integer.parseInt(tfid.getText()));
          ps.executeUpdate();
          JOptionPane.showMessageDialog(this, "Data karyawan berhasil diperbarui");
          loadDataKaryawan();
      }  catch (SQLException e) {
          System.out.println("Error Save Data" + e.getMessage());
      }
    }//GEN-LAST:event_beditActionPerformed

    //tambah transaksi
    private void btntmbhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntmbhActionPerformed
                                            
    try {
        if (cbkaryawan.getSelectedItem() == null || cbproyek.getSelectedItem() == null || txtdurasipengerjaan.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Pilih karyawan, proyek, dan isi peran terlebih dahulu");
            return;
        }

        // Ambil ID dari ComboBox
        int idKaryawan = getSelectedId(cbkaryawan.getSelectedItem().toString());
        int idProyek = getSelectedId(cbproyek.getSelectedItem().toString());
        String peran = txtdurasipengerjaan.getText().trim();

        String sql = "INSERT INTO transaksi (id_karyawan, id_proyek, peran) VALUES (?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        
        ps.setInt(1, idKaryawan);
        ps.setInt(2, idProyek);
        ps.setString(3, peran);

        int result = ps.executeUpdate();
        if (result > 0) {
            JOptionPane.showMessageDialog(this, "Data Transaksi berhasil ditambahkan");
            loadDataTransaksi(); // Memuat ulang data transaksi di tabel setelah ditambahkan
        }
    } catch (SQLException e) {
        System.out.println("Kesalahan Menambah Data Transaksi: " + e.getMessage());
        JOptionPane.showMessageDialog(this, "Gagal menambah data: " + e.getMessage());
    }

    }//GEN-LAST:event_btntmbhActionPerformed

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
            java.util.logging.Logger.getLogger(AplikasiMenejemen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiMenejemen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiMenejemen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiMenejemen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiMenejemen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Jtkaryawan;
    private javax.swing.JButton bdelete;
    private javax.swing.JButton bedit;
    private javax.swing.JButton btambah;
    private javax.swing.JButton btndlt;
    private javax.swing.JButton btnedt;
    private javax.swing.JButton btntmbh;
    private javax.swing.JComboBox<String> cbkaryawan;
    private javax.swing.JComboBox<String> cbproyek;
    private javax.swing.JButton delete;
    private javax.swing.JTextField durasi_pengerjaan;
    private javax.swing.JButton edit;
    private javax.swing.JTextField id_proyek;
    private javax.swing.JLabel jLDEPARTEMEN;
    private javax.swing.JLabel jLID;
    private javax.swing.JLabel jLJABATAN;
    private javax.swing.JLabel jLNAMA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLdrspengerjaan;
    private javax.swing.JLabel jLdurasi;
    private javax.swing.JLabel jLid;
    private javax.swing.JLabel jLnamaproyek;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jtproyek;
    private javax.swing.JLabel nam_proyek;
    private javax.swing.JLabel nama_karyawan;
    private javax.swing.JTextField nama_proyek;
    private javax.swing.JTable tabletransaksi;
    private javax.swing.JButton tambah;
    private javax.swing.JTextField tfDepartemen;
    private javax.swing.JTextField tfJabatan;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfid;
    private javax.swing.JTextField txtdurasipengerjaan;
    // End of variables declaration//GEN-END:variables

    //private void loadDataTransaksi() {
    // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   // }
}
