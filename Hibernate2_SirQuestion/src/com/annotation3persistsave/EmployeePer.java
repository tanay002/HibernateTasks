package com.annotation3persistsave;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="empPer")
public class EmployeePer
{
	 @Id 
	 @GeneratedValue()
		/* @GeneratedValue(strategy =GenerationType.AUTO ) */ 
	private int eid;
	private String ename;
	private String eadd;

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEadd() {
		return eadd;
	}
	public void setEadd(String eadd) {
		this.eadd = eadd;
	}

	public EmployeePer()
	{
		
	}
	public EmployeePer(int eid, String ename, String eadd)
	{
		this.eid = eid;
		this.ename = ename; this.eadd = eadd;
	}


}
