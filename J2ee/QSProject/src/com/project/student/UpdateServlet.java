package com.project.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String id=request.getParameter("id");
		String username=request.getParameter("un");
		String password=request.getParameter("pw");
		String gender=request.getParameter("gn");
		String address=request.getParameter("ad");
		String course=request.getParameter("cr");
		String fees=request.getParameter("fe");
		String contact=request.getParameter("co");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			
			String query="update student set username=?,password=?,gender=?,address=?,course=?,fees=?,contact=? where sid='"+id+"'";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, gender);
			ps.setString(4, address);
			ps.setString(5, course);
			ps.setString(6, fees);
			ps.setString(7, contact);
			int a=ps.executeUpdate();
			if(a>0)
			{
				pw.println("<script>alert('Updated Succesfully')</script>");
				System.out.println("Updated Succesfully");
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
	}
}
