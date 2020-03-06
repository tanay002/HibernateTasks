package com.firstlevelcache.task;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainMethod 
{
	public static void main(String[] args) 
	{
		Configuration cf=new Configuration().configure("com/firstlevelcache/task/hibernate.cfg.xml");
		SessionFactory sess=cf.buildSessionFactory();
		Session ses=sess.openSession();
		 Transaction tx= ses.beginTransaction();
		 
		
		  Employeee e=(Employeee)ses.get(Employeee.class,1);  //query is unique because both id is unique so firstly it will check in session 
		                      //if data exist in sess then it will return existing once and if not then it will execute query
		 System.out.println(e.getEid()+" "+e.getEname());
		 ses.evict(e);//sess.evict remove the existing object in session
		 Employeee e2=(Employeee)ses.get(Employeee.class,1); 
		 
		 Employeee e1=(Employeee)ses.get(Employeee.class,2);  //so this id is 1 then only one query is execute and at second time it will 
		                                                     //return existing object in sess
		  System.out.println(e1.getEid()+" "+e1.getEname());

	}
}
