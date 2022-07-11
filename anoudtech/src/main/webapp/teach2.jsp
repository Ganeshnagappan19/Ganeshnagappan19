<%@page import="java.util.List,java.util.ArrayList"%>
<%@page import="java.util.Date"%>
<%@ page
language="java"
contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	Date d;
	List list;
	ArrayList al;
%>
	<%="welcome to JSP................................." %>
	<%=application.getRealPath("") %>
	<%
		String uname=request.getParameter("uname");
	%>
	<h1>
		<%out.println(uname);met();%>
	</h1>
	<h2>	<%=uname %><%=value %> 	</h2>
		
	<%!
		String value="hello world...";
		void met(){
			System.out.println("called....");
		}
	%>
</body>
</html>