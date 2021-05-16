package com.criteria;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;

public class CheckSave
{
	public static void main(String[] args) {

		Configuration con=new AnnotationConfiguration().configure("com/criteria/hibernate.cfg.xml");
		SessionFactory sf=	con.buildSessionFactory();
		Session sess=sf.openSession();
	Teacher t=new Teacher();
	t.setTmobileno("12345678");
	t.setTname("Randeep");
	t.setTsalary("20000");
	sess.save(t);
		Transaction trx=sess.beginTransaction();
		trx.commit();

	
	}
}
