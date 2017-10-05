package demo;

import java.sql.*;
import java.util.*;

public class DAUpdate_cafe extends connection {
	static Connection cc = getConnection ();
	public static boolean add (BOUpdate_cafe ucaf)
	{
	try {
		PreparedStatement p = cc.prepareStatement ("insert into acafe (food_name,type,price) values (?,?,?)");
		p.setString (2, ucaf.getType ());
		p.setString (1, ucaf.getName ());		
		p.setInt (3, ucaf.getPrice ());
		p.executeUpdate ();
		return true;
	}
	catch (Exception e) {System.out.println (e);
		return false;
	}
	}
	
	//------------------------update-------------------------------------------
	
	public static boolean update (BOUpdate_cafe ucaf)
	{
	try {
		PreparedStatement p = cc.prepareStatement ("update acafe  set type = ?, price = ? where food_name=?");
		p.setString (1, ucaf.getType ());
		p.setString (3, ucaf.getName ());		
		p.setInt (2, ucaf.getPrice ());
		p.executeUpdate ();
		return true;
	}
	catch (Exception e) {System.out.println (e);
		return false;
	}
	}
	//---------------------delete-----------------------------------------------------
	public static boolean delete (String name)
	{
	try {
		PreparedStatement p = cc.prepareStatement ("delete from acafe where food_name=?");
		p.setString(1,name);
		p.executeUpdate ();
		return true;
	}
	catch (Exception e) {System.out.println (e);
		return false;
	}
	}
	//------------------------getByName-------------------------
	public static BOUpdate_cafe getByName (String name)
	{
		BOUpdate_cafe ucaf = null;
		try {
			PreparedStatement p = cc.prepareStatement ("select * from acafe where food_name = ?");
			p.setString (1, name);		
			ResultSet rs = p.executeQuery ();
			while(rs.next()){
				ucaf = new BOUpdate_cafe();
				ucaf.setName(rs.getString(1));
				ucaf.setType(rs.getString(2));
				ucaf.setPrice(rs.getInt(3));
			}
			return ucaf;
		}
		catch (Exception e) {
			System.out.println (e);
			return ucaf;
		}
	}
	//---------------------------------------------------------------------------------
	public static Vector getAll ()
	{
		Vector entr = new Vector();
		try {
			PreparedStatement s = cc.prepareStatement ("select * from acafe order by Type");
			ResultSet rs = s.executeQuery ();
			while (rs.next ()) {
				Vector user = new Vector();
				user.add (rs.getString (1));
				user.add (rs.getString (2));
				user.add (rs.getInt (3));
				entr.add(user);		
	} 
		}
		catch (Exception e) {
			System.out.println (e);
		}
		return entr;
	}
}