package com.collectionm.onetomany.list;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainMethod 
{
	public static void main(String[] args)
	{
		Configuration con=new Configuration().configure("com/collectionm/onetomany/list/hibernate.cfg.xml");
		SessionFactory sf= con.buildSessionFactory();
		Session sess=  sf.openSession();
		Transaction tx= sess.beginTransaction();
		Question q=new Question();
		q.setqName("What is OOPS Concept ");

		Answer a1=new Answer();
		a1.setAnsId(1);
		a1.setAnsName("class");

		Answer a2=new Answer();
		a2.setAnsId(2);
		a2.setAnsName("Object");
		List al=new ArrayList(); 
		al.add(a1);
		al.add(a2);
		
		q.setAns(al);
		sess.save(q);
		tx.commit();

	}
}
