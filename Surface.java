/*
 * Nama     : Fauzyah Hadirahma
 * NPM      : 20191310070
 * Materi   : Transformasi - Translasi
 * Tanggal  : 6 Agustus 2021
 */
package grafika1;

/**
 *
 * @author Fauzyah
 */
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Surface extends JPanel{
    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
       
        g2d.setPaint(new Color(255, 227, 200));
        /*koordinat objek awal 0*/
        String s = "Object ke-0";
        g2d.drawString(s,15, 15);
        g2d.fillRect(20, 20, 80, 50);
        
        g2d.setPaint(new Color(233, 150, 122));
        s = "Tranlasi ke-1";
        g2d.drawString(s, 150, 15);
        g2d.translate(120, 0); //posisi translasi
        //koordinat object - target 1
        g2d.fillRect(20, 20, 80, 50);
        
        g2d.setPaint(new Color(250, 128, 114));
        s = "Tranlasi ke-2";
        g2d.drawString(s, 20, 110);
        g2d.translate(0, 100); //posisi translasi
        //koordinat object - target 2
        g2d.fillRect(20, 20, 80, 50);
        
        g2d.dispose();
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }
}