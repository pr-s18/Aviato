package demo;

import java.awt.BorderLayout;
import java.util.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;

public class ViewAllEntr extends JFrame {

	private JPanel contentPane;
	private JTable table;
	JScrollPane pane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAllEntr frame = new ViewAllEntr();
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
	public ViewAllEntr() {
		setResizable(false);
		setTitle("View Entertainment section");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 730, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		Vector vv=new Vector();
		vv.add("Id");
		vv.add("Type");
		vv.add("Name");
		vv.add("Actor/Actress");
		vv.add ("Genre");
		vv.add ("Director/Author");
		vv.add ("Time/Pages");

		table=new JTable(DAEntertainment.getAll (),vv);
		table.setFont(new Font ("Kartika",Font.PLAIN,14));
		table.setAlignmentX(SwingConstants.CENTER);
		//table.setBounds(10,60,414,202);
		pane=new JScrollPane(table);
		pane.setViewportBorder(UIManager.getBorder("TableHeader.cellBorder"));
		pane.setToolTipText("Entertainment collection table");
		pane.setBounds(10,74,694,215);
		contentPane.add(pane);
		
		JLabel lblNewLabel = new JLabel("ENTERTAINMENT    COLLECTION");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Broadway", Font.BOLD, 26));
		lblNewLabel.setBounds(10, 0, 694, 52);
		contentPane.add(lblNewLabel);
		}
	}
