package com.bytecoder.map;

import java.util.Map;

public class Question<V>
{
	private int qid;
	private String qname;
	private Map answers;
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public Map getAnswers() {
		return answers;
	}
	public void setAnswers(Map answers) {
		this.answers = answers;
	}
	
	public Question(int qid, String qname, Map answers) {
		
		this.qid = qid;
		this.qname = qname;
		this.answers = answers;
	}

	
	
}
