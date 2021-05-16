package com.inheritance.joinedclass10;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="joined_anno_stud")
@PrimaryKeyJoinColumn(name="cid")  
public class Student extends College
{
	private String sname;
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
}
