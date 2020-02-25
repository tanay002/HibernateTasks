package com.bytecoder;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainMethod 
{
	public static void main(String[] args)
	{
     Configuration cfg=new Configuration(); 
     cfg.configure("com/bytecoder/hibernate.cfg.xml");
    SessionFactory sf= cfg.buildSessionFactory();
    Session sess=sf.openSession();
    Employeee e=new Employeee(102,"Tanay Saxena","Sky Residency");
    Transaction t=sess.beginTransaction();
    sess.save(e);
    t.commit();
    sess.close();
    System.out.println("True");
	}
}
