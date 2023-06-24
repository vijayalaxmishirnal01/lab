package com.jdbc.LAB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.jdbc.JDBC.DatabaseConnection;

public class InsertEmp {

public static void main(String[] args) {
		
		try(Connection con = DatabaseConnection.getDbConnection();
			Scanner sc =new Scanner(System.in))
		{
			String query ="insert into Emp values(?,?,?,?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			System.out.println("Enter ID:");
			int id = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Enter Name:");
			String name = sc.nextLine();
			
			System.out.println("Enter Address:");
			String head = sc.nextLine();
			
			System.out.println("Enter Salary:");
			int salary = sc.nextInt();
			
			System.out.println("Enter contact_no:");
			int contact_no = sc.nextInt();
			
			System.out.println("Enter Dept_id:");
			int dept_id = sc.nextInt();
			
			ps.setInt(1,id);
			ps.setString(2,name);
			ps.setString(3,head);
			ps.setInt(4, salary);
			ps.setInt(5, contact_no);
			ps.setInt(6, dept_id);
			
			int r = ps.executeUpdate();
			System.out.println(r+ "record is inserted successfully.");
			
		}
		catch (SQLException e) {
			System.out.println(e);
		}
	}
}
