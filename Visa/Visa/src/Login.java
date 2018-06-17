

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
		String type=request.getParameter("logintype");
		HttpSession ss=request.getSession();
		
		if(type.equals("Administrator"))
		{
			if(user.equals("ankita") && pass.equals("ankita"))
			{
				 out.println("<script type=\"text/javascript\">");
                 out.println("alert('Login sucessfully');");
                  out.println("location='AdminHome.jsp';");
                  out.println("</script>"); 
            //      ss.setAttribute("user1", user);
			}
		}else if(type.equals("Agent"))
		{
			if(user.equals("ankita") && pass.equals("ankita"))
			{
				 out.println("<script type=\"text/javascript\">");
                 out.println("alert('Login sucessfully');");
                  out.println("location='AgentHome.jsp';");
                  out.println("</script>");
			}
		}else if(type.equals("Customer"))
		{
			if(user.equals("ankita") && pass.equals("ankita"))
			{
				 out.println("<script type=\"text/javascript\">");
                 out.println("alert('Login sucessfully');");
                  out.println("location='CustomerHome.jsp';");
                  out.println("</script>");
			}
		}
	}

}
