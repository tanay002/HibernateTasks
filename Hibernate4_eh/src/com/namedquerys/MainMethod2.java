package com.namedquerys;

//Hibernate Named Query Language 1
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainMethod2
{
	public static void main(String[] args) 
	{
		Configuration con=new Configuration().configure("com/namedquerys/hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction t=sess.beginTransaction();

	
		
		Query q= sess.getNamedQuery("update");
		q.setParameter("n","nanu");
		q.setParameter("i",5);
		int row=q.executeUpdate();
		t.commit();
			System.out.println(row);
	}
}
