import java.awt.*;
import java.swing.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.*;

public class Puzzle extends JFrame implements ActionListener {
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, shuffle;
    int counter = 0;
    JLabel counterLabel; 
    
    Puzzle() {
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1 = new JButton("1");
        b2 = new JButton("");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        shuffle = new JButton("Shuffle!");
        counterLabel = new JLabel("Clicks: 0");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(shuffle);
        
        Container contentPane = this.getContentPane();
        contentPane.add(counterLabel);

        b1.setBounds(90, 60, 50, 40);
        b2.setBounds(160, 60, 50, 40);
        b3.setBounds(230, 60, 50, 40);
        b4.setBounds(90, 115, 50, 40);
        b5.setBounds(160, 115, 50, 40);
        b6.setBounds(230, 115, 50, 40);
        b7.setBounds(90, 170, 50, 40);
        b8.setBounds(160, 170, 50, 40);
        b9.setBounds(230, 170, 50, 40);
        shuffle.setBounds(135, 245, 100, 40);
        counterLabel.setBounds(145, 15, 180, 40);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
