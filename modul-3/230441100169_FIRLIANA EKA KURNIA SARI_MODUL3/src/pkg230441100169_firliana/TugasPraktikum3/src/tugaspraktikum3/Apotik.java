/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugaspraktikum3;

import javax.swing.JCheckBox;


public class Apotik extends javax.swing.JFrame {
 private JCheckBox[] obatCheckboxes;

 private final String[][] daftarObat = {
            {"Paracetamol", "Rp 5.000", "Digunakan untuk menurunkan demam dan meredakan nyeri."},
            {"Ibuprofen", "Rp 10.000", "Efektif untuk mengurangi peradangan dan nyeri."},
            {"Amoksisilin", "Rp 15.000", "Antibiotik yang digunakan untuk mengobati infeksi."},
            {"Cetirizine", "Rp 8.000", "Obat untuk alergi yang mengurangi gatal dan bersin."},
            {"Loperamide", "Rp 7.000", "Obat untuk mengatasi diare."},
            {"Omeprazole", "Rp 12.000", "Digunakan untuk mengurangi asam lambung."},
            {"Metformin", "Rp 20.000", "Obat untuk mengontrol gula darah pada diabetes."},
            {"Simvastatin", "Rp 18.000", "Menurunkan kolesterol jahat dan lemak dalam darah."},
            {"Salbutamol", "Rp 25.000", "Mengatasi gejala asma dan sesak napas."},
            {"Dextromethorphan", "Rp 9.000", "Obat batuk kering yang menekan refleks batuk."}
    };
    private Iterable<JCheckBox> obatCheckBoxes;

