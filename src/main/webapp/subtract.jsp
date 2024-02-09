<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Subtract two numbers</title>
</head>
<body>
<h1>Subtract two numbers</h1>
<form action="getSubtractServlet" method="post">
Enter the two numbers you would like to subtract from each other:
<input type="text" name="userSubtract1" size="10">
<input type="text" name="userSubtract2" size="10">
<input type="submit" value="Subtract 1st from Second" />
<a href="index.jsp">Add Instead</a>
</form>

</body>
</html>