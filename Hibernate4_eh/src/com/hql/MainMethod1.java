package com.hql;

//Hibernate Query Language 1 (HQL)
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainMethod1
{
	public static void main(String[] args) 
	{
  Configuration con=new Configuration().configure("com/hql/hibernate.cfg.xml");
  SessionFactory sf=con.buildSessionFactory();
  Session sess=sf.openSession();
   Transaction t=sess.beginTransaction();
   
   Query que=sess.createQuery("from Employee");
   
   //This code is also correct
		/*
		 * List ls=que.list();
		 * 
		 * Iterator it=ls.iterator(); while(it.hasNext()) {
		 * System.out.println(it.next()); }
		 */
   
List<Employee> ls1=que.list();
   for(Employee e:ls1)
   {
	   System.out.println(e.getId()+"  "+e.getName()+"  "+e.getMobileno()+"  "+e.getSalary()+"  "+e.getCity()+"  "+e.getCollege());
   }
 
	}
}
