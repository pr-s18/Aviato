package demo;

import java.sql.*;
import java.util.*;

public class DACrew extends connection {
	static Connection cc = getConnection ();
	public static BOCrew getById (String username, String password) {
		BOCrew crw = null;
		try {
			PreparedStatement s = cc.prepareStatement ("select * from aair_crew where type = ? and  password = ?");
			s.setString (1, username);
			s.setString(2,password);
			ResultSet rs = s.executeQuery ();
			while (rs.next ()) {
				crw = new BOCrew ();
				crw.setUsername (rs.getString (1));
				crw.setPassword (rs.getString (2));
			} 
		}
		catch (Exception e) {
			System.out.println (e);
		}
		return crw;
	}

}
