/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class UTS_230441100169_FirlianaEkaKurniaSari extends javax.swing.JFrame {

    /**
     * Creates new form UTS_230441100169_FirlianaEkaKurniaSari
     */
    public UTS_230441100169_FirlianaEkaKurniaSari() {
        initComponents();
    }

    

public class main extends JFrame implements ActionListener {
    // Deklarasi komponen GUI
    private JButton btnBatu, btnGunting, btnKertas, btnMain;
    private JLabel labelPilihanUser, labelPilihanKomputer, labelHasil;
    private String[] pilihan = {"Batu", "Gunting", "Kertas"};
    private String pilihanUser = "", pilihanKomputer = "";

    public permainan() {
        // Judul frame
        setTitle("Permainan Suit Sederhana");

        // Layout
        setLayout(new GridLayout(4, 1)); // 4 baris, 1 kolom

        // Panel untuk pilihan user
        JPanel panelUser = new JPanel();
        panelUser.setLayout(new GridLayout(1, 3)); // 1 baris, 3 kolom
        btnBatu = new JButton("Batu");
        btnGunting = new JButton("Gunting");
        btnKertas = new JButton("Kertas");

        // Tambahkan ActionListener pada tombol pilihan
        btnBatu.addActionListener(this);
        btnGunting.addActionListener(this);
        btnKertas.addActionListener(this);

        // Tambahkan tombol ke panel
        panelUser.add(btnBatu);
        panelUser.add(btnGunting);
        panelUser.add(btnKertas);

        // Panel untuk tombol main
        
        // Pengaturan frame
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Logic permainan
    

            // Tentukan hasil permainan
            
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        main = new javax.swing.JButton();
        jbBatu = new javax.swing.JButton();
        jbgunting = new javax.swing.JButton();
        jbKertas = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("                                                       PERMAINAN");
        jPanel2.add(jLabel5, java.awt.BorderLayout.CENTER);

        main.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        main.setText("Main");
        main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainActionPerformed(evt);
            }
        });

        jbBatu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbBatu.setText("Batu");

        jbgunting.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbgunting.setText("Gunting");

        jbKertas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbKertas.setText("Kertas");

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(new java.awt.GridLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\images__1_-removebg-preview.png")); // NOI18N
        jPanel3.add(jLabel3);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\images-removebg-preview-removebg-preview.png")); // NOI18N
        jPanel3.add(jLabel2);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\kertas-removebg-preview.png")); // NOI18N
        jPanel3.add(jLabel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbgunting)
                .addGap(107, 107, 107)
                .addComponent(jbBatu)
                .addGap(125, 125, 125)
                .addComponent(jbKertas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(main)))
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBatu)
                    .addComponent(jbKertas)
                    .addComponent(jbgunting))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(main)
                .addGap(17, 17, 17))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mainActionPerformed

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
            java.util.logging.Logger.getLogger(UTS_230441100169_FirlianaEkaKurniaSari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UTS_230441100169_FirlianaEkaKurniaSari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UTS_230441100169_FirlianaEkaKurniaSari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UTS_230441100169_FirlianaEkaKurniaSari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UTS_230441100169_FirlianaEkaKurniaSari().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbBatu;
    private javax.swing.JButton jbKertas;
    private javax.swing.JButton jbgunting;
    private javax.swing.JButton main;
    // End of variables declaration//GEN-END:variables
}
