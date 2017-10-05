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

public class Music extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblGenre;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Music frame = new Music();
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
	public Music() {
		setTitle("Music");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 620, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new CompoundBorder(new MatteBorder(6, 4, 6, 4, (Color) new Color(0, 0, 128)), new MatteBorder(4, 2, 4, 2, (Color) new Color(0, 0, 255))));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name of Music");
		lblNewLabel.setForeground(new Color(72, 61, 139));
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
		lblNewLabel_1.setIcon(new ImageIcon(Music.class.getResource("/demo/music_title.jpg")));
		lblNewLabel_1.setBounds(3, 1, 591, 127);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Music.class.getResource("/demo/music.jpg")));
		lblNewLabel_2.setBounds(36, 186, 214, 200);
		contentPane.add(lblNewLabel_2);
		
	
		
		btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose ();
			}
		});
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnNewButton_1.setBounds(448, 410, 115, 35);
		contentPane.add(btnNewButton_1);
		
		JComboBox comboBox = new JComboBox();
		Vector vv=DAEntertainment.getMusic ();
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
		lblGenre.setFont(new Font("Comic Sans MS", Font.ITALIC, 17));
		lblGenre.setBounds(265, 221, 80, 20);
		contentPane.add(lblGenre);
		
		lblNewLabel_4 = new JLabel("Singer");
		lblNewLabel_4.setFont(new Font("Comic Sans MS", Font.ITALIC, 17));
		lblNewLabel_4.setBounds(265, 273, 80, 23);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Duration");
		lblNewLabel_5.setFont(new Font("Comic Sans MS", Font.ITALIC, 17));
		lblNewLabel_5.setBounds(265, 331, 80, 20);
		contentPane.add(lblNewLabel_5);
		
		btnNewButton = new JButton("Play");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				//textField_3.setText(null);
				
				if (comboBox.getSelectedItem().equals ("BreakUpSong")) {
					try {
						BreakUpSong.main(null);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				if (comboBox.getSelectedItem().equals ("Wakhra_swag")) {
					try {
						Wakhra.main(null);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				if (comboBox.getSelectedItem().equals ("Lean on")) {
					try {
						LeanOn.main(null);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				if (comboBox.getSelectedItem().equals ("Cheap thrills")) {
					try {
						Cheap.main(null);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				if (comboBox.getSelectedItem().equals ("Nashe_si_chadh_gyi")) {
					try {
						Nashe.main(null);
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
		btnNewButton.setBounds(306, 409, 115, 35);
		contentPane.add(btnNewButton);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(Music.class.getResource("/demo/musicbg.jpg")));
		label.setBounds(0, 0, 614, 491);
		contentPane.add(label);
		
		
	}
}
