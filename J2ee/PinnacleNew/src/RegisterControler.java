

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterControler")
public class RegisterControler extends HttpServlet {

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String stream=request.getParameter("stream");
		String gender=request.getParameter("gender");
		String fees=request.getParameter("fees");
		String contact=request.getParameter("contact");
		System.out.println(name);
		System.out.println(age);
		System.out.println(stream);
		System.out.println(gender);
		System.out.println(fees);
		System.out.println(contact);
		
		
		if(name.isEmpty()||age.isEmpty()||stream.isEmpty()||gender.isEmpty()||fees.isEmpty()||contact.isEmpty())
		{
			RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
			pw.println("Please fill all the fields");
			rd.include(request, response);
		}
		else
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
				PreparedStatement pst=con.prepareStatement("insert into register values(?,?,?,?,?,?)");
				pst.setString(1,name);
				pst.setString(2, age);
				pst.setString(3, stream);
				pst.setString(4, gender);
				
				pst.setString(5, fees);
				pst.setString(6, contact);
				pst.execute();
				System.out.println("Inserted Sucessfully");
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher rd = request.getRequestDispatcher("details.jsp");
			rd.forward(request, response);
		}
		
	}

}
