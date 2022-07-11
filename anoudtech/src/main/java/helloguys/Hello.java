

package helloguys;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Serveltex1")
public class Hello extends HttpServlet{
  public void doGet(HttpServletRequest request,HttpServletResponse response)
                throws ServletException, IOException{
      response.setContentType("text/html");
      PrintWriter pw = response.getWriter();
      String name = request.getParameter("name");
      pw.println("<HTML>");
      pw.println("<HEAD><TITLE>Hello "+name+"</TITLE></HEAD>");
      pw.println("<BODY>");
      pw.println("<H1>Hello, <BLINK>"+name+"</BLINK></H1>");
      pw.println("</BODY>");
      pw.println("</HTML>");    }  }

