package com.criteria;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Conjunction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class MainMethod7
{
	public static void main(String[] args)
	{
		//Disjunction:-  If we wanted to create an OR expression with more than two different criteria  
		//“price > 25.0 OR name like Mou% OR description not like blocks%”
		Configuration con=new AnnotationConfiguration().configure("com/criteria/hibernate.cfg.xml");
		SessionFactory sf=	con.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction trx=sess.beginTransaction();

		Criteria cr=sess.createCriteria(Teacher.class);
		//cr.add(Restrictions.ilike("tname","ya", MatchMode.ANYWHERE));

		Criterion nm=Restrictions.eq("tname","tanay");
	 	Criterion mobileno=Restrictions.eq("tmobileno","6221762616");
		Criterion salary=Restrictions.lt("tid",5);

		Disjunction d=	Restrictions.disjunction();  //Or
		//Conjunction d=  Restrictions.conjunction();   //And
	
		d.add(nm);
	  d.add(mobileno);
		d.add(salary);
		cr.add(d);

		//	cr.add(Restrictions.or(nm, mobileno));


		List ls=cr.list();
		Iterator<Teacher> it=ls.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}			

	}
}
