package com.inheritance.joinedclass10;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainMethod2 
{
	public static void main(String[] args)
	{
    Configuration cf= new AnnotationConfiguration().configure("com/inheritance/joinedclass10/hibernate.cfg.xml");
    SessionFactory sf=  cf.buildSessionFactory();
    Session sess=  sf.openSession();
    Transaction tx= sess.beginTransaction();
    
    Student s=new Student();
    s.setCname("jnu");
    s.setSname("Raxx");
    
    Faculty fac=new Faculty();
    fac.setCname("manit");
    fac.setFname("mohit sir");
    sess.save(s);
    sess.save(fac);
    tx.commit();
    sess.close();
    System.out.println("Done....!");
	}
}
