package com.annotationmergeupdate4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class LoadAndGetMethod 
{
	public static void main(String[] args)
	{
		Configuration con=new AnnotationConfiguration();	
		con.configure("com/annotationmergeupdate4/hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session sess= sf.openSession();
		Transaction tx=  sess.beginTransaction();
		//we can't perform both method of fetching at same time..it will not display hibernate query,but it will fetch data successfully

		System.out.println("start"); System.out.println("Get Method"); 
		Employeee e=(Employeee)sess.get(Employeee.class,4); System.out.println("fetch");
		System.out.println("Id\tName      \tAddress");
		System.out.println(e.getEid()+"\t"+e.getEname()+"\t"+e.getEadd());
		System.out.println("End");


		sess.close();

	}
}
