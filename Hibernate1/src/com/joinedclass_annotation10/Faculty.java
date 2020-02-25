package com.inheritance.joinedclass10;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="joined_anno_facul")
@PrimaryKeyJoinColumn(name="cid")
public class Faculty extends College
{
private String fname;

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

}
