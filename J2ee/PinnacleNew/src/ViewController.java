

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ViewController")
public class ViewController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from register");
			
			HttpSession session=request.getSession();
			session.setAttribute("result", rs);
			response.sendRedirect("Display.jsp");
			
//			pw.println("<h2>STUDENT DETAILS</h2>");
//			pw.println("<table border='1'><tr><th></th><th>Name</th><th>Age</th><th>Stream</th><th>Gender</th><th>Fees</th><th>Contact</th></tr>");
//			while(rs.next())
//			{
//				String name=rs.getString(1);
//				String age=rs.getString(2);
//				String stream=rs.getString(3);
//				String gender=rs.getString(4);
//				String fees=rs.getString(5);
//				String contact=rs.getString(6);
//				pw.println("<tr><td><input type='checkbox'></td>");
//				pw.println("<td><input type='text' value='"+name+"' disable='true'></td>");
//				pw.println("<td><input type='text' value='"+age+"' disable='true'></td>");
//				pw.println("<td><input type='text' value='"+stream+"' disable='true'></td>");
//				pw.println("<td><input type='text' value='"+gender+"' disable='true'></td>");
//				pw.println("<td><input type='text' value='"+fees+"' disable='true'></td>");
//				pw.println("<td><input type='text' value='"+contact+"' disable='true'></td></tr>");
//				pw.println("</br>");
//				
//				//pw.println("<td>"+name+"</td><td>"+age+"</td><td>"+stream+"</td><td>"+gender+"</td><td>"+fees+"</td><td>"+contact+"</td></tr>");	
//				
//			}
//			pw.println("</table>");
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	
	}

}