    public Apotik() {
        initComponents();
        
        obatCheckboxes = new JCheckBox[]{
            cbParacetamol, cbIbuprofen, jCheckBox3, jCheckBox4, jCheckBox5, 
            jCheckBox6, jCheckBox7, jCheckBox8, jCheckBox9, jCheckBox10
        };
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        pAtas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pTengah = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbParacetamol = new javax.swing.JCheckBox();
        cbIbuprofen = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        pKanan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taRincianObat = new javax.swing.JTextArea();
        pBawah = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pAtas.setBackground(new java.awt.Color(51, 51, 255));
        pAtas.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 2, 5, 2, new java.awt.Color(255, 153, 153)));
        pAtas.setForeground(new java.awt.Color(153, 204, 255));
        pAtas.setLayout(new java.awt.GridLayout(2, 1, 2, 0));

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("{ APOTEK MEDIKA 24 JAM }");
        pAtas.add(jLabel1);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Menyediakan Berbagai macam obat - obatan ");
        pAtas.add(jLabel14);

        getContentPane().add(pAtas, java.awt.BorderLayout.PAGE_START);

        pTengah.setBackground(new java.awt.Color(102, 153, 255));
        pTengah.setForeground(new java.awt.Color(102, 153, 255));
        pTengah.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pilihan Obat :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pTengah.add(jLabel3, gridBagConstraints);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\download__5_-removebg-preview.png")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pTengah.add(jLabel4, gridBagConstraints);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\download__6_-removebg-preview.png")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pTengah.add(jLabel5, gridBagConstraints);

        jLabel6.setText("jLabel6");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pTengah.add(jLabel6, gridBagConstraints);

        jLabel7.setText("jLabel7");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pTengah.add(jLabel7, gridBagConstraints);

        jLabel8.setText("jLabel8");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pTengah.add(jLabel8, gridBagConstraints);

        cbParacetamol.setBackground(new java.awt.Color(102, 153, 255));
        cbParacetamol.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbParacetamol.setForeground(new java.awt.Color(255, 255, 255));
        cbParacetamol.setText("Paracetamol");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pTengah.add(cbParacetamol, gridBagConstraints);

        cbIbuprofen.setBackground(new java.awt.Color(102, 153, 255));
        cbIbuprofen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbIbuprofen.setForeground(new java.awt.Color(255, 255, 255));
        cbIbuprofen.setText("Ibuprofen");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pTengah.add(cbIbuprofen, gridBagConstraints);

        jCheckBox3.setBackground(new java.awt.Color(102, 153, 255));
        jCheckBox3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("Amoksisilin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pTengah.add(jCheckBox3, gridBagConstraints);

        jCheckBox4.setBackground(new java.awt.Color(102, 153, 255));
        jCheckBox4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("Loperamide");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pTengah.add(jCheckBox4, gridBagConstraints);

        jCheckBox5.setBackground(new java.awt.Color(102, 153, 255));
        jCheckBox5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox5.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setText("Cetirizine");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pTengah.add(jCheckBox5, gridBagConstraints);

        jLabel9.setText("jLabel9");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pTengah.add(jLabel9, gridBagConstraints);

        jLabel10.setText("jLabel10");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pTengah.add(jLabel10, gridBagConstraints);

        jLabel11.setText("jLabel11");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pTengah.add(jLabel11, gridBagConstraints);

        jLabel12.setText("jLabel12");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pTengah.add(jLabel12, gridBagConstraints);

        jLabel13.setText("jLabel13");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pTengah.add(jLabel13, gridBagConstraints);

        jCheckBox6.setBackground(new java.awt.Color(102, 153, 255));
        jCheckBox6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setText("Omeprazole");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pTengah.add(jCheckBox6, gridBagConstraints);

        jCheckBox7.setBackground(new java.awt.Color(102, 153, 255));
        jCheckBox7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox7.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setText("Metformin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pTengah.add(jCheckBox7, gridBagConstraints);

        jCheckBox8.setBackground(new java.awt.Color(102, 153, 255));
        jCheckBox8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox8.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox8.setText("Simvastatin");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pTengah.add(jCheckBox8, gridBagConstraints);

        jCheckBox9.setBackground(new java.awt.Color(102, 153, 255));
        jCheckBox9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox9.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox9.setText("Salbutamol");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pTengah.add(jCheckBox9, gridBagConstraints);

        jCheckBox10.setBackground(new java.awt.Color(102, 153, 255));
        jCheckBox10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox10.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox10.setText("Dextrometh");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pTengah.add(jCheckBox10, gridBagConstraints);

        getContentPane().add(pTengah, java.awt.BorderLayout.CENTER);

        pKanan.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("Rincian Obat");

        taRincianObat.setBackground(new java.awt.Color(102, 153, 255));
        taRincianObat.setColumns(20);
        taRincianObat.setRows(5);
        jScrollPane1.setViewportView(taRincianObat);

        javax.swing.GroupLayout pKananLayout = new javax.swing.GroupLayout(pKanan);
        pKanan.setLayout(pKananLayout);
        pKananLayout.setHorizontalGroup(
            pKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pKananLayout.createSequentialGroup()
                .addGroup(pKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pKananLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pKananLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel2)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        pKananLayout.setVerticalGroup(
            pKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pKananLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(pKanan, java.awt.BorderLayout.LINE_END);

        pBawah.setBackground(new java.awt.Color(51, 51, 255));
        pBawah.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 2, 5, 2, new java.awt.Color(255, 153, 153)));

        btnClear.setBackground(new java.awt.Color(51, 102, 255));
        btnClear.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        pBawah.add(btnClear);

        btnShow.setBackground(new java.awt.Color(51, 102, 255));
        btnShow.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        btnShow.setForeground(new java.awt.Color(255, 255, 255));
        btnShow.setText("Show");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });
        pBawah.add(btnShow);

        getContentPane().add(pBawah, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
       StringBuilder sb = new StringBuilder();
        for (int i = 0; i < obatCheckboxes.length; i++) {
            if (obatCheckboxes[i].isSelected()) {
                sb.append("Nama Obat: ").append(daftarObat[i][0]).append("\n")
                  .append("Harga: ").append(daftarObat[i][1]).append("\n")
                  .append("Keterangan: ").append(daftarObat[i][2]).append("\n\n");
            }
        }
        taRincianObat.setText(sb.toString());
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
     taRincianObat.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox8ActionPerformed

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
            java.util.logging.Logger.getLogger(Apotik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apotik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apotik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apotik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apotik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnShow;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbIbuprofen;
    private javax.swing.JCheckBox cbParacetamol;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pAtas;
    private javax.swing.JPanel pBawah;
    private javax.swing.JPanel pKanan;
    private javax.swing.JPanel pTengah;
    private javax.swing.JTextArea taRincianObat;
    // End of variables declaration//GEN-END:variables
}
