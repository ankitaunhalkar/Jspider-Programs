package com.ankita.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ControllerDemo {
	@Autowired
	ServiceDemo s;
	void controller(){
	s.service();
	System.out.println("Inside Controller method");
}
}
