package com.bytecoder.map;


import java.util.HashMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MyHibernate 
{

	public static void main(String[] args) 
	{

		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session ses= sf.openSession();   
		Transaction t=ses.beginTransaction();
  
       HashMap map=new HashMap();	
		map.put("Features of java",new Answer(1,"Plateform Indepentdant"));
		map.put("Features of java",new Answer(2,"Robust"));
		map.put("Features of java",new Answer(3,"Secure"));
		map.put("Features of java",new Answer(4,"OOPS Concept"));

		ses.persist(map);
		t.commit();
		ses.close();
		System.out.println("successfully saved");    

	}    
}   