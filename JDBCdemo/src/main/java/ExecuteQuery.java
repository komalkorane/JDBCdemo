import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteQuery {

	public static String url = "jdbc:mysql://localhost:3306/employee";
	public static String u_name = "root";
	public static String u_pass = "22697";
	static ResultSet res;
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,u_name,u_pass);
		
		Statement stmt =con.createStatement();
		
		String query = "select * from vehicle";
		
	
		 res =stmt.executeQuery(query);
		
		while(res.next()) {
			
			int no = res.getInt(1);
			String name = res.getString(2);
			String comp = res.getString(3);
			int price = res.getInt(4); 
			
			System.out.println(" "+no+" "+name+" "+comp+" "+price);
		}
		

	}

}
