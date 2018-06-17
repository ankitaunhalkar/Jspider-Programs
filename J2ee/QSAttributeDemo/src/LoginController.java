

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String username=request.getParameter("un");
		String password=request.getParameter("pw");
		if(username.equals("ankita") && password.equals("ankita"))
		{
			
			pw.println("Succesful");
			pw.println("<br>");
			pw.println("Username:"+username);
			pw.println("<br>");
			ServletContext ct=getServletContext();
			ct.setAttribute("k1", username);
			pw.println("<a href='ProfileController'>Profile</a>");
		}
		else
		{
			pw.println("Unsuccesful");
		}
	}

}
