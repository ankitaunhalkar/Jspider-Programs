<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Visa PIS</title>
<style>
header, footer {
    padding: 1em;
    color: white;
    background-color: grey;
    clear: left;
    text-align: center;
}
</style>
</head>
<body>
<header>
<img src="airplane-take-off.png" height="150" width="150">
<h1>VISA INFORMATION PROCESSING SYSTEM</h1>
</header>
<form action="Login" method="post"><br><br><br>
<h2 align="center">LOGIN DETAILS</h2>
<table align="center"><tr>
<td>Username:</td>
<td><input type="text" name="user"></td></tr><tr><br>
<td>Password:</td>
<td><input type="password" name="pass"></td></tr><tr><br>
<td>Login Type:</td>
<td><select name="logintype">
<option>Administrator</option>
<option>Agent</option>
<option>Customer</option>
</select></td><tr>
<td><input type="submit" value="Login"></td>
</tr>
</table>
</form><br><br><br><br>
<footer>Copyright &copy; Februray 2018</footer>
</body>
</html>
