package com;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class DTO {
	@Id 
	@GeneratedValue
	@Column(name="eid")
private int id;
	@Column(name="ename")
private String name;
	@Column(name="esalary")
private double salary;
	@Column(name="edesgination")
private String desgination;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDesgination() {
	return desgination;
}
public void setDesgination(String desgination) {
	this.desgination = desgination;
}
@Override
public String toString() {
	return "DTO [id=" + id + ", name=" + name + ", salary=" + salary + ", desgination=" + desgination + "]";
}

}

