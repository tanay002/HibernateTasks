package com.fetch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;
import org.slf4j.LoggerFactory;

public class MainMethod 
{
	public static void main(String[] args)
	{
		
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("com/fetch/JoinCriteria.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
	
	Company c= (Company)ses.get(Company.class,1);
		List<Employee> add = c.getEmp();
       System.out.println(c);
		
	/* Criteria crt=ses.createCriteria(Company.class);
		List<Company> list=crt.list();
		System.out.println(list);*/
	/*  */
	    ses.close();    
	    System.out.println("success"); 
		

		
	}

}
