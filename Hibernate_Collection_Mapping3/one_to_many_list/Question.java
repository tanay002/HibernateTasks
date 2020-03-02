package com.collectionm.onetomany.list;

import java.util.List;

public class Question 
{
	private int qId;
	private String qName;
	private List<Answer> ans;

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
	public List<Answer> getAns() {
		return ans;
	}
	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}


}
