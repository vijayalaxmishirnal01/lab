package com.jdbc.LAB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.jdbc.JDBC.DatabaseConnection;

public class InsertDept {

public static void main(String[] args) {
		
		try(Connection con = DatabaseConnection.getDbConnection();
			Scanner sc =new Scanner(System.in))
		{
			String query ="insert into Department values(?,?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			System.out.println("Enter ID:");
			int id = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Enter Name:");
			String name = sc.nextLine();
			
			System.out.println("Enter Head:");
			String head = sc.nextLine();
			
			System.out.println("Enter Description:");
			String description = sc.nextLine();
			
			ps.setInt(1,id);
			ps.setString(2,name);
			ps.setString(3,head);
			ps.setString(4, description);
			
			int r = ps.executeUpdate();
			System.out.println(r+ "record is inserted successfully.");
			
		}
		catch (SQLException e) {
			System.out.println(e);
		}
	}
}
