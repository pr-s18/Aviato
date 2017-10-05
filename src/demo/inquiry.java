package demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class inquiry extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inquiry frame = new inquiry();
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
	public inquiry() {
		setTitle("Inquiry");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 620, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(inquiry.class.getResource("/demo/inquiry_title.jpg")));
		label.setBounds(0, 0, 598, 112);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(inquiry.class.getResource("/demo/inquiry1.png")));
		label_1.setBounds(35, 132, 189, 189);
		contentPane.add(label_1);
		
		JLabel lblFlightDetails = new JLabel("FLIGHT DETAILS");
		lblFlightDetails.setForeground(new Color(178, 34, 34));
		lblFlightDetails.setFont(new Font("Algerian", Font.PLAIN, 20));
		lblFlightDetails.setBounds(257, 156, 183, 20);
		contentPane.add(lblFlightDetails);
		
		JLabel lblCurrentPosition = new JLabel("Current position: 20.5937\u00B0 N, 78.9629\u00B0 E");
		lblCurrentPosition.setForeground(new Color(255, 165, 0));
		lblCurrentPosition.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblCurrentPosition.setBounds(257, 190, 326, 20);
		contentPane.add(lblCurrentPosition);
		
		JLabel lblReminingTimeOf = new JLabel("Remining time of flight: 5 hours");
		lblReminingTimeOf.setForeground(new Color(255, 140, 0));
		lblReminingTimeOf.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblReminingTimeOf.setBounds(257, 227, 293, 20);
		contentPane.add(lblReminingTimeOf);
		
		JLabel lblWeathercWind = new JLabel("Weather: 21\u00B0C");
		lblWeathercWind.setForeground(new Color(255, 140, 0));
		lblWeathercWind.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblWeathercWind.setBounds(257, 260, 137, 20);
		contentPane.add(lblWeathercWind);
		
		JLabel lblWindWAt = new JLabel("Wind W at 3 km/h");
		lblWindWAt.setForeground(new Color(255, 140, 0));
		lblWindWAt.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblWindWAt.setBounds(309, 284, 151, 20);
		contentPane.add(lblWindWAt);
		
		JLabel lblHumidity = new JLabel("68% Humidity");
		lblHumidity.setForeground(new Color(255, 140, 0));
		lblHumidity.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblHumidity.setBounds(309, 311, 137, 20);
		contentPane.add(lblHumidity);
		
		JLabel lblRulesAndGuidelines = new JLabel("RULES AND GUIDELINES");
		lblRulesAndGuidelines.setForeground(new Color(178, 34, 34));
		lblRulesAndGuidelines.setFont(new Font("Algerian", Font.PLAIN, 20));
		lblRulesAndGuidelines.setBounds(36, 379, 234, 20);
		contentPane.add(lblRulesAndGuidelines);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(inquiry.class.getResource("/demo/inquiry2.jpg")));
		label_2.setBounds(352, 394, 207, 207);
		contentPane.add(label_2);
		
		JLabel lblRespectThe = new JLabel("1. Respect the Lavatory.");
		lblRespectThe.setForeground(new Color(34, 139, 34));
		lblRespectThe.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblRespectThe.setBounds(41, 415, 229, 20);
		contentPane.add(lblRespectThe);
		
		JLabel lblNewLabel = new JLabel("2. Keep your children in check.");
		lblNewLabel.setForeground(new Color(34, 139, 34));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel.setBounds(41, 454, 273, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblConsiderYour = new JLabel("3. Be nice to the attendants.");
		lblConsiderYour.setForeground(new Color(34, 139, 34));
		lblConsiderYour.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblConsiderYour.setBounds(41, 490, 273, 20);
		contentPane.add(lblConsiderYour);
		
		JLabel lblDontHog = new JLabel("4. Don't hog the overhead bin.");
		lblDontHog.setForeground(new Color(34, 139, 34));
		lblDontHog.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblDontHog.setBounds(41, 526, 283, 20);
		contentPane.add(lblDontHog);
		
		JLabel lblDontGet = new JLabel("5. Don't get hammered.");
		lblDontGet.setForeground(new Color(34, 139, 34));
		lblDontGet.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblDontGet.setBounds(41, 564, 214, 20);
		contentPane.add(lblDontGet);
		
		JLabel lblMiddleSeat = new JLabel("6. Sleep or recline carefully.");
		lblMiddleSeat.setForeground(new Color(34, 139, 34));
		lblMiddleSeat.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblMiddleSeat.setBounds(41, 600, 255, 20);
		contentPane.add(lblMiddleSeat);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(inquiry.class.getResource("/demo/inquiry3.jpg")));
		label_3.setBounds(35, 656, 173, 189);
		contentPane.add(label_3);
		
		JLabel lblInCaseOf = new JLabel("IN CASE OF EMERGENCY");
		lblInCaseOf.setForeground(new Color(178, 34, 34));
		lblInCaseOf.setFont(new Font("Algerian", Font.PLAIN, 20));
		lblInCaseOf.setBounds(309, 659, 224, 20);
		contentPane.add(lblInCaseOf);
		
		JLabel lblUseYour = new JLabel("1. Use your oxygen masks.");
		lblUseYour.setForeground(new Color(199, 21, 133));
		lblUseYour.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblUseYour.setBounds(309, 695, 250, 20);
		contentPane.add(lblUseYour);
		
		JLabel lblBuckleUp = new JLabel("2. Buckle up tight.");
		lblBuckleUp.setForeground(new Color(199, 21, 133));
		lblBuckleUp.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblBuckleUp.setBounds(309, 732, 224, 20);
		contentPane.add(lblBuckleUp);
		
		JLabel lblFindAnd = new JLabel("3. Find and open the exit door.");
		lblFindAnd.setForeground(new Color(199, 21, 133));
		lblFindAnd.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblFindAnd.setBounds(309, 769, 255, 20);
		contentPane.add(lblFindAnd);
		
		JLabel lblDoNot = new JLabel("4. Do NOT Panic!");
		lblDoNot.setForeground(new Color(199, 21, 133));
		lblDoNot.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblDoNot.setBounds(309, 802, 180, 20);
		contentPane.add(lblDoNot);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main_page  m = new Main_page();
				m.setVisible(true);
				dispose();
			}
		});
		btnExit.setBounds(430, 883, 115, 29);
		contentPane.add(btnExit);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\Users\\Nishtha Sharma\\Desktop\\demo\\src\\demo\\home.jpg"));
		label_4.setBounds(33, 864, 69, 64);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(inquiry.class.getResource("/demo/inquirybg.jpg")));
		label_5.setBounds(0, 37, 598, 907);
		contentPane.add(label_5);
	}
}