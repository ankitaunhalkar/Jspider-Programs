package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class RegisterDTO {
	@Id
	@GenericGenerator(name="auto",  strategy = "increment")
	@GeneratedValue(generator="auto")
	@Column
private int id;
	@Column
private String fname;
	@Column
private String lname;
	@Column
private String location;
	@Column
private int age;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "RegisterDTO [id=" + id + ", fname=" + fname + ", lname=" + lname + ", location=" + location + ", age=" + age
			+ "]";
}

}
