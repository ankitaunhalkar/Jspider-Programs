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
<title>Search Branch</title>
</head>
<body>
<table>
<form action="SearchBranch.jsp" >
<input type="text" placeholder="Search Branch" name="search" id="search"><input type="submit" value="Search"></form>
<%
String search = request.getParameter("search");
System.out.print(search);
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/visa", "root", "root");
if(search!=null){
Statement st=con.createStatement();
String searchquery="select * from branch where bname='"+search+"'";
System.out.println(searchquery);
ResultSet rs=st.executeQuery(searchquery);
while(rs.next())
{
%>
<tr><td>Branch Name:</td><td><%out.println(rs.getString("bname")); %></td></tr>
<tr><td>Branch Address:</td><td><%out.println(rs.getString("baddress")); %></td></tr>
<tr><td>Branch Location:</td><td><%out.println(rs.getString("blocation")); %></td></tr>
<tr><td>Branch Contact:</td><td><%out.println(rs.getString("bcontact")); %></td></tr>
<tr><td>Branch Email:</td><td><%out.println(rs.getString("bemail")); %></td></tr>
<tr><td>Branch-Created-Date:</td><td><%out.println(rs.getString("date")); %></td></tr>
<%
}
}%>
</table>
</body>
</html>