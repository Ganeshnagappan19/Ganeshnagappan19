package services;





import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dtopack.UserDTO;
import mystructs.Dbconnect;

public class Loginaction extends action {
	private UserDTO userDTO ;
 private Dbconnect dbcon;
public Dbconnect getDbcon() {
	return dbcon;
}

public void setDbcon(Dbconnect dbcon) {
	this.dbcon = dbcon;
}

public UserDTO getUseDTO() {
		return userDTO;
	}

	public void setUseDTO(UserDTO useDTO) {
		this.userDTO = useDTO;
	}

}

public DBConnect getCon() {
	return con;
}

public void setCon(DBConnect con) {
	this.con = con;
}

@Override
public String executeService(HttpServletRequest request, HttpServletResponse response) {

	user=new UserDIO();

	con=new DBConnect();

	user.setCname(request.getParameter("cname"));

	user.setCpass(request.getParameter("cpass"));

	boolean a=con.checkUser(user.getCname(), user.getCpass());

	if(a) {

		boolean b=con.checkFlag(user.getCname());

		if(b) {

			con.updateFlag(user.getCname(), 1);

			request.getSession().setAttribute("cname", user.getCname());

			return "Welcome-Page";

		}else {

			return "Already-Login";

		}

	}else {

	return "Invalid-User";

	}

}


}
