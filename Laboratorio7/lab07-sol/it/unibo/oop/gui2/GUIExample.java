package a02a.sol2;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class GUIExample extends JFrame {
    
    
    public GUIExample() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        int cols = 3; // {1,2,3,4,5}
        JPanel panel = new JPanel(new GridLayout(cols,cols));
        this.getContentPane().add(BorderLayout.CENTER,panel);
        ActionListener al = (e)->{
            final JButton bt = (JButton)e.getSource();
            bt.setText("X");
            System.exit(1);
        };
        for (int i=0;i<3*3;i++){
            final JButton jb = new JButton("a");
            jb.addActionListener(al);
            panel.add(jb);
        } 
        this.setVisible(true);
    }

        
    public static void main(String[] args){
        new GUIExample();
    }
        
}
