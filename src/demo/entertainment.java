package demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class entertainment extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					entertainment frame = new entertainment();
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
	public entertainment() {
		setTitle("Entertainment");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 620, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new CompoundBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(72, 61, 139)), new MatteBorder(3, 3, 3, 3, (Color) new Color(173, 216, 230))));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Movies");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movies mov = new movies ();
				mov.setVisible(true);
				mov.setSize(620,520);
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnNewButton.setBounds(49, 304, 155, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Music");
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Music mus = new Music();
				mus.setVisible(true);
				mus.setSize(620,520);
			}
		});
		btnNewButton_1.setBounds(49, 360, 155, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Books");
		btnNewButton_2.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				books bok = new books();
				bok.setVisible(true);
				bok.setSize(620,520);
			}
		});
		btnNewButton_2.setBounds(409, 304, 155, 35);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Games");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Games gam = new Games();
				gam.setVisible(true);
				gam.setSize(620,520);
			}
		});
		btnNewButton_3.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnNewButton_3.setBounds(407, 360, 155, 35);
		contentPane.add(btnNewButton_3);
		
		JButton btnSouveniers = new JButton("Souvenir");
		btnSouveniers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Souvenirs s = new Souvenirs();
				s.setVisible(true);
			}
		});
		btnSouveniers.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnSouveniers.setBounds(233, 416, 155, 35);
		contentPane.add(btnSouveniers);
		
		JLabel lblNewLabel = new JLabel("Ola! \r\nWelcome to our Entertainment section where you can have flight full");
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setFont(new Font("Berlin Sans FB", Font.ITALIC, 14));
		lblNewLabel.setBounds(84, 197, 480, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("of entertainment by enjoing different Movies, Songs and Games and");
		lblNewLabel_1.setForeground(Color.CYAN);
		lblNewLabel_1.setFont(new Font("Berlin Sans FB", Font.ITALIC, 14));
		lblNewLabel_1.setBounds(96, 233, 460, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("those passionate about reading can dig through our Ebooks collection ..");
		lblNewLabel_2.setForeground(Color.CYAN);
		lblNewLabel_2.setFont(new Font("Berlin Sans FB", Font.ITALIC, 14));
		lblNewLabel_2.setBounds(84, 264, 459, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(entertainment.class.getResource("/demo/entertainment.jpg")));
		lblNewLabel_3.setBounds(2, -5, 594, 178);
		contentPane.add(lblNewLabel_3);
		
		JLabel label = new JLabel("");
		label.setToolTipText("Home");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			Main_page m = new Main_page();
			m.setVisible(true);
				
				dispose();
			}
		});
		label.setIcon(new ImageIcon(entertainment.class.getResource("/demo/home.jpg")));
		label.setBounds(270, 305, 62, 56);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(entertainment.class.getResource("/demo/entertainmentbg.jpg")));
		label_1.setBounds(1, 148, 594, 319);
		contentPane.add(label_1);
	}
}
