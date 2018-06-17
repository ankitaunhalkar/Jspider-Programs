

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
		HttpSession ss=request.getSession(false);
		//String user=(String)ss.getAttribute("user");
		try{
		if(ss!=null){
		pw.println("Logout succesful Mr/Mrs."+ss);
		ss.invalidate();
		pw.println("<br><a href='ProfileServlet'>Profile</a> | <a href='SettingServlet'>Setting</a> | <a href='LogoutServlet'>Logout</a> ");

		}
		}catch(Exception e)
		{
			pw.print("Login First");
		}
	}

}
