package com.driver.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySql {
	
	public static final String dbURL = "jdbc:mysql://localhost:3306/pro_wings";
	public static final String dbUserName = "root";
	public static final String dbPass = "22697";

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(dbURL, dbUserName, dbPass);
		Statement stmt = conn.createStatement();
		String q="select * from voter";
		ResultSet rs = stmt.executeQuery(q);
		
		while(rs.next()) {
			
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String city = rs.getString(3);
			int age = rs.getInt(4);
			
			System.out.println("id : "+id+ " name : "+name+ " city : "+city+" age : "+age);
		}
		
		
	}

}
