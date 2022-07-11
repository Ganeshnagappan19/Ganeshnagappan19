package helloguys;

import java.io.IOException;
import java.io.ObjectInputFilter.Config;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.file.ConfigFileLoader;



 
//@WebServlet("/welcome")
//@WebInitParam(name="driver" ,value ="mydriver....." )
@WebServlet(
	urlPatterns = "*.do",
	initParams = {
				@WebInitParam(name="driver",value="my sql driver...."),			@WebInitParam(name="url",value="my sql driver urlllllll....")
			}
)

public class Ganesh extends HttpServlet {

       
	 @Override
	 
	    	System.out.println("init called....");
        String mydrivervalue = config.getInitParameter("driver"); 
System.out.println(mydrivervalue);
}
	/**
	 * 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String name=request.getParameter("uname");
		String password=request.getParameter("upass");
		PrintWriter out=response.getWriter();
		if(name.equals("ramu")) {
			out.println("<h1>Welcome page.........................</h1>");
		}
		else {
			//response.sendRedirect("welcome1.html");
			RequestDispatcher rd=request.getRequestDispatcher("welcome1.html");
			rd.forward(request, response);

		}
		System.out.println("Service method called...");
	}
	@Override
	public void destroy() {
		System.out.println("destroy called.....");
	}









	}


