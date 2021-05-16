package com.fetch;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="Company")
public class Company
{
	@Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  	

	@Column(name = "cid")
    private int id;
 
    @Column(name="cname")
    private String name;

	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER) 
    @JoinColumn(name = "company_id")
   //@Fetch(FetchMode.JOIN)
	//@Fetch(FetchMode.SUBSELECT)
	//@Fetch(FetchMode.SELECT)
	//@BatchSize(size=5)
	private List<Employee> emp;  

    
	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", emp=" + emp + "]";
	}

	
    
    
    
 }
