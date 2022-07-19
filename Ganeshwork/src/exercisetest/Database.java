package exercisetest;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Database {
		public static void main(String[] args) throws Exception {
			Scanner sc =new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud", "root", "root");
			Statement stmt = con.createStatement();
	   		String sql = "CREATE TABLE std1 " + "(rollno INTEGER not NULL, " +"name VARCHAR(255), " + " address VARCHAR(255), " + "section VARCHAR(255))";	stmt.executeUpdate(sql);		
	   		System.out.println("Created table in given database...");}
	}
	//}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
////			
//			int rowsInserted = statement1.executeUpdate();
//			if (roString sql1 = "INSERT INTO Std1 (rollno, name, address,section) VALUES (?, ?, ?, ?)";
////			PreparedStatement statement1 = con.prepareStatement(sql1);
//			statement1.setInt(1, 1);
//			statement1.setString(2, "eion");
//			statement1.setString(3, "fort");
//			statement1.setString(4, "12-a");
//		  wsInserted > 0) {
				//System.out.println("A new user was inserted successfully!");
			
	//}








