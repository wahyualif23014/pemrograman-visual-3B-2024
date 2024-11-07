package aplikasikantor;

import java.sql.Connection;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import javax.swing.Action;

public class Tampilan extends javax.swing.JFrame {
    private DefaultTableModel karyawan;
    private DefaultTableModel proyek;
    private DefaultTableModel transaksi;
    private JTextField p_peran;  
    private KantorDAO kantorDAO = new KantorDAO();
    

    public Tampilan() {
        initComponents();

        karyawan = new DefaultTableModel(new String[] {"ID", "Nama", "Jabatan", "Departemen"}, 0);
        transaksi = new DefaultTableModel(new String[] {"ID Transaksi", "ID Karyawan", "ID Proyek", "Peran"}, 0);
        proyek = new DefaultTableModel(new String[] {"ID", "Nama Proyek", "Waktu Pengerjaan"}, 0);
        jTableKaryawan.setModel(karyawan);
        peran = new JTextField(20);
        loadKaryawanData();
        loadKaryawanComboBox();
        loadProyekComboBox();
        loadDataTransaksi();       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        departemen = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        jabatan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableKaryawan = new javax.swing.JTable();
        HapusKaryawan = new javax.swing.JButton();
        TambahKaryawan = new javax.swing.JButton();
        EditKaryawan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        durasi_pengerjaan = new javax.swing.JTextField();
        id2 = new javax.swing.JTextField();
        nama_proyek = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProyek = new javax.swing.JTable();
        TambahProyek = new javax.swing.JButton();
        EditProyek = new javax.swing.JButton();
        HapusProyek = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        peran = new javax.swing.JTextField();
        id_proyek = new javax.swing.JComboBox<>();
        id_karyawan = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableTransaksi = new javax.swing.JTable();
        TambahTransaksi = new javax.swing.JButton();
        EditTransaksi = new javax.swing.JButton();
        HapusTransaksi = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        id_transaksi = new javax.swing.JTextField();
        ID = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jTabbedPane1.setBackground(new java.awt.Color(153, 204, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));

        jPanel6.setBackground(new java.awt.Color(153, 204, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(153, 204, 255));

        jLabel6.setFont(new java.awt.Font("Wide Latin", 1, 14)); // NOI18N
        jLabel6.setText("Data Karyawan");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(63, 63, 63))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 210, 30));

        jLabel7.setFont(new java.awt.Font("Bodoni Bk BT", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Departemen:");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        jLabel8.setFont(new java.awt.Font("Bodoni Bk BT", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID:");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        jLabel9.setFont(new java.awt.Font("Bodoni Bk BT", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nama Pekerja:");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, 20));

        jLabel10.setFont(new java.awt.Font("Bodoni Bk BT", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Jabatan Pekerja:");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));
        jPanel6.add(departemen, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 280, 30));
        jPanel6.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 172, 180, 30));
        jPanel6.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 280, 30));
        jPanel6.add(jabatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 280, 30));

        jScrollPane1.setBackground(new java.awt.Color(153, 204, 255));
        jScrollPane1.setToolTipText("");

        jTableKaryawan.setBackground(new java.awt.Color(153, 204, 255));
        jTableKaryawan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableKaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Jabatan", "Departemen"
            }
        ));
        jScrollPane1.setViewportView(jTableKaryawan);
        if (jTableKaryawan.getColumnModel().getColumnCount() > 0) {
            jTableKaryawan.getColumnModel().getColumn(3).setHeaderValue("Departemen");
        }

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 370, 230));

        HapusKaryawan.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        HapusKaryawan.setText("Hapus");
        HapusKaryawan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        HapusKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusKaryawanActionPerformed(evt);
            }
        });
        jPanel6.add(HapusKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 70, -1));

        TambahKaryawan.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        TambahKaryawan.setText("Tambah");
        TambahKaryawan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TambahKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahKaryawanActionPerformed(evt);
            }
        });
        jPanel6.add(TambahKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 80, -1));

        EditKaryawan.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        EditKaryawan.setText("Edit");
        EditKaryawan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EditKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditKaryawanActionPerformed(evt);
            }
        });
        jPanel6.add(EditKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 60, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasikantor/Wallpaper kantor.png"))); // NOI18N
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 920, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Karyawan", jPanel3);

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(153, 204, 255));

        jLabel11.setFont(new java.awt.Font("Wide Latin", 1, 14)); // NOI18N
        jLabel11.setText("Data Proyek");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(46, 46, 46))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 200, 30));

        jLabel12.setFont(new java.awt.Font("Bodoni Bk BT", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ID:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jLabel13.setFont(new java.awt.Font("Bodoni Bk BT", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Waktu Pengerjaan:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        jLabel14.setFont(new java.awt.Font("Bodoni Bk BT", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Nama Proyek:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));
        jPanel4.add(durasi_pengerjaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 280, 30));
        jPanel4.add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 180, 30));
        jPanel4.add(nama_proyek, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 280, 30));

        jScrollPane2.setBackground(new java.awt.Color(153, 204, 255));
        jScrollPane2.setToolTipText("");

        jTableProyek.setBackground(new java.awt.Color(153, 204, 255));
        jTableProyek.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableProyek.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nama Proyek", "Waktu Pengerjaan"
            }
        ));
        jScrollPane2.setViewportView(jTableProyek);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 370, 230));

        TambahProyek.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        TambahProyek.setText("Tambah");
        TambahProyek.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TambahProyek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahProyekActionPerformed(evt);
            }
        });
        jPanel4.add(TambahProyek, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 80, -1));

        EditProyek.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        EditProyek.setText("Edit");
        EditProyek.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EditProyek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditProyekActionPerformed(evt);
            }
        });
        jPanel4.add(EditProyek, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 60, -1));

        HapusProyek.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        HapusProyek.setText("Hapus");
        HapusProyek.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        HapusProyek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusProyekActionPerformed(evt);
            }
        });
        jPanel4.add(HapusProyek, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 70, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasikantor/Wallpaper kantor.png"))); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 920, -1));

        jTabbedPane1.addTab("Proyek", jPanel4);

        jPanel5.setBackground(new java.awt.Color(153, 204, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(153, 204, 255));

        jLabel15.setFont(new java.awt.Font("Wide Latin", 1, 14)); // NOI18N
        jLabel15.setText("Transaksi");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addContainerGap())
        );

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 200, 30));

        jLabel17.setFont(new java.awt.Font("Bodoni Bk BT", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Peran:");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        jLabel18.setFont(new java.awt.Font("Bodoni Bk BT", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Karyawan:");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jLabel19.setFont(new java.awt.Font("Bodoni Bk BT", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Proyek:");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));
        jPanel5.add(peran, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 160, 30));

        id_proyek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilihan --", "Item 2", "Item 3", "Item 4" }));
        jPanel5.add(id_proyek, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 160, 30));

        id_karyawan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilihan --", "Item 2", "Item 3", "Item 4" }));
        jPanel5.add(id_karyawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 160, 30));

        jScrollPane3.setBackground(new java.awt.Color(153, 204, 255));
        jScrollPane3.setToolTipText("");

        jTableTransaksi.setBackground(new java.awt.Color(153, 204, 255));
        jTableTransaksi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Tansaksi", "ID Karyawan", "ID Proyek", "Peran"
            }
        ));
        jScrollPane3.setViewportView(jTableTransaksi);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 370, 230));

        TambahTransaksi.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        TambahTransaksi.setText("Tambah");
        TambahTransaksi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TambahTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahTransaksiActionPerformed(evt);
            }
        });
        jPanel5.add(TambahTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 80, -1));

        EditTransaksi.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        EditTransaksi.setText("Edit");
        EditTransaksi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(EditTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 60, -1));

        HapusTransaksi.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        HapusTransaksi.setText("Hapus");
        HapusTransaksi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        HapusTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusTransaksiActionPerformed(evt);
            }
        });
        jPanel5.add(HapusTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 70, -1));

        jLabel16.setFont(new java.awt.Font("Bodoni Bk BT", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ID:");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));
        jPanel5.add(id_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 180, 30));

        ID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasikantor/Wallpaper kantor.png"))); // NOI18N
        jPanel5.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 920, -1));

        jTabbedPane1.addTab("Transaksi Proyek", jPanel5);

        jPanel2.setBackground(new java.awt.Color(71, 169, 226));

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Aplikasi Management Proyek");
        jPanel2.add(jLabel1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     private void loadKaryawanComboBox() {
        try {
            List<Karyawan> karyawanList = kantorDAO.getAllKaryawan(); 
            id_karyawan.removeAllItems(); 

            id_karyawan.addItem("Pilih Karyawan");
            
            for (Karyawan karyawan : karyawanList) {
                String item = karyawan.getId() + " - " + karyawan.getNama();
                id_karyawan.addItem(item);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, 
                "Error loading employee data into combo box: " + e.getMessage(),
                "Database Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadKaryawanData() {
        try {
            List<Karyawan> karyawanList = kantorDAO.getAllKaryawan();

            while (karyawan.getRowCount() > 0) {
                karyawan.removeRow(0);
            }

            for (Karyawan karyawanObj : karyawanList) {
                karyawan.addRow(new Object[]{
                    karyawanObj.getId(),
                    karyawanObj.getNama(),
                    karyawanObj.getJabatan(),
                    karyawanObj.getDepartemen()
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, 
                "Error loading employee data: " + e.getMessage(),
                "Database Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    private int getSelectedKaryawanId() {
        String selected = (String) id_karyawan.getSelectedItem();
        if (selected != null && !selected.equals("Pilih Karyawan")) {
            try {
                return Integer.parseInt(selected.split(" - ")[0]);
            } catch (NumberFormatException e) {
                return -1;
            }
        }
        return -1;
    }
        
            private void loadProyekComboBox() {
        try {
            List<Proyek> proyekList = kantorDAO.getProyek(); 
            id_proyek.removeAllItems();

            for (Proyek proyek : proyekList) {
                id_proyek.addItem(proyek.getId2() + " - " + proyek.getNama_proyek());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading project data into combo box: " + e.getMessage());
        }
    }
    
    private void loadProyekData() {
        try {
            List<Proyek> proyekList = kantorDAO.getProyek(); 
            proyek.setRowCount(0);

            for (Proyek proyekObj : proyekList) {
                proyek.addRow(new Object[]{
                    proyekObj.getId2(),
                    proyekObj.getNama_proyek(),
                    proyekObj.getDurasi_pengerjaan()
                });
            }

            jTableProyek.setModel(proyek); 

            loadProyekComboBox();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading projects: " + e.getMessage());
        }
    }
    
    private void TambahKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahKaryawanActionPerformed
        String val_nama_karyawan = nama.getText().trim();
        String val_jabatan = jabatan.getText().toString();
        String val_departemen = departemen.getText().trim();

        if (val_nama_karyawan.isEmpty() || val_departemen.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama dan Departemen tidak boleh kosong!");
            return;
        }

        Karyawan karyawanObj = new Karyawan(0, val_nama_karyawan, val_jabatan, val_departemen);

        try {
            kantorDAO.insertKaryawan(karyawanObj);
            JOptionPane.showMessageDialog(this, "Karyawan berhasil ditambahkan!");

            loadKaryawanData();
            loadKaryawanComboBox();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error adding employee: " + e.getMessage());
        }
    }//GEN-LAST:event_TambahKaryawanActionPerformed

    private void HapusKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusKaryawanActionPerformed
       int selectedRow = jTableKaryawan.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih karyawan yang ingin dihapus!");
            return;
        }

        int karyawanId = (int) jTableKaryawan.getValueAt(selectedRow, 0);

        try {
            kantorDAO.deleteKaryawan(karyawanId);
            JOptionPane.showMessageDialog(this, "Karyawan berhasil dihapus!");

            loadKaryawanData();
            loadKaryawanComboBox();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error deleting employee: " + e.getMessage());
        }
    }//GEN-LAST:event_HapusKaryawanActionPerformed

    private void EditKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditKaryawanActionPerformed
        int selectedRow = jTableKaryawan.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih karyawan yang ingin diedit!");
            return;
        }

        int karyawanId = (int) jTableKaryawan.getValueAt(selectedRow, 0);
        String updatedNama = nama.getText().trim();
        String updatedJabatan = jabatan.getText().toString();
        String updatedDepartemen = departemen.getText().trim();

        if (updatedNama.isEmpty() || updatedDepartemen.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama dan Departemen tidak boleh kosong!");
            return;
        }

        Karyawan updatedKaryawan = new Karyawan(karyawanId, updatedNama, updatedJabatan, updatedDepartemen);

        try {
            kantorDAO.updateKaryawan(updatedKaryawan);
            JOptionPane.showMessageDialog(this, "Karyawan berhasil diperbarui!");

            loadKaryawanData();
            loadKaryawanComboBox();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error updating employee: " + e.getMessage());
        }
    }//GEN-LAST:event_EditKaryawanActionPerformed

    private void TambahProyekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahProyekActionPerformed
        String namaProyek = nama_proyek.getText().trim();
        String durasiText = durasi_pengerjaan.getText().trim();

        if (namaProyek.isEmpty() || durasiText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama Proyek dan Durasi tidak boleh kosong!");
            return;
        }

        int durasiPengerjaan;
        try {
            durasiPengerjaan = Integer.parseInt(durasiText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Durasi harus berupa angka!");
            return;
        }

        Proyek proyekObj = new Proyek(0, namaProyek, durasiPengerjaan);

        try {
            kantorDAO.insertProyek(proyekObj);
            JOptionPane.showMessageDialog(this, "Proyek berhasil ditambahkan!");
            loadProyekData(); // Refresh both table and combo box
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error adding project: " + e.getMessage());
        }
    }//GEN-LAST:event_TambahProyekActionPerformed

    private void EditProyekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditProyekActionPerformed
        int selectedRow = jTableProyek.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih proyek yang ingin diedit!");
            return;
        }

        int proyekId = (int) jTableProyek.getValueAt(selectedRow, 0);
        String updatedNamaProyek = nama_proyek.getText().trim();
        String updatedDurasiText = durasi_pengerjaan.getText().trim();

        if (updatedNamaProyek.isEmpty() || updatedDurasiText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama Proyek dan Durasi tidak boleh kosong!");
            return;
        }

        int updatedDurasiPengerjaan;
        try {
            updatedDurasiPengerjaan = Integer.parseInt(updatedDurasiText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Durasi harus berupa angka!");
            return;
        }

        Proyek updatedProyek = new Proyek(proyekId, updatedNamaProyek, updatedDurasiPengerjaan);

    try {
        kantorDAO.EditProyek(updatedProyek);
            JOptionPane.showMessageDialog(this, "Proyek berhasil diperbarui!");
            loadProyekData(); // Refresh both table and combo box
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error updating project: " + e.getMessage());
        }
    }//GEN-LAST:event_EditProyekActionPerformed

    private void HapusProyekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusProyekActionPerformed
       int selectedRow = jTableProyek.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih proyek yang ingin dihapus!");
            return;
        }

        int proyekId = (int) jTableProyek.getValueAt(selectedRow, 0);

    try {
        kantorDAO.HapusProyek(proyekId);
            JOptionPane.showMessageDialog(this, "Proyek berhasil dihapus!");
            loadProyekData();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error deleting project: " + e.getMessage());
    }
    }//GEN-LAST:event_HapusProyekActionPerformed
    // tab transaksi
 
    private void addKaryawanToTransaksi() {
        int karyawanId = getSelectedKaryawanId();
        String karyawanNama = (String) id_karyawan.getSelectedItem();

        if (karyawanId != -1) {
            String namaKaryawan = karyawanNama.split(" - ")[1];

            DefaultTableModel transaksiModel = (DefaultTableModel) jTableTransaksi.getModel();
            transaksiModel.addRow(new Object[]{
                karyawanId,
                namaKaryawan
            });

            JOptionPane.showMessageDialog(this, "Karyawan berhasil ditambahkan ke transaksi.");
        } else {
            JOptionPane.showMessageDialog(this, "Silakan pilih karyawan terlebih dahulu.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void addProyekToTransaksi() {
        String selectedProyek = (String) id_proyek.getSelectedItem();

        if (selectedProyek != null && !selectedProyek.equals("Pilih Proyek")) {

            int proyekId = Integer.parseInt(selectedProyek.split(" - ")[0]);
            String proyekNama = selectedProyek.split(" - ")[1];

            DefaultTableModel transaksiModel = (DefaultTableModel) jTableTransaksi.getModel();
            transaksiModel.addRow(new Object[]{
                proyekId,
                proyekNama
            });

            JOptionPane.showMessageDialog(this, "Proyek berhasil ditambahkan ke transaksi.");
        } else {
            JOptionPane.showMessageDialog(this, "Silakan pilih proyek terlebih dahulu.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void loadDataTransaksi() {
        DefaultTableModel model = (DefaultTableModel) jTableTransaksi.getModel();
        model.setRowCount(0); 

        String sql = "SELECT id_transaksi, id_karyawan, id_proyek, peran FROM tb_transaksi2"; 

        try (Connection conn = KantorDAO.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                int idTransaksi = rs.getInt("id_transaksi");
                int idKaryawan = rs.getInt("id_karyawan");
                int idProyek = rs.getInt("id_proyek");
                String peran = rs.getString("peran");
            
                model.addRow(new Object[]{idTransaksi, idKaryawan, idProyek, peran});
//                jTableProyek.setModel(transaksi); 
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading transaction data: " + e.getMessage());
        }
    }

    private void tambahTransaksi() {
        String idTransaksi = id_transaksi.getText().trim();
        String selectedKaryawan = id_karyawan.getSelectedItem() != null ? id_karyawan.getSelectedItem().toString() : null;
        String selectedProyek = id_proyek.getSelectedItem() != null ? id_proyek.getSelectedItem().toString() : null;
        String peranValue = peran.getText().trim();

        try {
            Integer idKaryawan = Integer.parseInt(selectedKaryawan.split(" - ")[0].trim());
            Integer idProyek = Integer.parseInt(selectedProyek.split(" - ")[0].trim());

            String sql = "INSERT INTO tb_transaksi2 (id_transaksi, id_karyawan, id_proyek, peran) VALUES (?, ?, ?, ?)";

            try (Connection conn = KantorDAO.getConnection();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {

                pstmt.setInt(1, Integer.parseInt(idTransaksi));
                pstmt.setInt(2, idKaryawan);
                pstmt.setInt(3, idProyek);
                pstmt.setString(4, peranValue);

                int rowsInserted = pstmt.executeUpdate();
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Transaksi berhasil ditambahkan!");
                    loadDataTransaksi();
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal menambahkan transaksi.");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error inserting transaction: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Format ID Transaksi, Karyawan, atau Proyek tidak valid.");
        }
    }

    private void deleteTransaksi() {
       String idTransaksi = id_transaksi.getText();

       if (idTransaksi.isEmpty()) {
           JOptionPane.showMessageDialog(this, "ID Transaksi tidak boleh kosong.");
           return;
       }

       String sql = "DELETE FROM tb_transaksi2 WHERE id_transaksi = ?";

       try (Connection conn = KantorDAO.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {

           pstmt.setInt(1, Integer.parseInt(idTransaksi));

           int rowsAffected = pstmt.executeUpdate();
           if (rowsAffected > 0) {
               JOptionPane.showMessageDialog(this, "Transaksi berhasil dihapus!");
               loadDataTransaksi();
           } else {
               JOptionPane.showMessageDialog(this, "Transaksi tidak ditemukan.");
           }

       } catch (SQLException e) {
           e.printStackTrace(); 
           JOptionPane.showMessageDialog(this, "Gagal menghapus transaksi: " + e.getMessage());
       } catch (NumberFormatException e) {
           JOptionPane.showMessageDialog(this, "Format ID Transaksi tidak valid.");
       }
   }
    private void TambahTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahTransaksiActionPerformed
        
        
        addKaryawanToTransaksi();
        tambahTransaksi();
        addProyekToTransaksi();
    }//GEN-LAST:event_TambahTransaksiActionPerformed

    private void HapusTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusTransaksiActionPerformed
        deleteTransaksi();
    }//GEN-LAST:event_HapusTransaksiActionPerformed
private void resetForm() {
    id_transaksi.setText("");
    peran.setText("");
    id_karyawan.setSelectedIndex(0);
    id_proyek.setSelectedIndex(0);
    
    loadKaryawanComboBox();
    loadProyekComboBox();
    loadKaryawanData();
    loadProyekData();
}
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
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tampilan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditKaryawan;
    private javax.swing.JButton EditProyek;
    private javax.swing.JButton EditTransaksi;
    private javax.swing.JButton HapusKaryawan;
    private javax.swing.JButton HapusProyek;
    private javax.swing.JButton HapusTransaksi;
    private javax.swing.JLabel ID;
    private javax.swing.JButton TambahKaryawan;
    private javax.swing.JButton TambahProyek;
    private javax.swing.JButton TambahTransaksi;
    private javax.swing.JTextField departemen;
    private javax.swing.JTextField durasi_pengerjaan;
    private javax.swing.JTextField id;
    private javax.swing.JTextField id2;
    private javax.swing.JComboBox<String> id_karyawan;
    private javax.swing.JComboBox<String> id_proyek;
    private javax.swing.JTextField id_transaksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableKaryawan;
    private javax.swing.JTable jTableProyek;
    private javax.swing.JTable jTableTransaksi;
    private javax.swing.JTextField jabatan;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nama_proyek;
    private javax.swing.JTextField peran;
    // End of variables declaration//GEN-END:variables
}
