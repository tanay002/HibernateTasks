package com.annotation3persistsave;
//save and persist 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainMethod_Persist 
{
	public static void main(String[] args)
	{	Configuration cf=new AnnotationConfiguration();	
		cf.configure("com/annotation3persistsave/hibernate.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
	//	Session sess=sf.getCurrentSession();
		Session sess=sf.openSession();
		Transaction tx= sess.beginTransaction();

		 EmployeePer e=new EmployeePer();
		 e.setEid(1);
		 e.setEadd("pune");
		 e.setEname("Ranchi");
		//sess.save(e);
		tx.commit();   
		sess.persist(e);
		//sess.close();
		System.out.println("Done....!");
	}
}
