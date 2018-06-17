package com.project.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentRegister
 */
@WebServlet("/StudentRegister")
public class StudentRegister extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter pw=response.getWriter();
	
	String username = request.getParameter("user");
	String password = request.getParameter("pass");
	String gender = request.getParameter("gender");
	String address = request.getParameter("address");
	String course = request.getParameter("course");
	String fees = request.getParameter("fees");
	String contact = request.getParameter("contact");
	System.out.println(username);
	if(username.isEmpty())
	{
		RequestDispatcher rd = request.getRequestDispatcher("register.html");
		pw.println("<script>alert('Please fill all the fields')</script>");
		rd.include(request, response);
	}
	else{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			String query="insert into student(username,password,gender,address,course,fees,contact) values(?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, gender);
			ps.setString(4, address);
			ps.setString(5, course);
			ps.setString(6, fees);
			ps.setString(7, contact);
			int i=ps.executeUpdate();
			System.out.println(query);
			if(i>0)
			{
			pw.println("<script>alert('Inserted Succesfully')</script>");
			System.out.println("Inserted Succesfully");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	}
}


