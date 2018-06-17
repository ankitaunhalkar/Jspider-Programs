

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
 * Servlet implementation class GetAppoint
 */
@WebServlet("/GetAppoint")
public class GetAppoint extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String branch=request.getParameter("branch");
		String date=request.getParameter("date");
		String openings=request.getParameter("openings");		
		String booked=request.getParameter("booked");
		int open=Integer.parseInt(openings);
		int book=Integer.parseInt(booked);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/visa", "root", "root");
			Statement st=con.createStatement();
					
			if(book!=0)
			{
				book++;
					open--;
					
					String query="update appointment set Openings="+open+" where Branch='"+branch+"'and Date='"+date+"'";
					String query1="update appointment set Booked="+book+" where Branch='"+branch+"'and Date='"+date+"'";

					System.out.println(query);
					boolean b = st.execute(query);
					boolean b1 = st.execute(query1);
					if((b && b1) == false)
					{
						out.println("<script>alert('Booking Done!');</script>");
						RequestDispatcher rd=request.getRequestDispatcher("GetAppoint.jsp");
						rd.include(request, response);	
					}
					else
					{
						out.println("<script>alert('Sorry Booking Cannot Be Done!');</script>");
						RequestDispatcher rd=request.getRequestDispatcher("GetAppoint.jsp");
						rd.include(request, response);	
					}	
					}
					else
					{
						out.println("<script>alert('Seats are Ful! Booking Cannot Be Done!');</script>");
						RequestDispatcher rd=request.getRequestDispatcher("GetAppoint.jsp");
						rd.include(request, response);	
					}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
