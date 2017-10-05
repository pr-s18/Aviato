package demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class start extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					start frame = new start();
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
	public start() {
		setResizable(false);
		setTitle("Main page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Passenger");
		btnNewButton.setToolTipText("Click here to enter the tool ");
		btnNewButton.setForeground(new Color(51, 255, 255));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pass_login ll=new pass_login();
				ll.setVisible(true);
				//ll.setSize(664,459);
				dispose();
				
			}
		});
		btnNewButton.setOpaque(false);
		btnNewButton.setBounds(10, 195, 208, 72);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Air Crew");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crew_login cl = new crew_login();
				cl.setVisible(true);
				dispose();
				//cl.setSize(450,300);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setForeground(new Color(102, 0, 0));
		btnNewButton_1.setBounds(459, 220, 115, 29);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("FlyHigh With Aviato");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_2.setBounds(165, 42, 275, 50);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
				btnNewButton.setVisible(true);
				btnNewButton_1.setVisible(true);
				
			}
			@Override
			public void mouseDragged(MouseEvent e) {
				btnNewButton.setVisible(true);
				btnNewButton_1.setVisible(true);
			}
		});
		lblNewLabel.setForeground(new Color(102, 0, 0));
		lblNewLabel.setInheritsPopupMenu(false);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel.setIcon(new ImageIcon(start.class.getResource("/demo/maingif.gif")));
		lblNewLabel.setBounds(0, 0, 604, 304);
		contentPane.add(lblNewLabel);
	}
}
