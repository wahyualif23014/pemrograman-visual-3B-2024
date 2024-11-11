package modul5;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class manajemen extends javax.swing.JFrame {
    Connection conn;
    private DefaultTableModel modelKaryawan;
    private DefaultTableModel modelProyek;
    private DefaultTableModel modelTransaksiProyek;
    
    public manajemen() {
        initComponents();
        conn = koneksi.getConnection();

        modelKaryawan = new DefaultTableModel(new String[]{"ID", "NAMA", "JABATAN", "DEPARTEMEN"}, 0);
        jtkaryawan.setModel(modelKaryawan);
        loadDataKaryawan();     
        modelProyek = new DefaultTableModel(new String[]{"ID", "NAMA PROYEK", "DURASI PENGERJAAN (per minggu)"}, 0);
        jtproyek.setModel(modelProyek);   
        loadDataProyek();
        modelTransaksiProyek = new DefaultTableModel(new String[] { "ID KARYAWAN", "ID PROYEK", "NAMA KARYAWAN", "PERAN",  "PROYEK", "DURASI " }, 0);
        jttransaksi.setModel(modelTransaksiProyek);
        loadDataTransaksi();
        loadComboBoxKaryawan();
        loadComboBoxProyek();
        modelKaryawan.addTableModelListener(new TableModelListener() {
           @Override
           public void tableChanged(TableModelEvent e) {
               if (e.getType() == TableModelEvent.UPDATE || e.getType() == TableModelEvent.INSERT || e.getType() == TableModelEvent.DELETE) {
                   loadDataTransaksi();  
               }
           }
       });
       modelProyek.addTableModelListener(new TableModelListener() {
         @Override
         public void tableChanged(TableModelEvent e) {
             if (e.getType() == TableModelEvent.UPDATE || e.getType() == TableModelEvent.INSERT || e.getType() == TableModelEvent.DELETE) {
                 loadDataTransaksi();  
             }
         }
     });      
    }
    private void loadDataKaryawan() {
        modelKaryawan.setRowCount(0);     
    try {
      String sql = "SELECT * FROM karyawan";
      PreparedStatement ps = conn.prepareStatement(sql);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
         // Menambahkan baris ke dalam model tabel
         modelKaryawan.addRow(new Object[]{
         rs.getInt("id"),
         rs.getString("nama"),
         rs.getString("jabatan"),
         rs.getString("departemen")
       });
      }
    } catch (SQLException e) {
        System.out.println("gagal menyimpan data" + e.getMessage());
        }
    }
    
    private void loadDataProyek() {
        modelProyek.setRowCount(0);       
    try {
      String sql = "SELECT * FROM proyek";
      PreparedStatement ps = conn.prepareStatement(sql);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
         // Menambahkan baris ke dalam model tabel
         modelProyek.addRow(new Object[]{
         rs.getInt("id"),
         rs.getString("nama_proyek"),
         rs.getInt("durasi_pengerjaan")
       });
      }
    } catch (SQLException e) {
        System.out.println("gagal menyimpan data" + e.getMessage());
        }
    } 
    
    private void loadDataTransaksi() {
       modelTransaksiProyek.setRowCount(0);
        try {
            String sql = "SELECT t.id_karyawan, t.id_proyek, t.peran, " +
                         "k.nama AS nama, p.nama_proyek AS nama_proyek, " +
                         "p.durasi_pengerjaan " +
                         "FROM transaksiproyek t " +
                         "JOIN karyawan k ON t.id_karyawan = k.id " +
                         "JOIN proyek p ON t.id_proyek = p.id";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

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
            System.out.println("gagal menyimpan data: " + e.getMessage());
        }
        }
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
        System.out.println("tidak bisa memuat data karyawan: " + e.getMessage());
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
        System.out.println("tidak bisa memuat data karyawan: " + e.getMessage());
    }
}
    private int getSelectedId(String textComboBox) {
        if (textComboBox == null) return -1;
        try {
            String idPart = textComboBox.substring(textComboBox.indexOf("ID: ") + 4);
            return Integer.parseInt(idPart.substring(0, idPart.indexOf(" -")));
        } catch (Exception e) {
            System.out.println("kesalahan dalam mengambil id: " + e.getMessage());
            return -1;
        }
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton6 = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfnama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfjabatan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfdepartemen = new javax.swing.JTextField();
        jbtambah = new javax.swing.JButton();
        jbedit = new javax.swing.JButton();
        jbdelete = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtkaryawan = new javax.swing.JTable();
        jbclear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        id_proyek = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        nama_proyek = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        durasi_pengerjaan = new javax.swing.JTextField();
        btntambah = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtproyek = new javax.swing.JTable();
        btnclear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cbkaryawan = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cbproyek = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        tfperan = new javax.swing.JTextField();
        btn_tambah = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jttransaksi = new javax.swing.JTable();
        btn_clear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jButton6.setText("jButton6");

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(242, 239, 176));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tabel Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM));

        jPanel4.setBackground(new java.awt.Color(242, 234, 181));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("ID :");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 15, -1, -1));

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel4.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 12, 177, -1));

        jLabel3.setText("NAMA :");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 15, -1, -1));
        jPanel4.add(tfnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 12, 252, -1));

        jLabel4.setText("JABATAN :");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 49, -1, -1));
        jPanel4.add(tfjabatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 46, 177, -1));

        jLabel5.setText("DEPARTEMEN :");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 49, -1, -1));
        jPanel4.add(tfdepartemen, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 46, 252, -1));

        jbtambah.setText("Tambah");
        jbtambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtambahActionPerformed(evt);
            }
        });
        jPanel4.add(jbtambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 169, -1, -1));

        jbedit.setText("Edit");
        jbedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeditActionPerformed(evt);
            }
        });
        jPanel4.add(jbedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 204, -1, -1));

        jbdelete.setText("Delete");
        jbdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbdeleteActionPerformed(evt);
            }
        });
        jPanel4.add(jbdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 239, -1, -1));

        jtkaryawan.setModel(new javax.swing.table.DefaultTableModel(
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
        jtkaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtkaryawanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtkaryawan);

        jScrollPane3.setViewportView(jScrollPane1);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 76, 746, 380));

        jbclear.setText("Clear");
        jbclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbclearActionPerformed(evt);
            }
        });
        jPanel4.add(jbclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 420, -1, -1));

        jTabbedPane1.addTab("Karyawan", jPanel4);

        jPanel2.setBackground(new java.awt.Color(242, 234, 181));

        jLabel6.setText("ID :");

        jLabel7.setText("NAMA PROYEK :");

        jLabel8.setText("DURASI PENGERJAAN :");

        btntambah.setText("Tambah");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtproyek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtproyekMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jtproyek);

        jScrollPane4.setViewportView(jScrollPane5);

        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(id_proyek)
                    .addComponent(durasi_pengerjaan, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                .addGap(76, 76, 76)
                .addComponent(jLabel7)
                .addGap(26, 26, 26)
                .addComponent(nama_proyek, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(321, 321, 321))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnedit)
                    .addComponent(btntambah)
                    .addComponent(btndelete)
                    .addComponent(btnclear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(id_proyek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(nama_proyek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(durasi_pengerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(btntambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnedit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btndelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnclear)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Proyek", jPanel2);

        jPanel3.setBackground(new java.awt.Color(242, 234, 181));

        jLabel9.setText("KARYAWAN :");

        cbkaryawan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setText("PROYEK :");

        cbproyek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel12.setText("PERAN :");

        btn_tambah.setText("Tambah");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        jttransaksi.setModel(new javax.swing.table.DefaultTableModel(
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
        jttransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jttransaksiMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jttransaksi);

        jScrollPane8.setViewportView(jScrollPane7);

        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbproyek, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(cbkaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel12)
                                .addGap(67, 67, 67)
                                .addComponent(tfperan, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_tambah)
                            .addComponent(btn_edit)
                            .addComponent(btn_delete)
                            .addComponent(btn_clear))))
                .addContainerGap(266, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbkaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(tfperan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbproyek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btn_tambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_clear))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Transaksi Proyek", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 900, 540));

        jPanel1.setBackground(new java.awt.Color(215, 190, 140));

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel1.setText("APLIKASI MANAJEMEN KARYAWAN DAN PROYEK");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//DELETE PROYEK
    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
    try  {
          String sql = "DELETE FROM proyek WHERE id = ?";
          PreparedStatement ps = conn.prepareStatement(sql);
          ps.setInt(1, Integer.parseInt(id_proyek.getText()));
          ps.executeUpdate();
          JOptionPane.showMessageDialog(this, "data berhasil dihapus");
          loadDataProyek();
          loadComboBoxProyek();
          id_proyek.setText("");
          nama_proyek.setText("");
          durasi_pengerjaan.setText("");
          btntambah.setEnabled(true);
          btnedit.setEnabled(true);
          btndelete.setEnabled(true);
     } catch (SQLException e) {
          System.out.println("gagal menyimpan data" + e.getMessage());
      }    }//GEN-LAST:event_btndeleteActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed
//TAMBAH KARYAWAN
    private void jbtambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtambahActionPerformed
    try { String nama = tfnama.getText();
          String jabatan = tfjabatan.getText();
          String departemen = tfdepartemen.getText();
          if (nama.isEmpty() || jabatan.isEmpty() || departemen.isEmpty()) { JOptionPane.showMessageDialog(this, "Semua bidang harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE); 
          return; 
          } 
          String sql = "INSERT INTO karyawan (nama, jabatan, departemen) VALUES (?, ?, ?)"; 
          PreparedStatement ps = conn.prepareStatement(sql);
          ps.setString(1, nama); 
          ps.setString(2, jabatan); 
          ps.setString(3, departemen);
          ps.executeUpdate();
          JOptionPane.showMessageDialog(this, "Data berhasil disimpan"); 
          loadDataKaryawan();
          loadComboBoxKaryawan();
          id.setText("");
          tfnama.setText("");
          tfjabatan.setText("");
          tfdepartemen.setText("");
    } catch (SQLException e) {
        System.out.println("gagal menyimpan data" + e.getMessage());
    }
    }//GEN-LAST:event_jbtambahActionPerformed
//edit karayawan
    private void jbeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeditActionPerformed
    try {
          String sql = "UPDATE karyawan SET nama = ?, jabatan = ?, departemen = ? WHERE id = ?";
          PreparedStatement ps = conn.prepareStatement(sql);
          ps.setString(1, tfnama.getText());
          ps.setString(2, tfjabatan.getText());
          ps.setString(3, tfdepartemen.getText());
          ps.setInt(4, Integer.parseInt(id.getText()));
          ps.executeUpdate();
          JOptionPane.showMessageDialog(this, "data berhasil diedit");
          loadDataKaryawan();
          loadComboBoxKaryawan();
          id.setText("");
          tfnama.setText("");
          tfjabatan.setText("");
          tfdepartemen.setText("");
          jbtambah.setEnabled(true);
          jbedit.setEnabled(true);
          jbdelete.setEnabled(true);
      
      }  catch (SQLException e) {
          System.out.println("gagal mengedit data" + e.getMessage());
      }
    }//GEN-LAST:event_jbeditActionPerformed
