package com.collectionm.onetomanyanno.list2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainMethodFetchData 
{
	public static void main(String[] args) 
	{
      Configuration con=new Configuration().configure("com/onetoone/mapping5/hibernate.cfg.xml");
            SessionFactory sf= con.buildSessionFactory();
           Session sess= sf.openSession();
          // Transaction tx=sess.beginTransaction();
           Question s=(Question) sess.get(Question.class,3);
                 // Question s=(Question) sess.get(Question.class,1);
             
           sess.close();
	}
}
