<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">

function enable()
{
	for(var i=0;i<=1000;i++)
		{
	if(document.form.cb[i].checked)
		{
	
			document.form.name[i].disabled=false;
			document.form.age[i].disabled=false;
			document.form.stream[i].disabled=false;
			document.form.gender[i].disabled=false;
			document.form.fees[i].disabled=false;
			document.form.contact[i].disabled=false;
		}
	if(!document.form.cb[i].checked)
		{
	
			document.form.name[i].disabled=true;
			document.form.age[i].disabled=true;
			document.form.stream[i].disabled=true;
			document.form.gender[i].disabled=true;
			document.form.fees[i].disabled=true;
			document.form.contact[i].disabled=true;
		}
		}
	
}

</script>
</head>
<body>
<%

ResultSet rs=(ResultSet)session.getAttribute("result");
%>

<h2>STUDENT DETAILS</h2>
<form action="delete.jsp" name="form">
<table border='1'><tr><th></th><th>Name</th><th>Age</th><th>Stream</th><th>Gender</th><th>Fees</th><th>Contact</th></tr>

<%

while(rs.next())
{
	String id=rs.getString(1);
	String name=rs.getString(2);
	String age=rs.getString(3);
	String stream=rs.getString(4);
	String gender=rs.getString(5);
	String fees=rs.getString(6);
	String contact=rs.getString(7);
	
%>
	
	<tr><td><input type='checkbox' name="cb" value="<%=id %>"onclick="enable()"></td>
	<td><input type="text" name="name" value="<%= name %>" disabled></td>
	<td><input type="text" name="age" value="<%=age%>" disabled></td>
	<td><input type="text" name="stream" value="<%= stream%>" disabled></td>
	<td><input type="text" name="gender" value="<%= gender%>" disabled></td>
	<td><input type="text" name="fees" value="<%= fees%>" disabled></td>
	<td><input type="text" name="contact" value="<%= contact%>" disabled></td>
	
<!-- 	pw.println("<td>"+name+"</td><td>"+age+"</td><td>"+stream+"</td><td>"+gender+"</td><td>"+fees+"</td><td>"+contact+"</td></tr>");	 -->
<%	
}
%>
</tr>
<tr>	
<td><input type="submit" value="Delete"></td>
	</tr>
</table>
</form>
</body>
</html>