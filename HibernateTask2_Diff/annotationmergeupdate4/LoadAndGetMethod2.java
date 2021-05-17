package com.annotationmergeupdate4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class LoadAndGetMethod2
{
	public static void main(String[] args)
	{
		Configuration con=new AnnotationConfiguration();	
		con.configure("com/annotationmergeupdate4/hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session sess= sf.openSession();
		Transaction tx=  sess.beginTransaction();
       //we can't perform both method of fetching at same time..it will not display hibernate query,but it will fetch data successfully
		
		System.out.println("\n");
		System.out.println("start");
		System.out.println("load Method");
		Employeee e1=(Employeee)sess.load(Employeee.class,4);  
		System.out.println("Fetch");
		System.out.println("Id\tName      \tAddress");
		System.out.println(e1.getEid()+"\t"+e1.getEname()+"\t"+e1.getEadd());
	
		
		
		sess.close();

	}
}
