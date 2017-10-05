package demo;

import java.sql.*;
import java.util.*;

public class DAPassenger extends connection {
	static Connection cc = getConnection ();
	public static BOPassenger getById (int id) {
		BOPassenger psn = null;
		try {
			PreparedStatement s = cc.prepareStatement ("select * from apassenger where id = ? ");
			s.setInt (1, id);
			ResultSet rs = s.executeQuery ();
			while (rs.next ()) {
				psn = new BOPassenger ();
				psn.setCls (rs.getString (3));
				psn.setName (rs.getString (1));
				psn.setId(rs.getInt(2));
				psn.setSeat_number (rs.getInt (4));
			} 
		}
		catch (Exception e) {
			System.out.println (e);
		}
		return psn;
	}
}
