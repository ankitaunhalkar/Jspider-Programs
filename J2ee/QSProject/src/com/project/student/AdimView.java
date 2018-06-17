package com.project.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdimView
 */
@WebServlet("/AdminView")
public class AdimView extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from student");
			pw.println("<table><tr><th>Id</th><th>Username</th><th>Password</th><th>Gender</th><th>Address</th><th>Course</th><th>Fees</th><th>Contact</th></tr>");
			while(rs.next())
			{
				String id=rs.getString(1);
				String username=rs.getString(2);
				String password=rs.getString(3);
				String gender=rs.getString(4);
				String address=rs.getString(5);
				String course=rs.getString(6);
				String fees=rs.getString(7);
				String contact=rs.getString(8);
				pw.println("<tr><td>"+id+"</td><td>"+username+"</td><td>"+password+"</td><td>"+gender+"</td><td>"+address+"</td><td>"+course+"</td><td>"+fees+"</td><td>"+contact+"</td>");
				pw.println("<td><a href='Edit?id="+id+"'>Edit</a></td><td><a href='Delete?id="+id+"'>Delete</td><br>");//sending id to edit via url
			
				
			}
			pw.println("</tr></table>");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
