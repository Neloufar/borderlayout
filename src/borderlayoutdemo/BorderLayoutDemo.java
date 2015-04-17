/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package borderlayoutdemo;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author nl2027
 */
public class BorderLayoutDemo extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              JFrame frame = new JFrame("BorderLayout Demo");
        frame.setLayout(new BorderLayout());
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");
        frame.add(panel1);
        frame.add(panel2);
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel2.add(button4);
        panel2.add(button5);
        panel2.add(button6);
        frame.add(panel1,BorderLayout.SOUTH);
        frame.add(panel2,BorderLayout.CENTER);
        frame.pack();
        frame.setSize(300,110);
        frame.setVisible(true);
        
    }
}