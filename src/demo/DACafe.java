package demo;

import java.sql.*;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class DACafe extends connection{
	static Connection cc = getConnection();
	public static boolean place (BOCafe entr){
		try{
			PreparedStatement p = cc.prepareStatement("Insert into cafe_order values(?,?,?)");
			p.setInt(1,entr.getOrder_id());
			p.setString(2, entr.getItems());
			p.setInt(3, entr.getPrice());
			p.executeUpdate();
			return true;
			
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, e.getMessage());
			return false;
		}
	}
	/*---------------------show-------------------
	public static DefaultListModel show(String type, DefaultListModel listmode){
		try{
			
			PreparedStatement p1 = cc.prepareStatement("Select * from acafe where type =?");
			p1.setString(1,type);
			ResultSet rs =p1.executeQuery();
			DefaultListModel listModel = listmode; 
			while (rs.next()) 
			{
				String items = rs.getString(1);
				listModel.addElement(items);
			} 
			
			return listModel;
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, e.getMessage());
			return listmode;
		}
	}
	*/
	public static String[] show(String type){
		try{
			String[] arr = new String[20];
			PreparedStatement p1 = cc.prepareStatement("Select food_name from acafe where type =?");
			p1.setString(1,type);
			ResultSet rs =p1.executeQuery();
			int i = 0;
			while (rs.next()) 
			{
				String items = rs.getString(1);
				//System.out.println(items);
				arr[i] = items;
				i++;
			} 
			arr[i] = "/0";
			return arr;
		}
		catch(Exception e){
			String[] k ={"error"};
			JOptionPane.showMessageDialog(null, e.getMessage());
			return k;
		}
	}
	
	
	
	
	
	
	//--------------------display-------------
	public static String[] display(String type){
		try{
			String[] arr = new String[20];
			PreparedStatement p1 = cc.prepareStatement("Select price from acafe where type =?");
			p1.setString(1,type);
			ResultSet rs =p1.executeQuery();
			int i = 0;
			while (rs.next()) 
			{
				String food = Integer.toString(rs.getInt(1));
				//System.out.println(items);
				arr[i] = food;
				i++;
			} 
			arr[i] = "/0";
			return arr;
		}
		catch(Exception e){
			String[] k ={"error"};
			JOptionPane.showMessageDialog(null, e.getMessage());
			return k;
		}
	}
	//---------------------------------------------------------------
	public static Vector getAll ()
	{
		Vector entr = new Vector();
		try {
			PreparedStatement s = cc.prepareStatement ("select order_id  from cafe_order ");
			ResultSet rs = s.executeQuery ();
			while (rs.next ()) {
				
				entr.add(rs.getInt(1));		
	} 
		}
		catch (Exception e) {
			System.out.println (e);
		}
		return entr;
	}
	//-------------------------------------------------------------------------
	public static BOCafe getById (int id) {
		BOCafe psn = null;
		try {
			PreparedStatement s = cc.prepareStatement ("select * from cafe_order where order_id = ? ");
			s.setInt (1, id);
			ResultSet rs = s.executeQuery ();
			while (rs.next ()) {
				psn = new BOCafe ();
				psn.setOrder_id (rs.getInt (1));
				psn.setItems (rs.getString (2));
				psn.setPrice(rs.getInt(3));
			} 
		}
		catch (Exception e) {
			System.out.println (e);
		}
		return psn;
	}
	
	
	
	
}