//delete karayawan
    private void jbdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbdeleteActionPerformed
    try  {
          String sql = "DELETE FROM karyawan WHERE id = ?";
          PreparedStatement ps = conn.prepareStatement(sql);
          ps.setInt(1, Integer.parseInt(id.getText()));
          ps.executeUpdate();
          JOptionPane.showMessageDialog(this, "data berhasil dihapus");
          loadDataKaryawan();
          loadComboBoxKaryawan();
          id.setText("");
          tfnama.setText("");
          tfjabatan.setText("");
          tfdepartemen.setText("");
          jbtambah.setEnabled(true);
          jbedit.setEnabled(true);
          jbdelete.setEnabled(true);
     } catch (SQLException e) {
          System.out.println("gagal menyimpan data" + e.getMessage());
      }    }//GEN-LAST:event_jbdeleteActionPerformed
    private void jtkaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtkaryawanMouseClicked
      id.setText(jtkaryawan.getValueAt(jtkaryawan.getSelectedRow(), 0).toString());
      tfnama.setText(jtkaryawan.getValueAt(jtkaryawan.getSelectedRow(), 1).toString());
      tfjabatan.setText(jtkaryawan.getValueAt(jtkaryawan.getSelectedRow(), 2).toString());
      tfdepartemen.setText(jtkaryawan.getValueAt(jtkaryawan.getSelectedRow(), 3).toString());
      jbtambah.setEnabled(false);
      jbedit.setEnabled(true);
      jbdelete.setEnabled(true);
      
    }//GEN-LAST:event_jtkaryawanMouseClicked
