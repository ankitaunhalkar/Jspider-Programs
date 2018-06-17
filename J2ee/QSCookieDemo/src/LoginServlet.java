

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String username=request.getParameter("un");
		String password=request.getParameter("pw");
	
		if(username.equals("ankita") && password.equals("ankita"))
		{
			
			pw.println("Login Succesful!<br> Hi! "+username);
			pw.println("<hr>");
			Cookie cs=new Cookie("c1", username);
			response.addCookie(cs);
			pw.println("<br><a href='ProfileServlet'>Profile</a> | <a href='SettingServlet'>Setting</a> | <a href='LogoutServlet'>Logout</a> ");
		
		}
		else
		{
			request.getRequestDispatcher("index.html").include(request, response);
			pw.println("Login Failed! Try Again");
		}
		
	}

}
