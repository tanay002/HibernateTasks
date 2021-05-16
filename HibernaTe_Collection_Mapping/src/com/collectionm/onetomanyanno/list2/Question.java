package com.collectionm.onetomanyanno.list2;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name="otm_Questionanno")
public class Question 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int qId;
private String qName;
@OneToMany(cascade =CascadeType.ALL)
@JoinColumn(name="quesId")
@IndexColumn(name="indexx")
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
