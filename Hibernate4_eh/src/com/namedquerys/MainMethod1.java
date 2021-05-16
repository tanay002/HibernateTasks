package com.namedquerys;

//Hibernate Named Query Language 1
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainMethod1
{
	public static void main(String[] args) 
	{
		Configuration con=new Configuration().configure("com/namedquerys/hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction t=sess.beginTransaction();

	/*	Query q= sess.getNamedQuery("selectdata");
		List<Employee> ls=q.list();

		for(Employee e:ls)
		{
			System.out.println(e.getId()+" "+e.getName()+" "+e.getMobileno()+" "+e.getCity()+" "+e.getCollege());
		}
	*/	
		
		/*
		Query q= sess.getNamedQuery("seledata");
		List<Employee> ls=q.list();

		for(Employee e:ls)
		{
			System.out.println(e.getId()+" "+e.getName()+" "+e.getMobileno()+" "+e.getCity()+" "+e.getCollege());
		}
		*/
		
		Query q= sess.getNamedQuery("selecctdata");
		q.setParameter("i",5);
		List<Employee> ls=q.list();

		for(Employee e:ls)
		{
			System.out.println(e.getId()+" "+e.getName()+" "+e.getMobileno()+" "+e.getCity()+" "+e.getCollege());
		}
		
		
		
		
	}
}
