package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ahmad")
public class Ahmad {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Ahid")
	private int ahid;
	
	@Column(name="FName")
	private String fname;
	
	@Column(name="DOB")
	private String dob;
	
	@Column(name="GPA")
	private String gpa;

	public int getAhid() {
		return ahid;
	}

	public void setAhid(int ahid) {
		this.ahid = ahid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGpa() {
		return gpa;
	}

	public void setGpa(String gpa) {
		this.gpa = gpa;
	}
	
	

}
