

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
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SearchController
 */
@WebServlet("/SearchController")
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String Name=request.getParameter("search");
	
		try {
		Class.forName("com.mysql.jdbc.Driver");
		String query = "select * from register where name='"+Name+"'";
		System.out.println(query);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		out.print("<form action='update.jsp'>");
		
		while(rs.next())
		{
		out.println("<table><tr>");
		out.println("<td>ID: <input type='text' name='id' id='id1' value='"+rs.getString(1)+"'></td>");
		out.println("<td>NAME:  <input type='text' name='name' id='name1' value='"+rs.getString(2)+"'></td>");
		out.println("<td>AGE:  <input type='text' name='age' id='age1' value='"+rs.getString(3)+"'></td>");
		out.println("<td>STREAM:  <input type='text' name='stream' id='stream1' value='"+rs.getString(4)+"'></td>");
		out.println("<td>GENDER:  <input type='text' name='gender' id='age1' value='"+rs.getString(5)+"'></td>");
		out.println("<td>FEES:  <input type='text' name='fees' id='fees1' value='"+rs.getString(6)+"'></td>");
		out.println("<td>CONTACT:  <input type='text' name='contact' id='contact1' value='"+rs.getString(7)+"'></td>");
		out.print("<br>");
		out.println("</tr></table>");
	
		}
		out.print("<td><input type='submit' value='Update'></td>");
		out.println("</form>");
		
	
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		

}
