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
 * Servlet implementation class AdminLogin
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
		if(user.isEmpty()||pass.isEmpty())
		{
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			pw.println("<script>alert('Please fill all the fields')</script>");
			rd.include(request, response);
		}
		else{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from admin");
			while(rs.next())
			{
				String dbuser=rs.getString("username");
				String dbpass=rs.getString("password");
				if(dbuser.equals(user) && dbpass.equals(pass))
				{
					pw.print("Succesfull Login");
				}
				else{
					pw.println("Wrong username/password");
				}
			}
			pw.println("<a href='AdminView'>View</a>");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

	private void alert(String string) {
		// TODO Auto-generated method stub
		
	}

}
