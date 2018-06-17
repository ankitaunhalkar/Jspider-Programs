

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logout
 */
@WebServlet("/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//HttpSession ss=request.getSession(false);
		//String user=(String)ss.getAttribute("user1");
		request.getSession().invalidate();
	/*	try{
		if(user!=null)
		{
		out.println("<script>alert('Logout Successful');</script>");
	
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.include(request, response);
		//ss.removeAttribute("user");
	//	ss.invalidate();
		
		}
		

		}
		catch(Exception e)
		{
			out.print("Login First");
		}*/
		out.println("<script>alert('Logout Successful');</script>");
		
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.include(request, response);
	}

}
