package com.bytecoder.map;

import java.util.Map;

import javax.persistence.Entity;
@Entity
public class Question<V>
{
	private int qid;
	private String qname;
	private Map<String,String> answers;

	
	public Question(String qname, Map<String, String> answers) {
		
		this.qid = qid;
		this.qname = qname;
		this.answers = answers;
	}
	public int getQid()
	{
		return qid;
	}
	public void setQid(int qid) 
	{
		this.qid = qid;
	}
	public String getQname() 
	{
		return qname;
	}
	public void setQname(String qname) 
	{
		this.qname = qname;
	}
	public Map<String, String> getAnswers()
	{
		return answers;
	}
	public void setAnswers(Map<String, String> answers) 
	{
		this.answers = answers;
	}

}
