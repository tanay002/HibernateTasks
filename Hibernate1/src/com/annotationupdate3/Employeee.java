package com.annotationupdate3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empdata2")
public class Employeee
{
	@Id
	/*	@GeneratedValue(generator = "assigned") */
	@GeneratedValue(strategy =GenerationType.AUTO ) 
	private int eid;
	@Column(name="empd")
	private String ename;
	@Column(name="eaddd")
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

	public Employeee()
	{
		
	}
	public Employeee(int eid, String ename, String eadd)
	{
		this.eid = eid;
		this.ename = ename; this.eadd = eadd;
	}


}
