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
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JTextField;
import java.awt.Color;
//import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.util.*;
import java.awt.Cursor;
public class chef_master extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chef_master frame = new chef_master();
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
	public chef_master() {
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		setResizable(false);
		setTitle("Chef Master");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 485, 367);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new crew_login().setVisible(true);
			}
		});
		btnLogout.setBounds(383, 308, 89, 23);
		contentPane.add(btnLogout);
		
		
		
		JLabel lblKitchenKing = new JLabel("Kitchen King");
		lblKitchenKing.setForeground(new Color(0, 255, 255));
		lblKitchenKing.setFont(new Font("Times New Roman", Font.BOLD, 52));
		lblKitchenKing.setHorizontalAlignment(SwingConstants.CENTER);
		lblKitchenKing.setBounds(81, 20, 310, 58);
		contentPane.add(lblKitchenKing);
		
		JButton btnCafe = new JButton("Cafe");
		btnCafe.setForeground(new Color(0, 0, 0));
		btnCafe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update_cafe upcf = new update_cafe();
				upcf.setVisible(true);
				upcf.setSize(476, 385);
			}
		});
		btnCafe.setBackground(UIManager.getColor("Button.highlight"));
		btnCafe.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnCafe.setBounds(81, 101, 104, 36);
		contentPane.add(btnCafe);
		
		JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewAllCafe v = new ViewAllCafe();
				v.setVisible(true);
			}
		});
		btnView.setForeground(new Color(0, 0, 0));
		btnView.setBackground(UIManager.getColor("Button.highlight"));
		btnView.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnView.setBounds(314, 101, 104, 36);
		contentPane.add(btnView);
		
		JLabel lblSeatNo = new JLabel("Ticket No.");
		lblSeatNo.setForeground(new Color(245, 255, 250));
		lblSeatNo.setFont(new Font("Gadugi", Font.BOLD, 23));
		lblSeatNo.setBounds(125, 169, 115, 25);
		contentPane.add(lblSeatNo);
		
	
		
		JTextArea txtrOrder = new JTextArea();
		txtrOrder.setEnabled(false);
		txtrOrder.setLineWrap(true);
		txtrOrder.setFont(new Font("Raavi", Font.PLAIN, 15));
		txtrOrder.setForeground(Color.BLACK);
		txtrOrder.setText("Order");
		txtrOrder.setBackground(new Color(255, 255, 255));
		txtrOrder.setEditable(false);
		txtrOrder.setBounds(24, 221, 187, 94);
		contentPane.add(txtrOrder);
		
		JLabel lblSeatNo_1 = new JLabel("Seat No.");
		lblSeatNo_1.setForeground(new Color(240, 248, 255));
		lblSeatNo_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblSeatNo_1.setBounds(254, 224, 65, 25);
		contentPane.add(lblSeatNo_1);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setBackground(new Color(255, 255, 255));
		textField.setEditable(false);
		textField.setBounds(334, 226, 65, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
	
		Vector vv=DACafe.getAll ();
		for(Object oo:vv){
			
		comboBox.addItem(oo);
		};
		
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				BOCafe cf = new BOCafe();
				BOPassenger psn = new  BOPassenger();
				cf = DACafe.getById((int)e.getItem());
				psn = DAPassenger.getById((int)e.getItem());
				txtrOrder.setEnabled(true);
				txtrOrder.setText(cf.getItems());
				textField.setEnabled(true);
				textField.setText(Integer.toString(psn.getSeat_number()));
				
			}
		});
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setMaximumRowCount(15);
		comboBox.setBounds(257, 171, 92, 20);
		contentPane.add(comboBox);
		//setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, lblKitchenKing, btnCafe, btnView, lblSeatNo, comboBox, txtrOrder, lblSeatNo_1, textField}));
	
		JButton btnOrderDone = new JButton("Order Done");
		btnOrderDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BOAir_hostess ah = new BOAir_hostess();
				ah.setPass_chef ("Chef");
				ah.setPurpose ("Order_ready");
				ah.setSeat_no(Integer.parseInt(textField.getText()));
				ah.setTicket_no((int)comboBox.getSelectedItem());
				DAAir_hostess.for_chef(ah);
				JOptionPane.showMessageDialog(null, "Air Hostess will reach you shortly!!");
			}
		});
		btnOrderDone.setFont(new Font("Aharoni", Font.ITALIC, 15));
		btnOrderDone.setBounds(254, 265, 145, 32);
		contentPane.add(btnOrderDone);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(chef_master.class.getResource("/demo/chef_master_back.jpeg")));
		lblNewLabel.setBounds(0, 0, 480, 340);
		contentPane.add(lblNewLabel);
	
	}
}
