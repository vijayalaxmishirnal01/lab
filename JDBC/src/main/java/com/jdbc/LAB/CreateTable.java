package com.jdbc.LAB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.JDBC.DatabaseConnection;

public class CreateTable{

	public static void main(String[] args) {
		
		//try with resource
		try(Connection conn = DatabaseConnection.getDbConnection())
		{
			//create the statement
			Statement st = conn.createStatement();
			
			//write/create query
			String sql = "create table Department(Dept_id int primary key, Dept_name varchar(20) not null,"
					+ "Dept_Head varchar(30) not null, Dept_Description varchar(30) not null)";
			
			//execute the query
			st.executeUpdate(sql);
			System.out.println("Table create suceessfully.");
				
			} catch (SQLException e) {
				System.out.println(e);
			}
			
		}
}
