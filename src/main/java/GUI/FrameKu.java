package GUI;

import javax.swing.*;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class FrameKu extends JFrame{
    public FrameKu(){
        this.setSize(300,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ini Class turunan dari class JFrame");
        
        JPanel panel = new JPanel();
        JButton tombol = new JButton();
        tombol.setText("Ini Tombol");
        panel.add(tombol);
        JLabel label = new JLabel();
        label.setText("Ini Label");
        panel.add(label);
        JTextField textfld = new JTextField();
        panel.add(textfld);
        JCheckBox checkBox = new JCheckBox();
        panel.add(checkBox);
        JRadioButton radioButton = new JRadioButton();
        panel.add(radioButton);
        this.add(panel);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new FrameKu();
    }
}

