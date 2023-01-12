package com.driver.manager;

import java.sql.*;
import java.sql.DriverManager;

public class JdbcDemo {

	public static String url = "jdbc:mysql://localhost:3306/employee";
	public static String u_name = "root";
	public static String pass = "22697";
	static ResultSet res;

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, u_name, pass);
		Statement stmt = con.createStatement();

//		String query = "select * from data";
		
		String query="alter table data drop column e_country";
//		ResultSet res = stmt.executeQuery(query);
		int rs=stmt.executeUpdate(query);
		
		System.out.println(rs);

//		while (res.next()) {
//
//			int id = res.getInt(1);
//			String name = res.getString(2);
//			String city = res.getString(3);
//			int salary = res.getInt(4);
//
//			System.out.println(" " + id + " " + name + " " + city + " " + salary);
//		}

	}
}
