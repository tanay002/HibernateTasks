package com.collectionm.onetomany.set3;

import java.util.Set;

public class Question 
{
private int qId;
private String qName;
private Set<Answer> ans;

public int getqId() {
	return qId;
}
public void setqId(int qId) {
	this.qId = qId;
}
public String getqName() {
	return qName;
}
public void setqName(String qName) {
	this.qName = qName;
}
public Set<Answer> getAns() {
	return ans;
}
public void setAns(Set<Answer> ans) {
	this.ans = ans;
}

}
