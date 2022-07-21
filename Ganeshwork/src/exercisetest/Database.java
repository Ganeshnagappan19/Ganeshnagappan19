package exercisetest;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;



public class Database {
		public static void main(String[] args) throws Exception {
			//Scanner sc =new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh", "root", "root");
			Statement stm= con.createStatement();
			String sql="create table employesss"+"(sno integer,"+" name varchar(70),"+"address varchar(34),"+"depart varchar(45))";
	  	stm.executeUpdate(sql);		
		System.out.println("Created table in given database...");}
}
			//Insert 
			 
//			//Update std1 record
//			R = statement1.executeUpdate("Update std1 set section='6-b' where name='lion'");
//			System.out.println(R);
//			System.out.println("Update successfully!");
//			// delete std1 record
//		//	R = statement1.executeUpdate("delete from std1 where address = 'eion'");
//			//System.out.println(R);
//			//System.out.println("Deleted successfully...");
//			
//			// read std1 records
//			ResultSet rs = statement1.executeQuery("Select * from std1");
//			while (rs.next()) {
//				System.out.println("rollno : " + rs.getInt("rollno") + ", name : " + rs.getString("name") + ", address : "
//						+ rs.getString("address") + ", section : " + rs.getString("section"));
//			}
//			System.out.println("showed success");
	
