package tagihan;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.LinkedHashMap;
import javax.swing.table.DefaultTableModel;

public class spp extends javax.swing.JFrame {
    private HashMap<String, Boolean> statusPembayaran = new LinkedHashMap<>();
    private DefaultTableModel tableModel;
    public spp() {
        initComponents();
        statusPembayaran = new HashMap<>();
        statusPembayaran.put("Januari", false);
        statusPembayaran.put("Februari", false);
        statusPembayaran.put("Maret", false);
        statusPembayaran.put("April", false);
        statusPembayaran.put("Mei", false);
        statusPembayaran.put("Juni", false);
        statusPembayaran.put("Juli", false);
        statusPembayaran.put("Agustus", false);
        statusPembayaran.put("September", false);
        statusPembayaran.put("Oktober", false);
        statusPembayaran.put("November", false);
        statusPembayaran.put("Desember", false);
        
         tableModel = new DefaultTableModel(new String[]{"Nama", "Bulan", "Tagihan", "Status"}, 0);
         tabel.setModel(tableModel);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtnama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jttagihan = new javax.swing.JTextField();
        bulan = new javax.swing.JLabel();
        bulanpanel = new javax.swing.JPanel();
        januari = new javax.swing.JCheckBox();
        april = new javax.swing.JCheckBox();
        juli = new javax.swing.JCheckBox();
        oktober = new javax.swing.JCheckBox();
        februari = new javax.swing.JCheckBox();
        mei = new javax.swing.JCheckBox();
        agustus = new javax.swing.JCheckBox();
        november = new javax.swing.JCheckBox();
        maret = new javax.swing.JCheckBox();
        juni = new javax.swing.JCheckBox();
        september = new javax.swing.JCheckBox();
        desember = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        hasil = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cash = new javax.swing.JTextField();
        bayar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        kembali = new javax.swing.JTextField();
        hitung = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("PEMBAYARAN SPP");
        jPanel1.add(jLabel1, new java.awt.GridBagConstraints());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("SMPN 4 SIMPANG EMPAT");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        jPanel1.add(jLabel2, gridBagConstraints);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1278, 60));

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));

        jLabel3.setText("NAMA : ");

        jLabel4.setText("JUMLAH TAGIHAN :");

        bulan.setText("BULAN :");

        bulanpanel.setBackground(new java.awt.Color(255, 204, 0));
        bulanpanel.setLayout(new java.awt.GridLayout(3, 4, 10, 10));

        januari.setText("Januari");
        bulanpanel.add(januari);

        april.setText("April");
        april.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aprilActionPerformed(evt);
            }
        });
        bulanpanel.add(april);

        juli.setText("Juli");
        bulanpanel.add(juli);

        oktober.setText("Oktober");
        oktober.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oktoberActionPerformed(evt);
            }
        });
        bulanpanel.add(oktober);

        februari.setText("Februari");
        bulanpanel.add(februari);

        mei.setText("Mei");
        bulanpanel.add(mei);

        agustus.setText("Agustus");
        bulanpanel.add(agustus);

        november.setText("November");
        bulanpanel.add(november);

        maret.setText("Maret");
        bulanpanel.add(maret);

        juni.setText("Juni");
        bulanpanel.add(juni);

        september.setText("September");
        bulanpanel.add(september);

        desember.setText("Desember");
        bulanpanel.add(desember);

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jLabel6.setText("JUMLAH YG HARUS DIBAYAR:");

        jLabel7.setText("CASH :");

        bayar.setText("BAYAR");
        bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarActionPerformed(evt);
            }
        });

        jLabel8.setText("KEMBALIAN :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hasil, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(cash)
                    .addComponent(kembali))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bayar, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        hitung.setText("HITUNG");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });

        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        simpan.setText("SIMPAN");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hitung)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(42, 42, 42)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jttagihan, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(bulan)
                            .addGap(18, 18, 18)
                            .addComponent(bulanpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jttagihan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bulan)
                    .addComponent(bulanpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hitung)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(simpan)
                    .addComponent(reset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 520, 490));

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NAMA", "BULAN", "TAGIHAN", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 760, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oktoberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oktoberActionPerformed
    }//GEN-LAST:event_oktoberActionPerformed
    private void aprilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aprilActionPerformed
    }//GEN-LAST:event_aprilActionPerformed
    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        tableModel.setRowCount(0);

        String[] bulanUrut = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        for (String bulan : bulanUrut) {
            if (statusPembayaran.containsKey(bulan)) {
                String statusBulan = statusPembayaran.get(bulan) ? "Lunas" : "Belum Dibayar";
                tableModel.addRow(new Object[]{
                    jtnama.getText(),
                    bulan,
                    "Rp " + jttagihan.getText(),
                    statusBulan
                });
            }
        }   
        JOptionPane.showMessageDialog(this, "Status pembayaran diperbarui!", "Info", JOptionPane.INFORMATION_MESSAGE);    }//GEN-LAST:event_simpanActionPerformed
        private void cekStatusSiswa() {
         boolean adaTunggakan = false;
        StringBuilder tunggakan = new StringBuilder();
        int totalTunggakan = 0;

        for (String bulan : statusPembayaran.keySet()) {
            if (!statusPembayaran.get(bulan)) {
                adaTunggakan = true;
                tunggakan.append(bulan).append(", ");
                totalTunggakan += Integer.parseInt(jttagihan.getText());
            }
        }
}
    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        try {
            int jumlahSPP = Integer.parseInt(jttagihan.getText()); 
            int totalPembayaran = 0;

             if (januari.isSelected()) totalPembayaran += jumlahSPP;
            if (februari.isSelected()) totalPembayaran += jumlahSPP;
            if (maret.isSelected()) totalPembayaran += jumlahSPP;
            if (april.isSelected()) totalPembayaran += jumlahSPP;
            if (mei.isSelected()) totalPembayaran += jumlahSPP;
            if (juni.isSelected()) totalPembayaran += jumlahSPP;
            if (juli.isSelected()) totalPembayaran += jumlahSPP;
            if (agustus.isSelected()) totalPembayaran += jumlahSPP;
            if (september.isSelected()) totalPembayaran += jumlahSPP;
            if (oktober.isSelected()) totalPembayaran += jumlahSPP;
            if (november.isSelected()) totalPembayaran += jumlahSPP;
            if (desember.isSelected()) totalPembayaran += jumlahSPP;

            hasil.setText(String.valueOf(totalPembayaran)); 
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan jumlah SPP yang valid!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return; 
        }    }//GEN-LAST:event_hitungActionPerformed

    private void bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarActionPerformed
        String nama = jtnama.getText();
        String jumlah = jttagihan.getText();
        StringBuilder bulanPembayaran = new StringBuilder();
        int hasilnya = Integer.parseInt(hasil.getText());        
        if (nama.isEmpty() || jumlah.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masukkan Nama dan Jumlah SPP terlebih dahulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }       
        int uang = Integer.parseInt(cash.getText());        
        if (uang < hasilnya) {
            JOptionPane.showMessageDialog(this, "Uang tidak cukup untuk melakukan pembayaran!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int kembalian = uang - hasilnya;
        if (kembalian < 0) {
            kembali.setText("Uang tidak cukup");
        } else {
            kembali.setText("Rp. " + kembalian);
        }
        boolean adaBulanDipilih = false;
        if (januari.isSelected()) {
            bulanPembayaran.append("Januari, ");
            statusPembayaran.put("Januari", true);
            januari.setSelected(false);
            januari.setEnabled(false);
            adaBulanDipilih = true;
        }
        if (februari.isSelected()) {
            bulanPembayaran.append("Februari, ");
            februari.setSelected(false);
            statusPembayaran.put("Februari", true);
            februari.setEnabled(false);
            adaBulanDipilih = true;
        }
        if (maret.isSelected()) {
            bulanPembayaran.append("Maret, ");
            maret.setSelected(false);
            statusPembayaran.put("Maret", true);
            maret.setEnabled(false);
            adaBulanDipilih = true;
        }
        if (april.isSelected()) {
            bulanPembayaran.append("April, ");
            april.setSelected(false);
            statusPembayaran.put("April", true);
            april.setEnabled(false);
            adaBulanDipilih = true;
        }
        if (mei.isSelected()) {
            bulanPembayaran.append("Mei, ");
            mei.setSelected(false);
            statusPembayaran.put("Mei", true);
            mei.setEnabled(false);
            adaBulanDipilih = true;
        }
        if (juni.isSelected()) {
            bulanPembayaran.append("Juni, ");
            juni.setSelected(false);
            statusPembayaran.put("Juni", true);
            juni.setEnabled(false);
            adaBulanDipilih = true;
        }
        if (juli.isSelected()) {
            bulanPembayaran.append("Juli, ");
            juli.setSelected(false);

            statusPembayaran.put("Juli", true);
            juli.setEnabled(false);
            adaBulanDipilih = true;
        }
        if (agustus.isSelected()) {
            bulanPembayaran.append("Agustus, ");
            agustus.setSelected(false);
            statusPembayaran.put("Agustus", true);
            agustus.setEnabled(false);
            adaBulanDipilih = true;
        }
        if (september.isSelected()) {
            bulanPembayaran.append("September, ");
            september.setSelected(false);
            statusPembayaran.put("September", true);
            september.setEnabled(false);
            adaBulanDipilih = true;
        }
        if (oktober.isSelected()) {
            bulanPembayaran.append("Oktober, ");
            oktober.setSelected(false);
            statusPembayaran.put("Oktober", true);
            oktober.setEnabled(false);
            adaBulanDipilih = true;
        }
        if (november.isSelected()) {
            bulanPembayaran.append("November, ");
            november.setSelected(false);
            statusPembayaran.put("November", true);
            november.setEnabled(false);
            adaBulanDipilih = true;
        }
        if (desember.isSelected()) {
            bulanPembayaran.append("Desember, ");
            desember.setSelected(false);
            statusPembayaran.put("Desember", true);
            desember.setEnabled(false);
            adaBulanDipilih = true;
        }
        if (!adaBulanDipilih) {
            JOptionPane.showMessageDialog(this, "Pilih minimal satu bulan pembayaran!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (bulanPembayaran.length() > 0) {
            bulanPembayaran.setLength(bulanPembayaran.length() - 2); 
        }
        hasil.setText("Pembayaran berhasil!");
        JOptionPane.showMessageDialog(this, "Pembayaran berhasil!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        cekStatusSiswa();
    }//GEN-LAST:event_bayarActionPerformed
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        jtnama.setText("");
        jttagihan.setText("");
        hasil.setText("");
        cash.setText("");
        kembali.setText("");
        statusPembayaran.clear();
        JCheckBox[] monthCheckboxes = {januari, februari, maret, april, mei, juni, juli, agustus, september, oktober, november, desember};
        for (JCheckBox checkbox : monthCheckboxes) {
        checkbox.setSelected(false);
        checkbox.setEnabled(true);
    }
        tableModel.setRowCount(0);
    }//GEN-LAST:event_resetActionPerformed
    private int extractNumber(String input) throws NumberFormatException {
        String numericPart = input.replaceAll("[^\\d]", "");
        return Integer.parseInt(numericPart);
    }

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
            java.util.logging.Logger.getLogger(spp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(spp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(spp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(spp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new spp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox agustus;
    private javax.swing.JCheckBox april;
    private javax.swing.JButton bayar;
    private javax.swing.JLabel bulan;
    private javax.swing.JPanel bulanpanel;
    private javax.swing.JTextField cash;
    private javax.swing.JCheckBox desember;
    private javax.swing.JCheckBox februari;
    private javax.swing.JTextField hasil;
    private javax.swing.JButton hitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox januari;
    private javax.swing.JTextField jtnama;
    private javax.swing.JTextField jttagihan;
    private javax.swing.JCheckBox juli;
    private javax.swing.JCheckBox juni;
    private javax.swing.JTextField kembali;
    private javax.swing.JCheckBox maret;
    private javax.swing.JCheckBox mei;
    private javax.swing.JCheckBox november;
    private javax.swing.JCheckBox oktober;
    private javax.swing.JButton reset;
    private javax.swing.JCheckBox september;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
