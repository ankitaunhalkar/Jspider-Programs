

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
 * Servlet implementation class Renewal
 */
@WebServlet("/Renewal")
public class Renewal extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); 
		PrintWriter out=response.getWriter(); 
		 String name=request.getParameter("name");
	     String date=request.getParameter("dob");
	       String passport=request.getParameter("pass");
	        String visa=request.getParameter("visa");
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/visa", "root", "root");
	            Statement st=con.createStatement();
	            String insert="insert into renewal(Name,Passport,Visa,DOB,Status) values('"+name+"','"+passport+"','"+visa+"','"+date+"','Pending')";
	            st.execute(insert);
	            out.println("<script>alert('Your renewal request has been sent for approval');</script>"); 
	            RequestDispatcher rd=request.getRequestDispatcher("Renewal.jsp");
	            rd.include(request, response);
	                      
	         }catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	       
	}
}
