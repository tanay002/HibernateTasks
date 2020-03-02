package com.collectionm.onetomanyanno.list2;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainMethod 
{
	public static void main(String[] args)
	{
		Configuration con=new AnnotationConfiguration().configure("com/collectionm/onetomanyanno/list2/hibernate.cfg.xml");
		SessionFactory sf= con.buildSessionFactory();
		Session sess=  sf.openSession();
		Transaction tx= sess.beginTransaction();
		Question q=new Question();
		q.setqName("Object Class Methods");

		Answer a1=new Answer();
		a1.setAnsId(1);
		a1.setAnsName("toString");

		Answer a2=new Answer();
		a2.setAnsId(2);
		a2.setAnsName("hashCode");
		
		Answer a3=new Answer();
		a3.setAnsId(3);
		a3.setAnsName("equals");
		List al=new ArrayList(); 
		al.add(a1);
		al.add(a2);
		al.add(a3);
		
		q.setAns(al);
		sess.save(q);
		tx.commit();

	}
}
