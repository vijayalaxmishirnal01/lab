package com.jdbc.LAB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.JDBC.DatabaseConnection;

public class CreateTable_Emp {

public static void main(String[] args) {
		
		//try with resource
		try(Connection conn = DatabaseConnection.getDbConnection())
		{
			//create the statement
			Statement st = conn.createStatement();
			
			//write/create query
			String sql = "create table Emp(Emp_id int primary key, Emp_name varchar(20) not null,"
					+ "Emp_address varchar(30) not null, Emp_salary int not null, Emp_contact_no int,"
					+ "Dept_id int foreign key)";
			
			//execute the query
			st.executeUpdate(sql);
			System.out.println("Table create suceessfully.");
				
			} catch (SQLException e) {
				System.out.println(e);
			}
			
		}
}

