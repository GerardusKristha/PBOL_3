package GUI;

import javax.swing.*;
/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class find_frame extends JFrame{
    public find_frame(){
        this.setSize(420,140);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Find");
        
       JPanel panel = new JPanel();
       panel.setLayout(null);
       
       JLabel label = new JLabel("Keyword:");
       label.setBounds(15,10,100,25);
       panel.add(label);
       
       JTextField textfld = new JTextField();
       textfld.setBounds(15,40,(420-40),25);
       panel.add(textfld);
       
       
       JButton button = new JButton();
       button.setText("Find");
       button.setBounds(15,70,60,25);
       panel.add(button);
       
       this.add(panel);
       this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new find_frame();
    }
}


//        final int frameX = 420;
//        final int frameY = 140;
//        final int marginLeft = 15;
//        final int marginRight = frameX - marginLeft;
//        final int marginTop = 15;
//        final int marginButtom = frameY - marginTop;
//        final int compHeight = 25;
//        final int compWidth = compHeight * 3;
//       label.setBounds(marginLeft, marginTop, compWidth, compHeight);
//       textfld.setBounds(marginLeft, marginTop + compHeight, marginRight-marginLeft,compHeight);
//       button.setBounds(marginLeft, marginButtom-2*compHeight, compHeight*3, compHeight);


