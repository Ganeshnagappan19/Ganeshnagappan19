package helloguys;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputFilter.Config;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Secondservlet
 */
@WebServlet("/Secondservlet")
public class Secondservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	@Override
		public void init(ServletConfig config) throws ServletException {
			// TODO Auto-generated method stub
   ServletContext app=config.getServletContext();
		
		System.out.println("From Second Servlet...:"+app.getAttribute("myglobal"));
		try {
			String path=app.getRealPath("/WEB-INF/config.properties");
			Properties prop=new Properties();
			prop.load(new FileInputStream(path));
			System.out.println(prop.get("welcome"));
			}catch(Exception e) {
				e.printStackTrace();
			}

}
		
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
