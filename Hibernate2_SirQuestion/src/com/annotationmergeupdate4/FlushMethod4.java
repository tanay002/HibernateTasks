package com.annotationmergeupdate4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class FlushMethod4
{
	public static void main(String[] args)
	{
		Configuration con=new AnnotationConfiguration();	
		con.configure("com/annotationmergeupdate4/hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session sess= sf.openSession();
		Transaction tx=  sess.beginTransaction();

		Employeee e=(Employeee)sess.get(Employeee.class,3);      
		e.setEid(e.getEid());
		e.setEname("bajaj");
		e.setEadd("palasikar");  
		sess.save(e);
             sess.flush();
            //tx.commit();
         
		sess.close();
		System.out.println("Done.............!");
	}
}
