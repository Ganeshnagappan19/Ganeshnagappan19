package mystructs;

	

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

import dtopack.UserDTO;



	public class Dbconnect {
		
		public Dbconnect() {

			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
				
			}

		}
		
		public boolean checkservelts(String cname, int cpass) {
			
			try {
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogin","root","root");
				
				String qury="select * from servelts where uname=? and upass=?";
				
				PreparedStatement ps=con.prepareStatement(qury);
				
				ps.setString(1, cname);
				
				ps.setString(2, cpass);
				
				ResultSet rs=ps.executeQuery();
				
				if(rs.next()) {
					
					return true;
					
				}else {
					
					return false;
					
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
				
				return false;
				
			}
			
		}
	
		public boolean checkFlag(String uname) {
			
			try {
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogin","root","root");
				
				String qury="select flag from servelts where uname=?";
				
				PreparedStatement ps=con.prepareStatement(qury);
				
				ps.setString(1, uname);
				
				ResultSet rs=ps.executeQuery();
				
				if(rs.next()) {
					
					int f=rs.getInt(1);
					
					if(f==0) {
						
						return true;
						
					}else {
						
						return false;
					
					}
					
				}else {
					
					return false;
					
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
				
				return false;
				
			}
			
		}
		
		public boolean updateFlag(String uname, int flag) {
			
			try {
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogin","root","root");
				
				String qury="Update servelts set flag=? where uname=?";
				
				PreparedStatement ps=con.prepareStatement(qury);
				
				ps.setInt(1, flag);
				
				ps.setString(2, uname);
				
				int i=ps.executeUpdate();
				
				if(i!=0) {
					
					return true;
					
				}else {
					
					return false;
					
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
				
				return false;
				
			}
			
		}
	
		public boolean RegisterUser(UserDTO user) {
			
			try {
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogin","root","root");
				
				String qury="insert into servlets  values(?,?,?,?)";
				
				PreparedStatement ps=con.prepareStatement(qury);
				
				ps.setString(1, user.getUname());
				
				ps.setInt(2, user.getUpass());
				ps.setInt(3,user.getFlag());
				ps.setString(4, user.getCity());
				
				int rs=ps.executeUpdate();
				
				if(rs>0) {
					
					return true;
					
				}else {
					
					return false;
					
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
				
				return false;
				
			}
			
		}
	}
//	public static void main(String[] args) {
//			
//			DBConnect db=new DBConnect();
//			
//			UserDIO user=new UserDIO();
//			
//			user.setCname("muthu");
//			
//			user.setCpass("muthu123");
//			
//			System.out.println(db.checkUser("rose", "rose456"));
//			
//			System.out.println(db.checkFlag("rose"));
//			
//			System.out.println(db.updateFlag("rose", 0));
//			
//			System.out.println(db.RegisterUser(user));
//			
//		}
//
//	}
//	