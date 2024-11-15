package tugas4;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.ArrayList;
import javax.swing.ImageIcon;
public class permainan extends javax.swing.JFrame {
    int tebak ;
    int kesempatan = 10;
    int hasil = 0;
    private ArrayList<Integer> guesses = new ArrayList<>();

    public permainan() {
        initComponents();
        angkanya.setEnabled(false);
        jtcek.setEnabled(false);
        jtscore.setEnabled(false);
        jbtebak.setEnabled(false);
    }
    private void startGame() {
        tebak = (int) (Math.random() * 100 + 1); 
        System.out.println(" Target: " + tebak); 
        hasil = 0; 
        jtcek.setText("let's guess the numbers!"); 
        angkanya.setText(""); 
        kesempatan = 10; 
        jtscore.setText(hasil + ""); 
        jbmulai.setText("RESET");
    }
    private void resetGame(){
        Random rand = new Random();
        kesempatan = 10; 
        hasil = 0;
        angkanya.setText("");
        jtcek.setText("okayy! let's play again!");
        jtscore.setText(String.valueOf(hasil));
        guesses.clear();
        jbtebak.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        angkanya = new javax.swing.JTextField();
        jtcek = new javax.swing.JTextField();
        jtscore = new javax.swing.JTextField();
        jbtebak = new javax.swing.JButton();
        jbmulai = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        hasilskor = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(153, 146, 251));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas4/console1.png"))); // NOI18N
        jPanel4.add(jLabel4);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jLabel7);

        jLabel6.setFont(new java.awt.Font("Eras Medium ITC", 0, 24)); // NOI18N
        jLabel6.setText("HAVE FUN !");
        jPanel4.add(jLabel6);

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "GUESS THE NUMBER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM));

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(153, 146, 251));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("COBA TEBAK ");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 25, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SCORE");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 99, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CEK");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 59, -1, -1));
        jPanel6.add(angkanya, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 22, 190, -1));

        jtcek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtcekActionPerformed(evt);
            }
        });
        jPanel6.add(jtcek, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 190, -1));
        jPanel6.add(jtscore, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 190, -1));

        jbtebak.setText("TEBAK (10)");
        jbtebak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtebakActionPerformed(evt);
            }
        });
        jPanel6.add(jbtebak, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        jbmulai.setText("MULAI");
        jbmulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmulaiActionPerformed(evt);
            }
        });
        jPanel6.add(jbmulai, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 146, 251));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas4/info.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 411, 192));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas4/10.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 450));

        jTabbedPane1.addTab("GAME", jPanel1);

        jPanel5.setBackground(new java.awt.Color(153, 146, 251));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hasilskor.setColumns(20);
        hasilskor.setRows(5);
        jScrollPane2.setViewportView(hasilskor);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 340, 334));

        jLabel8.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas4/10.jpg"))); // NOI18N
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, -1));

        jScrollPane1.setViewportView(jPanel5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("HISTORY", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 720, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtebakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtebakActionPerformed
        try {
        int guess = Integer.parseInt(angkanya.getText());
        System.out.println(" Target: " + tebak); 

        if (guess < 1 || guess > 100) {
            JOptionPane.showMessageDialog(this, "u only can guess number from 1 to 100");
            return;
        }
        if (guesses.contains(guess)) {
                JOptionPane.showMessageDialog(this, "Angka " + guess + " udah ditebak sebelumnya!");
                return;
            }
                guesses.add(guess);

        if (guess < tebak) {
            jtcek.setText("besarin lagi angkanya!");
            kesempatan--;
            jbtebak.setText("TEBAK (" + kesempatan + ")");
        } else if (guess > tebak) {
            jtcek.setText("kecilin lagi angkanya!");
            kesempatan--;
            jbtebak.setText("TEBAK (" + kesempatan + ")");
        } else {
            jtcek.setText("kongratulesyennn brow!");
            String name = "";
            while (true) {
                    name = JOptionPane.showInputDialog("Masukkan nama Anda :");
                    if (name == null) {
                        JOptionPane.showMessageDialog(null, "Permainan dibatalkan.");
                        jbtebak.setEnabled(false);
                        return; 
                    } else if (name.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong");
                    } else {
                        break; 
                    }
                }
            hasil = kesempatan * 10;
            hasilskor.append("NAMA : " +name + " || " +" SCORE : " + hasil + "\n"); 
            jtscore.setText(String.valueOf(hasil));
            JOptionPane.showMessageDialog(this, "Selamat " + name + "! Skor Anda: " + hasil);
            jbtebak.setEnabled(false);
            return;
        }
        if (kesempatan == 0) {
            JOptionPane.showMessageDialog(this, "sorry you lose, the number is " + tebak);
            resetGame();
        }

        jtscore.setText(String.valueOf(hasil));
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Masukkan angka yang valid");
    }       
    }//GEN-LAST:event_jbtebakActionPerformed

    private void jbmulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmulaiActionPerformed
        angkanya.setEnabled(true);
        jtscore.setEnabled(true);
        jtcek.setEnabled(true);     
        jbtebak.setEnabled(true);
        if (jbmulai.getText().equals("MULAI")) {
        startGame();  
    } else {
        jbmulai.setText("MULAI");
        resetGame();  
    }
    }//GEN-LAST:event_jbmulaiActionPerformed

    private void jtcekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtcekActionPerformed
    }//GEN-LAST:event_jtcekActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String detail = "PERATURAN PERMAINAN\n" +
                        "1. permainan ini hanya bisa menebak angka 1 - 100\n" +
                        "2. hanya terdapat 10 kesempatan menebak\n" +
                        "3. hasil score akan di tampilkan di halaman score\n" +
                        " HAVE FUN! <3";
    JOptionPane.showMessageDialog(this, detail, "PERATURAN GAME", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("/info2.png")); 
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(permainan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(permainan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(permainan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(permainan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new permainan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField angkanya;
    private javax.swing.JTextArea hasilskor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbmulai;
    private javax.swing.JButton jbtebak;
    private javax.swing.JTextField jtcek;
    private javax.swing.JTextField jtscore;
    // End of variables declaration//GEN-END:variables
}
