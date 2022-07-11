<!-- This JavaServer Page purposefully throws a NullPointerException
     that demonstrates using a JSP error page. (ErrorPage.jsp) 
 -->

<%@ page 
    errorPage="ErrPage.jsp"
    import="java.util.Vector"
    import="java.io.*"
%>
