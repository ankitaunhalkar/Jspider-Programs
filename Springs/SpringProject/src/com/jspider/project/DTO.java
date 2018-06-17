package com.jspider.project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="login")
public class DTO {
	@Id
	@GenericGenerator(name="auto",  strategy = "increment")
	@GeneratedValue(generator="auto")
	@Column
	private int id;
	@Column
private String name;
	@Column
private String pass;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
}
