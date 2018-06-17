package com.oneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table

public class DepartmentDTO {
	//@GeneratedValue
	// generic generator used for creating id incrementing from index 1 
	@GenericGenerator(name="auto", strategy="increment")
	@GeneratedValue(generator="auto")
	@Id
	private int id;
	private String dept;
	@OneToOne(cascade=CascadeType.ALL)
	private EmployeeDTO emp;
	
	public EmployeeDTO getEmp() {
		return emp;
	}
	public void setEmp(EmployeeDTO emp) {
		this.emp = emp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
