package demo;

import java.awt.EventQueue;
import javax.swing.JFrame;


public class Snake extends JFrame {

    public Snake() {

        add(new BoardS());
        
        setResizable(false);
        pack();
        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {                
                JFrame ex = new Snake();
                ex.setVisible(true);                
            }
        });
    }
} 