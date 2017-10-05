package demo;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class pass_login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pass_login frame = new pass_login();
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
	public pass_login() {
		setResizable(false);
		setTitle("Passenger Login");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(80, 80, 664, 459);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.background"));
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTicketNo = new JLabel("Ticket No.");
		lblTicketNo.setForeground(new Color(0, 0, 0));
		lblTicketNo.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblTicketNo.setBounds(247, 257, 145, 57);
		contentPane.add(lblTicketNo);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char ch =e.getKeyChar();
				if(!(ch>='0'|| ch<='9'))
				e.consume();
			}
		});
		textField.setDisabledTextColor(new Color(0, 0, 0));
		textField.setOpaque(false);
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setBounds(198, 327, 221, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setOpaque(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BOPassenger psn = DAPassenger.getById(Integer.parseInt(textField.getText ()));
				if(psn==null) {	
					JOptionPane.showMessageDialog (null, "ERROR!!!");
					textField.setText(null);
				}
				else{
				Invoker.psn = psn;
				Main_page p = new Main_page ();
				p.setVisible(true);
				p.setSize(600,490);
				dispose();
				}
			}
		});
		btnNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Calibri Light", Font.BOLD, 20));
		btnNewButton.setBounds(461, 319, 139, 47);
		contentPane.add(btnNewButton);
		
		JLabel lblWelcomeToAviato = new JLabel("Welcome to Aviato ");
		lblWelcomeToAviato.setForeground(new Color(0, 0, 0));
		lblWelcomeToAviato.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToAviato.setFont(new Font("Times New Roman", Font.ITALIC, 40));
		lblWelcomeToAviato.setBounds(112, 31, 378, 67);
		contentPane.add(lblWelcomeToAviato);
		
		JLabel lblEnterYourTicket = new JLabel("Enter your Ticket No. and we'll do the rest ...  ");
		lblEnterYourTicket.setForeground(new Color(0, 0, 0));
		lblEnterYourTicket.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterYourTicket.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 22));
		lblEnterYourTicket.setBounds(33, 98, 557, 47);
		contentPane.add(lblEnterYourTicket);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new start().setVisible(true);
			}
		});
		btnBack.setOpaque(false);
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Calibri Light", Font.BOLD, 20));
		btnBack.setBorderPainted(false);
		btnBack.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBounds(33, 319, 139, 47);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_2.setIcon(new ImageIcon(pass_login.class.getResource("/demo/pass_login.jpg")));
		lblNewLabel_2.setBounds(0, 0, 658, 430);
		contentPane.add(lblNewLabel_2);
	}
}