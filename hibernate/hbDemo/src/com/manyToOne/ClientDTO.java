package com.manyToOne;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class ClientDTO {
	@GenericGenerator(name="auto",  strategy = "increment")
	@GeneratedValue(generator="auto")
	@Id
private int id;
private String cname;
@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(referencedColumnName="sid")
private ServerDTO server;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public ServerDTO getServer() {
	return server;
}
public void setServer(ServerDTO server) {
	this.server = server;
}






}
