package manytomany;

import java.util.List;

public class Question 
{
	private int qid;    
	private String qname;    
	private List<Answer> ans;
	
	
	public String toString() {
		return qid + " " + qname;
	}
	public List<Answer> getAns() {
		return ans;
	}
	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}
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
}
