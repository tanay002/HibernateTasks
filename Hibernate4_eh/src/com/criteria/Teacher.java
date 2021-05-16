package com.criteria;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;
import javax.persistence.Table;

@Entity
@Table(name="criteria_teacher")
public class Teacher 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int tid;
private String tname;
private String tmobileno;
private String tsalary;


@Override
public String toString() {
	return "Teacher [tid=" + tid + ", tname=" + tname + ", tmobileno=" + tmobileno + ", tsalary=" + tsalary + "]";
}
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public String getTmobileno() {
	return tmobileno;
}
public void setTmobileno(String tmobileno) {
	this.tmobileno = tmobileno;
}
public String getTsalary() {
	return tsalary;
}
public void setTsalary(String tsalary) {
	this.tsalary = tsalary;
}


}
