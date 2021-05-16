package com.annotationdelete4;

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
		cf.configure("com/annotationdelete4/comp.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session sess=  sf.openSession();
		Employeee e=new Employeee();
		e.setEid(2);
		Transaction tx= sess.beginTransaction();
		sess.delete(e);
		tx.commit();
		sess.close();
		System.out.println("Done....!");
	}
}
