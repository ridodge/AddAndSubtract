<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add two numbers</title>
</head>
<body>
<h1>Add two numbers</h1>
<form action="getAddServlet" method="post">
Enter the two numbers you would like to add together:
<input type="text" name="userAdd1" size="10">
<input type="text" name="userAdd2" size="10">
<input type="submit" value="Add Together" />
<a href="subtract.jsp">Subtract Instead</a>
</form>

</body>
</html>