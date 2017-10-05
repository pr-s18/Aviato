package demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class crew_login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					crew_login frame = new crew_login();
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
	public crew_login() {
		setResizable(false);
		setTitle("CrewLogin");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 117, 80, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 165, 80, 31);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(96, 128, 124, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnLogin = new JButton("Back");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				start s = new start();
				s.setVisible(true);
				dispose();
			}
		});
		btnLogin.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnLogin.setBounds(314, 75, 110, 23);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel_2 = new JLabel("Air Crew Section");
		lblNewLabel_2.setForeground(new Color(25, 25, 112));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Algerian", Font.BOLD, 22));
		lblNewLabel_2.setBounds(21, 64, 237, 45);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(crew_login.class.getResource("/demo/Smart-Cabin-Crew-pictures-2.jpg")));
		lblNewLabel_3.setBounds(245, 105, 179, 157);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BOCrew crw = DACrew.getById(textField.getText (),passwordField.getText());
				if(crw==null) {	
					JOptionPane.showMessageDialog (null, "ERROR!!!");
					textField.setText(null);
					passwordField.setText(null);
				}
				else if (crw.getUsername().equals("Airhostess")) {
					Air_hostess ah = new Air_hostess();
					ah.setVisible(true);
					//ah.setSize(800,500);
					dispose();
				}
				else if (crw.getUsername().equals("manager")){
					manager mng = new manager();
					mng.setVisible(true);
					//mng.setSize(450,300);
					dispose();
				}
				else if (crw.getUsername().equals("Chef")) {
					chef_master cf = new chef_master();
					cf.setVisible(true);
					//cf.setSize(485,367);
					dispose();
				}
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnNewButton.setBounds(68, 215, 101, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(crew_login.class.getResource("/demo/crew_login_title.jpg")));
		lblNewLabel_4.setBounds(0, 0, 434, 53);
		contentPane.add(lblNewLabel_4);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(96, 170, 124, 23);
		contentPane.add(passwordField);
	}
}
