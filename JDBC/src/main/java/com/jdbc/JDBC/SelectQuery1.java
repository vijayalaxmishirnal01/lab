package com.jdbc.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectQuery1 {

	public static void main(String[] args) {
		
		try(Connection con = DatabaseConnection.getDbConnection();
				Scanner sc = new Scanner(System.in))
		{
			String query ="select * from employee where id=?";
		
			PreparedStatement ps = con.prepareStatement(query);
			
			System.out.println("Enter ID:");
			int id = sc.nextInt();
			
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
		
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
