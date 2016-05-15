/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Database;
import model.Image;

/**
 *
 * @author Lenovo
 */
public class PicturesPanel extends JPanel {

    private BufferedImage image;
    private ArrayList<BufferedImage> pictures;
    ArrayList<Object[][]> donnes;
    Object[][] data;
    Vector v1 = new Vector();
    Vector v3 = new Vector();

    public PicturesPanel() {
        v1.addElement("Nom Article");
        v1.addElement("Type Article");
        v1.addElement("Prix Achat");
        v1.addElement("Genre Article");
        v1.addElement("Image");
   

        //headers for the table
        Database db = new Database();
        ArrayList<Object[][]> donnes = new ArrayList<Object[][]>();

        try {

            ArrayList<Image> p1 = db.getImages();
            for (Image p : p1) {
                Vector v2 = new Vector();
                v2.addElement(p.getNomArticle());
                v2.addElement(p.getTypeArticle());
                v2.addElement(p.getPrixAchat());
                v2.addElement(p.getGenreArticle());
                
                ImageIcon img = new ImageIcon("C:\\wamp\\www\\TunisiaMallFinalVersion\\web\\uploads\\" + p.getPath());

                v2.addElement(img);

                v3.add(v2);
            //create table with data

            }
            DefaultTableModel tableModel = new DefaultTableModel(v3, v1);
            JTable table = new JTable(tableModel) {
                public Class getColumnClass(int column) {
                    return getValueAt(0, column).getClass();
                }

                public boolean getScrollableTracksViewportWidth() {
                    return getPreferredSize().width < getParent().getWidth();
                }

            };

            table.setRowHeight(200);
           table.getColumnModel().getColumn(4).setPreferredWidth(300);
            table.setSize(new Dimension(600, 600));

        //add the table to the frame
            this.add(new JScrollPane(table));

        } catch (Exception ex) {
            Logger.getLogger(Pidev.class.getName()).log(Level.SEVERE, null, ex);
        }

        //actual data for the table in a 2d array
    }

}
