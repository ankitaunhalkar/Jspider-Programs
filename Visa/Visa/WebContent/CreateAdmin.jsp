<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Admin</title>
</head>
<%request.getSession(false) ;



%>  >>
<body>
<h1>Create Admin</h1>
<form action="Admin" method="post">
<table>
<tr><td>First Name:</td><td><input type="text" name="fname"></td></tr>
<tr><td>Last Name:</td><td><input type="text" name="lname"></td></tr>
<tr><td>Contact:</td><td><input type="text" name="contact"></td></tr>
<tr><td>Email:</td><td><input type="text" name="email"></td></tr>
<tr><td>User-Name:</td><td><input type="text" name="user"></td></tr>
<tr><td>Password:</td><td><input type="text" name="pass"></td></tr>
<tr><td>User-Type:</td><td><input type="text" name="type" value="Admin"></td></tr>
<tr><td>Admin-Created-Date:</td><td><input type="date" name="createdate"></td></tr>
<tr><td><input type="submit" name="create" value="Create"></td></tr>
</table>
</form>
</body>
</html>