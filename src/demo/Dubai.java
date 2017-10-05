package demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class Dubai extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dubai frame = new Dubai();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Dubai() {
		setResizable(false);
		setTitle("Dubai");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 790, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLaLouvre = new JLabel("Palm Islands");
		lblLaLouvre.setOpaque(true);
		lblLaLouvre.setForeground(new Color(0, 0, 128));
		lblLaLouvre.setFont(new Font("Algerian", Font.BOLD, 27));
		lblLaLouvre.setBackground(new Color(173, 216, 230));
		lblLaLouvre.setBounds(408, 391, 196, 27);
		contentPane.add(lblLaLouvre);
		
		JLabel lblNotreDame = new JLabel("Burj Al Arab");
		lblNotreDame.setOpaque(true);
		lblNotreDame.setForeground(new Color(0, 0, 128));
		lblNotreDame.setFont(new Font("Algerian", Font.BOLD, 27));
		lblNotreDame.setBackground(new Color(173, 216, 230));
		lblNotreDame.setBounds(407, 166, 206, 27);
		contentPane.add(lblNotreDame);
		
		JLabel lblArcDeTriomphe = new JLabel("Dubai Creek");
		lblArcDeTriomphe.setOpaque(true);
		lblArcDeTriomphe.setForeground(new Color(0, 0, 128));
		lblArcDeTriomphe.setFont(new Font("Algerian", Font.BOLD, 27));
		lblArcDeTriomphe.setBackground(new Color(173, 216, 230));
		lblArcDeTriomphe.setBounds(15, 391, 180, 27);
		contentPane.add(lblArcDeTriomphe);
		
		JLabel lblFamousTouristSpots = new JLabel("Burj Khalifa");
		lblFamousTouristSpots.setOpaque(true);
		lblFamousTouristSpots.setBackground(new Color(173, 216, 230));
		lblFamousTouristSpots.setFont(new Font("Algerian", Font.BOLD, 27));
		lblFamousTouristSpots.setForeground(new Color(0, 0, 128));
		lblFamousTouristSpots.setBounds(15, 166, 196, 27);
		contentPane.add(lblFamousTouristSpots);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Dubai.class.getResource("/demo/Dubaibg.jpg")));
		label.setBounds(0, 0, 784, 450);
		contentPane.add(label);
	}
}
