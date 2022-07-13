<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lite red"><center>
<hr>
<h1>Gkbook Shop</h1></center>
<hr>
<form action="purchase.do" method="post">
<input type="hidden" name="action" value="purchase">
<input type="hidden" name="nextshop" value="Transport">
<b>
<input type="radio" name="Sportsbook" value="450">Sportsbook<br>
<input type="radio" name="current_affairs" value="400">current_affairs<br>
<input type="radio" name="Story_books" value="500">Story_books<br>
</b>
<hr>
<input type="submit" value="Nextshop">
</form>

</body>
</html>