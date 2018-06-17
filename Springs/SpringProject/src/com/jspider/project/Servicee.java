package com.jspider.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Servicee {
	
	@Autowired
	DAO d;
public  void add(DTO dto)
{
	d.save(dto);
	System.out.println("Service method");
}
}
