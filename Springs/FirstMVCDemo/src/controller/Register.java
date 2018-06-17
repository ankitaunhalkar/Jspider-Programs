package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.RegisterDAO;
import Service.Add;
import model.RegisterDTO;


@WebServlet("/Register")
public class Register extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String loc=request.getParameter("loc");
		String age=request.getParameter("age");
		int age1=Integer.parseInt(age);
	
		//Setting Value
		RegisterDTO rd=new RegisterDTO();
		rd.setAge(age1);
		rd.setFname(fname);
		rd.setLname(lname);
		rd.setLocation(loc);
		
		//Calling Service Add Method
		Add d=new Add();
		rd.setFname(d.addname(fname));
		String st=rd.getFname();
		out.println(st);
		
		//Calling DAO save Method
			RegisterDAO dao=new RegisterDAO();
			dao.save(rd);
		
		//Printing by overriding tostring method
			out.println(rd);
			
		
		
		
	}

}
