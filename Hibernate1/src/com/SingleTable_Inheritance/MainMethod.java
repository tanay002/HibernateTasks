package com.hibernate.Inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainMethod 
{
	public static void main(String[] args) 
	{
		Configuration cf=new Configuration().configure("com/hibernate/Inheritance/hibernate.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tx=sess.beginTransaction();
		College c=new College();
		//c.setCid(20);
		c.setCname("Tanay");
		Student s=new Student();
		s.setSname("Raka");
		
		sess.save(c);
		//tx.commit();
		sess.save(s);
		tx.commit();
		sess.close();
		System.out.println("Done....!");

	}
}
