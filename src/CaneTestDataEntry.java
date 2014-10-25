/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ims.lankasugar;

import javax.swing.JFrame;

/**
 *
 * @author Thilini
 */
public class CaneTestDataEntry extends javax.swing.JFrame {

    /**
     * Creates new form CaneTestDataEntry
     */
    public CaneTestDataEntry() {
        initComponents();
         
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSampleNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBrix = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPol = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPurity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRendement = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnSubmit = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuNew = new javax.swing.JMenuItem();
        jMenuClose = new javax.swing.JMenuItem();
        jMenuDecFont = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1366, 768));
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/images/home.png"))); // NOI18N
        jButton1.setToolTipText("Home");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/images/add-icon.png"))); // NOI18N
        jButton2.setToolTipText("New Record");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton2);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/images/Save-icon30.png"))); // NOI18N
        jButton4.setToolTipText("Save Current Form");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton4);

        jButtonClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/images/Clear.png"))); // NOI18N
        jButtonClear.setToolTipText("Clear Current Form");
        jButtonClear.setFocusable(false);
        jButtonClear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonClear.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonClear);

        mainPanel.setLayout(new java.awt.GridLayout(0, 2, 200, 30));

        jLabel1.setText("Sample Number");
        mainPanel.add(jLabel1);
        mainPanel.add(txtSampleNo);

        jLabel4.setText("BRIX");
        mainPanel.add(jLabel4);
        mainPanel.add(txtBrix);

        jLabel2.setText("Polarity");
        mainPanel.add(jLabel2);
        mainPanel.add(txtPol);

        jLabel3.setText("Purity");
        mainPanel.add(jLabel3);
        mainPanel.add(txtPurity);

        jLabel5.setText("Rendement");
        mainPanel.add(jLabel5);
        mainPanel.add(txtRendement);

        jLabel6.setText("Incorrected Brix");
        mainPanel.add(jLabel6);
        mainPanel.add(jTextField1);

        btnSubmit.setText("Submit");

        btnView.setText("View");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(btnView)
                .addGap(150, 150, 150)
                .addComponent(btnSubmit)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnView))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuFile.setText("File");
        jMenuFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFileActionPerformed(evt);
            }
        });

        jMenuNew.setText("New");
        jMenuNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNewActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuNew);

        jMenuClose.setText("Close");
        jMenuClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCloseActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuClose);

        jMenuBar1.add(jMenuFile);

        jMenuDecFont.setText("Edit");

        jMenuItem1.setText("Increase Font Size");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuDecFont.add(jMenuItem1);

        jMenuItem2.setText("Decrease Font Size");
        jMenuDecFont.add(jMenuItem2);

        jMenuBar1.add(jMenuDecFont);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFileActionPerformed
         
    }//GEN-LAST:event_jMenuFileActionPerformed

    private void jMenuNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNewActionPerformed
         txtSampleNo.setText("");
            txtBrix.setText("");
            txtPol.setText("");
            txtPurity.setText("");
            txtRendement.setText("");
    }//GEN-LAST:event_jMenuNewActionPerformed

    private void jMenuCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuCloseActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
         txtSampleNo.setText("");
            txtBrix.setText("");
            txtPol.setText("");
            txtPurity.setText("");
            txtRendement.setText("");
    }//GEN-LAST:event_jButtonClearActionPerformed

    
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
            java.util.logging.Logger.getLogger(CaneTestDataEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CaneTestDataEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CaneTestDataEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CaneTestDataEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CaneTestDataEntry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnView;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuClose;
    private javax.swing.JMenu jMenuDecFont;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuNew;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField txtBrix;
    private javax.swing.JTextField txtPol;
    private javax.swing.JTextField txtPurity;
    private javax.swing.JTextField txtRendement;
    private javax.swing.JTextField txtSampleNo;
    // End of variables declaration//GEN-END:variables
}
