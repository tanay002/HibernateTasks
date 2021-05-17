package com.annotation2;
//save and persist 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainMethod_Save 
{
	public static void main(String[] args)
	{

		Configuration cf=new AnnotationConfiguration();	
		cf.configure("com/annotation2/hibernate.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session sess=  sf.openSession();
		Employeee e=new Employeee();
	//	e.setEid(14);
		e.setEname("Ra");
		e.setEadd("Skes");
		Transaction tx= sess.beginTransaction();
	    sess.save(e);
		//tx.commit();
		
		Employeee e1=new Employeee();
		e.setEid(15); //agar id unique nhi hogi to exception aayegi primary key ka concept
		e.setEname("dkl");
		e.setEadd("yahoo");
		sess.save(e1);  //data of e1 object will not save in database jabtak hum commit nhi karenge
		//tx.commit();
		sess.close();
		System.out.println("Done....!");

	}
}
