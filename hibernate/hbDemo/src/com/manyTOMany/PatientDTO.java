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
public class PatientDTO {
	@GenericGenerator(name="auto",  strategy = "increment")
	@GeneratedValue(generator="auto")
	@Id
	private int pid;
	private String pname;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="doc_pat",joinColumns=@JoinColumn(name="pid"),inverseJoinColumns=@JoinColumn(name="did"))
	
	private List<DoctorDTO> plist;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public List<DoctorDTO> getPlist() {
		return plist;
	}
	public void setPlist(List<DoctorDTO> plist) {
		this.plist = plist;
	}
	
}
