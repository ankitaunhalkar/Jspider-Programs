

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AppointDetails
 */
@WebServlet("/AppointDetails")
public class AppointDetails extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String branch=request.getParameter("branch");
	String date=request.getParameter("date");
	String open=request.getParameter("open");

	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/visa", "root", "root");
		Statement st=con.createStatement();
		String insert="insert into appointment(Branch,Date,Openings,Booked) values('"+branch+"','"+date+"',"+open+",0)";
		System.out.println(insert);
		boolean b=st.execute(insert);
		if(b==false)
		{
			out.println("<script>alert('Register Successful');</script>");
		}
		RequestDispatcher rd=request.getRequestDispatcher("AppointDetails.jsp");
		rd.include(request, response);
	
	 } catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
