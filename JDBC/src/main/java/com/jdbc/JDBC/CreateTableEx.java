package com.jdbc.JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableEx {

	public static void main(String[] args) {
		
		//try with resource
		try(Connection conn=DatabaseConnection.getDbConnection())
		{
			//create the statement
			Statement st = conn.createStatement();
			
			//write/create query
			String sql = "create table employee (id int primary key, name varchar(20) not null,"
					+ "email varchar(30) not null unique,salary int not null)";
			
			//execute the query
			st.executeUpdate(sql);
			System.out.println("Table create suceessfully.");
				
			} catch (SQLException e) {
				System.out.println(e);
			}
			
		}
	}

