/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import dao.CategorieDao;
import entite.Categorie;

import utils.DisplayCategorie;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author Hakim
 */
public class CategorieFrame extends javax.swing.JFrame {

    /**
     * Creates new form PubFrame
     */
    public CategorieFrame() {
        initComponents();
        lparcourir2.setVisible(true);
        this.setResizable(false);
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        lnom = new javax.swing.JLabel();
        tfnom = new javax.swing.JTextField();
        ltype = new javax.swing.JLabel();
        rbgold = new javax.swing.JRadioButton();
        rbsilver = new javax.swing.JRadioButton();
        rbbronze = new javax.swing.JRadioButton();
        bajout = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableajout = new javax.swing.JTable();
        lparcourir = new javax.swing.JLabel();
        lparcourir2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableupdate = new javax.swing.JTable();
        llnom = new javax.swing.JLabel();
        lltype = new javax.swing.JLabel();
        tffnom = new javax.swing.JTextField();
        lid = new javax.swing.JLabel();
        tfid = new javax.swing.JTextField();
        IMessage2 = new javax.swing.JLabel();
        rbbgold = new javax.swing.JRadioButton();
        rbbsilver = new javax.swing.JRadioButton();
        rbbbronze = new javax.swing.JRadioButton();
        jButtonupdate = new javax.swing.JButton();
        llparcourir = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablesupp = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        llrecherche = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        jLabel2.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        jLabel2.setText("Gestion Categorie");

        jTabbedPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel3.setEnabled(false);
        jPanel3.setLayout(null);

        lnom.setText("Nom");
        jPanel3.add(lnom);
        lnom.setBounds(20, 30, 40, 14);
        jPanel3.add(tfnom);
        tfnom.setBounds(70, 30, 130, 20);

        ltype.setText("Type");
        jPanel3.add(ltype);
        ltype.setBounds(20, 70, 40, 14);

        rbgold.setText("Homme");
        rbgold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbgoldActionPerformed(evt);
            }
        });
        jPanel3.add(rbgold);
        rbgold.setBounds(70, 70, 70, 23);

        rbsilver.setText("Femme");
        rbsilver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsilverActionPerformed(evt);
            }
        });
        jPanel3.add(rbsilver);
        rbsilver.setBounds(70, 100, 70, 23);

        rbbronze.setText("Enfant");
        rbbronze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbronzeActionPerformed(evt);
            }
        });
        jPanel3.add(rbbronze);
        rbbronze.setBounds(70, 130, 90, 23);

        bajout.setText("Ajouter");
        bajout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajoutActionPerformed(evt);
            }
        });
        jPanel3.add(bajout);
        bajout.setBounds(40, 200, 170, 40);

        tableajout.setModel(new DisplayCategorie());
        jScrollPane5.setViewportView(tableajout);

        jPanel3.add(jScrollPane5);
        jScrollPane5.setBounds(270, 10, 340, 240);
        jPanel3.add(lparcourir);
        lparcourir.setBounds(20, 220, 180, 0);
        jPanel3.add(lparcourir2);
        lparcourir2.setBounds(10, 220, 230, 30);

        jTabbedPane2.addTab("Ajouter Publicité", jPanel3);

        tableupdate.setModel(new DisplayCategorie());
        tableupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableupdateMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tableupdate);

        llnom.setText("nom");

        lltype.setText("type");

        lid.setText("id");

        tfid.setEnabled(false);
        tfid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfidActionPerformed(evt);
            }
        });

        IMessage2.setForeground(new java.awt.Color(255, 0, 0));

        rbbgold.setText("Homme");
        rbbgold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbgoldActionPerformed(evt);
            }
        });

        rbbsilver.setText("Femme");
        rbbsilver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbsilverActionPerformed(evt);
            }
        });

        rbbbronze.setText("Enfant");
        rbbbronze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbbronzeActionPerformed(evt);
            }
        });

        jButtonupdate.setText("modifier");
        jButtonupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonupdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lltype)
                                .addComponent(llnom))
                            .addComponent(lid))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfid, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tffnom, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbbgold)
                                    .addComponent(rbbsilver)
                                    .addComponent(rbbbronze))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(llparcourir, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(IMessage2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lid)
                            .addComponent(tfid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(llnom)
                            .addComponent(tffnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lltype)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(rbbgold)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbbsilver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbbbronze)))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(llparcourir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(IMessage2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Modifier Publicité", jPanel5);

        tablesupp.setModel(new DisplayCategorie());
        tablesupp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablesuppMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tablesuppMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(tablesupp);

        jButton4.setText("supprimer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jButton4)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Supprimer Pulicité", jPanel4);

        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        llrecherche.setText("recherche");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(379, Short.MAX_VALUE)
                .addComponent(llrecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(llrecherche))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
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
public String type(){
    if(rbgold.isSelected()){
        return "homme";
    }else if(rbsilver.isSelected()){
        return "femme";
    }else {
        return "enfant";
    }
}
public String ttype(){
    if(rbbgold.isSelected()){
        return "homme";
    }else if(rbbsilver.isSelected()){
        return "femme";
    }else {
        return "enfant";
    }
}
    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
       
    }//GEN-LAST:event_searchKeyReleased

    private void rbbbronzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbbronzeActionPerformed
        rbbsilver.setSelected(false);
        rbbgold.setSelected(false);
    }//GEN-LAST:event_rbbbronzeActionPerformed

    private void rbbsilverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbsilverActionPerformed
        rbbgold.setSelected(false);
        rbbbronze.setSelected(false);
    }//GEN-LAST:event_rbbsilverActionPerformed

    private void rbbgoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbgoldActionPerformed
        rbbsilver.setSelected(false);
        rbbbronze.setSelected(false);
    }//GEN-LAST:event_rbbgoldActionPerformed

    private void tfidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfidActionPerformed

    }//GEN-LAST:event_tfidActionPerformed

    private void tableupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableupdateMouseClicked
        tfid.setText(tableupdate.getValueAt(tableupdate.getSelectedRow(), 0).toString());
        tffnom.setText(tableupdate.getValueAt(tableupdate.getSelectedRow(), 1).toString());
     
        if(tableupdate.getValueAt(tableupdate.getSelectedRow(), 2).toString().equals("homme")){
            rbbgold.setSelected(true);
            rbbsilver.setSelected(false);
            rbbbronze.setSelected(false);

        }else if(tableupdate.getValueAt(tableupdate.getSelectedRow(), 2).toString().equals("femme")){
            rbbsilver.setSelected(true);
            rbbgold.setSelected(false);
            rbbbronze.setSelected(false);
        }else if(tableupdate.getValueAt(tableupdate.getSelectedRow(), 2).toString().equals("enfant")){
            rbbbronze.setSelected(true);
            rbbgold.setSelected(false);
            rbbsilver.setSelected(false);

        }
    }//GEN-LAST:event_tableupdateMouseClicked

    private void bajoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajoutActionPerformed
       
        if (tfnom.getText().equals("") || !(rbgold.isSelected() || rbsilver.isSelected() || rbbronze.isSelected())) {
            JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs", "attention", JOptionPane.ERROR_MESSAGE, null);
            return;
        }
        
        new CategorieDao().addCategorie(new Categorie(tfnom.getText(), type()));
        tableajout.setModel(new DisplayCategorie());
        tablesupp.setModel(new DisplayCategorie());
        tableupdate.setModel(new DisplayCategorie());
        
        tfnom.setText("");
      
    }//GEN-LAST:event_bajoutActionPerformed

    private void rbbronzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbronzeActionPerformed
        rbsilver.setSelected(false);
        rbgold.setSelected(false);
    }//GEN-LAST:event_rbbronzeActionPerformed

    private void rbsilverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsilverActionPerformed
        rbgold.setSelected(false);
        rbbronze.setSelected(false);
    }//GEN-LAST:event_rbsilverActionPerformed

    private void rbgoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbgoldActionPerformed
        rbsilver.setSelected(false);
        rbbronze.setSelected(false);
    }//GEN-LAST:event_rbgoldActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new CategorieDao().removeCategorieById(Integer.parseInt(tablesupp.getValueAt(tablesupp.getSelectedRow(), 0).toString()));
        tableajout.setModel(new DisplayCategorie());
        tablesupp.setModel(new DisplayCategorie());
        tableupdate.setModel(new DisplayCategorie());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tablesuppMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablesuppMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tablesuppMouseEntered

    private void tablesuppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablesuppMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablesuppMouseClicked

    private void jButtonupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonupdateActionPerformed
 if (tffnom.getText().equals("") || !(rbbgold.isSelected() || rbbsilver.isSelected() || rbbronze.isSelected()) ) {
            JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs", "attention", JOptionPane.ERROR_MESSAGE, null);
            return;
        }        
        
        new CategorieDao().updateCategorie(new Categorie(Integer.parseInt(tfid.getText()), tffnom.getText(), ttype()));
        tableajout.setModel(new DisplayCategorie());
        tablesupp.setModel(new DisplayCategorie());
        tableupdate.setModel(new DisplayCategorie());
        tfid.setText("");
         
        tffnom.setText("");
    }//GEN-LAST:event_jButtonupdateActionPerformed

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
            java.util.logging.Logger.getLogger(CategorieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategorieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategorieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategorieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategorieFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IMessage2;
    private javax.swing.JButton bajout;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonupdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lid;
    private javax.swing.JLabel llnom;
    private javax.swing.JLabel llparcourir;
    private javax.swing.JLabel llrecherche;
    private javax.swing.JLabel lltype;
    private javax.swing.JLabel lnom;
    private javax.swing.JLabel lparcourir;
    private javax.swing.JLabel lparcourir2;
    private javax.swing.JLabel ltype;
    private javax.swing.JRadioButton rbbbronze;
    private javax.swing.JRadioButton rbbgold;
    private javax.swing.JRadioButton rbbronze;
    private javax.swing.JRadioButton rbbsilver;
    private javax.swing.JRadioButton rbgold;
    private javax.swing.JRadioButton rbsilver;
    private javax.swing.JTextField search;
    private javax.swing.JTable tableajout;
    private javax.swing.JTable tablesupp;
    private javax.swing.JTable tableupdate;
    private javax.swing.JTextField tffnom;
    private javax.swing.JTextField tfid;
    private javax.swing.JTextField tfnom;
    // End of variables declaration//GEN-END:variables
}