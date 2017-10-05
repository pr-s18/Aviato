package demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.Font;
import java.util.Vector;

import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Color;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Air_hostess extends JFrame {

	private JPanel contentPane;
	private JTable table;
	JScrollPane pane;
	private JButton btnLogout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Air_hostess frame = new Air_hostess();
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
	public Air_hostess() {
		setTitle("AirHostessSection");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Air Hostess Section");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 37));
		lblNewLabel.setBounds(20, 11, 743, 43);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Update table");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Update_hostess uph = new Update_hostess();
				uph.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setForeground(new Color(139, 0, 0));
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 16));
		btnNewButton.setBounds(171, 398, 126, 29);
		contentPane.add(btnNewButton);
		
		Vector vv=new Vector();
		vv.add("Passenger/Chef");
		vv.add("Purpose");
		vv.add("Seat Number");
		vv.add("Ticket Number");

		table=new JTable(DAAir_hostess.getAll (),vv);
		
		pane=new JScrollPane(table);
		pane.setViewportBorder(UIManager.getBorder("TableHeader.cellBorder"));
		pane.setToolTipText("Air Hostess Pending Work");
		pane.setBounds(20,77,743,284);
		contentPane.add(pane);
		
		btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crew_login c = new crew_login();
				c.setVisible(true);
				dispose();
			}
		});
		btnLogout.setForeground(new Color(139, 0, 0));
		btnLogout.setFont(new Font("Calibri", Font.BOLD, 16));
		btnLogout.setBounds(489, 398, 126, 29);
		contentPane.add(btnLogout);
	}
}
