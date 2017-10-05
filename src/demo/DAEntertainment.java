package demo;

import java.sql.*;
import java.util.*;

public class DAEntertainment extends connection{
	static Connection cc = getConnection ();
	public static boolean add (BOEntertainment entr)
	{
	try {
		PreparedStatement p = cc.prepareStatement ("insert into entertainment (ent_id,ent_type, ent_name, actor, genre, auth_dir,time_pages) values (?,?,?,?,?,?,?)");
		p.setString (2, entr.getType ());
		p.setString (3, entr.getName ());		
		p.setInt (1, entr.getId ());
		p.setString (4, entr.getActor ());
		p.setString (5, entr.getGenre ());
		p.setString (6, entr.getMaker ());				
		p.setString (7, entr.getTime ());
		p.executeUpdate ();
		return true;
	}
	catch (Exception e) {System.out.println (e);
		return false;
	}
	}

//--------------------------update-----------------------------------------------------------------
public static boolean update (BOEntertainment entr)
{
try {
	PreparedStatement p = cc.prepareStatement ("update entertainment  set ent_type=?,ent_name=?,actor=?,genre=?,auth_dir=?, time_pages = ? where ent_id=?");
	p.setString (1, entr.getType ());
	p.setString (2, entr.getName ());		
	p.setInt (7, entr.getId ());
	p.setString (3, entr.getActor ());
	p.setString (4, entr.getGenre ());
	p.setString (5, entr.getMaker ());				
	p.setString (6, entr.getTime());
	p.executeUpdate ();
	return true;
}
catch (Exception e) {System.out.println (e);
	return false;
}
}

//----------delete item-------------------------------------------------------
public static boolean delete (int id)
{
try {
	PreparedStatement p = cc.prepareStatement ("delete from entertainment where ent_id=?");
	p.setInt(1,id);
	p.executeUpdate ();
	return true;
}
catch (Exception e) {System.out.println (e);
	return false;
}
}
//-----------------------getAll---------------------------------------------------------
public static Vector getAll ()
{
	Vector entr = new Vector();
	try {
		PreparedStatement s = cc.prepareStatement ("select * from entertainment where ent_name  != '--Choose--'  order by ent_id");
		ResultSet rs = s.executeQuery ();
		while (rs.next ()) {
			Vector user = new Vector();
			user.add (rs.getInt (1));
			user.add (rs.getString (2));
			user.add (rs.getString (3));
			user.add (rs.getString (4));
			user.add (rs.getString (5));
			user.add (rs.getString (6));
			user.add (rs.getString (7));
			entr.add(user);		
} 
	}
	catch (Exception e) {
		System.out.println (e);
	}
	return entr;
}
//------------------------getGames------------------------------------------------------------

public static Vector getGames ()
{
	Vector entr = new Vector();
	try {
		PreparedStatement s = cc.prepareStatement ("select * from entertainment where ent_type='Games' order by ent_id ");
		ResultSet rs = s.executeQuery ();
		while (rs.next ()) {
			entr.add (rs.getString(3));	
} 
	}
	catch (Exception e) {
		System.out.println (e);
	}
	return entr;
}

//--------------------------------------------------------------------------------------------------------
//-----------------------------------getMusic--------------------------------------------------

public static Vector getMusic ()
{
	Vector entr = new Vector();
	try {
		PreparedStatement s = cc.prepareStatement ("select * from entertainment where ent_type='Music' order by ent_id ");
		ResultSet rs = s.executeQuery ();
		while (rs.next ()) {
			entr.add (rs.getString(3));	
} 
	}
	catch (Exception e) {
		System.out.println (e);
	}
	return entr;
}


//-------------------------------------------------------------------------------------------------------
//-----------------------------------------------getMovies--------------------------------------

public static Vector getMovies ()
{
	Vector entr = new Vector();
	try {
		PreparedStatement s = cc.prepareStatement ("select * from entertainment where ent_type='Movie'  order by ent_id");
		ResultSet rs = s.executeQuery ();
		while (rs.next ()) {
			entr.add (rs.getString(3));	
} 
	}
	catch (Exception e) {
		System.out.println (e);
	}
	return entr;
}


//--------------------------------------------------------------------------------------------------------
//-----------------------------------------------getBooks-----------------------------------------

public static Vector getBooks ()
{
	Vector entr = new Vector();
	try {
		PreparedStatement s = cc.prepareStatement ("select * from entertainment where ent_type='Book' order by ent_id ");
		ResultSet rs = s.executeQuery ();
		while (rs.next ()) {
			entr.add (rs.getString(3));	
} 
	}
	catch (Exception e) {
		System.out.println (e);
	}
	return entr;
}

//---------------------------------------------------------------------------------------------------------
//---------------------------getByName---------------------------------------------------------

public static BOEntertainment getByName (String str) {
	BOEntertainment cf = null;
	try {
		PreparedStatement s = cc.prepareStatement ("select * from entertainment where ent_name = ? ");
		s.setString (1, str);
		ResultSet rs = s.executeQuery ();
		while (rs.next ()) {
			cf = new BOEntertainment ();
			cf.setId (rs.getInt (1));
			cf.setName (rs.getString (3));
			cf.setMaker (rs.getString (6));
			cf.setGenre (rs.getString (5));
			cf.setType (rs.getString (2));
			cf.setActor (rs.getString (4));
			cf.setTime (rs.getString (7));
		} 
	}
	catch (Exception e) {
		System.out.println (e);
	}
	return cf;
}
}

