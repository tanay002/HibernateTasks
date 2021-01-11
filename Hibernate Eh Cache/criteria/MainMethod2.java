package com.criteria;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;

public class MainMethod2
{
	public static void main(String[] args) {

		Configuration con=new AnnotationConfiguration().configure("com/criteria/hibernate.cfg.xml");
		SessionFactory sf=	con.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction trx=sess.beginTransaction();

		Criteria cr=sess.createCriteria(Teacher.class);
		cr.setFirstResult(4);
		cr.setMaxResults(8);

		List ls=cr.list();
		Iterator<Teacher> it=ls.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}			

	}
}
