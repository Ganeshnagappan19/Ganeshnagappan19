package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class Dataconnection {
   public static void main(String[] args)throws Exception  {
	   
	   Scanner obi= new Scanner(System.in);
	   Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud", "root", "root");
	  Statement con=con.createstatement();
	  String sql=("CREATE TABLE BOYS"+"SNO")
}
}
