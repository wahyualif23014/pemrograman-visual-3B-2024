
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class apotek extends javax.swing.JFrame {

    /**
     * Creates new form apotek
     */
    public apotek() {
        initComponents();
        bltengah.removeAll(); 
        bltengah.add(jpbatuk); 
        bltengah.revalidate();
        bltengah.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgbatuk = new javax.swing.ButtonGroup();
        bgperut = new javax.swing.ButtonGroup();
        bgnyeri = new javax.swing.ButtonGroup();
        bgkepala = new javax.swing.ButtonGroup();
        bltengah = new javax.swing.JPanel();
        jpbatuk = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        jpperut = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel27 = new javax.swing.JLabel();
        jpnyeri = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jRadioButton9 = new javax.swing.JRadioButton();
        jLabel30 = new javax.swing.JLabel();
        jpkepala = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jRadioButton11 = new javax.swing.JRadioButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton10 = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jRadioButton12 = new javax.swing.JRadioButton();
        jLabel32 = new javax.swing.JLabel();
        blatas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        blbawah = new javax.swing.JPanel();
        btbatal = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        btreset = new javax.swing.JButton();
        blkanan = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        tfalamat = new javax.swing.JTextField();
        tfjumlah = new javax.swing.JTextField();
        tftotal = new javax.swing.JTextField();
        tfnama = new javax.swing.JTextField();
        blkiri = new javax.swing.JPanel();
        spasi5 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        spasi2 = new javax.swing.JLabel();
        btbatuk = new javax.swing.JButton();
        spasi = new javax.swing.JLabel();
        btperut = new javax.swing.JButton();
        spasi1 = new javax.swing.JLabel();
        btnyeri = new javax.swing.JButton();
        spasi3 = new javax.swing.JLabel();
        btkepala = new javax.swing.JButton();
        spasi4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bltengah.setBackground(new java.awt.Color(0, 204, 255));
        bltengah.setMinimumSize(new java.awt.Dimension(460, 450));

        jpbatuk.setBackground(new java.awt.Color(153, 153, 255));
        jpbatuk.setMinimumSize(new java.awt.Dimension(450, 450));
        jpbatuk.setLayout(new java.awt.GridLayout(3, 1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/1000464617.png"))); // NOI18N
        jpbatuk.add(jLabel6);

        bgbatuk.add(jRadioButton1);
        jRadioButton1.setText("Phenylephrine");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jpbatuk.add(jRadioButton1);

        jLabel18.setText("<html>\n<p>\nDetail: Meredakan hidung tersumbat.<br>Harga: Rp 6.000 per strip\n</P>\n</html>");
        jpbatuk.add(jLabel18);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/1000464616 (1).png"))); // NOI18N
        jpbatuk.add(jLabel7);

        bgbatuk.add(jRadioButton2);
        jRadioButton2.setText("Dextromethorphan ");
        jpbatuk.add(jRadioButton2);

        jLabel20.setText("<html>\n<p>\n Detail: Mengurangi batuk kering.<br> Harga: Rp 15.000 per botol sirup.\n</P>\n</html>");
        jpbatuk.add(jLabel20);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/1000464615.png"))); // NOI18N
        jpbatuk.add(jLabel8);

        bgbatuk.add(jRadioButton3);
        jRadioButton3.setText("Guaifenesin ");
        jpbatuk.add(jRadioButton3);

        jLabel19.setText("<html>\n<p>\n Detail: Membantu mengeluarkan dahak.<br>Harga: Rp 12.000 per botol sirup.\n</P>\n</html>");
        jpbatuk.add(jLabel19);

        jpperut.setBackground(new java.awt.Color(102, 102, 255));
        jpperut.setLayout(new java.awt.GridLayout(3, 1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/1000464611.png"))); // NOI18N
        jpperut.add(jLabel9);

        bgperut.add(jRadioButton4);
        jRadioButton4.setText("Simethicone ");
        jpperut.add(jRadioButton4);

        jLabel21.setText("<html>\n<p>\nDetail: Mengurangi gas dan kembung.<br> Harga: Rp 10.000 \n</P>\n</html>");
        jpperut.add(jLabel21);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/1000464608.png"))); // NOI18N
        jpperut.add(jLabel10);

        bgperut.add(jRadioButton6);
        jRadioButton6.setText("Promag");
        jpperut.add(jRadioButton6);

        jLabel26.setText("<html>\n<p>\nDetail: Netralisir asam lambung, cocok untuk maag.<br>Harga: Rp. 8000\n</P>\n</html>");
        jpperut.add(jLabel26);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/1000464702.png"))); // NOI18N
        jpperut.add(jLabel11);

        bgperut.add(jRadioButton5);
        jRadioButton5.setText("Domperidone ");
        jpperut.add(jRadioButton5);

        jLabel27.setText("<html>\n<p>\nDetail: Mengurangi mual dan kembung.<br>Harga: Rp 10.000 per strip.\n</P>\n</html>");
        jpperut.add(jLabel27);

        jpnyeri.setBackground(new java.awt.Color(102, 0, 255));
        jpnyeri.setLayout(new java.awt.GridLayout(3, 1));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/1000464610.png"))); // NOI18N
        jpnyeri.add(jLabel12);

        bgnyeri.add(jRadioButton7);
        jRadioButton7.setText("Ketoprofen ");
        jpnyeri.add(jRadioButton7);

        jLabel28.setText("<html>\n<p>\n Detail: Obat antiinflamasi yang kuat untuk mengatasi nyeri otot dan peradangan.<br>Harga:  Rp 12.000 per strip.\n</P>\n</html>");
        jpnyeri.add(jLabel28);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/1000464612.png"))); // NOI18N
        jpnyeri.add(jLabel13);

        bgnyeri.add(jRadioButton8);
        jRadioButton8.setText("Piroxicam ");
        jpnyeri.add(jRadioButton8);

        jLabel34.setText("<html>\n<p>\n Detail: obat untuk nyeri otot dan sendi yang parah.<br>Harga: Rp 8.000  per strip.\n</P>\n</html>\n");
        jpnyeri.add(jLabel34);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/1000464613.png"))); // NOI18N
        jpnyeri.add(jLabel14);

        bgnyeri.add(jRadioButton9);
        jRadioButton9.setText("Counterpain ");
        jpnyeri.add(jRadioButton9);

        jLabel30.setText("<html>\n<p>\nDetail: Krim pereda nyeri otot yang memberikan sensasi hangat untuk meredakan otot yang tegang.<br>Harga: Rp 30.000 per tube (15g).\n</P>\n</html>");
        jpnyeri.add(jLabel30);

        jpkepala.setBackground(new java.awt.Color(153, 0, 204));
        jpkepala.setMinimumSize(new java.awt.Dimension(450, 450));
        jpkepala.setLayout(new java.awt.GridLayout(3, 1));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/1000464618.png"))); // NOI18N
        jpkepala.add(jLabel16);

        bgkepala.add(jRadioButton11);
        jRadioButton11.setText("Naproxen ");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });
        jpkepala.add(jRadioButton11);

        jLabel31.setText("<html>\n<p>\nDetail: Obat peradangan untuk sakit kepala lebih berat.<br>Harga: Rp 12.000 per strip.\n</P>\n</html>");
        jpkepala.add(jLabel31);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/1000464562.png"))); // NOI18N
        jpkepala.add(jLabel15);

        bgkepala.add(jRadioButton10);
        jRadioButton10.setText("Aspirin ");
        jpkepala.add(jRadioButton10);

        jLabel33.setText("<html>\n<p>\n Detail: Mengurangi sakit kepala dan peradangan.<br>Harga: Rp 6.000 per strip.\n</P>\n</html>");
        jpkepala.add(jLabel33);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/1000464710.png"))); // NOI18N
        jpkepala.add(jLabel17);

        bgkepala.add(jRadioButton12);
        jRadioButton12.setText("Paracetamol");
        jpkepala.add(jRadioButton12);

        jLabel32.setText("<html>\n<p>\nDetail: Meredakan sakit kepala ringan hingga sedang.<br>Harga: Rp 5.000 per strip.\n</P>\n</html>");
        jpkepala.add(jLabel32);

        javax.swing.GroupLayout bltengahLayout = new javax.swing.GroupLayout(bltengah);
        bltengah.setLayout(bltengahLayout);
        bltengahLayout.setHorizontalGroup(
            bltengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpbatuk, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
            .addGroup(bltengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpperut, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))
            .addGroup(bltengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpnyeri, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))
            .addGroup(bltengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpkepala, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))
        );
        bltengahLayout.setVerticalGroup(
            bltengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpbatuk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bltengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpperut, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE))
            .addGroup(bltengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpnyeri, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE))
            .addGroup(bltengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpkepala, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE))
        );

        getContentPane().add(bltengah, java.awt.BorderLayout.CENTER);

        blatas.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/obat.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/orang.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel3.setText("SELAMAT DATANG DI APOTEK MINI");

        jLabel4.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jLabel4.setText("\"Kesehatan Anda, Prioritas Kami!\"");

        javax.swing.GroupLayout blatasLayout = new javax.swing.GroupLayout(blatas);
        blatas.setLayout(blatasLayout);
        blatasLayout.setHorizontalGroup(
            blatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blatasLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(blatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blatasLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blatasLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(100, 100, 100)))
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        blatasLayout.setVerticalGroup(
            blatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blatasLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(blatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(blatasLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(blatasLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        getContentPane().add(blatas, java.awt.BorderLayout.PAGE_START);

        blbawah.setBackground(new java.awt.Color(0, 204, 255));

        btbatal.setText("Batal");
        btbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbatalActionPerformed(evt);
            }
        });

        jButton14.setText("Beli");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        btreset.setText("Reset");
        btreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout blbawahLayout = new javax.swing.GroupLayout(blbawah);
        blbawah.setLayout(blbawahLayout);
        blbawahLayout.setHorizontalGroup(
            blbawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blbawahLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(btbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btreset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 257, Short.MAX_VALUE)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        blbawahLayout.setVerticalGroup(
            blbawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blbawahLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(blbawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btreset, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        getContentPane().add(blbawah, java.awt.BorderLayout.PAGE_END);

        blkanan.setBackground(new java.awt.Color(0, 204, 255));
        blkanan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setText("Alamat:");
        blkanan.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel23.setText("Jumlah:");
        blkanan.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel24.setText("Total:");
        blkanan.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel25.setText("Nama:");
        blkanan.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        tfalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfalamatActionPerformed(evt);
            }
        });
        blkanan.add(tfalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 100, -1));

        tfjumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfjumlahActionPerformed(evt);
            }
        });
        blkanan.add(tfjumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 100, -1));

        tftotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tftotalActionPerformed(evt);
            }
        });
        blkanan.add(tftotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 100, -1));

        tfnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnamaActionPerformed(evt);
            }
        });
        blkanan.add(tfnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 100, -1));

        getContentPane().add(blkanan, java.awt.BorderLayout.LINE_END);

        blkiri.setBackground(new java.awt.Color(0, 204, 255));
        blkiri.setAutoscrolls(true);
        blkiri.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        blkiri.setLayout(new javax.swing.BoxLayout(blkiri, javax.swing.BoxLayout.Y_AXIS));

        spasi5.setText(" ");
        blkiri.add(spasi5);

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel5.setText("<html> <p>&nbsp;&nbsp;&nbsp;&nbsp;pilih gejala yang <br>&nbsp;&nbsp;&nbsp;&nbsp; anda alami :</p> </html>");
        jLabel5.setAlignmentX(0.3F);
        jLabel5.setMaximumSize(new java.awt.Dimension(2147483647, 34));
        blkiri.add(jLabel5);

        spasi2.setText(" ");
        blkiri.add(spasi2);

        btbatuk.setBackground(new java.awt.Color(153, 153, 255));
        btbatuk.setText("batuk / pilek");
        btbatuk.setMargin(new java.awt.Insets(20, 10, 20, 20));
        btbatuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbatukActionPerformed(evt);
            }
        });
        blkiri.add(btbatuk);

        spasi.setText(" ");
        blkiri.add(spasi);

        btperut.setBackground(new java.awt.Color(102, 102, 255));
        btperut.setText("sakit perut");
        btperut.setMargin(new java.awt.Insets(20, 10, 20, 30));
        btperut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btperutActionPerformed(evt);
            }
        });
        blkiri.add(btperut);

        spasi1.setText(" ");
        blkiri.add(spasi1);

        btnyeri.setBackground(new java.awt.Color(102, 51, 255));
        btnyeri.setText("nyeri otot");
        btnyeri.setMargin(new java.awt.Insets(20, 10, 20, 34));
        btnyeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnyeriActionPerformed(evt);
            }
        });
        blkiri.add(btnyeri);

        spasi3.setText(" ");
        blkiri.add(spasi3);

        btkepala.setBackground(new java.awt.Color(153, 0, 204));
        btkepala.setText("sakit kepala");
        btkepala.setMargin(new java.awt.Insets(20, 10, 20, 25));
        btkepala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkepalaActionPerformed(evt);
            }
        });
        blkiri.add(btkepala);

        spasi4.setText(" ");
        blkiri.add(spasi4);

        getContentPane().add(blkiri, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btbatukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbatukActionPerformed
        // TODO add your handling code here:
        bltengah.removeAll();
        bltengah.repaint();
        bltengah.revalidate();
        
//        memunculkan panelnya
        bltengah.add(jpbatuk);
        bltengah.repaint();
        bltengah.revalidate();
    }//GEN-LAST:event_btbatukActionPerformed

    private void btperutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btperutActionPerformed
        // TODO add your handling code here:
        bltengah.removeAll();
        bltengah.repaint();
        bltengah.revalidate();
        
