package com.inheritance.joinedclass9;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainMethod 
{
	public static void main(String[] args)
	{
		Configuration cf=new Configuration().configure("com/inheritance/joinedclass9/hibernate.cfg.xml");
		SessionFactory sf=  cf.buildSessionFactory();
		Session sess= sf.openSession();
		Transaction tx= sess.beginTransaction();
		College c=new College();
		c.setCname("oriental");
		sess.save(c);
		tx.commit();
		sess.close();
		System.out.println("Done....!");
	}
}
