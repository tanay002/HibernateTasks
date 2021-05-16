package com.collectionm.onetomanyanno.set4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainMethod 
{
	public static void main(String[] args)
	{
		Configuration con=new AnnotationConfiguration().configure("com/collectionm/onetomanyanno/set4/hibernate.cfg.xml");
		SessionFactory sf= con.buildSessionFactory();
		Session sess=  sf.openSession();
		Transaction tx= sess.beginTransaction();
		Question q=new Question();
		q.setqName("ways to create object");

		Answer a1=new Answer();
		a1.setAnsId(1);
		a1.setAnsName("new");

		Answer a2=new Answer();
		a2.setAnsId(2);
		a2.setAnsName("clone");
		
		Answer a3=new Answer();
		a3.setAnsId(3);
		a3.setAnsName("deserialization");
		
		Answer a4=new Answer();
		a4.setAnsId(4);
		a4.setAnsName("new instanceOf");
		
		Set al=new HashSet(); 
		al.add(a1);
		al.add(a2);
		al.add(a3);
		al.add(a4);
		
		q.setAns(al);
		sess.save(q);
		tx.commit();

	}
}
