package demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class update_cafe extends JFrame {

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
					update_cafe frame = new update_cafe();
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
	public update_cafe() {
		setTitle("Cafe_Menu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 476, 385);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(303, 60, 165, 181);
		lblNewLabel_2.setIcon(new ImageIcon(update_cafe.class.getResource("/demo/update_cafe.jpg")));
		contentPane.add(lblNewLabel_2);
		
		
		
		JLabel lblCafeMenu = new JLabel("CAFE   MENU");
		lblCafeMenu.setBounds(90, 11, 284, 31);
		lblCafeMenu.setForeground(new Color(255, 255, 255));
		lblCafeMenu.setBackground(new Color(255, 255, 255));
		lblCafeMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblCafeMenu.setFont(new Font("Gabriola", Font.BOLD, 38));
		contentPane.add(lblCafeMenu);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(50, 119, 50, 19);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Caladea", Font.PLAIN, 17));
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(156, 118, 139, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(50, 171, 46, 14);
		lblPrice.setForeground(new Color(255, 255, 255));
		lblPrice.setFont(new Font("Caladea", Font.PLAIN, 17));
		contentPane.add(lblPrice);
		
		textField_1 = new JTextField();
		textField_1.setBounds(158, 165, 139, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblType = new JLabel("Type");
		lblType.setBounds(50, 217, 46, 20);
		lblType.setForeground(new Color(255, 255, 255));
		lblType.setFont(new Font("Caladea", Font.PLAIN, 17));
		contentPane.add(lblType);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(156, 218, 139, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"--None--", "Drinks", "Snacks", "Main Course", "Desserts", "Packed Items"}));
		comboBox.setSelectedIndex(0);
		comboBox.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(156, 68, 139, 20);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"--None--", "Add", "Update", "Delete"}));
		comboBox_1.setSelectedIndex(0);
		comboBox_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		contentPane.add(comboBox_1);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String op =(String)comboBox_1.getSelectedItem ();
				
				if (op.equals ("Add")) {
					BOUpdate_cafe upcf = new BOUpdate_cafe ();
					upcf.setType ((String)comboBox.getSelectedItem ());
					upcf.setName (textField.getText ());
					upcf.setPrice (Integer.parseInt (textField_1.getText ()));
					if (DAUpdate_cafe.add (upcf)) {
						JOptionPane.showMessageDialog (null, "Item Successfully Added");
					}
					else {
						JOptionPane.showMessageDialog (null, "ERROR!!!");
					}
				}
				else if (op.equals("Update")) {
					BOUpdate_cafe upcf = new BOUpdate_cafe ();
					upcf.setType ((String)comboBox.getSelectedItem ());
					upcf.setName (textField.getText ());
					upcf.setPrice (Integer.parseInt (textField_1.getText ()));
					if (DAUpdate_cafe.update (upcf)) {
						JOptionPane.showMessageDialog (null, "Item Successfully Updated");
					}
					else  {
						JOptionPane.showMessageDialog (null, "ERROR!!!");
					}
				}
				else if (op.equals("Delete")){
					if (DAUpdate_cafe.delete (textField.getText())) {
						JOptionPane.showMessageDialog (null, "Item Deleted");
					}
					else {
						JOptionPane.showMessageDialog (null, "ERROR!!!");
					}
				}
				
			}
		});
		btnSubmit.setBounds(68, 293, 111, 31);
		btnSubmit.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		contentPane.add(btnSubmit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				comboBox.setSelectedIndex(0);
				comboBox_1.setSelectedIndex(0);
			}
		});
		btnReset.setBounds(306, 293, 111, 31);
		btnReset.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		contentPane.add(btnReset);
		
		JLabel lblOperation = new JLabel("Operation");
		lblOperation.setBounds(50, 71, 82, 19);
		lblOperation.setForeground(new Color(255, 255, 255));
		lblOperation.setFont(new Font("Caladea", Font.PLAIN, 17));
		contentPane.add(lblOperation);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(2, 0, 467, 359);
		lblNewLabel_1.setIcon(new ImageIcon(update_cafe.class.getResource("/demo/update_cafe_back (1).jpg")));
		contentPane.add(lblNewLabel_1);
	}
}
