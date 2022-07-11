package helloguys;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.core.ApplicationContext;
import org.apache.catalina.core.ApplicationFilterConfig;

/**
 * Servlet implementation class Appliobj
 */
@WebServlet("/Appliobj")
public class Appliobj extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	@Override
    public void init(ServletConfig config) throws ServletException {
	
			System.out.println("init called.....");
			String mydrivervalue=config.getInitParameter("driver");
			System.out.println(mydrivervalue);
			System.out.println(config.getInitParameter("url"));
			ServletContext application=config.getServletContext();
			application.setAttribute("myglobal","sun.....");
	}






    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
