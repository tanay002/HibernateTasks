package com.fetch;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Employee")

public class Employee 
{

	  @Id  
	     @GeneratedValue(strategy=GenerationType.AUTO)    

	    @Column(name = "eid")
	    private int id;
	 
	    @Column(name = "ename")
	    private String ename;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getEname() {
			return ename;
		}

		public void setEname(String ename) {
			this.ename = ename;
		}

		@Override
		public String toString() {
			return "Employeee [id=" + id + ", ename=" + ename + "]";
		}
		
	
	    
	    
}
