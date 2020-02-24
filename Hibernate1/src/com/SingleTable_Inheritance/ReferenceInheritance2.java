package com.hibernate.Inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ReferenceInheritance2 
{
	public static void main(String[] args) 
	{
		Configuration cf=new Configuration().configure("com/hibernate/Inheritance/hibernate.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tx=sess.beginTransaction();

	
		 	Student s=new Student();       // Working code                                 
		s.setCname("Ips");
		s.setSname("Dhruv");
		sess.save(s);       

		
		
		
		
		/*	
		s.setCid(20);  
		s.setCname("iet");
		College c=new College();
		c.setCid(20);
		c.setCname("cec");
		sess.save(s); 
		tx.commit();
		sess.save(c);
		tx.commit(); 

		    Exception in thread "main" org.hibernate.TransactionException: Transaction not successfully started
	at org.hibernate.transaction.JDBCTransaction.commit(JDBCTransaction.java:131)
	at com.hibernate.Inheritance.ReferenceInheritance2.main(ReferenceInheritance2.java:38)
		 */
		
		/*
		College c=new College();
		c.setCid(21);
		sess.save(c);
		tx.commit();
		c.setCid(21);
		sess.save(c);
		tx.commit();	
		
			Exception in thread "main" org.hibernate.TransactionException: Transaction not successfully started
	at org.hibernate.transaction.JDBCTransaction.commit(JDBCTransaction.java:131)
	at com.hibernate.Inheritance.ReferenceInheritance2.main(ReferenceInheritance2.java:38)

		*/
		sess.close();             
		System.out.println("Done....!");

	}
}
 