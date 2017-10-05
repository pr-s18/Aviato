package demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.ScrollPaneConstants;

public class Souvenirs extends JFrame {

	private JPanel contentPane;
//	JScrollPane scrollPane = new JScrollPane(contentPane, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Souvenirs frame = new Souvenirs();
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
	public Souvenirs() {
		setTitle("Sovenir");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 599, 686);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Souvenirs.class.getResource("/demo/airplane.jpg")));
		lblNewLabel.setBounds(18, 145, 149, 141);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabelr = new JLabel("Remote Control Airplane");
		lblNewLabelr.setForeground(new Color(178, 34, 34));
		lblNewLabelr.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabelr.setBounds(221, 145, 237, 20);
		contentPane.add(lblNewLabelr);
		
		JLabel lblAirplane = new JLabel("Material: Plastic");
		lblAirplane.setForeground(new Color(178, 34, 34));
		lblAirplane.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAirplane.setBounds(221, 178, 173, 20);
		contentPane.add(lblAirplane);
		
		JLabel lblColorBlue = new JLabel("color: Blue");
		lblColorBlue.setForeground(new Color(178, 34, 34));
		lblColorBlue.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblColorBlue.setBounds(221, 214, 104, 20);
		contentPane.add(lblColorBlue);
		
		JLabel lblManufacturerTheToys = new JLabel("Manufacturer: Toys Store");
		lblManufacturerTheToys.setForeground(new Color(178, 34, 34));
		lblManufacturerTheToys.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblManufacturerTheToys.setBounds(221, 250, 250, 20);
		contentPane.add(lblManufacturerTheToys);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Rs. 1500");
		chckbxNewCheckBox.setForeground(new Color(178, 34, 34));
		chckbxNewCheckBox.setBackground(new Color(255, 215, 0));
		chckbxNewCheckBox.setBounds(471, 184, 95, 29);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Souvenirs.class.getResource("/demo/souvenir.jpg")));
		lblNewLabel_1.setBounds(0, 0, 598, 130);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Souvenirs.class.getResource("/demo/flowerpot.jpg")));
		lblNewLabel_3.setBounds(18, 300, 149, 149);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblArtificalFlowerPot = new JLabel("Artifical Flower Pot");
		lblArtificalFlowerPot.setForeground(new Color(178, 34, 34));
		lblArtificalFlowerPot.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblArtificalFlowerPot.setBounds(221, 300, 237, 20);
		contentPane.add(lblArtificalFlowerPot);
		
		JLabel lblMaterialPlastic = new JLabel("Material: Plastic");
		lblMaterialPlastic.setForeground(new Color(178, 34, 34));
		lblMaterialPlastic.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMaterialPlastic.setBounds(221, 334, 237, 20);
		contentPane.add(lblMaterialPlastic);
		
		JLabel lblColorGreenwhite = new JLabel("Color: Green/White");
		lblColorGreenwhite.setForeground(new Color(178, 34, 34));
		lblColorGreenwhite.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblColorGreenwhite.setBounds(221, 370, 237, 20);
		contentPane.add(lblColorGreenwhite);
		
		JLabel lblManufacturerGreenleaf = new JLabel("Manufacturer: GreenLeaf");
		lblManufacturerGreenleaf.setForeground(new Color(178, 34, 34));
		lblManufacturerGreenleaf.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblManufacturerGreenleaf.setBounds(221, 404, 237, 20);
		contentPane.add(lblManufacturerGreenleaf);
		
		JCheckBox chckbxRs = new JCheckBox("Rs. 1000");
		chckbxRs.setForeground(new Color(178, 34, 34));
		chckbxRs.setBackground(new Color(255, 215, 0));
		chckbxRs.setBounds(471, 331, 95, 29);
		contentPane.add(chckbxRs);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Souvenirs.class.getResource("/demo/Budda.jpg")));
		label.setBounds(18, 468, 149, 149);
		contentPane.add(label);
		
		JLabel lblLordBuddhaStatue = new JLabel("Lord Buddha Statue");
		lblLordBuddhaStatue.setForeground(new Color(178, 34, 34));
		lblLordBuddhaStatue.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblLordBuddhaStatue.setBounds(221, 468, 237, 20);
		contentPane.add(lblLordBuddhaStatue);
		
		JLabel lblMaterialCeramic = new JLabel("Material: Ceramic");
		lblMaterialCeramic.setForeground(new Color(178, 34, 34));
		lblMaterialCeramic.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMaterialCeramic.setBounds(221, 505, 237, 20);
		contentPane.add(lblMaterialCeramic);
		
		JLabel lblManufacturerStatuePalace = new JLabel("Manufacturer: Statue Palace");
		lblManufacturerStatuePalace.setForeground(new Color(178, 34, 34));
		lblManufacturerStatuePalace.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblManufacturerStatuePalace.setBounds(220, 577, 281, 20);
		contentPane.add(lblManufacturerStatuePalace);
		
		JLabel lblColorBrownishYellow = new JLabel("Color: Brownish yellow");
		lblColorBrownishYellow.setForeground(new Color(178, 34, 34));
		lblColorBrownishYellow.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblColorBrownishYellow.setBounds(221, 541, 237, 20);
		contentPane.add(lblColorBrownishYellow);
		
		JCheckBox chckbxRs_2 = new JCheckBox("Rs. 1200");
		chckbxRs_2.setForeground(new Color(178, 34, 34));
		chckbxRs_2.setBackground(new Color(255, 215, 0));
		chckbxRs_2.setBounds(473, 521, 95, 29);
		contentPane.add(chckbxRs_2);
		
		JButton btnNewButton = new JButton("Place Order");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int amt = 0;
				String s = null;
				if (chckbxRs_2.isSelected()) {
					amt += 1200;
					s += "/Statue/";
				}
				if (chckbxRs.isSelected()) {
					amt += 1000;
					s += "/Flower/";
				}
				if (chckbxNewCheckBox.isSelected()) {
					amt += 1500;
					s += "/Airplane/";
				}
				BOAir_hostess bair_h = new BOAir_hostess();
				bair_h.setPass_chef("Passenger");
				bair_h.setPurpose(s);
				bair_h.setSeat_no(Invoker.psn.getSeat_number());
				bair_h.setTicket_no(Invoker.psn.getId());
				DAAir_hostess dair_h = new DAAir_hostess();
				dair_h.souvenirs(bair_h);
				JOptionPane.showMessageDialog(null, "Your order has been placed. Please be ready with Rs." + amt );
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton.setBounds(267, 622, 127, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_1.setBounds(427, 622, 115, 29);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Souvenirs.class.getResource("/demo/souvenirbg.jpg")));
		lblNewLabel_2.setBounds(0, 54, 598, 602);
		contentPane.add(lblNewLabel_2);
		
		
	}
}