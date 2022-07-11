package helloguys;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servelt2")
public class Post extends HttpServlet {


    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
response.setContentType("text/html");

        PrintWriter pw=response.getWriter();

        String name=request.getParameter("name");

        pw.println("<html>");
        pw.println("<head><title>hello"+name+"</title></head>");

        pw.println("<body>");
        pw.println("<h1> hello,<blink>"+name+"</blink></h1>");
        pw.println("</html>");

    }

}