
      <html> 
     <head><title>An Include Test</title></head> 
     <body bgcolor="white"> 
     <font color="blue"> 
     The current date and time are 
     <%@ include file="date.jsp" %> 
     </font> 
     </body> 
     </html> 

     date.jsp: 
     <%@ page import="java.util.*" %>
     <%=(new java.util.Date()).toLocaleString() %> 

        

</body>
</html>