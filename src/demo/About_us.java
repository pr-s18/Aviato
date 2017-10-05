package demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class About_us extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About_us frame = new About_us();
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
	public About_us() {
		setResizable(false);
		setTitle("About Us");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 557, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(About_us.class.getResource("/demo/aq.jpg")));
		label.setBounds(119, 11, 319, 98);
		contentPane.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("Aviato is a Java Application designed to give you a memorable");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.ITALIC, 18));
		lblNewLabel_1.setBounds(7, 134, 531, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("and exciting experience .We have a huge database of movies, ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.ITALIC, 18));
		lblNewLabel_2.setBounds(10, 159, 528, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("songs, books and games to keep you entertained. Along with ");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.ITALIC, 18));
		lblNewLabel_3.setBounds(7, 183, 531, 25);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("that we have services like cafe and Call the AirHostess for");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Comic Sans MS", Font.ITALIC, 18));
		lblNewLabel_4.setBounds(8, 207, 528, 25);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("your aid. Information regarding flight along with other details");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Comic Sans MS", Font.ITALIC, 18));
		lblNewLabel_5.setBounds(7, 231, 531, 25);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblWeHopeTo = new JLabel("is available at inquiry page. We hope to give you an");
		lblWeHopeTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeHopeTo.setForeground(new Color(255, 255, 255));
		lblWeHopeTo.setFont(new Font("Comic Sans MS", Font.ITALIC, 18));
		lblWeHopeTo.setBounds(7, 254, 531, 25);
		contentPane.add(lblWeHopeTo);
		
		JLabel lblExperienceOfA = new JLabel("experience of a lifetime.");
		lblExperienceOfA.setHorizontalAlignment(SwingConstants.CENTER);
		lblExperienceOfA.setForeground(new Color(255, 255, 255));
		lblExperienceOfA.setFont(new Font("Comic Sans MS", Font.ITALIC, 18));
		lblExperienceOfA.setBounds(7, 277, 531, 25);
		contentPane.add(lblExperienceOfA);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Main_page mn = new Main_page();
				mn.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_6.setIcon(new ImageIcon(About_us.class.getResource("/demo/home.jpg")));
		lblNewLabel_6.setBounds(44, 297, 56, 50);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(About_us.class.getResource("/demo/qw1.jpg")));
		lblNewLabel.setBounds(0, 0, 549, 360);
		contentPane.add(lblNewLabel);
	}
}
