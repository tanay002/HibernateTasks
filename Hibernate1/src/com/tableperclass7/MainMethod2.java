package com.inheritance.tableperclass7;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainMethod2 
{
	public static void main(String[] args)
	{
		Configuration cf=new Configuration().configure("com/inheritance/tableperclass7/hibernate.cfg.xml");
		SessionFactory sf= cf.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tx= sess.beginTransaction();
		Student s=new Student();
		s.setCname("medicaps");
		s.setSname("Gopal");
		sess.save(s);
		tx.commit();

		sess.close();
		sf.close();
		System.out.println("Done....!");
	}
}
