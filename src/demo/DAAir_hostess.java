package demo;
import java.sql.*;
import java.util.Vector;

public class DAAir_hostess extends connection{
	static Connection cc = getConnection ();
	
	// ------------------------------water------------------------
	public static boolean drinking_water (BOAir_hostess air_h)
	{
	try {
		PreparedStatement p = cc.prepareStatement ("insert into aair_hostess (pass_chef,purpose,ticket_no,seat_no) values (?,?,?,?)");
		p.setString (2, air_h.getPurpose ());	
		p.setInt (4, air_h.getSeat_no ());
		p.setInt (3, air_h.getTicket_no());
		p.setString (1, air_h.getPass_chef());
		p.executeUpdate ();
		return true;
	}
	catch (Exception e) {System.out.println (e);
		return false;
	}
	}
	
	//---------------------seat_exchange ---------------------------
	public static boolean seat_exchange (BOAir_hostess air_h)
	{
	try {
		PreparedStatement p = cc.prepareStatement ("insert into aair_hostess (pass_chef,purpose,ticket_no,seat_no) values (?,?,?,?)");
		p.setString (2, air_h.getPurpose ());	
		p.setInt (4, air_h.getSeat_no ());
		p.setInt (3, air_h.getTicket_no());
		p.setString (1, air_h.getPass_chef());
		p.executeUpdate ();
		return true;
	}
	catch (Exception e) {System.out.println (e);
		return false;
	}
	}
	
	//--------------------medical------------------------------------
	public static boolean medical (BOAir_hostess air_h)
	{
	try {
		PreparedStatement p = cc.prepareStatement ("insert into aair_hostess (pass_chef,purpose,ticket_no,seat_no) values (?,?,?,?)");
		p.setString (2, air_h.getPurpose ());	
		p.setInt (4, air_h.getSeat_no ());
		p.setInt (3, air_h.getTicket_no());
		p.setString (1, air_h.getPass_chef());
		p.executeUpdate ();
		return true;
	}
	catch (Exception e) {System.out.println (e);
		return false;
	}
	}
	
	//---------------------souvenirs-----------------------
	public static boolean souvenirs (BOAir_hostess air_h)
	{
	try {
		PreparedStatement p = cc.prepareStatement ("insert into aair_hostess (pass_chef,purpose,ticket_no,seat_no) values (?,?,?,?)");
		p.setString (2, air_h.getPurpose ());	
		p.setInt (4, air_h.getSeat_no ());
		p.setInt (3, air_h.getTicket_no());
		p.setString (1, air_h.getPass_chef());
		p.executeUpdate ();
		return true;
	}
	catch (Exception e) {System.out.println (e);
		return false;
	}
	}
	
	//--------------------others----------------------------
	public static boolean others (BOAir_hostess air_h)
	{
	try {
		PreparedStatement p = cc.prepareStatement ("insert into aair_hostess (pass_chef,purpose,ticket_no,seat_no) values (?,?,?,?)");
		p.setString (2, air_h.getPurpose ());	
		p.setInt (4, air_h.getSeat_no ());
		p.setInt (3, air_h.getTicket_no());
		p.setString (1, air_h.getPass_chef());
		p.executeUpdate ();
		return true;
	}
	catch (Exception e) {System.out.println (e);
		return false;
	}
	}
	
	//------------------------------chef----------------------
	public static boolean for_chef (BOAir_hostess air_h)
	{
	try {
		PreparedStatement p = cc.prepareStatement ("insert into aair_hostess (pass_chef,purpose,ticket_no,seat_no) values (?,?,?,?)");
		p.setString (2, air_h.getPurpose ());	
		p.setInt (4, air_h.getSeat_no ());
		p.setInt (3, air_h.getTicket_no());
		p.setString (1, air_h.getPass_chef());
		p.executeUpdate ();
		return true;
	}
	catch (Exception e) {System.out.println (e);
		return false;
	}
	}
	//------------------getAll-----------------------------------------------------------------
	
	public static Vector getAll ()
	{
		Vector entr = new Vector();
		try {
			PreparedStatement s = cc.prepareStatement ("select * from aair_hostess");
			ResultSet rs = s.executeQuery ();
			while (rs.next ()) {
				Vector user = new Vector();
				user.add (rs.getString (1));
				user.add (rs.getString (2));
				user.add (rs.getInt (3));
				user.add (rs.getInt (4));
				entr.add(user);		
	} 
		}
		catch (Exception e) {
			System.out.println (e);
		}
		return entr;
	}
	
	//-----------------------------------------------------------------------------------------------
	//-------------------------------Delete----------------------------------------------------
	
	public static boolean delete (int ticket_no, String purpose)
	{
	try {
		PreparedStatement p = cc.prepareStatement ("delete from aair_hostess where purpose=? and ticket_no = ?");
		p.setString(1, purpose);
		p.setInt(2,ticket_no);
		p.executeUpdate ();
		return true;
	}
	catch (Exception e) {System.out.println (e);
		return false;
	}
	}
	
	//-----------------------------------------------------------------------------------------------
	
}
