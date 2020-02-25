package com.annotation.tableperclass8;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tableperclass_stud")
@AttributeOverrides({  
    @AttributeOverride(name="cid", column=@Column(name="cid")),  
    @AttributeOverride(name="cname", column=@Column(name="cname"))
})
public class Student extends College
{
	private String sname;

	public String getSname()
	{
		return sname;
	}

	public void setSname(String sname)
	{
		this.sname = sname;
	}

}
