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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class books extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblGenre;
	private JLabel lblWriter;
	private JLabel lblPages;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					books frame = new books();
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
	public books() {
		setTitle("Books");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 620, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new CompoundBorder(new MatteBorder(6, 4, 6, 4, (Color) new Color(0, 0, 128)), new MatteBorder(4, 2, 4, 2, (Color) new Color(0, 0, 255))));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name of Book");
		lblNewLabel.setForeground(new Color(70, 147, 180));
		lblNewLabel.setFont(new Font("Forte", Font.PLAIN, 24));
		lblNewLabel.setBounds(42, 142, 164, 26);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField.setBounds(355, 215, 183, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_1.setBounds(355, 270, 183, 31);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_2.setBounds(355, 326, 183, 31);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(books.class.getResource("/demo/books_title.jpg")));
		lblNewLabel_1.setBounds(10, 7, 611, 124);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(books.class.getResource("/demo/books.jpg")));
		lblNewLabel_2.setBounds(40, 186, 241, 200);
		contentPane.add(lblNewLabel_2);
		
		
		
		btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnNewButton_1.setBounds(448, 410, 115, 35);
		contentPane.add(btnNewButton_1);
		
		JComboBox comboBox = new JComboBox();
		Vector vv=DAEntertainment.getBooks ();
		for(Object oo:vv){
		comboBox.addItem(oo);
		};
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				BOEntertainment ent = new BOEntertainment();
				ent = DAEntertainment.getByName((String)e.getItem());
				textField.setText(ent.getGenre());
				textField_1.setText(ent.getMaker());
				textField_2.setText(ent.getTime());
			}
		});
		comboBox.setBounds(293, 145, 270, 37);
		contentPane.add(comboBox);
		
		lblGenre = new JLabel("Genre");
		lblGenre.setForeground(Color.CYAN);
		lblGenre.setFont(new Font("Comic Sans MS", Font.ITALIC, 17));
		lblGenre.setBounds(275, 226, 70, 21);
		contentPane.add(lblGenre);
		
		lblWriter = new JLabel("Writer");
		lblWriter.setForeground(Color.CYAN);
		lblWriter.setFont(new Font("Comic Sans MS", Font.ITALIC, 17));
		lblWriter.setBounds(275, 279, 70, 21);
		contentPane.add(lblWriter);
		
		lblPages = new JLabel("Pages");
		lblPages.setForeground(Color.CYAN);
		lblPages.setFont(new Font("Comic Sans MS", Font.ITALIC, 17));
		lblPages.setBounds(275, 330, 46, 24);
		contentPane.add(lblPages);
		
		btnNewButton = new JButton("Read");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
			//	textField_3.setText(null);
				
				
				if (comboBox.getSelectedItem().equals ("If_tomorrow_comes")) {
					try {
						Tomorrow.main(null);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				if (comboBox.getSelectedItem().equals ("True_blue")) {
					try {
						Blue.main(null);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				if (comboBox.getSelectedItem().equals ("Angels&Demons")) {
					try {
						Angels.main(null);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				if (comboBox.getSelectedItem().equals ("Only_time_will_tell")) {
					try {
						Time.main(null);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				if (comboBox.getSelectedItem().equals ("On_Street_where_u_live")) {
					try {
						Street.main(null);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				
				comboBox.setSelectedIndex(0);
				
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnNewButton.setBounds(306, 410, 115, 35);
		contentPane.add(btnNewButton);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(books.class.getResource("/demo/booksbg.jpg")));
		label.setBounds(0, -1, 614, 509);
		contentPane.add(label);
		
	}
}
