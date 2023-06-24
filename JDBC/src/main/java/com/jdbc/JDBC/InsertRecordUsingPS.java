package com.jdbc.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.xdevapi.PreparableStatement;

public class InsertRecordUsingPS {

	public static void main(String[] args) {
		
		try(Connection con = DatabaseConnection.getDbConnection();
			Scanner sc =new Scanner(System.in))
		{
			String query ="insert into employee values(?,?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			System.out.println("Enter ID:");
			int id = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Enter Name:");
			String name = sc.nextLine();
			
			System.out.println("Enter Email:");
			String email = sc.nextLine();
			
			System.out.println("Enter salary");
			int salary = sc.nextInt();
			
			ps.setInt(1,id);
			ps.setString(2,name);
			ps.setString(3,email);
			ps.setInt(4, salary);
			
			int r = ps.executeUpdate();
			System.out.println(r+ "record is inserted successfully.");
			
		}
		catch (SQLException e) {
			System.out.println(e);
		}
	}
}
