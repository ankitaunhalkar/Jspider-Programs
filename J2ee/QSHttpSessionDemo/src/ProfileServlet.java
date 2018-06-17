

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		HttpSession ss=request.getSession(false);
		String user=(String)ss.getAttribute("user");
		if(user!=null){
		pw.println("Welcome to Profile Mr/Mrs."+user);
		pw.println("<br><a href='ProfileServlet'>Profile</a> | <a href='SettingServlet'>Setting</a> | <a href='LogoutServlet'>Logout</a> ");

		}else
		{
			pw.print("Login First");
		}
	}

}
