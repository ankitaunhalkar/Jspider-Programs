package com.oneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table
public class FacultyDTO1 {
	
@GenericGenerator(name="auto",  strategy = "increment")
@GeneratedValue(generator="auto")
@Id
private int fid;
private String fname;

@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(referencedColumnName="fid")

private List<StudentDTO> list;
public int getFid() {
	return fid;
}
public void setFid(int fid) {
	this.fid = fid;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}

public List<StudentDTO> getList() {
	return list;
}
public void setList(List<StudentDTO> list) {
	this.list = list;
}





}
