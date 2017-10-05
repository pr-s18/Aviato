package demo;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;

public class manager extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					manager frame = new manager();
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
	public manager() {
		setResizable(false);
		setTitle("Manager");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 580, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new MatteBorder(6, 0, 0, 0, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("UPDATE");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UIEntertainment ent = new UIEntertainment();
				ent.setVisible(true);
				ent.setSize(450,300);
				
			}
		});
		btnNewButton.setBounds(356, 169, 169, 44);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("VIEW");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewAllEntr vae = new ViewAllEntr();
				vae.setVisible(true);
				vae.setSize(730,350);
			}
		});
		btnNewButton_1.setBounds(356, 108, 169, 44);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Logout");
		btnNewButton_2.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crew_login c = new crew_login();
				c.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(455, 277, 92, 31);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("FlyHigh With AVIATO");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 42));
		lblNewLabel.setBounds(0, 11, 583, 75);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(manager.class.getResource("/demo/managerfrnt.jpg")));
		label.setBounds(33, 108, 263, 183);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(manager.class.getResource("/demo/managerbg.jpg")));
		label_1.setBounds(0, 0, 576, 335);
		contentPane.add(label_1);
	}
}