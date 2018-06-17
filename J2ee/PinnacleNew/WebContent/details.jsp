<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Your Details</title>
</head>
<body>
<body>  
<% String name =  request.getParameter("name");
	String age = request.getParameter("age");
	String stream = request.getParameter("stream");
	String gender = request.getParameter("gender");
	String fees = request.getParameter("fees");
	String contact = request.getParameter("contact"); 
	%>
	
<font color="green">You Have Successfully Registered with the Following Details</font>
<table border="1">

<tr>
	<td>Name:</td>
	<td><%= name %></td>
</tr>
<tr>
	<td>Age:</td>
	<td><%= age %></td>
</tr>
<tr>
	<td>Stream:</td>
	<td><%= stream %></td>
</tr>
<tr>
	<td>Gender:</td>
	<td><%= gender %></td>
</tr>
<tr>
	<td>Fees:</td>
	<td><%= fees %></td>
</tr>
<tr>
	<td>Contact No:</td>
	<td><%= contact %></td>
</tr>
</table>
</body>
</html>