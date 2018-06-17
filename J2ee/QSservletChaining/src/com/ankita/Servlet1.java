package com.ankita;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		RequestDispatcher rd=request.getRequestDispatcher("Servlet2");
		//rd.include(request, response);//includes servlet2 along with it
		rd.forward(request, response);//everything forwarded to servlet2
		
		pw.println("Response from servlet1");
		
	}

	
}
