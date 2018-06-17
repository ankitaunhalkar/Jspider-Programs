package com.ankita.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring-config.xml");
		ControllerDemo c=context.getBean(ControllerDemo.class);
		c.controller();
	}

}
