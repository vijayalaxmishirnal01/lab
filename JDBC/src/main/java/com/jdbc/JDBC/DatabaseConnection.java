package com.jdbc.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	
	static Connection con=null;
	
	//method will create connection and return us the connection object
	
	public static Connection getDbConnection()
	{
		try
		{
			//register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//establish a connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anp4778", "root", "Vijayalaxmi01@");
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		return con;
	}

}