//TABEL PROYEK
    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
    try {
        String namaProyek = nama_proyek.getText();
        String durasiPengerjaanText = durasi_pengerjaan.getText();
        if (namaProyek.isEmpty() || durasiPengerjaanText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua bidang harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return; 
    }
        int durasiPengerjaan = Integer.parseInt(durasiPengerjaanText);
        
        String sql = "INSERT INTO proyek (nama_proyek, durasi_pengerjaan) VALUES (?, ?)"; 
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, namaProyek); 
        ps.setInt(2, durasiPengerjaan);
        ps.executeUpdate(); JOptionPane.showMessageDialog(this, "Data berhasil ditambah");
        loadDataProyek();
        loadComboBoxProyek();
        id_proyek.setText("");
        nama_proyek.setText("");
        durasi_pengerjaan.setText("");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Durasi pengerjaan harus berupa angka!", "Peringatan", JOptionPane.ERROR_MESSAGE); 
    } catch (SQLException e) { 
        System.out.println("Error Save Data: " + e.getMessage());
        }
    }//GEN-LAST:event_btntambahActionPerformed
    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
    try {
          String sql = "UPDATE proyek SET nama_proyek = ?, durasi_pengerjaan = ? WHERE id = ?";
          PreparedStatement ps = conn.prepareStatement(sql);
          ps.setString(1, nama_proyek.getText());
          ps.setString(2, durasi_pengerjaan.getText());
          ps.setInt(3, Integer.parseInt(id_proyek.getText()));
          ps.executeUpdate();
          JOptionPane.showMessageDialog(this, "data berhasil diedit");
          loadDataProyek();
          loadComboBoxProyek();
          id_proyek.setText("");
          nama_proyek.setText("");
          durasi_pengerjaan.setText("");
          btntambah.setEnabled(true);
          btnedit.setEnabled(true);
          btndelete.setEnabled(true);
      }  catch (SQLException e) {
          System.out.println("gagal menyimpan data" + e.getMessage());
      }    }//GEN-LAST:event_btneditActionPerformed

    private void jtproyekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtproyekMouseClicked
      id_proyek.setText(jtproyek.getValueAt(jtproyek.getSelectedRow(), 0).toString());
      nama_proyek.setText(jtproyek.getValueAt(jtproyek.getSelectedRow(), 1).toString());
      durasi_pengerjaan.setText(jtproyek.getValueAt(jtproyek.getSelectedRow(), 2).toString());
      btntambah.setEnabled(false);
      btnedit.setEnabled(true);
      btndelete.setEnabled(true);
    }//GEN-LAST:event_jtproyekMouseClicked
    private void jbclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbclearActionPerformed
      id.setText("");
      tfnama.setText("");
      tfjabatan.setText("");
      tfdepartemen.setText("");
      jbtambah.setEnabled(true);
      jbedit.setEnabled(true);
      jbdelete.setEnabled(true);
    }//GEN-LAST:event_jbclearActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
      id_proyek.setText("");
      nama_proyek.setText("");
      durasi_pengerjaan.setText("");
      btntambah.setEnabled(true);
      btnedit.setEnabled(true);
      btndelete.setEnabled(true);    }//GEN-LAST:event_btnclearActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
            try {
                if (tfperan.getText().isEmpty()) { 
                    JOptionPane.showMessageDialog(this, "Pilih peran terlebih dahulu", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
            }
                String sql = "INSERT INTO transaksiproyek (id_karyawan, id_proyek, peran) VALUES (?, ?, ?)";
                PreparedStatement ps = conn.prepareStatement(sql);

                int idKaryawan = getSelectedId(cbkaryawan.getSelectedItem().toString());
                int idProyek = getSelectedId(cbproyek.getSelectedItem().toString());

                ps.setInt(1, idKaryawan);
                ps.setInt(2, idProyek);
                ps.setString(3, tfperan.getText());

                int result = ps.executeUpdate();
                if (result > 0) {
                    JOptionPane.showMessageDialog(this, "Data Transaksi berhasil ditambahkan");
                    loadDataTransaksi();
                }
            } catch (SQLException e) {
                System.out.println("Kesalahan Menambah Data Transaksi: " + e.getMessage());
                JOptionPane.showMessageDialog(this, "Gagal menambah data: " + e.getMessage());
            }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
    if (tfperan.getText().isEmpty()) { 
        JOptionPane.showMessageDialog(this, "Peran tidak boleh kosong.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
        }

        String sql = "UPDATE transaksiproyek SET peran = ? WHERE id_karyawan = ? AND id_proyek = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            int idKaryawan = getSelectedId(cbkaryawan.getSelectedItem().toString());
            int idProyek = getSelectedId(cbproyek.getSelectedItem().toString());

            ps.setString(1, tfperan.getText());
            ps.setInt(2, idKaryawan);
            ps.setInt(3, idProyek);

            int affectedRows = ps.executeUpdate(); 
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(this, "Data Transaksi berhasil diperbarui");
                loadDataTransaksi();
            } else {
                JOptionPane.showMessageDialog(this, "Tidak ada data transaksi yang diperbarui. Pastikan ID karyawan dan proyek benar.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Kesalahan Memperbarui Data Transaksi: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);   
    }    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        String sql = "DELETE FROM transaksiproyek WHERE id_karyawan = ? AND id_proyek = ?";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                int idKaryawan = getSelectedId(cbkaryawan.getSelectedItem().toString());
                int idProyek = getSelectedId(cbproyek.getSelectedItem().toString());

                ps.setInt(1, idKaryawan);
                ps.setInt(2, idProyek);

                int affectedRows = ps.executeUpdate(); 
                if (affectedRows > 0) {
                    JOptionPane.showMessageDialog(this, "Data Transaksi berhasil dihapus.");
                    loadDataTransaksi();
                } else {
                    JOptionPane.showMessageDialog(this, "Tidak ada transaksi yang dihapus. Pastikan ID karyawan dan proyek benar.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Kesalahan Menghapus Data Transaksi: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);      
    }    }//GEN-LAST:event_btn_deleteActionPerformed

    private void jttransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jttransaksiMouseClicked
        tfperan.setText(jttransaksi.getValueAt(jttransaksi.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_jttransaksiMouseClicked
    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
      tfperan.setText("");
      btn_tambah.setEnabled(true);
      btn_edit.setEnabled(true);
      btn_delete.setEnabled(true);      }//GEN-LAST:event_btn_clearActionPerformed

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
            java.util.logging.Logger.getLogger(manajemen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manajemen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manajemen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manajemen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manajemen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btntambah;
    private javax.swing.JComboBox<String> cbkaryawan;
    private javax.swing.JComboBox<String> cbproyek;
    private javax.swing.JTextField durasi_pengerjaan;
    private javax.swing.JTextField id;
    private javax.swing.JTextField id_proyek;
    private javax.swing.JButton jButton6;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbclear;
    private javax.swing.JButton jbdelete;
    private javax.swing.JButton jbedit;
    private javax.swing.JButton jbtambah;
    private javax.swing.JTable jtkaryawan;
    private javax.swing.JTable jtproyek;
    private javax.swing.JTable jttransaksi;
    private javax.swing.JTextField nama_proyek;
    private javax.swing.JTextField tfdepartemen;
    private javax.swing.JTextField tfjabatan;
    private javax.swing.JTextField tfnama;
    private javax.swing.JTextField tfperan;
    // End of variables declaration//GEN-END:variables
}