//        memunculkan panelnya
        bltengah.add(jpperut);
        bltengah.repaint();
        bltengah.revalidate();
    }//GEN-LAST:event_btperutActionPerformed

    private void btnyeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnyeriActionPerformed
        // TODO add your handling code here:
        bltengah.removeAll();
        bltengah.repaint();
        bltengah.revalidate();
        
//        memunculkan panelnya
        bltengah.add(jpnyeri);
        bltengah.repaint();
        bltengah.revalidate();
    }//GEN-LAST:event_btnyeriActionPerformed

    private void btkepalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkepalaActionPerformed
        // TODO add your handling code here:
        bltengah.removeAll();
        bltengah.repaint();
        bltengah.revalidate();
        
//        memunculkan panelnya
        bltengah.add(jpkepala);
        bltengah.repaint();
        bltengah.revalidate();
    }//GEN-LAST:event_btkepalaActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void tfalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfalamatActionPerformed

    private void tfjumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfjumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfjumlahActionPerformed

    private void tftotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tftotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tftotalActionPerformed

    private void tfnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnamaActionPerformed

    private void btbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbatalActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btbatalActionPerformed

    private void btresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btresetActionPerformed
        // TODO add your handling code here:
        int hasil;
         hasil = JOptionPane.showConfirmDialog(null,  "anda yakin akan mereset halaman ini?");
        if(hasil == JOptionPane.YES_OPTION){
            System.out.println("Yes!");
            bgkepala.clearSelection();
            bgperut.clearSelection();
            bgnyeri.clearSelection();
            bgbatuk.clearSelection();
            
            tfjumlah.setText("");
            tftotal.setText("");
            tfnama.setText("");
            tfalamat.setText("");
            
        }else if(hasil == JOptionPane.NO_OPTION){
            System.out.println("No!");
        }else if(hasil == JOptionPane.CANCEL_OPTION){
            System.out.println("Cancel!");
        }
    }//GEN-LAST:event_btresetActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,  "Pembelian Berhasil!");
    }//GEN-LAST:event_jButton14ActionPerformed

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
            java.util.logging.Logger.getLogger(apotek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(apotek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(apotek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(apotek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new apotek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgbatuk;
    private javax.swing.ButtonGroup bgkepala;
    private javax.swing.ButtonGroup bgnyeri;
    private javax.swing.ButtonGroup bgperut;
    private javax.swing.JPanel blatas;
    private javax.swing.JPanel blbawah;
    private javax.swing.JPanel blkanan;
    private javax.swing.JPanel blkiri;
    private javax.swing.JPanel bltengah;
    private javax.swing.JButton btbatal;
    private javax.swing.JButton btbatuk;
    private javax.swing.JButton btkepala;
    private javax.swing.JButton btnyeri;
    private javax.swing.JButton btperut;
    private javax.swing.JButton btreset;
    private javax.swing.JButton jButton14;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JPanel jpbatuk;
    private javax.swing.JPanel jpkepala;
    private javax.swing.JPanel jpnyeri;
    private javax.swing.JPanel jpperut;
    private javax.swing.JLabel spasi;
    private javax.swing.JLabel spasi1;
    private javax.swing.JLabel spasi2;
    private javax.swing.JLabel spasi3;
    private javax.swing.JLabel spasi4;
    private javax.swing.JLabel spasi5;
    private javax.swing.JTextField tfalamat;
    private javax.swing.JTextField tfjumlah;
    private javax.swing.JTextField tfnama;
    private javax.swing.JTextField tftotal;
    // End of variables declaration//GEN-END:variables
}
