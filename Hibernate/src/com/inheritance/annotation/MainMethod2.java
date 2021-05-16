package com.inheritance.annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainMethod2 
{
	public static void main(String[] args) 
	{
		Configuration cf=new AnnotationConfiguration().configure("com/inheritance/annotation/hibernate.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tx=sess.beginTransaction();
		Faculty f=new Faculty();
		f.setFname("Raka");
		f.setCname("Rgpv");
		f.setCid(20);
		sess.save(f);
		tx.commit();
		sess.close();
		System.out.println("Done....!");

	}
}
