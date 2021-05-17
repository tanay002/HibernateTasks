package com.annotation2;
//save and persist 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainMethod_Persist 
{
	public static void main(String[] args)
	{

		Configuration cf=new AnnotationConfiguration();	
		cf.configure("com/annotation2/hibernate.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session sess=  sf.openSession();
		Employeee e=new Employeee();
		e.setEid(11);
		e.setEname("Rbba");
		e.setEadd("Siiii");
		Transaction tx= sess.beginTransaction();
	
		sess.persist(e); //persistence exception  //org.hibernate.PersistentObjectException: detached entity passed to persist: com.annotation2.Employeee
		tx.commit();                         
			
		
		/*
		 * Employeee e1=new Employeee(); e.setEid(20); e.setEname("dkl");
		 * e.setEadd("yahoo"); sess.save(e1); //data of e1 object will not save in
		 * database jabtak hum commit nhi karenge
		 */
		sess.close();
		System.out.println("Done....!");

	}
}
