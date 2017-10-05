package demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;
import java.util.Vector;
import java.awt.Color;

public class ViewAllCafe extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JScrollPane pane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAllCafe frame = new ViewAllCafe();
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
	public ViewAllCafe() {
		setResizable(false);
		setTitle("Cafe Menu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 750, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Vector vv=new Vector();
		vv.add("Name");
		vv.add("Type");
		vv.add("Price");

		table=new JTable(DAUpdate_cafe.getAll (),vv);
		table.setFont(new Font ("Kartika",Font.PLAIN,14));
		table.setAlignmentX(SwingConstants.CENTER);
		//table.setBounds(10,60,414,202);
		pane=new JScrollPane(table);
		pane.setViewportBorder(UIManager.getBorder("TableHeader.cellBorder"));
		pane.setToolTipText("Menu");
		pane.setBounds(30,74,683,207);
		contentPane.add(pane);
		
		JLabel lblCafeMenu = new JLabel("Cafe Menu");
		lblCafeMenu.setForeground(new Color(0, 0, 139));
		lblCafeMenu.setFont(new Font("Algerian", Font.BOLD, 45));
		lblCafeMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblCafeMenu.setBounds(30, 8, 683, 37);
		contentPane.add(lblCafeMenu);
	}
}
