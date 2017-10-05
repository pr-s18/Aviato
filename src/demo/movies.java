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
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

public class movies extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movies frame = new movies();
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
	public movies() {
		setTitle("Movies");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 620, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new CompoundBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 128)), new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 255))));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Name of Movie");
		lblNewLabel.setForeground(new Color(70, 143, 180));
		lblNewLabel.setFont(new Font("Forte", Font.PLAIN, 24));
		lblNewLabel.setBounds(42, 139, 164, 26);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField.setBounds(382, 190, 183, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_1.setBounds(382, 244, 183, 31);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_2.setBounds(382, 301, 183, 31);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_3.setBounds(382, 356, 183, 31);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(movies.class.getResource("/demo/movie_title.jpg")));
		lblNewLabel_1.setBounds(2, 1, 612, 121);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(movies.class.getResource("/demo/movies.jpg")));
		lblNewLabel_2.setBounds(40, 186, 241, 200);
		contentPane.add(lblNewLabel_2);
		
		
		
		btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnNewButton_1.setBounds(448, 417, 115, 35);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setToolTipText("Home");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Main_page m = new Main_page();
			m.setVisible(true);
			dispose();
			}
		});
	//	lblNewLabel_3.setIcon(new ImageIcon(movies.class.getResource("/demo/home.jpg")));
	//	lblNewLabel_3.setBounds(30, 403, 69, 55);
	//	contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		Vector vv=DAEntertainment.getMovies ();
		for(Object oo:vv){
		comboBox.addItem(oo);
		};
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				BOEntertainment ent = new BOEntertainment();
				ent = DAEntertainment.getByName((String)e.getItem());
				textField.setText(ent.getGenre());
				textField_1.setText(ent.getMaker());
				textField_2.setText(ent.getActor());
				textField_3.setText(ent.getTime());
			}
		});
		comboBox.setBounds(293, 132, 270, 37);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Genre");
		lblNewLabel_4.setForeground(new Color(0, 139, 139));
		lblNewLabel_4.setFont(new Font("Comic Sans MS", Font.ITALIC, 17));
		lblNewLabel_4.setBounds(291, 196, 85, 20);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Director");
		lblNewLabel_5.setFont(new Font("Comic Sans MS", Font.ITALIC, 17));
		lblNewLabel_5.setBounds(291, 252, 81,20);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Actors");
		lblNewLabel_6.setForeground(new Color(0, 139, 139));
		lblNewLabel_6.setFont(new Font("Comic Sans MS", Font.ITALIC, 17));
		lblNewLabel_6.setBounds(290, 309, 82, 17);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Duration");
		lblNewLabel_7.setFont(new Font("Comic Sans MS", Font.ITALIC, 17));
		lblNewLabel_7.setBounds(294, 364, 78, 20);
		contentPane.add(lblNewLabel_7);
		
		btnNewButton = new JButton("Play");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				
				
				if (comboBox.getSelectedItem().equals ("Frozen")) {
					try {
						Frozen.main(null);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				
				if (comboBox.getSelectedItem().equals ("The_Conjuring")) {
					try {
						Conjuring.main(null);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				
				if (comboBox.getSelectedItem().equals ("P.K")) {
					try {
						Pk.main(null);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				
				if (comboBox.getSelectedItem().equals ("Inception")) {
					try {
						Inception.main(null);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				if (comboBox.getSelectedItem().equals ("Yeh_Jawaani_Hai_Deewani")) {
					try {
						YehJawani.main(null);
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
		btnNewButton.setBounds(306, 417, 115, 35);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(movies.class.getResource("/demo/bgmovies.jpg")));
		label.setBounds(0, 0, 614, 491);
		contentPane.add(label);
		
	}
}
