package com.jdbc.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {

	public static void main(String[] args) {
		
		try(Connection con = DatabaseConnection.getDbConnection())
		{
			Statement st = con.createStatement();
			
			String select = "select * from employee";
			
			ResultSet rs =st.executeQuery(select);
			
			while(rs.next())
			{
				System.out.println("Employee Id:" +rs.getInt(1));
				System.out.println("Employee Name:" +rs.getString(2));
				System.out.println("Employee Email:" +rs.getString("email"));
				System.out.println("Employee Salary:" +rs.getInt("salary"));
				System.out.println("========================================");
			}
		}
		catch(SQLException e) {
			System.out.println(e);
		}
	}
	
}
