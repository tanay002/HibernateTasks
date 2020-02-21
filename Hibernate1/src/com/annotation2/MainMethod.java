package com.annotation2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainMethod 
{
	public static void main(String[] args)
	{

		Configuration cf=new AnnotationConfiguration();	
		cf.configure("com/annotation2/hibernate.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session sess=  sf.openSession();
		Employeee e=new Employeee();
		e.setEid(10);
		e.setEname("Rajat kick");
		e.setEadd("Skyy");
		Transaction tx= sess.beginTransaction();
		sess.save(e);
		tx.commit();
		sess.close();
		System.out.println("Done....!");

	}
}
