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
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class MainMethod4
{
	public static void main(String[] args) {

		Configuration con=new AnnotationConfiguration().configure("com/criteria/hibernate.cfg.xml");
		SessionFactory sf=	con.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction trx=sess.beginTransaction();

		Criteria cr=sess.createCriteria(Teacher.class);
		//cr.add(Restrictions.gt("tid",7));
		//cr.add(Restrictions.ge("tid",10));
		
		//cr.add(Restrictions.lt("tid",4));
//	cr.add(Restrictions.le("tid",4));
		//cr.add(Restrictions.eq("tname","tanay"));
		//cr.add(Restrictions.ne("tname","tanay"));
		  //cr.addOrder(Order.desc("tname"));
		 cr.setProjection(Projections.property("tname"));
		               cr.setProjection(Projections.count("tname"));
		List ls=cr.list();
		Iterator<Teacher> it=ls.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}			

	}
}
