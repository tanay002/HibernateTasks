package com.hql;

//Hibernate Query Language 1 (HQL)
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainMethod4
{
	public static void main(String[] args) 
	{
		Configuration con=new Configuration().configure("com/hql/hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction t=sess.beginTransaction();

		Query que=sess.createQuery("update Employee set college=:c where salary>:i");
		que.setParameter("c", "unipune");
		que.setParameter("i", 80000);
		
		int row=que.executeUpdate();
		if(row>0)
		{
			System.out.println(row+" row is updated");
		}
		t.commit();

		Query p=sess.createQuery("from Employee where salary>:i");
		p.setParameter("i", 80000);
		List<Employee> ls=p.list();
		for(Employee e:ls)
		{
			System.out.println(e.getId()+"  "+e.getName()+"  "+e.getMobileno()+"  "+e.getSalary()+"  "+e.getCity()+"  "+e.getCollege());
		}
	}
}
