

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/LoginServlet" })
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String username=request.getParameter("un");
		String password=request.getParameter("pw");
		HttpSession ss=request.getSession();
		if(username.equals("ankita") && password.equals("ankita"))
		{
			
			pw.println("Login Succesful!<br> Hi! "+username);
			pw.println("<hr>");
			//ss=request.getSession();
			ss.setAttribute("user", username);
			pw.println("<br><a href='ProfileServlet'>Profile</a> | <a href='SettingServlet'>Setting</a> | <a href='LogoutServlet'>Logout</a> ");
		
		}
		else
		{
			pw.print("Unsuccesful");
			request.getRequestDispatcher("login.html").include(request, response);
			pw.println("Login Failed! Try Again");
		}
		
	
		}

}
