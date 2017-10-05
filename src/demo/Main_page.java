package demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;

public class Main_page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_page frame = new Main_page();
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
	public Main_page() {
		setTitle("MainPage");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 600, 490);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new CompoundBorder(new MatteBorder(8, 6, 8, 6, (Color) new Color(0, 0, 128)), new CompoundBorder(new MatteBorder(6, 4, 6, 4, (Color) new Color(0, 0, 255)), new MatteBorder(5, 3, 5, 3, (Color) new Color(30, 144, 255)))));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Entertainment");
		btnNewButton.setIcon(null);
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entertainment en = new entertainment ();
				en.setVisible(true);
				//en.setSize(620,520);
				dispose();
			}
		});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Main_page.class.getResource("/demo/main_title.jpg")));
		lblNewLabel.setBounds(0, 0, 594, 107);
		contentPane.add(lblNewLabel);
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 17));
		btnNewButton.setBounds(59, 160, 145, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Inquiry");
		btnNewButton_1.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inquiry inq = new inquiry ();
				inq.setVisible(true);
				//inq.setSize(620,1000);
				//dispose();
			}
		});
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Main_page.class.getResource("/demo/main.jpg")));
		label_1.setBounds(268, 191, 250, 177);
		contentPane.add(label_1);
		btnNewButton_1.setFont(new Font("Calibri", Font.BOLD, 17));
		btnNewButton_1.setBounds(59, 366, 145, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Services");
		btnNewButton_2.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_2.setFont(new Font("Calibri", Font.BOLD, 17));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				services ser = new services();
				ser.setVisible(true);
				//ser.setSize(450,300);
				dispose();
			}
		});
		btnNewButton_2.setBounds(59, 226, 145, 40);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Explore");
		btnNewButton_3.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Explore ex = new Explore();
				ex.setVisible(true);
				//dispose();
			}
		});
		btnNewButton_3.setFont(new Font("Calibri", Font.BOLD, 17));
		btnNewButton_3.setBounds(59, 296, 145, 40);
		contentPane.add(btnNewButton_3);
		
		
		JLabel lblNewLabel_1 = new JLabel("Welcome   "+Invoker.psn.getName());
		lblNewLabel_1.setBackground(Color.CYAN);
		lblNewLabel_1.setFont(new Font("Lucida Handwriting", Font.BOLD, 16));
		lblNewLabel_1.setForeground(new Color(30, 144, 255));
		lblNewLabel_1.setBounds(106, 115, 250, 29);
		contentPane.add(lblNewLabel_1);
		
		JButton btnAboutUs = new JButton("About Us");
		btnAboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About_us abs = new About_us();
				abs.setVisible(true);
				dispose();
			}
		});
		btnAboutUs.setFont(new Font("Calibri", Font.BOLD, 16));
		btnAboutUs.setBounds(444, 117, 114, 29);
		contentPane.add(btnAboutUs);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog (null, "Thanks for travelling with us!! We hope u Enjoyed. ");
				Invoker.psn = null;
				start s = new start();
				s.setVisible(true);
				dispose();
			}
		});
		btnLogout.setFont(new Font("Sylfaen", Font.BOLD, 14));
		btnLogout.setBounds(444, 405, 114, 29);
		contentPane.add(btnLogout);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Main_page.class.getResource("/demo/mainbg.jpg")));
		label.setBounds(0, 0, 594, 450);
		contentPane.add(label);
	}
}
