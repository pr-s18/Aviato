package demo;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class UIEntertainment extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIEntertainment frame = new UIEntertainment();
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
	public UIEntertainment() {
		setResizable(false);
		setTitle("Updation of the entertainment section");
		setForeground(Color.BLUE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblType = new JLabel("Type");
		lblType.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblType.setBounds(10, 13, 104, 24);
		contentPane.add(lblType);
		
		
		JLabel lblId = new JLabel("Id");
		lblId.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblId.setBounds(10, 46, 104, 20);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setBounds(134, 46, 283, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblName.setBounds(10, 77, 104, 24);
		contentPane.add(lblName);
		
		JLabel lblActoractress = new JLabel("Actor/Actress");
		lblActoractress.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblActoractress.setBounds(10, 112, 140, 20);
		contentPane.add(lblActoractress);
		
		JLabel lblGenre = new JLabel("Genre");
		lblGenre.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblGenre.setBounds(10, 143, 140, 20);
		contentPane.add(lblGenre);
		
		JLabel lblDirectorauthor = new JLabel("Director/Author");
		lblDirectorauthor.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblDirectorauthor.setBounds(10, 174, 114, 14);
		contentPane.add(lblDirectorauthor);
		
		JLabel lblTimenoOfPages = new JLabel("Time/No. of pages");
		lblTimenoOfPages.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblTimenoOfPages.setBounds(10, 203, 129, 14);
		contentPane.add(lblTimenoOfPages);
		
		textField_1 = new JTextField();
		textField_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_1.setBounds(134, 77, 283, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_2.setBounds(134, 108, 283, 20);
		textField_2.setEnabled(false);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_3.setBounds(134, 139, 283, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_4.setBounds(134, 169, 283, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_5.setBounds(134, 200, 283, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (((String)e.getItem()).equals("Movie")){
					textField_2.setEnabled(true);
					textField_5.setEnabled(true);
				}
				
				if (((String)e.getItem()).equals("Games")){
					textField_5.setEnabled(false);
					textField_2.setEnabled(false);
				}
				
				if (((String)e.getItem()).equals("Music")){
					textField_2.setEnabled(false);
					textField_5.setEnabled(true);
				}
				
				if (((String)e.getItem()).equals("Book")){
					textField_2.setEnabled(false);
					textField_5.setEnabled(true);
				}
				
				
				
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Choose","Movie", "Book", "Games","Music"}));
		comboBox.setBounds(134, 15, 283, 20);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					BOEntertainment entr = new BOEntertainment ();
					entr.setType ((String)comboBox.getSelectedItem ());
					entr.setName (textField_1.getText ());
					entr.setId (Integer.parseInt (textField.getText ()));
					entr.setActor (textField_2.getText ());
					entr.setGenre (textField_3.getText ());
					entr.setMaker (textField_4.getText ());
					entr.setTime (textField_5.getText ());
					if (DAEntertainment.add (entr)) {
						JOptionPane.showMessageDialog (null, "User Successfully Added");
					}
					else {
						JOptionPane.showMessageDialog (null, "ERROR!!!");
					}
			}
		});
		btnNewButton.setBounds(10, 237, 59, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("UPDATE");
	btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BOEntertainment entr = new BOEntertainment ();
				entr.setType ((String)comboBox.getSelectedItem ());
				entr.setName (textField_1.getText ());
				entr.setId (Integer.parseInt (textField.getText ()));
				entr.setActor (textField_2.getText ());
				entr.setGenre (textField_3.getText ());
				entr.setMaker (textField_4.getText ());
				entr.setTime (textField_5.getText ());
				if (DAEntertainment.update (entr)) {
					JOptionPane.showMessageDialog (null, "User Successfully Added");
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					comboBox.setSelectedItem("Choose");
				}
				else {
					JOptionPane.showMessageDialog (null, "ERROR!!!");
				}
			}
		});
		btnNewButton_1.setBounds(73, 237, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DELETE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (DAEntertainment.delete (Integer.parseInt (textField.getText ()))) {
					JOptionPane.showMessageDialog (null, "User Deleted");
				}
				else {
					JOptionPane.showMessageDialog (null, "ERROR!!!");
				}
			}
		});
		btnNewButton_2.setBounds(166, 237, 80, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("RESET");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				comboBox.setSelectedItem("Choose");
				
			}
		});
		btnNewButton_3.setBounds(250, 237, 78, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("CANCEL");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton_4.setBounds(331, 237, 86, 23);
		contentPane.add(btnNewButton_4);
		

	
		
		
	}
}
