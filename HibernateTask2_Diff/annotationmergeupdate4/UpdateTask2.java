package com.annotationmergeupdate4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class UpdateTask2
{
	public static void main(String[] args)
	{
		Configuration con=new AnnotationConfiguration();	
		con.configure("com/annotationmergeupdate4/hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session sess= sf.openSession();

		Employeee e=(Employeee)sess.get(Employeee.class,5);  
	
		sess.close();
		                  
		e.setEname("chandrashekhar");

      Session sess2 = sf.openSession();
      Employeee e2=(Employeee)sess2.get(Employeee.class,5);  
      Transaction tx1 = sess2.beginTransaction();
         sess2.update(e);
      tx1.commit();

		System.out.println("Done.............!");
	}
}
