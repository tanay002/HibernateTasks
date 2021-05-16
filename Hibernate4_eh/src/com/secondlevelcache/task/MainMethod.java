package com.secondlevelcache.task;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainMethod 
{
	public static void main(String[] args) 
	{
		Configuration cf=new Configuration().configure("com/secondlevelcache/task/hibernate.cfg.xml");
		SessionFactory sess=cf.buildSessionFactory();
		Session ses=sess.openSession();
		 Transaction tx= ses.beginTransaction();
			
		  Employeee e=(Employeee)ses.get(Employeee.class,1); //read-only me session-factory me jo data rakha hua hai usme updation nhi hoga
                   e.setEname("kalua");  //java.lang.UnsupportedOperationException: Can't write to a readonly object
                   ses.save(e);
                   tx.commit();
	}
}
