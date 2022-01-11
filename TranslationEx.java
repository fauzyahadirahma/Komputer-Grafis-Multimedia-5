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

public class TranslationEx extends JFrame {

    public TranslationEx() {
        initUI();
    }
    
    private void initUI() {
        add(new Surface());
        
        setTitle("Contoh Transformation - Translation");
        setSize(400, 400); //resolusi layar
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            
            public void run() {
                TranslationEx ex =  new TranslationEx();
                ex.setVisible(true);
            }
        });
    }
}