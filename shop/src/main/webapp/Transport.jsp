<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lite blue"><center>
<hr>
<h1>transport</h1></center>
<hr>

<form action="purchase.do" method="post">
<input type="hidden" name="action" value="purchase">
<input type="hidden" name="nextshop" value="Thiruvannamalai">

<input type="radio" name="Komban" value="6000000">Komban<br>
<input type="radio" name="Onenness" value="7000000">Onenness<br>
<input type="radio" name="Jai_guru" value="50000000">Jai_guru<br>


<hr>
<input type="submit" value="submit">
</form>

</body>
</html>