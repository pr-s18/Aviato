package demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

public class call_ah extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					call_ah frame = new call_ah();
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
	public call_ah() {
		setTitle("Call for Airhostess");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 501, 327);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("How can I help you ?");
		lblNewLabel.setForeground(new Color(0, 51, 51));
		lblNewLabel.setFont(new Font("Calibri", Font.ITALIC, 24));
		lblNewLabel.setBounds(237, 85, 197, 31);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Drinking water");
		btnNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BOAir_hostess bair_h = new BOAir_hostess();
				bair_h.setPass_chef("Passenger");
				bair_h.setPurpose("Drinking_Water");
				bair_h.setSeat_no(Invoker.psn.getSeat_number());
				bair_h.setTicket_no(Invoker.psn.getId());
				DAAir_hostess dair_h = new DAAir_hostess();
				dair_h.drinking_water(bair_h);
				JOptionPane.showMessageDialog(null, "Your request has been recorded, will reach you shortly ... !");
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnNewButton.setBounds(353, 121, 132, 31);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Seat Change");
		btnNewButton_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BOAir_hostess bair_h = new BOAir_hostess();
				bair_h.setPass_chef("Passenger");
				bair_h.setPurpose("Requested_for_seat_exchange");
				bair_h.setSeat_no(Invoker.psn.getSeat_number());
				bair_h.setTicket_no(Invoker.psn.getId());
				DAAir_hostess dair_h = new DAAir_hostess();
				dair_h.seat_exchange(bair_h);
				JOptionPane.showMessageDialog(null, "Your request has been recorded, will reach you soon with the seat details ... !");
			}
		});
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnNewButton_1.setBounds(353, 156, 132, 31);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Souvenirs");
		btnNewButton_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setBackground(Color.GRAY);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BOAir_hostess bair_h = new BOAir_hostess();
				bair_h.setPass_chef("Passenger");
				bair_h.setPurpose("requested for souvenirs");
				bair_h.setSeat_no(Invoker.psn.getSeat_number());
				bair_h.setTicket_no(Invoker.psn.getId());
				DAAir_hostess dair_h = new DAAir_hostess();
				dair_h.souvenirs(bair_h);
				Souvenirs frame = new Souvenirs();
				frame.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnNewButton_2.setBounds(353, 191, 132, 31);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Medical Needs");
		btnNewButton_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setBackground(Color.GRAY);
		btnNewButton_3.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BOAir_hostess bair_h = new BOAir_hostess();
				bair_h.setPass_chef("Passenger");
				bair_h.setPurpose(" Medical_help");
				bair_h.setSeat_no(Invoker.psn.getSeat_number());
				bair_h.setTicket_no(Invoker.psn.getId());
				DAAir_hostess dair_h = new DAAir_hostess();
				dair_h.medical(bair_h);
				JOptionPane.showMessageDialog(null, "Your request has been taken, will reach you shortly ... !");
			}
		});
		btnNewButton_3.setBounds(353, 227, 132, 31);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Others");
		btnNewButton_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_4.setBackground(Color.GRAY);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BOAir_hostess bair_h = new BOAir_hostess();
				bair_h.setPass_chef("Passenger");
				bair_h.setPurpose("Other");
				bair_h.setSeat_no(Invoker.psn.getSeat_number());
				bair_h.setTicket_no(Invoker.psn.getId());
				DAAir_hostess dair_h = new DAAir_hostess();
				dair_h.others(bair_h);
				JOptionPane.showMessageDialog(null, "Will be at your seat soon ... !");
			}
		});
		btnNewButton_4.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnNewButton_4.setBounds(353, 263, 132, 31);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBorder(null);
		lblNewLabel_1.setIcon(new ImageIcon(call_ah.class.getResource("/demo/asdf.jpg")));
		lblNewLabel_1.setBounds(-1, -11, 504, 329);
		contentPane.add(lblNewLabel_1);
	}
}