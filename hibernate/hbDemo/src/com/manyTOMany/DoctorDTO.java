package com.manyTOMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class DoctorDTO {

	@GenericGenerator(name="auto",  strategy = "increment")
	@GeneratedValue(generator="auto")
	@Id
	private int did;
	private String dname;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="doc_pat",joinColumns=@JoinColumn(name="did"),inverseJoinColumns=@JoinColumn(name="pid"))
	
	private List<PatientDTO> dlist;

	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public List<PatientDTO> getDlist() {
		return dlist;
	}
	public void setDlist(List<PatientDTO> dlist) {
		this.dlist = dlist;
	}
	
	
	
}
