package Helloguys;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("*.do")
public class Ganesh extends HttpServlet {

       
	 @Override
	    public void init() throws ServletException {
	    	System.out.println("init called....");
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
		String name=request.getParameter("uname");
		String password=request.getParameter("upass");
		PrintWriter out=response.getWriter();
		if(name.equals("ramu")) {
			out.println("<h1>Welcome page.........................</h1>");
		}
		else {
			response.sendRedirect("welcome1.html");
		}
		System.out.println("Service method called...");
	}
	@Override
	public void destroy() {
		System.out.println("destroy called.....");
	}









	}


