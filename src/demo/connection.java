package demo;

import java.sql.*;

public class connection {
	public static Connection getConnection()
	{
	Connection con=null;
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","123456");

	}catch(Exception e)
	{
	System.out.println(e);	
	}
	return con;
	}

}
