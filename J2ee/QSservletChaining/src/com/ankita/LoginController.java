package com.ankita;

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
			
			//pw.println("Succesful");
			request.getRequestDispatcher("home.html").forward(request, response);
		}
		else
		{
	
			request.getRequestDispatcher("index.html").include(request, response);
			pw.println("<font color='red'>Login Failed! Please Try Again!</font>");
		}
	}

}
