
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
<title>Get Appointment</title>
</head>
<body>
<h2>GET APPOINTMENT</h2>
<form action="GetAppoint.jsp" method="post">
<table>
<tr><td>Branch:</td>
<td><select name="branch">
<option>Mumbai</option>
<option>Navi-Mumbai</option>
<option>Thane</option>
</select></td></tr>
<tr><td>Date:</td><td><input type="date" name="date"></td></tr>
<tr><td><input type="submit" value="Submit"></td></tr></table></form>
<form action="GetAppoint" method="post">

<%
String branch=request.getParameter("branch");
String date=request.getParameter("date");
try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/visa", "root", "root");
	Statement st=con.createStatement();
	String query="select * from appointment where Branch='"+branch+"'and Date='"+date+"'";
	ResultSet rs=st.executeQuery(query);
	while(rs.next())
	{
	%>
	<table>
	<tr><th>Branch</th><th>Date</th><th>Openings</th><th>Booked</th></tr><tr>
		<td><input type="text" name="branch" readonly value="<%out.println(rs.getString("Branch"));%>"></td>
		<td><input type="text" name="date" readonly value="<%out.println(rs.getString("Date"));%>"></td>
		<td><input type="text" name="openings" readonly value="<%out.println(rs.getString("Openings"));%>"></td>
		<td><input type="text" name="booked" readonly value="<%out.println(rs.getString("Booked"));%>"></td>	
		<td><input type="submit" name="submit" value="Book"></td>
	<%
	}
	
} catch(Exception e){
	e.printStackTrace();
}
%>
</tr></table>
</form>
</body>
</html>