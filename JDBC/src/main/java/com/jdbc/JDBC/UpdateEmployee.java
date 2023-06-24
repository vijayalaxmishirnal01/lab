package com.jdbc.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateEmployee {

	public static void main(String[] args) {
		
		try(Connection conn = DatabaseConnection.getDbConnection();
				Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter Name:");
			String name = sc.nextLine();
			
			System.out.println("Enter Email:");
			String email = sc.nextLine();
			
			System.out.println("Enter salary");
			int salary = sc.nextInt();
			
			String query = "update employee set name='"+name+"', email='"+email+"', salary='"+salary+"' "
					+ "Where id=?";
			
			PreparedStatement ps = conn.prepareStatement(query);
			
			System.out.println("Enter id to update:");
			int id = sc.nextInt();
			
			ps.setInt(1, id);
			
			int r = ps.executeUpdate();
			System.out.println(r+ "row has been updated successfully.");
			
			System.out.println();
			
			PreparedStatement ps1 = conn.prepareStatement(query);
			ResultSet rs = ps1.executeQuery();
			
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
