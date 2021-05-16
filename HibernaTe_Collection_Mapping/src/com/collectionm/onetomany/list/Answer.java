package com.collectionm.onetomany.list;

public class Answer 
{
 @Override
	public String toString() {
		return "Answer [ansId=" + ansId + ", ansName=" + ansName + "]";
	}
private int ansId;
 private String ansName;
 
public int getAnsId() {
	return ansId;
}
public void setAnsId(int ansId) {
	this.ansId = ansId;
}
public String getAnsName() {
	return ansName;
}
public void setAnsName(String ansName) {
	this.ansName = ansName;
}
 
 
}
