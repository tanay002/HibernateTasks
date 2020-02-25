package com.bytecoder;

public class Employeee
{
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
public Employeee(int eid, String ename, String eadd) {
	this.eid = eid;
	this.ename = ename;
	this.eadd = eadd;
}



}
