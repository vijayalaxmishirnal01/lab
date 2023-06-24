package com.jdbc.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecordsEx {

	public static void main(String[] args) {
		
		try (Connection con = DatabaseConnection.getDbConnection()){
			
			//Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anp4778", "root", "Vijayalaxmi01@");
			Statement  stm =con.createStatement();
			
			String query = "insert into employee values(102,'laxmi', 'laxmi@gmail.com',85000),"
					+ "(103, 'Purushottam', 'purushottam@gmail.com', 75000)";
			
			int row = stm.executeUpdate(query);
			
			System.out.println(row+" record inserted successfully.");
		}
		catch (SQLException e) {
			
			System.out.println(e);
		}
	}
}
