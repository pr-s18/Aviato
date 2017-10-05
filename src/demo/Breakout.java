package demo;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;

public class Breakout extends JFrame {

    public Breakout() {
        
        initUI();
    }
    
    private void initUI() {
        
        Board board = new Board();
        board.setBackground(new Color(248, 248, 255));
        getContentPane().add(board);
        setTitle("Breakout");
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(Commons.WIDTH, Commons.HEIGTH);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {                
                Breakout game = new Breakout();
                game.setVisible(true);                
            }
        });
    }
 }