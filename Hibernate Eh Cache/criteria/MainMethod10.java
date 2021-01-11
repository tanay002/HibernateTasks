package com.criteria;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class MainMethod10
{
	public static void main(String[] args) 
	{
		Configuration con=new AnnotationConfiguration();
		con.configure("com/criteria/hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tx=sess.beginTransaction();

		Criteria cr=sess.createCriteria(Teacher.class);
		
	     ProjectionList pList = Projections.projectionList();
		
	     Projection pro1 = Projections.property("tname");
		Projection pro2 = Projections.property("tsalary");
       // cr.setProjection(pro1);
    //    cr.setProjection(pro2);
   
        pList.add(pro1);
        pList.add(pro2);
        cr.setProjection(pList);
        
		List ls=cr.list();
		Iterator it=ls.iterator();

		while(it.hasNext())
		{
			Object[] obj = (Object[])it.next();
			System.out.println(obj[0]+" "+obj[1]);
		}			

	}
}
