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
<title>Search Admin</title>
</head>
<body><table>
<form action="SearchAdmin.jsp">
<input type="text" placeholder="Search Admin" name="search" id="search"><input type="submit" value="Search">
</form>
<%
String search = request.getParameter("search");
System.out.print(search);
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/visa", "root", "root");
if(search!=null){
Statement st=con.createStatement();
String searchquery="select * from admin where fname='"+search+"'";
System.out.println(searchquery);
ResultSet rs=st.executeQuery(searchquery);
while(rs.next())
{
%>
<tr><td>First Name:</td><td><%out.println(rs.getString("fname")); %></td></tr>
<tr><td>Last Name:</td><td><%out.println(rs.getString("lname")); %></td></tr>
<tr><td>Contact:</td><td><%out.println(rs.getString("contact")); %></td></tr>
<tr><td>Email:</td><td><%out.println(rs.getString("email")); %></td></tr>
<tr><td>User-name:</td><td><%out.println(rs.getString("username")); %></td></tr>
<tr><td>Password:</td><td><%out.println(rs.getString("password")); %></td></tr>
<tr><td>User-Type:</td><td><%out.println(rs.getString("usertype")); %></td></tr>
<tr><td>Admin-Created-Date:</td><td><%out.println(rs.getString("createdate")); %></td></tr>
<%
}
}%>
</table>
</body>
</html>