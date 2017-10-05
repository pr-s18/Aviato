package demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.UIManager;

public class Explore extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Explore frame = new Explore();
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
	public Explore() {
		setTitle("Explore");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 504, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLasVegas = new JButton("Las Vegas");
		btnLasVegas.setForeground(new Color(51, 153, 102));
		btnLasVegas.setHorizontalAlignment(SwingConstants.LEFT);
		btnLasVegas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LasVegas ll = new LasVegas();
				ll.setVisible(true);
			}
		});
		btnLasVegas.setOpaque(false);
		btnLasVegas.setFont(new Font("Comic Sans MS", Font.ITALIC, 25));
		btnLasVegas.setBorderPainted(false);
		btnLasVegas.setBackground(Color.WHITE);
		btnLasVegas.setBounds(360, 283, 159, 33);
		contentPane.add(btnLasVegas);
		
		JButton btnAgra = new JButton("Agra");
		btnAgra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Agra ll = new Agra();
				ll.setVisible(true);
			}
		});
		btnAgra.setForeground(new Color(51, 153, 102));
		btnAgra.setOpaque(false);
		btnAgra.setFont(new Font("Comic Sans MS", Font.ITALIC, 25));
		btnAgra.setBorderPainted(false);
		btnAgra.setBackground(Color.WHITE);
		btnAgra.setBounds(375, 239, 113, 34);
		contentPane.add(btnAgra);
		
		JButton btnParis = new JButton("Paris");
		btnParis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Paris ll = new Paris();
				ll.setVisible(true);
			}
		});
		btnParis.setOpaque(false);
		btnParis.setForeground(new Color(51, 153, 102));
		btnParis.setFont(new Font("Comic Sans MS", Font.ITALIC, 25));
		btnParis.setBorderPainted(false);
		btnParis.setBackground(Color.WHITE);
		btnParis.setBounds(21, 258, 103, 23);
		contentPane.add(btnParis);
		
		JButton btnDubai = new JButton("Dubai");
		btnDubai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dubai ll = new Dubai();
				ll.setVisible(true);
			}
		});
		btnDubai.setOpaque(false);
		btnDubai.setForeground(new Color(51, 153, 102));
		btnDubai.setFont(new Font("Comic Sans MS", Font.ITALIC, 25));
		btnDubai.setBorderPainted(false);
		btnDubai.setBackground(Color.WHITE);
		btnDubai.setBounds(21, 293, 110, 23);
		contentPane.add(btnDubai);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Explore.class.getResource("/demo/travel-the-world-quotesexplore-explore-explore-travelquote-travel-quotes-pinterest-mekkzb6b.gif")));
		lblNewLabel.setBounds(0, 0, 500, 331);
		contentPane.add(lblNewLabel);
	}
}
