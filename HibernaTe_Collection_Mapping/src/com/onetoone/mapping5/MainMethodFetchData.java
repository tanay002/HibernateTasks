package com.onetoone.mapping5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainMethodFetchData 
{
	public static void main(String[] args) 
	{
      Configuration con=new Configuration().configure("com/onetoone/mapping5/hibernate.cfg.xml");
            SessionFactory sf= con.buildSessionFactory();
           Session sess= sf.openSession();
          //Transaction tx=sess.beginTransaction();
           
                  Student s=(Student) sess.get(Student.class,1);
                 System.out.println(s.getsId()+" "+s.getsName()+s.getAdd());
           sess.close();
	}
}
