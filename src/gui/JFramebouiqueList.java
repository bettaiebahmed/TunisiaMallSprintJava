/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.*;
import model.*;
import entite.boutique;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author mohamed
 */
public class JFramebouiqueList extends javax.swing.JFrame {

    public String ch;

    public String getCh() {
        return ch;
    }

    /**
     * Creates new form JFramebouiqueList
     */
    public JFramebouiqueList() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
this.setLocation(dim.width/100-this.getSize().width/100, dim.height/100-this.getSize().height/100);
        showboutiqueinjtable();
        //jLabel1.setVisible(false);
        jPanel3.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Look shop");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Claim");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Shop", "Target"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 34, Short.MAX_VALUE)))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(29, 29, 29)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Wording", "Description", "Picture", "Price"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        Back.setText("Back to Shops List");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Back))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(Back))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(80, 80, 80)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(80, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        jPanel1.setVisible(false);
     //   jPanel3.setVisible(true);
        try {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        } catch (MessagingException ex) {
            Logger.getLogger(JFramebouiqueList.class.getName()).log(Level.SEVERE, null, ex);
        }
        showproductinjtable();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        ch = model.getValueAt(i, 0).toString();
        jLabel2.setText(ch);
        jLabel1.setText("you chose to view " + ch + " Click on look shop to confirm");
    }//GEN-LAST:event_jTable1MouseClicked

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        jPanel3.setVisible(false);
        jPanel1.setVisible(true);
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_BackActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        JFrameAdmin A = new JFrameAdmin();
        A.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:

            ReclamationFrame rec = new ReclamationFrame();
            rec.setVisible(true);
        } catch (MessagingException ex) {
            Logger.getLogger(JFramebouiqueList.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(JFramebouiqueList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramebouiqueList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramebouiqueList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramebouiqueList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramebouiqueList().setVisible(true);
            }
        });
    }

    public void showboutiqueinjtable() {
        boutiqueDao A = new boutiqueDao();

        ArrayList<boutique> list = (ArrayList<boutique>) A.find();
        //  DefaultTableModel model = new DefaultTableModel();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[6];
        for (boutique list1 : list) {
            row[0] = list1.getLibelleBoutique();
            row[1] = list1.getcibleBoutique();
            model.addRow(row);
        }
        //jTable_Display_Users.setModel(model);
    }

    public void showproductinjtable() {
        ProduitDao A = new ProduitDao();

//        ArrayList<Produit> list = (ArrayList<Produit>) A.findproduit(jLabel2.getText());
//        //  DefaultTableModel model = new DefaultTableModel();
//        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
//        Object[] row = new Object[6];
//        for (Produit list1 : list) {
//            row[0] = list1.getNomProduit();
//            row[1] = list1.getDescription();
//            row[2] = list1.getImage();
//            model.addRow(row);
//        }
        //jTable_Display_Users.setModel(model);
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public static int getDEFAULT_CURSOR() {
        return DEFAULT_CURSOR;
    }

    public static int getCROSSHAIR_CURSOR() {
        return CROSSHAIR_CURSOR;
    }

    public static int getTEXT_CURSOR() {
        return TEXT_CURSOR;
    }

    public static int getWAIT_CURSOR() {
        return WAIT_CURSOR;
    }

    public static int getSW_RESIZE_CURSOR() {
        return SW_RESIZE_CURSOR;
    }

    public static int getSE_RESIZE_CURSOR() {
        return SE_RESIZE_CURSOR;
    }

    public static int getNW_RESIZE_CURSOR() {
        return NW_RESIZE_CURSOR;
    }

    public static int getNE_RESIZE_CURSOR() {
        return NE_RESIZE_CURSOR;
    }

    public static int getN_RESIZE_CURSOR() {
        return N_RESIZE_CURSOR;
    }

    public static int getS_RESIZE_CURSOR() {
        return S_RESIZE_CURSOR;
    }

    public static int getW_RESIZE_CURSOR() {
        return W_RESIZE_CURSOR;
    }

    public static int getE_RESIZE_CURSOR() {
        return E_RESIZE_CURSOR;
    }

    public static int getHAND_CURSOR() {
        return HAND_CURSOR;
    }

    public static int getMOVE_CURSOR() {
        return MOVE_CURSOR;
    }

    public static int getNORMAL() {
        return NORMAL;
    }

    public static int getICONIFIED() {
        return ICONIFIED;
    }

    public static int getMAXIMIZED_HORIZ() {
        return MAXIMIZED_HORIZ;
    }

    public static int getMAXIMIZED_VERT() {
        return MAXIMIZED_VERT;
    }

    public static int getMAXIMIZED_BOTH() {
        return MAXIMIZED_BOTH;
    }

    public static float getTOP_ALIGNMENT() {
        return TOP_ALIGNMENT;
    }

    public static float getCENTER_ALIGNMENT() {
        return CENTER_ALIGNMENT;
    }

    public static float getBOTTOM_ALIGNMENT() {
        return BOTTOM_ALIGNMENT;
    }

    public static float getLEFT_ALIGNMENT() {
        return LEFT_ALIGNMENT;
    }

    public static float getRIGHT_ALIGNMENT() {
        return RIGHT_ALIGNMENT;
    }

    public static int getDO_NOTHING_ON_CLOSE() {
        return DO_NOTHING_ON_CLOSE;
    }

    public static int getHIDE_ON_CLOSE() {
        return HIDE_ON_CLOSE;
    }

    public static int getDISPOSE_ON_CLOSE() {
        return DISPOSE_ON_CLOSE;
    }

    public static int getEXIT_ON_CLOSE() {
        return EXIT_ON_CLOSE;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
