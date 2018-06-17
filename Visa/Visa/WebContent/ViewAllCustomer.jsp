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
<title>View All Customer</title>
</head>
<body>
<table border="1">
<h3>CUSTOMERS</h3>
<tr><th>Name</th><th>Passport</th><th>Visa</th><th>DOB</th><th>STATUS</th></tr>
<%
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/visa", "root", "root");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from renewal");
while(rs.next())
{
%>
<tr><td><%out.println(rs.getString("Name"));%></td>
<td><%out.println(rs.getString("Passport"));%></td>
<td><%out.println(rs.getString("Visa"));%></td>
<td><%out.println(rs.getString("DOB"));%></td>
<td><%out.println(rs.getString("Status"));%></td></tr>
<%
}
%>
</table>
</body>
</html>