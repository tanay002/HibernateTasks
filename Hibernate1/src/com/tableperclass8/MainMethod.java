package com.annotation.tableperclass8;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainMethod
{
	public static void main(String[] args) 
	{
		Configuration cf=new AnnotationConfiguration().configure("com/annotation/tableperclass8/hibernate.cfg.xml");
		SessionFactory sf=	cf.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tx=sess.beginTransaction();
		College c=new College();
		c.setCname("makhanlal");
		sess.save(c);
		tx.commit();
		sess.close();
		sf.close();
		System.out.println("Done...!");

	}
}
