<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
<br>
<h1>Registration Form</h1><br>
<form action="RegisterControler" method="post">
<table>
<tr>
<td> Name: </td>
<td> <input type="text" name="name"> </td>
</tr>
<tr>
<td> Age: </td>
<td> <input type="text" name="age"></td>
</tr>
<tr>
<td>Stream:</td>
<td> <select name="stream">
<option>Science</option>
<option>Commerce</option>
<option>Arts</option>
</select>
</td>
<tr>
<td>Gender:</td>
<td><input type="radio" name="gender" value="male">Male</td>
<td><input type="radio" name="gender" value="female">Female</td>
</tr>
<tr>
<td>Fees:</td>
<td><input type="text" name="fees"></td>
</tr>
<tr>
<td>Contact No:</td>
<td><input type="text" name="contact" maxlength="10"></td>
</tr>
<tr>
<td><input type="submit" value="Register" name="register"></td>

</form>
<td>
<form action="ViewController" method="post">
 <input type="submit" value="ViewAll">
</form></td></tr>
</table>
<pre>
<form action="SearchController" method="post">
Name:<input type="text" name="search"> <input type="submit" value="Search">
</form>
</pre>
</body>
</html>