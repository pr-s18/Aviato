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

public class Paris extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paris frame = new Paris();
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
	public Paris() {
		setResizable(false);
		setTitle("PARIS");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 790, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLaLouvre = new JLabel("La Louvre");
		lblLaLouvre.setOpaque(true);
		lblLaLouvre.setForeground(new Color(0, 0, 128));
		lblLaLouvre.setFont(new Font("Algerian", Font.BOLD, 27));
		lblLaLouvre.setBackground(new Color(173, 216, 230));
		lblLaLouvre.setBounds(407, 397, 199, 27);
		contentPane.add(lblLaLouvre);
		
		JLabel lblNotreDame = new JLabel("Notre Dame");
		lblNotreDame.setOpaque(true);
		lblNotreDame.setForeground(new Color(0, 0, 128));
		lblNotreDame.setFont(new Font("Algerian", Font.BOLD, 27));
		lblNotreDame.setBackground(new Color(173, 216, 230));
		lblNotreDame.setBounds(442, 172, 199, 27);
		contentPane.add(lblNotreDame);
		
		JLabel lblArcDeTriomphe = new JLabel("Arc de Triomphe");
		lblArcDeTriomphe.setOpaque(true);
		lblArcDeTriomphe.setForeground(new Color(0, 0, 128));
		lblArcDeTriomphe.setFont(new Font("Algerian", Font.BOLD, 27));
		lblArcDeTriomphe.setBackground(new Color(173, 216, 230));
		lblArcDeTriomphe.setBounds(15, 391, 243, 27);
		contentPane.add(lblArcDeTriomphe);
		
		JLabel lblFamousTouristSpots = new JLabel("Eiffel Tower");
		lblFamousTouristSpots.setOpaque(true);
		lblFamousTouristSpots.setBackground(new Color(173, 216, 230));
		lblFamousTouristSpots.setFont(new Font("Algerian", Font.BOLD, 27));
		lblFamousTouristSpots.setForeground(new Color(0, 0, 128));
		lblFamousTouristSpots.setBounds(15, 166, 199, 27);
		contentPane.add(lblFamousTouristSpots);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Paris.class.getResource("/demo/Parisbg.jpg")));
		label.setBounds(0, 0, 784, 461);
		contentPane.add(label);
	}
}
