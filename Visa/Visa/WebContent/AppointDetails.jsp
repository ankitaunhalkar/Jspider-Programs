<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Appointment Details</title>
</head>
<body>
<form action="AppointDetails" method="post">
<h2>ADD NEW APPOINTMENT</h2>
<table>
<tr><td>Branch:</td><td><input type="text" name="branch"></td></tr>
<tr><td>Date:</td><td><input type="date" name="date"></td></tr>
<tr><td>Opening:</td><td><input type="number" name="open"></td></tr>
<tr><td><input type="submit" value="Submit">
</table>
</form>
<h2>APPOINTMENT DETAILS</h2>
<table border="1">
<tr><th>Branch</th><th>Date</th><th>Opening</th><th>Booked</th></tr>
<% 
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/visa", "root", "root");
Statement st=con.createStatement();
String searchquery="select * from appointment";
System.out.println(searchquery);
ResultSet rs=st.executeQuery(searchquery);
while(rs.next())
{
%>
<tr><td><%out.println(rs.getString("Branch"));%></td>
<td><%out.println(rs.getString("Date"));%></td>
<td><%out.println(rs.getString("Openings"));%></td>
<td><%out.println(rs.getString("Booked"));%></td></tr>
<%
}
%>
</table>
</body>
</html>