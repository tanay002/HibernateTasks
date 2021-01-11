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
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;

public class MainMethod3
{
	public static void main(String[] args) {

		Configuration con=new AnnotationConfiguration().configure("com/criteria/hibernate.cfg.xml");
		SessionFactory sf=	con.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction trx=sess.beginTransaction();

		Criteria cr=sess.createCriteria(Teacher.class);
	//	SimpleExpression r=Restrictions.gt("tid", 6);
	Criterion r1=Restrictions.lt("tid", 4);
	//	cr.add(r);	
	//	cr.add(r1);
		
	//	cr.add(Restrictions.gt("tid",5));
	//cr.add(Restrictions.between("tid",4,8));
		 
		// cr.addOrder(Order.desc("tname"));
		/*
		 * Order o=Order.asc("tname"); cr.addOrder(o);
		 */
	cr.add(r1);
		List ls=cr.list();
		Iterator<Teacher> it=ls.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}			

	}
}
