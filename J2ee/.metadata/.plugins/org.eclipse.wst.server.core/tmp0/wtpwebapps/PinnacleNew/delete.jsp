<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String[] check=request.getParameterValues("cb");

try{
Connection con= null;
Class.forName("com.mysql.jdbc.Driver").newInstance();
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root", "root");

Statement st=con.createStatement();
for(int a=0;a<check.length;a++){
int c=st.executeUpdate("delete from register where id='"+check[a]+"'");
if(c>0)
{
	out.print("Id:"+check[a]);
	out.print("Deleted Successful");
	out.print("<br>");
}
else
{
	out.print("Cannot Delete");
	out.print("<br>");
}

}
}catch(SQLException e){ 
    System.out.println(e.getMessage()); 
    }
    %>
</body>
</html>