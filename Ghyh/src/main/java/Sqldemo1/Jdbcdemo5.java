package Sqldemo1;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.Statement;
	public class Jdbcdemo5{
		public static void main(String[] args) throws Exception{
			//Step1 - Load the Driver.
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Step 2 - Establish Connection
			Connection con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/behind","root","root");
			
			System.out.println(con);
			//Step 3 - Execute sql statement
			
			String sql="select * from employees where employee_name=?";
			PreparedStatement stmt=con.prepareStatement(sql);
			
			stmt.setString(1, "sakthi");
			ResultSet rs=stmt.executeQuery();
			
			//step 4 - process result
			
			if(rs.next()) 
			{
				System.out.println(rs.getInt("employe_id")+":"+rs.getString("email")+":"+rs.getInt("salary"));
			}
		}
}
