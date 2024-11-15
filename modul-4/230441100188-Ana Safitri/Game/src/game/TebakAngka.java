package game;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import java.util.Random;

public class TebakAngka extends javax.swing.JFrame {
    private int kesempatan = 10;
    private int angkaRahasia;
    private int score;
    private DefaultListModel<String> winnersModel = new DefaultListModel<>();

        public TebakAngka() {
            initComponents();
            resetGame();
            jHasil.setModel(winnersModel);
            Reset.addActionListener(e -> resetGame());
        }
        
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTebak = new javax.swing.JTextField();
        jKet = new javax.swing.JTextField();
        jScore = new javax.swing.JTextField();
        jKesempatan = new javax.swing.JTextField();
        Tebak = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jHasil = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        Keluar2 = new javax.swing.JButton();
        Tamplate2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jTebak, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 230, 30));
        jPanel4.add(jKet, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 230, 30));
        jPanel4.add(jScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 230, 30));

        jKesempatan.setFont(new java.awt.Font("Wide Latin", 1, 14)); // NOI18N
        jKesempatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKesempatanActionPerformed(evt);
            }
        });
        jPanel4.add(jKesempatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 40, 40));

        Tebak.setBackground(new java.awt.Color(102, 153, 255));
        Tebak.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Tebak.setText("Tebak");
        Tebak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TebakActionPerformed(evt);
            }
        });
        jPanel4.add(Tebak, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 580, 90, 30));

        Reset.setBackground(new java.awt.Color(153, 153, 255));
        Reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel4.add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, 90, 30));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Kesempatan  :");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("Berapa Angka Ku?");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Ayo Tebak 1-100!");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setText("Clue      :");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 255));
        jLabel7.setText("Score    :");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 255));
        jLabel8.setText("Tebak   :");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/A.Wallpaper4 (1).png"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Permainan", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jHasil.setToolTipText("item 1\nitem 2");
        jScrollPane1.setViewportView(jHasil);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 200, 230));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 255));
        jLabel9.setText("Hasil Score :");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        Keluar2.setBackground(new java.awt.Color(255, 51, 51));
        Keluar2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Keluar2.setText("Keluar");
        Keluar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Keluar2ActionPerformed(evt);
            }
        });
        jPanel5.add(Keluar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 580, 90, 40));

        Tamplate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/A.Wallpaper4 (1).png"))); // NOI18N
        jPanel5.add(Tamplate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 670));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Score", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
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

    private void jKesempatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKesempatanActionPerformed
        jKesempatan.setText(String.valueOf(kesempatan));
    }//GEN-LAST:event_jKesempatanActionPerformed
    private void resetGame() {
        kesempatan = 10;
        score = 0;
        angkaRahasia = new Random().nextInt(100) + 1;

        jKesempatan.setText("Kesempatan: " + kesempatan);
        jScore.setText("");
        jKet.setText("");
        jTebak.setText("");
    }
    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        if (kesempatan > 0) {
            jTebak.setText("");
            jKet.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Permainan sudah selesai. Mulai permainan baru.");
        }
    }//GEN-LAST:event_ResetActionPerformed

    private void TebakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TebakActionPerformed
        if (kesempatan > 0) {
            try {
                int tebakan = Integer.parseInt(jTebak.getText());

                if (tebakan < 1 || tebakan > 100) {
                    JOptionPane.showMessageDialog(this, "Masukkan angka antara 1-100!");
                    return;
                }

                kesempatan--;
                jKesempatan.setText("Kesempatan: " + kesempatan);

                if (tebakan == angkaRahasia) {
                    jKet.setText("Selamat! Anda berhasil menebak!");
                    score = kesempatan * 10;
                    jScore.setText("Score: " + score);

                    String namaPemain = JOptionPane.showInputDialog(this, "Anda Menang! Masukkan nama Anda:");
                    if (namaPemain != null && !namaPemain.isEmpty()) {
                        winnersModel.addElement(namaPemain + " - Score: " + score);
                    }

                    JOptionPane.showMessageDialog(this, "Permainan akan dimulai lagi.");
                    resetGame();
                } else if (tebakan < angkaRahasia) {
                    jKet.setText("Angka terlalu kecil!");
                } else {
                    jKet.setText("Angka terlalu besar!");
                }

                if (kesempatan == 0 && tebakan != angkaRahasia) {
                    JOptionPane.showMessageDialog(this, "Anda Gagal! Angka yang benar adalah: " + angkaRahasia);
                    resetGame();
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Permainan selesai!");
        } 
    }//GEN-LAST:event_TebakActionPerformed

    private void Keluar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Keluar2ActionPerformed
        dispose();
    }//GEN-LAST:event_Keluar2ActionPerformed
        
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
            java.util.logging.Logger.getLogger(TebakAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TebakAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TebakAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TebakAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TebakAngka().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Keluar2;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel Tamplate2;
    private javax.swing.JButton Tebak;
    private javax.swing.JList<String> jHasil;
    private javax.swing.JTextField jKesempatan;
    private javax.swing.JTextField jKet;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jScore;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTebak;
    // End of variables declaration//GEN-END:variables
}