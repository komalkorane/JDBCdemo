import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ExecuteQuery2 {

	public static String url = "jdbc:mysql://localhost:/employee";
	public static String u_name = "root";
	public static String u_pass = "22697";
	static ResultSet res;
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection(url,u_name,u_pass);
		
		Statement stmt = conn.createStatement();
		
		String query = "select * from data where e_id=1";
		
		 res = stmt.executeQuery(query);
		
		while(res.next()) {
			
			String name = res.getString(2);
			String city = res.getString(3);
			String dept = res.getString(5);
			
			System.out.println(" "+name+" "+city+" "+dept);
		}

	}

}
