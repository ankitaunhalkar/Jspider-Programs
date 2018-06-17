

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
 * Servlet implementation class Approval
 */
@WebServlet("/Approval")
public class Approval extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String passport=request.getParameter("passport");
		String visa=request.getParameter("visa");
		String DOB=request.getParameter("dob");
		String status=request.getParameter("status");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/visa", "root", "root");
			Statement st=con.createStatement();
			String query="delete from renewal where Passport='"+passport+"'";
			boolean b=st.execute(query);
			if(b==false)
			{
				out.println("<font color='green'>Passport Number:"+passport+" is approved</font>");
				RequestDispatcher rd=request.getRequestDispatcher("Approval.jsp");
						rd.include(request, response);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
