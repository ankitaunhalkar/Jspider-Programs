

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Admin
 */
@WebServlet("/Admin")
public class Admin extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();

	String fname=request.getParameter("fname");
	String lname=request.getParameter("lname");
	String contact=request.getParameter("contact");
	String email=request.getParameter("email");
	String user=request.getParameter("user");
	String pass=request.getParameter("pass");
	String type=request.getParameter("type");
	String date=request.getParameter("createdate");
	 try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/visa", "root", "root");
		Statement st=con.createStatement();
		String insert="insert into admin(fname,lname,contact,email,username,password,usertype,createdate) values('"+fname+"','"+lname+"','"+contact+"','"+email+"','"+user+"','"+pass+"','"+type+"','"+date+"')";
		System.out.println(insert);
		boolean b=st.execute(insert);
		if(b==false)
		{
			out.println("<script>alert('Register Successful');</script>");
		}
	
	 } catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
