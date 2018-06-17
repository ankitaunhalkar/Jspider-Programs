

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
 * Servlet implementation class Branch
 */
@WebServlet("/Branch")
public class Branch extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String bname=request.getParameter("bname");
		String baddress=request.getParameter("baddress");
		String blocation=request.getParameter("blocation");
		String bcontact=request.getParameter("bcontact");
		String bemail=request.getParameter("bemail");	
		String date=request.getParameter("date");	
		
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/visa", "root", "root");
			Statement st=con.createStatement();
			String insert="insert into branch(bname,baddress,blocation,bcontact,bemail,date) values('"+bname+"','"+baddress+"','"+blocation+"','"+bcontact+"','"+bemail+"','"+date+"')";
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
