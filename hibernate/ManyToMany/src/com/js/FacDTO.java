package com.js;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
public class FacDTO {
	@Id
	@GeneratedValue(generator="auto")
	@GenericGenerator(name="auto",  strategy = "increment")
	
	
	@Column private int fid;
	@Column	private String fname;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="stu_fac",joinColumns=@JoinColumn(name="fid"),inverseJoinColumns=@JoinColumn(name="sid"))
	private List<StudDTO> flist;
	
	
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
	public List<StudDTO> getFlist() {
		return flist;
	}
	public void setFlist(List<StudDTO> flist) {
		this.flist = flist;
	}
	@Override
	public String toString() {
		return "FacDTO [fid=" + fid + ", fname=" + fname + ", flist=" + flist + "]";
	}
	
}
