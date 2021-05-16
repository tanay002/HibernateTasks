package com.inheritance.annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainMethod 
{
	public static void main(String[] args) 
	{
		Configuration cf=new AnnotationConfiguration().configure("com/inheritance/annotation/hibernate.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tx=sess.beginTransaction();
		Student s=new Student();
		s.setSname("Raka");
		s.setCname("Rgpv");
		s.setCid(20);
		sess.save(s);
		tx.commit();
		/*
		 * s.setCid(2); sess.save(s); tx.commit();
		 */
		sess.close();
		System.out.println("Done....!");

	}
}
