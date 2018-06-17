package com.project.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Edit
 */
@WebServlet("/Edit")
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String id=request.getParameter("id");
		System.out.println(id);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from student where sid='"+id+"'");
			System.out.println();
			pw.println("<form action='UpdateServlet'>");
			pw.println("<table border='1'><tr><th>Id</th><th>Username</th><th>Password</th><th>Gender</th><th>Address</th><th>Course</th><th>Fees</th><th>Contact</th></tr>");
			while(rs.next())
			{
				String did=rs.getString(1);
				String dusername=rs.getString(2);
				String dpassword=rs.getString(3);
				String dgender=rs.getString(4);
				String daddress=rs.getString(5);
				String dcourse=rs.getString(6);
				String dfees=rs.getString(7);
				String dcontact=rs.getString(8);
				pw.println("<tr><td><input type='hidden' name='id' value='"+did+"'></td>");
				pw.println("<td><input type='text' name='un' value='"+dusername+"'></td>");
				pw.println("<td><input type='text' name='pw' value='"+dpassword+"'></td>");
				pw.println("<td><input type='text' name='gn' value='"+dgender+"'></td>");
				pw.println("<td><input type='text' name='ad' value='"+daddress+"'></td>");
				pw.println("<td><input type='text' name='cr' value='"+dcourse+"'></td>");
				pw.println("<td><input type='text' name='fe' value='"+dfees+"'></td>");
				pw.println("<td><input type='text' name='co' value='"+dcontact+"'></td>");
				pw.println("<td><input type='submit' value='Update'></td></tr>");

			}
			pw.println("</tr></table></form>");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}