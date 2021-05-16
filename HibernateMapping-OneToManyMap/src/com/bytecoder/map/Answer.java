package com.bytecoder.map;

public class Answer
{
	private int id;
	private String answername;

	
	public Answer(int id, String answername) {
	
		this.id = id;
		this.answername = answername;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswername() {
		return answername;
	}
	public void setAnswername(String answername) {
		this.answername = answername;
	}

}
