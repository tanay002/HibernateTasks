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

		HashMap<String,String> map=new HashMap<String,String>(); 
		map.put("plateform Independent","1");
		map.put("Robust","2");
		map.put("Secure","3");
		map.put("OOP Language","4");

		Question q=new Question("features of java",map);
		ses.persist(q);
		t.commit();
		ses.close();
		System.out.println("successfully saved");    

	}    
}   