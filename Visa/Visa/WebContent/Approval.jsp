
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
<title>Approval</title>
</head>
<body>
  <h2>VISA APPROVAL</h2>
        <form action="Approval" method="post">
            <table border="1">
                  <tr>
                    <th>Name</th>
                     <th>Passport Number</th>
                      <th>Visa Number</th>
                       <th>Date of Birth</th>
                        <th>Status</th>
                </tr>
                <%

   try
   {
       
       
       Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/visa", "root", "root");
       String query="select * from renewal";
       Statement st=con.createStatement();
       ResultSet rs=st.executeQuery(query);
      
       while(rs.next())
       {
          
   %>           
                <tr>
                    <td><input type="text" name="name" readonly value="<%out.println(rs.getString("Name"));%>"></td>
                    <td><input type="text" name="passport" readonly value="<%out.println(rs.getString("Passport"));%>"></td>
                    <td><input type="text" name="visa" readonly value="<%out.println(rs.getString("Visa"));%>"></td>
                    <td><input type="text" name="dob" readonly value="<%out.println(rs.getString("DOB"));%>"></td>
                    <td><input type="submit" name="status" value="<%out.println(rs.getString("Status"));%>"></td>
                </tr>
                 <%
       }
   %>
            </table>
            <%
       
   }
   catch(Exception e)
   {
        e.printStackTrace();
   }
   %>
</body>
</html>