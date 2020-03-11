package com.hql;

//Hibernate Query Language 1 (HQL)
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainMethod6
{
	//Aggregate function
	public static void main(String[] args) 
	{
		Configuration con=new Configuration().configure("com/hql/hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction t=sess.beginTransaction();
		//Sum
		Query que=sess.createQuery("select sum(salary) from Employee");
		List ls=que.list();
		for(int i=0;i<ls.size();i++)
		{
			System.out.println(ls.get(i));
		}

		//Min
		Query que1=sess.createQuery("select min(salary) from Employee");
		List ls1=que1.list();
		for(int i=0;i<ls1.size();i++)
		{
			System.out.println(ls1.get(i));
		}
		//Max
		Query que2=sess.createQuery("select max(salary) from Employee");
		List ls2=que2.list();
		for(int i=0;i<ls2.size();i++)
		{
			System.out.println(ls2.get(i));
		}

		//count
		Query que3=sess.createQuery("select count(id) from Employee");
		List ls3=que3.list();
		for(int i=0;i<ls3.size();i++)
		{
			System.out.println(ls3.get(i));
		}

		//Avg
		Query que4=sess.createQuery("select avg(salary) from Employee");
		List ls4=que4.list();
		for(int i=0;i<ls4.size();i++)
		{
			System.out.println(ls4.get(i));
		}
	}
}
