package com.jdbc.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteQuery {

	public static void main(String[] args) {
	
		try(Connection con = DatabaseConnection.getDbConnection();
				Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter id:");
			int id = sc.nextInt();
			
			String query ="delete from employee where id=?";
		
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(1, id);
			
			int r = ps.executeUpdate();
			System.out.println(r+ "row has been deleted successfully.");
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				System.out.println("Employee Id:" +rs.getInt(1));
				System.out.println("Employee Name:" +rs.getString("name"));
				System.out.println("Employee Email:" +rs.getString(3));
				System.out.println("Employee Salary:" +rs.getInt("salary"));
				System.out.println("========================================");
			}
			else
				System.out.println("Employee with id "+id+" not found!");
		}
		catch (SQLException e) {
			System.out.println(e);
		}
	}
}
