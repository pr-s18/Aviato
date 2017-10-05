package demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Vector;
import java.awt.event.ItemEvent;
import javax.swing.SwingConstants;

public class Games extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblGenre;
	private JLabel lblMaker;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Games frame = new Games();
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
	public Games() {
		setTitle("Games");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 620, 520);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Name of Game");
		lblNewLabel.setForeground(new Color(70, 143, 180));
		lblNewLabel.setFont(new Font("Forte", Font.PLAIN, 24));
		lblNewLabel.setBounds(93, 177, 164, 26);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField.setBounds(355, 255, 183, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_1.setBounds(355, 323, 183, 31);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
				
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Games.class.getResource("/demo/games_title.jpg")));
		lblNewLabel_1.setBounds(-18, 7, 591, 158);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Games.class.getResource("/demo/games.jpg")));
		lblNewLabel_2.setBounds(38, 219, 241, 200);
		contentPane.add(lblNewLabel_2);
		
		
		
		btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnNewButton_1.setBounds(446, 401, 115, 35);
		contentPane.add(btnNewButton_1);
		
		JComboBox comboBox = new JComboBox();
		Vector vv=DAEntertainment.getGames ();
		for(Object oo:vv){
			
		comboBox.addItem(oo);
		};
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				BOEntertainment ent = new BOEntertainment();
				ent = DAEntertainment.getByName((String)e.getItem());
				textField.setText(ent.getGenre());
				textField_1.setText(ent.getMaker());
			}
		});
		comboBox.setBounds(293, 175, 270, 37);
		contentPane.add(comboBox);
		
		lblGenre = new JLabel("Genre");
		lblGenre.setForeground(Color.CYAN);
		lblGenre.setBounds(294, 264, 46, 14);
		contentPane.add(lblGenre);
		
		lblMaker = new JLabel("Maker");
		lblMaker.setForeground(Color.CYAN);
		lblMaker.setBounds(294, 332, 46, 14);
		contentPane.add(lblMaker);
		
		btnNewButton = new JButton("Play");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				if (comboBox.getSelectedItem().equals ("Snake")) {
			
					Snake s = new Snake();
					s.setVisible(true);
				}
				
				if (comboBox.getSelectedItem().equals ("Breakout")) {
					
					Breakout b = new Breakout();
					b.setVisible(true);
			}
			/*	textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
			comboBox.setSelectedIndex(0);*/
				
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnNewButton.setBounds(306, 401, 115, 35);
		contentPane.add(btnNewButton);
		
		
	}
}
