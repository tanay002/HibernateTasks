package com.namedquerysAnnotation;

//Hibernate Named Query Language 1
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainMethod1
{
	public static void main(String[] args) 
	{
		Configuration con=new AnnotationConfiguration().configure("com/namedquerysAnnotation/hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction t=sess.beginTransaction();
	/*	
		Query q= sess.getNamedQuery("updateData");
		q.setParameter("n","modi");
		q.setParameter("i",20);
	int row=	q.executeUpdate();
	System.out.println(row);   */
		
	/*	Query q=sess.getNamedQuery("delete");
		q.setParameter("i",20);
		q.executeUpdate();
	t.commit(); */
		
		         Query q=sess.getNamedQuery("selectData");
		         q.setParameter("id",2);
		   List list=q.list();
		   for(Object e:list)
		   {
			   System.out.println(e);
		   }
		
	}
}
