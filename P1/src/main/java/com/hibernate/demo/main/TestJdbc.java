package com.hibernate.demo.main;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:mysql://localhost:3306/majorproject";
		String user = "sam";
		String pass = "sam@12345";
		
		try {
			System.out.println("Connecting to database: " + jdbcUrl);
			
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Connection successful!!!"+myConn);
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
	}

}



