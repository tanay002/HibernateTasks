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
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class MainMethod5
{
	public static void main(String[] args) {

		Configuration con=new AnnotationConfiguration().configure("com/criteria/hibernate.cfg.xml");
		SessionFactory sf=	con.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction trx=sess.beginTransaction();

		Criteria cr=sess.createCriteria(Teacher.class);
	//	cr.add(Restrictions.isNull("tname"));
	// cr.add(Restrictions.like("tname","Tan%",MatchMode.START));
	// cr.add(Restrictions.like("tname","%an%",MatchMode.ANYWHERE));
		Restrictions.like("tname","%an%",MatchMode.EXACT);
	 cr.add(Restrictions.like("tname","%ay",MatchMode.END));
		List ls=cr.list();
		Iterator<Teacher> it=ls.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}			

	}
}
