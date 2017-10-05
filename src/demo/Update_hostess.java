package demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Update_hostess extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Update_hostess frame = new Update_hostess();
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
	public Update_hostess() {
		setTitle("UpdateHostess");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ticket number");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(34, 68, 129, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblPurpose = new JLabel("Purpose");
		lblPurpose.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblPurpose.setHorizontalAlignment(SwingConstants.CENTER);
		lblPurpose.setBounds(34, 118, 129, 24);
		contentPane.add(lblPurpose);
		
		textField = new JTextField();
		textField.setBounds(192, 71, 160, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(192, 121, 160, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (DAAir_hostess.delete(  Integer.parseInt  (  textField.getText()  ),   (textField_1.getText()  )  )) {
					JOptionPane.showMessageDialog (null, " Task Completed");
				}
				else {
					JOptionPane.showMessageDialog (null, "ERROR!!!");
				}
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 13));
		btnNewButton.setBounds(87, 193, 103, 24);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Air_hostess ah = new Air_hostess();
				ah.setVisible(true);
				ah.setSize(800,500);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_1.setBounds(237, 194, 110, 23);
		contentPane.add(btnNewButton_1);
	}
}
