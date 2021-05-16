package com.onetoone.mapping5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainMethod2 
{
	public static void main(String[] args) 
	{
      Configuration con=new Configuration().configure("com/onetoone/mapping5/hibernate.cfg.xml");
            SessionFactory sf= con.buildSessionFactory();
           Session sess= sf.openSession();
           Transaction tx=sess.beginTransaction();
           
           Student s=new Student();
           s.setsMobno("9907820661");
           s.setsName("Tanny");
           Address ad=new Address();
           ad.setCity("Bhopal");
           ad.setStreet("Limbodi");
           
          // s.setAdd(ad);
           ad.setStd(s);
           sess.save(s);
           tx.commit();
           sess.close();
	}
}
