package demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Cafe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cafe frame = new Cafe();
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
	public Cafe() {
		setResizable(false);
		setTitle("Aviato Cafe");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 682, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new MatteBorder(8, 3, 3, 3, (Color) new Color(64, 64, 64)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		JRadioButton radioButton_2 = new JRadioButton("");
		radioButton_2.setVisible(false);
		buttonGroup.add(radioButton_2);
		radioButton_2.setBounds(203, 169, 23, 23);
		contentPane.add(radioButton_2);
		
		JRadioButton radioButton_5 = new JRadioButton("");
		radioButton_5.setVisible(false);
		buttonGroup.add(radioButton_5);
		radioButton_5.setBounds(203, 274, 23, 23);
		contentPane.add(radioButton_5);
		
		JRadioButton radioButton_1 = new JRadioButton("");
		radioButton_1.setVisible(false);
		buttonGroup.add(radioButton_1);
		radioButton_1.setBounds(203, 134, 22, 23);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_4 = new JRadioButton("");
		radioButton_4.setVisible(false);
		buttonGroup.add(radioButton_4);
		radioButton_4.setBounds(203, 239, 22, 23);
		contentPane.add(radioButton_4);
		
		JRadioButton radioButton = new JRadioButton("");
		radioButton.setVisible(false);
		buttonGroup.add(radioButton);
		radioButton.setBounds(203, 99, 22, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_3 = new JRadioButton("");
		radioButton_3.setVisible(false);
		buttonGroup.add(radioButton_3);
		radioButton_3.setBounds(203, 204, 23, 23);
		contentPane.add(radioButton_3);
		
		
		textField_16 = new JTextField();
		textField_16.setEnabled(false);
		textField_16.setEditable(false);
		textField_16.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_16.setText("0");
		textField_16.setColumns(10);
		textField_16.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_16.setBackground(Color.WHITE);
		textField_16.setBounds(596, 240, 44, 20);
		contentPane.add(textField_16);
		
		textField_15 = new JTextField();
		textField_15.setEnabled(false);
		textField_15.setEditable(false);
		textField_15.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_15.setText("0");
		textField_15.setColumns(10);
		textField_15.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_15.setBackground(Color.WHITE);
		textField_15.setBounds(596, 205, 44, 20);
		contentPane.add(textField_15);
		
		textField_17 = new JTextField();
		textField_17.setEnabled(false);
		textField_17.setEditable(false);
		textField_17.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_17.setText("0");
		textField_17.setColumns(10);
		textField_17.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_17.setBackground(Color.WHITE);
		textField_17.setBounds(596, 275, 44, 20);
		contentPane.add(textField_17);
		
		textField_14 = new JTextField();
		textField_14.setEnabled(false);
		textField_14.setEditable(false);
		textField_14.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_14.setText("0");
		textField_14.setColumns(10);
		textField_14.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_14.setBackground(Color.WHITE);
		textField_14.setBounds(596, 170, 44, 20);
		contentPane.add(textField_14);
		
		textField_13 = new JTextField();
		textField_13.setEnabled(false);
		textField_13.setEditable(false);
		textField_13.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_13.setText("0");
		textField_13.setColumns(10);
		textField_13.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_13.setBackground(Color.WHITE);
		textField_13.setBounds(596, 135, 44, 20);
		contentPane.add(textField_13);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_12.setText("0");
		textField_12.setColumns(10);
		textField_12.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_12.setBackground(Color.WHITE);
		textField_12.setBounds(596, 100, 44, 20);
		contentPane.add(textField_12);
	
		
		JLabel lblCafeteria = new JLabel("CAFETERIA");
		lblCafeteria.setToolTipText("Coolest Cafe");
		lblCafeteria.setHorizontalAlignment(SwingConstants.CENTER);
		lblCafeteria.setFont(new Font("Algerian", Font.PLAIN, 38));
		lblCafeteria.setForeground(new Color(255, 228, 181));
		lblCafeteria.setBounds(195, 26, 232, 50);
		contentPane.add(lblCafeteria);
		
		DefaultListModel m1 = new DefaultListModel();
		JList list_1 = new JList(m1);
		list_1.setOpaque(false);
		list_1.setEnabled(false);
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list_1.setBackground(Color.WHITE);
		list_1.setBounds(331, 100, 58, 195);
		contentPane.add(list_1);
	
		DefaultListModel m = new DefaultListModel();
		JList list = new JList(m);
		list.setOpaque(false);
		
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBackground(new Color(255, 255, 255));
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("1");
		textField.setBounds(30, 100, 22, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setText("2");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(30, 135, 22, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setText("3");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(30, 170, 22, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setText("4");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(30, 205, 22, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setText("5");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(30, 240, 22, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEnabled(false);
		textField_5.setText("6");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(30, 275, 22, 20);
		contentPane.add(textField_5);
	
		JSpinner spinner = new JSpinner();
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				String k= (String) list_1.getSelectedValue();
				int p = Integer.parseInt(k);
				int q = (int) spinner.getValue();
				p = p *q;
				textField_12.setText(Integer.toString(p));
			}
		});
		spinner.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		spinner.setBackground(new Color(255, 255, 255));
		spinner.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		spinner.setBounds(403, 100, 39, 20);
		contentPane.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				String k= (String) list_1.getSelectedValue();
				int p = Integer.parseInt(k);
				int q = (int) spinner_1.getValue();
				p = p *q;
				textField_13.setText(Integer.toString(p));
			}
		});
		spinner_1.setEnabled(false);
		spinner_1.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		spinner_1.setBackground(new Color(255, 255, 255));
		spinner_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		spinner_1.setBounds(403, 135, 39, 20);
		contentPane.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String k= (String) list_1.getSelectedValue();
				int p = Integer.parseInt(k);
				int q = (int) spinner_2.getValue();
				p = p *q;
				textField_14.setText(Integer.toString(p));
			}
		});
		spinner_2.setEnabled(false);
		spinner_2.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		spinner_2.setBackground(new Color(255, 255, 255));
		spinner_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		spinner_2.setBounds(403, 170, 39, 20);
		contentPane.add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String k= (String) list_1.getSelectedValue();
				int p = Integer.parseInt(k);
				int q = (int) spinner_3.getValue();
				p = p *q;
				textField_15.setText(Integer.toString(p));
			}
		});
		spinner_3.setEnabled(false);
		spinner_3.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		spinner_3.setBackground(new Color(255, 255, 255));
		spinner_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		spinner_3.setBounds(403, 205, 39, 20);
		contentPane.add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String k= (String) list_1.getSelectedValue();
				int p = Integer.parseInt(k);
				int q = (int) spinner_4.getValue();
				p = p *q;
				textField_16.setText(Integer.toString(p));
			}
		});
		spinner_4.setEnabled(false);
		spinner_4.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		spinner_4.setBackground(new Color(255, 255, 255));
		spinner_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		spinner_4.setBounds(403, 240, 39, 20);
		contentPane.add(spinner_4);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String k= (String) list_1.getSelectedValue();
				int p = Integer.parseInt(k);
				int q = (int) spinner_5.getValue();
				p = p *q;
				textField_17.setText(Integer.toString(p));
			}
		});
		spinner_5.setEnabled(false);
		spinner_5.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		spinner_5.setBackground(new Color(255, 255, 255));
		spinner_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		spinner_5.setBounds(403, 275, 39, 20);
		contentPane.add(spinner_5);
	
		JButton btnPlaceAnOrder = new JButton("Place Order");
		btnPlaceAnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BOCafe entr = new BOCafe();
				//String order = textField_6.getText() + " + " + textField_7.getText() + " + " + textField_8.getText() + " + " + textField_9.getText() + " + " + textField_10.getText() + " + " + textField_11.getText();
				String order="";
				if(!(textField_6.getText().equalsIgnoreCase(""))){
					int k = (int) spinner.getValue();
					order += k +textField_6.getText();
				}
				if(!(textField_7.getText().equalsIgnoreCase(""))){
					int k = (int) spinner_1.getValue();
					order +=" + " + k + textField_7.getText();
				}
				if(!(textField_8.getText().equalsIgnoreCase(""))){
					int k = (int) spinner_2.getValue();
					order +=" + " + k + textField_8.getText();
				}
				if(!(textField_9.getText().equalsIgnoreCase(""))){
					int k = (int) spinner_3.getValue();
					order += " + " + k + textField_9.getText();
				}
				if(!(textField_10.getText().equalsIgnoreCase(""))){
					int k = (int) spinner_4.getValue();
					order += " + " + k + textField_10.getText();
				}
				if(!(textField_11.getText().equalsIgnoreCase(""))){
					int k = (int) spinner_5.getValue();
					order += " + " + k + textField_11.getText();
				}
				entr.setItems(order);
				entr.setOrder_id(Invoker.psn.getId());
				//entr.setOrder_id(5);
				int sum = Integer.parseInt(textField_12.getText()) + Integer.parseInt(textField_13.getText()) + Integer.parseInt(textField_14.getText()) + Integer.parseInt(textField_15.getText()) + Integer.parseInt(textField_16.getText()) + Integer.parseInt(textField_17.getText());
				entr.setPrice(sum);
				if (DACafe.place (entr)) {
					JOptionPane.showMessageDialog (null, "Order Successfully Placed\n Your Bill Amount is: " + sum);
				}
				else {
					JOptionPane.showMessageDialog (null, "ERROR!!!");
				}
				dispose();
				
			}
		});
		btnPlaceAnOrder.setBorder(UIManager.getBorder("Button.border"));
		btnPlaceAnOrder.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnPlaceAnOrder.setBounds(451, 328, 156, 40);
		contentPane.add(btnPlaceAnOrder);
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				radioButton.setSelected(true);
			}
		});
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				//String type = (String) comboBox.getSelectedItem();
				spinner.setValue((int)1);
				radioButton.setSelected(true);
				textField_6.setText("");
				textField_12.setText("0");
				m.removeAllElements();
				m1.removeAllElements();
				if(comboBox.getSelectedIndex() != 0){
					
					String arr[] = DACafe.show((String) arg0.getItem());
					String arr1[] = DACafe.display((String) arg0.getItem());
					int i = 0;
					
					while (arr1[i]!= "/0"){
						//System.out.println("__" +arr[i]+"   " +i);
						m.add(i,(String)arr[i]);
						m1.add(i,(String)arr1[i]);
						i++;
					}
				}
		}
		});
		
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"--Choose--", "Drinks", "Snacks", "Main Course", "Desserts", "Packed foods"}));
		comboBox.setBounds(83, 100, 108, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEnabled(false);
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				radioButton_1.setSelected(true);
				textField_7.setText("");
				spinner_1.setValue((int)1);
				textField_13.setText("0");
				m.removeAllElements();
				m1.removeAllElements();
				if(comboBox.getSelectedIndex() != 0){
					
					String arr[] = DACafe.show((String) arg0.getItem());
					String arr1[] = DACafe.display((String) arg0.getItem());
					int i = 0;
					
					while (arr1[i]!= "/0"){
						//System.out.println("__" +arr[i]+"   " +i);
						m.add(i,(String)arr[i]);
						m1.add(i,(String)arr1[i]);
						i++;
					}
				}
			}
		});
		comboBox_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				radioButton_1.setSelected(true);
			}
		});
		comboBox_1.setBackground(new Color(255, 255, 255));
		comboBox_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"--Choose--", "Drinks", "Snacks", "Main Course", "Desserts", "Packed foods"}));
		comboBox_1.setBounds(83, 135, 108, 20);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setEnabled(false);
		comboBox_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				radioButton_2.setSelected(true);
				spinner_2.setValue((int)1);
				textField_8.setText("");
				textField_14.setText("0");
				m.removeAllElements();
				m1.removeAllElements();
				if(comboBox.getSelectedIndex() != 0){
					
					String arr[] = DACafe.show((String) e.getItem());
					String arr1[] = DACafe.display((String) e.getItem());
					int i = 0;
					
					while (arr1[i]!= "/0"){
						//System.out.println("__" +arr[i]+"   " +i);
						m.add(i,(String)arr[i]);
						m1.add(i,(String)arr1[i]);
						i++;
					}
				}
			}
		});
		comboBox_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				radioButton_2.setSelected(true);
			}
		});
		comboBox_2.setBackground(new Color(255, 255, 255));
		comboBox_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"--Choose--", "Drinks", "Snacks", "Main Course", "Desserts", "Packed foods"}));
		comboBox_2.setBounds(83, 170, 108, 20);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setEnabled(false);
		comboBox_3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				radioButton_3.setSelected(true);
				spinner_3.setValue((int)1);
				textField_9.setText("");
				textField_15.setText("0");
				m.removeAllElements();
				m1.removeAllElements();
				if(comboBox.getSelectedIndex() != 0){
					
					String arr[] = DACafe.show((String) e.getItem());
					String arr1[] = DACafe.display((String) e.getItem());
					int i = 0;
					
					while (arr1[i]!= "/0"){
						//System.out.println("__" +arr[i]+"   " +i);
						m.add(i,(String)arr[i]);
						m1.add(i,(String)arr1[i]);
						i++;
					}
				}
			}
		});
		comboBox_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				radioButton_3.setSelected(true);
			}
		});
		comboBox_3.setBackground(new Color(255, 255, 255));
		comboBox_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"--Choose--", "Drinks", "Snacks", "Main Course", "Desserts", "Packed foods"}));
		comboBox_3.setBounds(83, 205, 108, 20);
		contentPane.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setEnabled(false);
		comboBox_4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				spinner_4.setValue((int)1);
				radioButton_4.setSelected(true);
				textField_10.setText("");
				textField_16.setText("0");
				m.removeAllElements();
				m1.removeAllElements();
				if(comboBox.getSelectedIndex() != 0){
					
					String arr[] = DACafe.show((String) e.getItem());
					String arr1[] = DACafe.display((String) e.getItem());
					int i = 0;
					
					while (arr1[i]!= "/0"){
						//System.out.println("__" +arr[i]+"   " +i);
						m.add(i,(String)arr[i]);
						m1.add(i,(String)arr1[i]);
						i++;
					}
				}
			}
		});
		comboBox_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				radioButton_4.setSelected(true);
			}
		});
		comboBox_4.setBackground(new Color(255, 255, 255));
		comboBox_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"--Choose--", "Drinks", "Snacks", "Main Course", "Desserts", "Packed foods"}));
		comboBox_4.setBounds(83, 240, 108, 20);
		contentPane.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setEnabled(false);
		comboBox_5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				radioButton_5.setSelected(true);
				spinner_5.setValue((int)1);
				textField_11.setText("");
				textField_17.setText("0");
				m.removeAllElements();
				m1.removeAllElements();
				if(comboBox.getSelectedIndex() != 0){
					
					String arr[] = DACafe.show((String) e.getItem());
					String arr1[] = DACafe.display((String) e.getItem());
					int i = 0;
					
					while (arr1[i]!= "/0"){
						//System.out.println("__" +arr[i]+"   " +i);
						m.add(i,(String)arr[i]);
						m1.add(i,(String)arr1[i]);
						i++;
					}
				}
			}
		});
		comboBox_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				radioButton_5.setSelected(true);
			}
		});
		comboBox_5.setBackground(new Color(255, 255, 255));
		comboBox_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"--Choose--", "Drinks", "Snacks", "Main Course", "Desserts", "Packed foods"}));
		comboBox_5.setBounds(83, 275, 108, 20);
		contentPane.add(comboBox_5);
	
		
		
		JButton btnAddItem = new JButton("Add Item");
		btnAddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				m.removeAllElements();
				m1.removeAllElements();
			if(!(textField_1.isEnabled()) && !(textField_12.getText().equals("0") )){
				textField_1.setEnabled(true);
				comboBox_1.setEnabled(true);
				spinner_1.setEnabled(true);
				textField_7.setEnabled(true);
				textField_13.setEnabled(true);
			}
			else if(!(textField_2.isEnabled()) && !(textField_13.getText().equals("0") )){
				textField_2.setEnabled(true);
				comboBox_2.setEnabled(true);
				spinner_2.setEnabled(true);
				textField_8.setEnabled(true);
				textField_14.setEnabled(true);
			}
			else if(!(textField_3.isEnabled()) && !(textField_14.getText().equals("0") )){
				textField_3.setEnabled(true);
				comboBox_3.setEnabled(true);
				spinner_3.setEnabled(true);
				textField_9.setEnabled(true);
				textField_15.setEnabled(true);
			}
			else if(!(textField_4.isEnabled()) && !(textField_15.getText().equals("0") )){
				textField_4.setEnabled(true);
				comboBox_4.setEnabled(true);
				spinner_4.setEnabled(true);
				textField_10.setEnabled(true);
				textField_16.setEnabled(true);
			}
			else if(!(textField_5.isEnabled()) && !(textField_16.getText().equals("0") )){
				textField_5.setEnabled(true);
				comboBox_5.setEnabled(true);
				spinner_5.setEnabled(true);
				textField_11.setEnabled(true);
				textField_17.setEnabled(true);
			}
			else{
				JOptionPane.showMessageDialog(null,"Please select an Item first!!");
			}
			}
		});


		
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(radioButton.isSelected()){
					spinner.setValue((int)1);
					String op =(String) list.getSelectedValue();
					int k = (int) list.getSelectedIndex();
					list_1.setSelectedIndex(k);
					BOUpdate_cafe upcf = DAUpdate_cafe.getByName(op);
					textField_6.setText(upcf.getName());
					textField_12.setText(Integer.toString(upcf.getPrice()));
				}
				else if(radioButton_1.isSelected()){
					spinner_1.setValue((int)1);
					String op =(String) list.getSelectedValue();
					int k = (int) list.getSelectedIndex();
					list_1.setSelectedIndex(k);
					BOUpdate_cafe upcf = DAUpdate_cafe.getByName(op);
					textField_7.setText(upcf.getName());
					textField_13.setText(Integer.toString(upcf.getPrice()));
				}
				else if(radioButton_2.isSelected()){
					spinner_2.setValue((int)1);
					String op =(String) list.getSelectedValue();
					int k = (int) list.getSelectedIndex();
					list_1.setSelectedIndex(k);
					BOUpdate_cafe upcf = DAUpdate_cafe.getByName(op);
					textField_8.setText(upcf.getName());
					textField_14.setText(Integer.toString(upcf.getPrice()));
				}
				else if(radioButton_3.isSelected()){
					spinner_3.setValue((int)1);
					String op =(String) list.getSelectedValue();
					int k = (int) list.getSelectedIndex();
					list_1.setSelectedIndex(k);
					BOUpdate_cafe upcf = DAUpdate_cafe.getByName(op);
					textField_9.setText(upcf.getName());
					textField_15.setText(Integer.toString(upcf.getPrice()));
				}
				else if(radioButton_4.isSelected()){
					spinner_4.setValue((int)1);
					String op =(String) list.getSelectedValue();
					int k = (int) list.getSelectedIndex();
					list_1.setSelectedIndex(k);
					BOUpdate_cafe upcf = DAUpdate_cafe.getByName(op);
					textField_10.setText(upcf.getName());
					textField_16.setText(Integer.toString(upcf.getPrice()));
				}
				else if(radioButton_5.isSelected()){
					spinner_5.setValue((int)1);
					String op =(String) list.getSelectedValue();
					int k = (int) list.getSelectedIndex();
					list_1.setSelectedIndex(k);
					BOUpdate_cafe upcf = DAUpdate_cafe.getByName(op);
					textField_11.setText(upcf.getName());
					textField_17.setText(Integer.toString(upcf.getPrice()));
				}
			}
		});
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		
		list.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list.setBackground(new Color(255, 255, 255));
		list.setBounds(232, 100, 100, 195);
		contentPane.add(list);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBackground(new Color(255, 255, 255));
		textField_6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_6.setBounds(470, 100, 93, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setEnabled(false);
		textField_7.setEditable(false);
		textField_7.setBackground(new Color(255, 255, 255));
		textField_7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_7.setColumns(10);
		textField_7.setBounds(470, 135, 93, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setEnabled(false);
		textField_8.setEditable(false);
		textField_8.setBackground(new Color(255, 255, 255));
		textField_8.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_8.setColumns(10);
		textField_8.setBounds(470, 170, 93, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setEnabled(false);
		textField_9.setEditable(false);
		textField_9.setBackground(new Color(255, 255, 255));
		textField_9.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_9.setColumns(10);
		textField_9.setBounds(470, 205, 93, 20);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setEnabled(false);
		textField_10.setEditable(false);
		textField_10.setBackground(new Color(255, 255, 255));
		textField_10.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_10.setColumns(10);
		textField_10.setBounds(470, 240, 93, 20);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setEnabled(false);
		textField_11.setEditable(false);
		textField_11.setBackground(new Color(255, 255, 255));
		textField_11.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_11.setColumns(10);
		textField_11.setBounds(470, 275, 93, 20);
		contentPane.add(textField_11);
		
		
		/*
		DefaultListModel model=new DefaultListModel();
		rs=stmt.executeQuery(query);
		while (rs.next()) 
		{
			String stadium = rs.getString("Stadium");
			String city = rs.getString("City");
			model.addElement(stadium);
			model1.addElement(city);
		} 
		JList list=new JList(model);
		 */
	
		JButton btnReset = new JButton("Reset");
		btnReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				spinner_1.setValue((int)1);
				spinner_2.setValue((int)1);
				spinner_3.setValue((int)1);
				spinner_4.setValue((int)1);
				spinner_5.setValue((int)1);
				spinner.setValue((int)1);
				//m.removeAllElements();
				//m1.removeAllElements();
				comboBox.setSelectedIndex(0);
				textField_12.setText("0");
				textField_13.setText("0");
				textField_14.setText("0");
				textField_15.setText("0");
				textField_16.setText("0");
				textField_17.setText("0");
				comboBox_1.setSelectedIndex(0);
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_6.setText("");
				comboBox_2.setSelectedIndex(0);
				comboBox_3.setSelectedIndex(0);
				textField_1.setEnabled(false);
				textField_2.setEnabled(false);
				textField_3.setEnabled(false);
				textField_4.setEnabled(false);
				textField_5.setEnabled(false);
				textField_7.setEnabled(false);
				textField_8.setEnabled(false);
				textField_9.setEnabled(false);
				textField_10.setEnabled(false);
				comboBox_4.setSelectedIndex(0);
				textField_11.setEnabled(false);
				textField_13.setEnabled(false);
				textField_14.setEnabled(false);
				textField_15.setEnabled(false);
				textField_16.setEnabled(false);
				textField_17.setEnabled(false);
				comboBox_5.setSelectedIndex(0);
				comboBox_1.setEnabled(false);
				comboBox_2.setEnabled(false);
				comboBox_3.setEnabled(false);
				comboBox_4.setEnabled(false);
				comboBox_5.setEnabled(false);
				
				spinner_1.setEnabled(false);
				spinner_2.setEnabled(false);
				spinner_3.setEnabled(false);
				spinner_4.setEnabled(false);
				spinner_5.setEnabled(false);
			}
		});
		
		btnReset.setBorder(UIManager.getBorder("Button.border"));
		btnReset.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnReset.setBounds(263, 328, 136, 40);
		contentPane.add(btnReset);
		
		btnAddItem.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnAddItem.setBorder(UIManager.getBorder("Button.border"));
		btnAddItem.setBounds(67, 328, 136, 40);
		contentPane.add(btnAddItem);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Cafe.class.getResource("/demo/cafe_back.jpg")));
		label.setBounds(0, 0, 692, 410);
		contentPane.add(label);
		
		
	}
}