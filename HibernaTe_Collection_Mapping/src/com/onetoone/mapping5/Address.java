package com.onetoone.mapping5;

public class Address 
{
private int addId;
private String city;
private String Street;
private Student std;


public int getAddId() {
	return addId;
}
public void setAddId(int addId) {
	this.addId = addId;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getStreet() {
	return Street;
}
public void setStreet(String street) {
	Street = street;
}
public Student getStd() {
	return std;
}

@Override
public String toString() {
	return addId +""+ city + " " + Street;
}
public void setStd(Student std) {
	this.std = std;
}


}
