package demo;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class services extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					services frame = new services();
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
	public services() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setForeground(Color.BLUE);
		setTitle("Services");
		setBounds(100, 100, 530, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCallForAir = new JButton("Call for Air Hostess");
		btnCallForAir.setHorizontalAlignment(SwingConstants.LEFT);
		btnCallForAir.setContentAreaFilled(false);
		btnCallForAir.setDefaultCapable(false);
		btnCallForAir.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnCallForAir.setForeground(new Color(0, 0, 0));
		btnCallForAir.setBackground(UIManager.getColor("Button.background"));
		btnCallForAir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				call_ah ah = new call_ah();
				ah.setVisible(true);
				//ah.setSize(523,345);
			}
		});
		btnCallForAir.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnCallForAir.setBounds(208, 231, 211, 33);
		contentPane.add(btnCallForAir);
		
		JLabel lblHungry = new JLabel("Hungry ??");
		lblHungry.setForeground(new Color(255, 255, 255));
		lblHungry.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblHungry.setBounds(316, 25, 135, 39);
		contentPane.add(lblHungry);
		
		JLabel lblOr = new JLabel("OR");
		lblOr.setForeground(new Color(255, 255, 255));
		lblOr.setFont(new Font("Times New Roman", Font.ITALIC, 24));
		lblOr.setBounds(358, 62, 46, 39);
		contentPane.add(lblOr);
		
		JLabel lblNeedSomeHelp = new JLabel("Need some help ...??");
		lblNeedSomeHelp.setForeground(new Color(255, 255, 255));
		lblNeedSomeHelp.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNeedSomeHelp.setBounds(246, 89, 278, 41);
		contentPane.add(lblNeedSomeHelp);
		
		JButton btnNewButton = new JButton("Cafe");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton.setEnabled(true);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cafe c = new Cafe();
				c.setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnNewButton.setBounds(226, 187, 165, 33);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("");
		label.setToolTipText("Home");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			Main_page m = new Main_page();
			m.setVisible(true);
				
				dispose();
			}
		});
		label.setIcon(new ImageIcon(services.class.getResource("/demo/home.jpg")));
		label.setBounds(10, 5, 90, 77);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(services.class.getResource("/demo/services.jpg")));
		lblNewLabel.setBounds(0, 0, 524, 301);
		contentPane.add(lblNewLabel);
		
	
	}
}