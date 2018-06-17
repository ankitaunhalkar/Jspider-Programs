package com.jspider.project;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Component
@RequestMapping("/")
public class ControllerDemo {
@RequestMapping("/Controller1")
public ModelAndView login()
{
	return new ModelAndView("Login");
}

@RequestMapping("/Controller2")
public String register()
{
	return "Register";
}


/*public String verify(HttpServletRequest request)
{
	String name=request.getParameter("name");
	String pass=request.getParameter("pass");
	if(name.equals("ankita") && pass.equals("ankita"))
	{
	return "Success";
	}
	return "Unsuccess";
}*/

/*public String verify(@RequestParam String name,@RequestParam String pass)
{
	if(name.equals("ankita") && pass.equals("ankita"))
	{
	return "Success";
	}
	return "Unsuccess";
}*/


@Autowired
Servicee s;
@RequestMapping("/Verify")
public ModelAndView verify(@ModelAttribute DTO dto)
{
	System.out.println(dto.getName());
	System.out.println(dto.getPass());
	if(dto.getName().equals("ankita") && dto.getPass().equals("ankita"))
	{
		s.add(dto);
		return new ModelAndView("Success");
		
	}
	return new ModelAndView("Unsuccess");
}


}
