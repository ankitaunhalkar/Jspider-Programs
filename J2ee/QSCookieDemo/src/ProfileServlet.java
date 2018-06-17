

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		Cookie[] arr=request.getCookies();
		Cookie ck1=arr[0];
		String user=ck1.getValue();
		pw.println("Welcome to Profile Mr/Mrs."+user);
		pw.println("<br><a href='ProfileServlet'>Profile</a> | <a href='SettingServlet'>Setting</a> | <a href='LogoutServlet'>Logout</a> ");
		
	}

}
