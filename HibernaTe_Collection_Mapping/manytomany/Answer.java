package manytomany;

import java.util.List;

public class Answer 
{
	private int aid;
	private String ansName;
	private String submitBy;
	private  List<Question> que;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnsName() {
		return ansName;
	}
	public void setAnsName(String ansName) {
		this.ansName = ansName;
	}
	public String getSubmitBy() {
		return submitBy;
	}
	public void setSubmitBy(String submitBy) {
		this.submitBy = submitBy;
	}
	public List<Question> getQue() {
		return que;
	}
	public void setQue(List<Question> que) {
		this.que = que;
	}

	public String toString()
	{
		return aid+" "+ansName+""+submitBy;	
	}
}
