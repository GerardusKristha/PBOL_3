package GUI;

import javax.swing.JFrame;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class gui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ini Frame Pertamaku");
        
        int tinggi = 200;
        int lebar = 300;
        
        frame.setBounds(100, 100, lebar, tinggi);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

