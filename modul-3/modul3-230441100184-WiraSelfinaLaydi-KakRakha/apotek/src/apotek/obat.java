package apotek;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
public class obat extends javax.swing.JFrame {

    public obat() {
        initComponents();
        jtjumlah.setText("0");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        obat = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        demacoline = new javax.swing.JRadioButton();
        ddemacoline = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        betadine = new javax.swing.JRadioButton();
        dtbetadine = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        combatrin = new javax.swing.JRadioButton();
        dtcombatrin = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        promag = new javax.swing.JRadioButton();
        dtpromag = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        konidin = new javax.swing.JRadioButton();
        dtkonidin = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        paracetamol = new javax.swing.JRadioButton();
        dtparacetamol = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        paramex = new javax.swing.JRadioButton();
        dtparamex = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        sangobion = new javax.swing.JRadioButton();
        dtsangobion = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        astria = new javax.swing.JRadioButton();
        dastria = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        vitc = new javax.swing.JRadioButton();
        dtvitc = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jbplus = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jtnama = new javax.swing.JTextField();
        jbmin = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jtjumlah = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 51));
        jPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 5);
        flowLayout1.setAlignOnBaseline(true);
        jPanel1.setLayout(flowLayout1);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apotek/1-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel15);

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel1.setText("INTERNATIONAL PHARMACY ");
        jPanel1.add(jLabel1);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apotek/2-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel16);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 120));

        jPanel2.setBackground(new java.awt.Color(51, 255, 0));
        jPanel2.setLayout(new java.awt.GridLayout(2, 5, 5, 5));

        obat.add(demacoline);
        demacoline.setText("Demacoline");
        demacoline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demacolineActionPerformed(evt);
            }
        });

        ddemacoline.setText("More");
        ddemacoline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddemacolineActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apotek/demacoline.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ddemacoline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel2)
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(demacoline, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(demacoline, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(ddemacoline))
        );

        jPanel2.add(jPanel5);

        obat.add(betadine);
        betadine.setText("Betadine");

        dtbetadine.setText("More");
        dtbetadine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtbetadineActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apotek/betadhine.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(betadine, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addComponent(dtbetadine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addComponent(betadine, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dtbetadine, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel6);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apotek/combatrin.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        obat.add(combatrin);
        combatrin.setText("Combatrin");
        combatrin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combatrinActionPerformed(evt);
            }
        });

        dtcombatrin.setText("More");
        dtcombatrin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtcombatrinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(combatrin, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(dtcombatrin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(combatrin)
                .addGap(18, 18, 18)
                .addComponent(dtcombatrin)
                .addContainerGap())
        );

        jPanel2.add(jPanel7);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apotek/gazero.jpeg"))); // NOI18N
        jLabel5.setText("jLabel5");

        obat.add(promag);
        promag.setText("Promag");

        dtpromag.setText("More");
        dtpromag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtpromagActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dtpromag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(promag))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(promag)
                .addGap(18, 18, 18)
                .addComponent(dtpromag))
        );

        jPanel2.add(jPanel8);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apotek/konidin.png"))); // NOI18N

        obat.add(konidin);
        konidin.setText("Konidin");

        dtkonidin.setText("More");
        dtkonidin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtkonidinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dtkonidin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(konidin))
                .addGap(65, 65, 65))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(konidin)
                .addGap(18, 18, 18)
                .addComponent(dtkonidin))
        );

        jPanel2.add(jPanel9);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apotek/paracetamol1.jpg"))); // NOI18N

        obat.add(paracetamol);
        paracetamol.setText("Paracetamol");

        dtparacetamol.setText("More");
        dtparacetamol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtparacetamolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dtparacetamol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(paracetamol))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel6)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(paracetamol)
                .addGap(18, 18, 18)
                .addComponent(dtparacetamol))
        );

        jPanel2.add(jPanel10);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apotek/paramex.jpeg"))); // NOI18N

        obat.add(paramex);
        paramex.setText("Paramex");

        dtparamex.setText("More");
        dtparamex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtparamexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dtparamex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(paramex)
                    .addComponent(jLabel11))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(paramex)
                .addGap(18, 18, 18)
                .addComponent(dtparamex))
        );

        jPanel2.add(jPanel11);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apotek/sangobion.jpeg"))); // NOI18N
        jLabel10.setText("jLabel10");

        obat.add(sangobion);
        sangobion.setText("Sangobion");

        dtsangobion.setText("More");
        dtsangobion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtsangobionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dtsangobion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(sangobion)
                        .addGap(60, 60, 60))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(sangobion)
                .addGap(18, 18, 18)
                .addComponent(dtsangobion))
        );

        jPanel2.add(jPanel14);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apotek/11.jpg"))); // NOI18N

        obat.add(astria);
        astria.setText("Astria");

        dastria.setText("More");
        dastria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dastriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dastria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(astria)
                    .addComponent(jLabel9))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(34, 34, 34)
                .addComponent(astria)
                .addGap(18, 18, 18)
                .addComponent(dastria))
        );

        jPanel2.add(jPanel13);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apotek/vitamin c.jpeg"))); // NOI18N

        obat.add(vitc);
        vitc.setText("Vitamin C");

        dtvitc.setText("More");
        dtvitc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtvitcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dtvitc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vitc)
                    .addComponent(jLabel8))
                .addGap(57, 57, 57))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(33, 33, 33)
                .addComponent(vitc)
                .addGap(18, 18, 18)
                .addComponent(dtvitc))
        );

        jPanel2.add(jPanel12);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 116, 1040, 410));

        jPanel3.setBackground(new java.awt.Color(255, 153, 51));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING, 5, 38));

        jLabel12.setText("THANK YOU");
        jPanel3.add(jLabel12);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 527, 1050, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 153));

        jLabel14.setText("JUMLAH BARANG");

        jPanel15.setBackground(new java.awt.Color(255, 255, 51));

        jLabel13.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 14)); // NOI18N
        jLabel13.setText("TAGIHAN PEMBAYARAN");
        jPanel15.add(jLabel13);

        jbplus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbplus.setText("+");
        jbplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbplusActionPerformed(evt);
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

        jLabel18.setText("NAMA :");

        jbmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbmin.setText("-");
        jbmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbminActionPerformed(evt);
            }
        });

        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel14))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel18))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jbmin)))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jbplus))
                            .addComponent(jtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(reset)
                        .addGap(27, 27, 27)
                        .addComponent(simpan))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(exit)))
                .addContainerGap(8, Short.MAX_VALUE))
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbplus)
                    .addComponent(jbmin)
                    .addComponent(jtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset)
                    .addComponent(simpan))
                .addGap(18, 18, 18)
                .addComponent(exit)
                .addContainerGap(260, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 110, 220, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel1AncestorAdded
    }//GEN-LAST:event_jPanel1AncestorAdded

    private void combatrinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combatrinActionPerformed
    }//GEN-LAST:event_combatrinActionPerformed

    private void demacolineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demacolineActionPerformed
    }//GEN-LAST:event_demacolineActionPerformed

    private void jbplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbplusActionPerformed
        int jumlahobat = Integer.parseInt(jtjumlah.getText());
            jumlahobat++;
            jtjumlah.setText(String.valueOf(jumlahobat));        // TODO add your handling code here:
    }//GEN-LAST:event_jbplusActionPerformed

    private void jbminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbminActionPerformed
        int kurangi = Integer.parseInt(jtjumlah.getText());
                if (kurangi > 0) {
                    kurangi--; 
                }
                jtjumlah.setText(String.valueOf(kurangi));        // TODO add your handling code here:
    }//GEN-LAST:event_jbminActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        ButtonGroup obat = new ButtonGroup();
        obat.clearSelection();
        jtjumlah.setText("0");
        jtnama.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_exitActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        if (!konidin.isSelected() && !paracetamol.isSelected() && !sangobion.isSelected() && !promag.isSelected() && !paramex.isSelected() 
                && !astria.isSelected() && !betadine.isSelected() && !demacoline.isSelected() && !vitc.isSelected() && !combatrin.isSelected()) {
            JOptionPane.showMessageDialog(null, "pilih jenis obat terlebih dahulu!");
            return;
        }
        String namaobat = "";
        if (konidin.isSelected()) namaobat = "Konidin";
        else if (paracetamol.isSelected()) namaobat = "Paracetamol";
        else if (sangobion.isSelected()) namaobat = "Sangobion";
        else if (promag.isSelected()) namaobat = "Promag";
        else if (paramex.isSelected()) namaobat = "Paramex";
        else if (astria.isSelected()) namaobat = "Astria";
        else if (betadine.isSelected()) namaobat = "Betadine";
        else if (demacoline.isSelected()) namaobat = "Demacoline";
        else if (vitc.isSelected()) namaobat = "Vitamin C";
        else if (combatrin.isSelected()) namaobat = "Combatrin";
               
        String nama = jtnama.getText();
        if (nama.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "isi nama terlebih dahulu!");
        return;
        }        
        int totalHarga = 0;
        int jumlah = Integer.parseInt(jtjumlah.getText());
        if (astria.isSelected()) {
            totalHarga += 25000 * jumlah;
        }
        if (konidin.isSelected()) {
            totalHarga += 3000 * jumlah;
        }
        if (paracetamol.isSelected()) {
            totalHarga += 10000 * jumlah;
        }
        if (sangobion.isSelected()) {
            totalHarga += 20000 * jumlah;
        }
        if (promag.isSelected()) {
            totalHarga += 10000 * jumlah;
        }
        if (paramex.isSelected()) {
            totalHarga += 5000 * jumlah;
        }
        if (betadine.isSelected()) {
            totalHarga += 20000 * jumlah;
        }
        if (demacoline.isSelected()) {
            totalHarga += 10000 * jumlah;
        }
        if (vitc.isSelected()) {
            totalHarga += 15000 * jumlah;
        }
        if (combatrin.isSelected()) {
            totalHarga += 20000 * jumlah;
        }                       
        String struk = "Struk Pembelian Obat\n" +
                   "=====================\n" +
                   "Nama : " + nama + "\n" +
                   "Nama Obat: " + namaobat + "\n" +
                   "Jumlah Obat: " + jumlah + "\n" +
                   "Total Harga :" + totalHarga + "\n"+
                   "=====================\n" +
                   "Terima kasih telah berbelanja di Apotek kami.";
    JOptionPane.showMessageDialog(this, struk, "Struk Pembelian", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_simpanActionPerformed
    private void ddemacolineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddemacolineActionPerformed
        String detail ="untuk mengatasi gejala flu, batuk, pilek, demam dan sakit kepala\n" +
                        "Bahan utama : paracetamol, pseudoephedrine dan chlorpheniramine maleate\n" +
                        "harga : Rp.10.000";
    JOptionPane.showMessageDialog(this, detail, "Detail Obat", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("/obatbru.png"));
    }//GEN-LAST:event_ddemacolineActionPerformed
    private void dtbetadineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtbetadineActionPerformed
        String detail = "Betadine adalah antiseptik yang digunakan untuk mencegah dan mengatasi infeksi pada kulit\n" +
                        "Bahan utama : povidone iodine\n" +
                        "harga : Rp.20.000";
    JOptionPane.showMessageDialog(this, detail, "Detail Obat", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("/obatbru.png"));    }//GEN-LAST:event_dtbetadineActionPerformed
    private void dtcombatrinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtcombatrinActionPerformed
        String detail = "Obat antelmintik untuk mengatasi infeksi cacing disaluran pencernaan\n" +
                        "Bahan utama : pirantel pamoat\n" +
                        "harga : Rp.20.000";
    JOptionPane.showMessageDialog(this, detail, "Detail Obat", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("/obatbru.png"));    }//GEN-LAST:event_dtcombatrinActionPerformed
    private void dtpromagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtpromagActionPerformed
        String detail = "Promag digunakan untuk mengatasi maag atau asam lambung\n" +
                        "Bahan utama : hydrotalcite, magnesium hidroksida, dan simethicone\n" +
                        "harga : Rp.10.000";
    JOptionPane.showMessageDialog(this, detail, "Detail Obat", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("/obatbru.png"));    }//GEN-LAST:event_dtpromagActionPerformed
    private void dtkonidinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtkonidinActionPerformed
        String detail = "digunakan untuk mengatasi gejala batuk atau gejala bronkitis\n" +
                        "Bahan utama : guaifenesin, dextromethorphan HBr, dan chlorpheniramine maleate\n" +
                        "harga : Rp.30.000";
    JOptionPane.showMessageDialog(this, detail, "Struk Pembelian", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("/obatbru.png"));    }//GEN-LAST:event_dtkonidinActionPerformed
    private void dtparamexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtparamexActionPerformed
        String detail = "Obat ini digunakan untuk mengatasi demam, nyeri dan gejala flu\n" +
                        "Bahan utama :paracetamol, propyphenazone, caffeine, dan dexchlorpheniramine maleate \n" +
                        "harga : Rp.5.000";
    JOptionPane.showMessageDialog(this, detail, "Detail Obat", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("/obatbru.png"));     }//GEN-LAST:event_dtparamexActionPerformed
    private void dtparacetamolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtparacetamolActionPerformed
        String detail = "Obat ini digunakan untuk blablabla\n" +
                        "mengandung lblb\n" +
                        "harga : Rp.10.000 per item";
    JOptionPane.showMessageDialog(this, detail, "Detail Obat", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("/obatbru.png"));     }//GEN-LAST:event_dtparacetamolActionPerformed
    private void dtsangobionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtsangobionActionPerformed
        String detail = "Suplemen mengatasi anemia\n" +
                        "Bahan utama : ferrous gluconate (zat besi), vitamin C, tembaga sulfat, asam folat, dan multivitamin B\n" +
                        "harga : Rp.20.000";
    JOptionPane.showMessageDialog(this, detail, "Detail Obat", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("/obatbru.png"));     }//GEN-LAST:event_dtsangobionActionPerformed
    private void dastriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dastriaActionPerformed
        String detail = "Obat antimerik pereda nyeri demam atau nyeri ringan\n" +
                        "harga : Rp.25.000";
    JOptionPane.showMessageDialog(this, detail, "Detail Obat", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("/obatbru.png"));     }//GEN-LAST:event_dastriaActionPerformed
    private void dtvitcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtvitcActionPerformed
        String detail = "suplemen vitamin untuk memperkuat sistem kekebalan tubuh\n" +
                        "harga : Rp.15.000";
    JOptionPane.showMessageDialog(this, detail, "Struk Pembelian", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("/obatbru.png"));     }//GEN-LAST:event_dtvitcActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new obat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton astria;
    private javax.swing.JRadioButton betadine;
    private javax.swing.JRadioButton combatrin;
    private javax.swing.JButton dastria;
    private javax.swing.JButton ddemacoline;
    private javax.swing.JRadioButton demacoline;
    private javax.swing.JButton dtbetadine;
    private javax.swing.JButton dtcombatrin;
    private javax.swing.JButton dtkonidin;
    private javax.swing.JButton dtparacetamol;
    private javax.swing.JButton dtparamex;
    private javax.swing.JButton dtpromag;
    private javax.swing.JButton dtsangobion;
    private javax.swing.JButton dtvitc;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbmin;
    private javax.swing.JButton jbplus;
    private javax.swing.JTextField jtjumlah;
    private javax.swing.JTextField jtnama;
    private javax.swing.JRadioButton konidin;
    private javax.swing.ButtonGroup obat;
    private javax.swing.JRadioButton paracetamol;
    private javax.swing.JRadioButton paramex;
    private javax.swing.JRadioButton promag;
    private javax.swing.JButton reset;
    private javax.swing.JRadioButton sangobion;
    private javax.swing.JButton simpan;
    private javax.swing.JRadioButton vitc;
    // End of variables declaration//GEN-END:variables
}
