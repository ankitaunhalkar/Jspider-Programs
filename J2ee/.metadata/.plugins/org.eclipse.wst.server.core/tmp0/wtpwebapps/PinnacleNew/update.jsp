<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.io.IOException"%>
<%@page import="java.sql.SQLException"%>
<%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<%
int count=0;
String id[]=request.getParameterValues("id");
String name[] =request.getParameterValues("name");
String age[] =request.getParameterValues("age");
String stream[] =request.getParameterValues("stream");
String gender[] =request.getParameterValues("gender");
String fees[] =request.getParameterValues("fees");
String contact[] =request.getParameterValues("contact");
Connection con=null;ResultSet rs=null;Statement st=null;
try
{

Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
/*String sql="Update register set id=?,name=?,age=?,gender=?,stream=?,fees=?,contact=? where id="+id;
PreparedStatement ps = con.prepareStatement(sql);
ps.setString(1,id);
ps.setString(2, name);
ps.setString(3,age);
ps.setString(4, stream);
ps.setString(5, gender);
ps.setString(6, fees);
ps.setString(7, contact);
System.out.print(sql);
int i = ps.executeUpdate();*/
//st=con.createStatement();
PreparedStatement ps = con.prepareStatement("Update register set id=?,name=?,age=?,gender=?,stream=?,fees=?,contact=? where id=?");

for(int j=1;j<id.length;j++)
{
	ps.setString(1,id[j]);
	ps.setString(2, name[j]);
	ps.setString(3,age[j]);
	ps.setString(4, stream[j]);
	ps.setString(5, gender[j]);
	ps.setString(6, fees[j]);
	ps.setString(7, contact[j]);
	ps.setString(8,id[j]);
	System.out.println(ps);
	count=ps.executeUpdate();

}
if(count> 0)
{
String query = "select * from register where id=?";
System.out.println(query);
out.print("Record Updated Successfully");
st=con.createStatement();
rs=st.executeQuery(query);
while(rs.next())
{
%>
<tr>
<td>ID:</td>
<td><%out.println(rs.getString(1));%></td>
</tr>
<tr>
<td>Name:</td>
<td><%out.println(rs.getString(2));%></td>
</tr>
<tr>
<td>Age:</td>
<td><%out.println(rs.getString(3));%></td>
</tr>
<tr>
<td>Stream:</td>
<td><%out.println(rs.getString(4));%></td>
</tr>
<tr>
<td>Gender:</td>
<td><%out.println(rs.getString(5));%></td>
</tr>
<tr>
<td>Fees:</td>
<td><%out.println(rs.getString(6));%></td>
</tr>
<tr>
<td>Contact:</td>
<td><%out.println(rs.getString(7));%></td>
</tr>
<%
}
%>
</table>
<%
}
else
{
out.print("There is a problem in updating Record.");
} 
}
catch(ClassNotFoundException | SQLException e)
{
	// TODO Auto-generated catch block
				e.printStackTrace();
}

%>
</body>
</html>