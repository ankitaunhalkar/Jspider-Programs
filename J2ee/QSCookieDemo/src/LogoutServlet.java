

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
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		Cookie[] arr=request.getCookies();
		Cookie ck1=arr[0];
		

		if(ck1!=null)
		{
			String user=ck1.getValue();
			ck1.setMaxAge(0);
			ck1.setValue("");
			response.addCookie(ck1);
		pw.println("Logout succesful Mr/Mrs."+user);
		pw.println("<br><a href='ProfileServlet'>Profile</a> | <a href='SettingServlet'>Setting</a> | <a href='LogoutServlet'>Logout</a> ");

		}
		else
		{
			pw.print("login first");
		}
		
	}

}
