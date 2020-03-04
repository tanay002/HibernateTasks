package com.onetoone.mappingAnno6;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainMethod 
{
	public static void main(String[] args) {


		Configuration con=new AnnotationConfiguration().configure("com/onetoone/mappingAnno6/hibernate.cfg.xml");
		SessionFactory sf= con.buildSessionFactory();
		Session sess= sf.openSession();
		Transaction tx=sess.beginTransaction();
		CompanyAnno com=new CompanyAnno();
		com.setCname("TCS");
		com.setCfounder("Ratan Tata");

		AddressAnno add=new AddressAnno();
		add.setCity("Banglore");
		add.setStreet("tower of lakeway");
		add.setComp(com);
		com.setAdd(add);
		sess.save(com);
		sess.save(add);
		tx.commit();
		sess.close();
		System.out.println("Done.....!");
	}
}
