package com.annotation.tableperclass8;


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tableperclass_anno_facul")
@AttributeOverrides({  
    @AttributeOverride(name="cid", column=@Column()),  
    @AttributeOverride(name="cname", column=@Column())
})
public class Faculty extends College
{
	private String fname;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}


}
