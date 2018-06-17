package com.ankita;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CServletController extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("Welocome to Clothes\n");
		ServletConfig config=getServletConfig();
		String sc=config.getInitParameter("cl");
		pw.println(sc);
		ServletContext conf=getServletContext();
		String sco=conf.getInitParameter("ec");
		pw.println(sco);
	
	}

	

}
