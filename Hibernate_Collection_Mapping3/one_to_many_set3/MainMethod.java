package com.collectionm.onetomany.set3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainMethod 
{
	public static void main(String[] args)
	{
		Configuration con=new Configuration().configure("com/collectionm/onetomany/set3/hibernate.cfg.xml");
		SessionFactory sf= con.buildSessionFactory();
		Session sess=  sf.openSession();
		Transaction tx= sess.beginTransaction();
		Question q=new Question();
		q.setqName("Types of inheritance");

		Answer a1=new Answer();
		a1.setAnsId(1);
		a1.setAnsName("single inheritance");

		Answer a2=new Answer();
		a2.setAnsId(2);
		a2.setAnsName("Multilevel inheritance");
		
		Answer a3=new Answer();
		a3.setAnsId(3);
		a3.setAnsName("Hierarchical inheritance");
		
		//Answer a4=new Answer();
		//a4.setAnsId(3); primary key same nhi hoo sakti... hume primary key dusri lena padegi
		    //is hisab se hamara object ka content bhi different ho jayega....so hame hashCode and equals override karne ki jaroorat nhi hai..
		//a4.setAnsName("Hierarchical inheritance");
		
		Set s=new HashSet(); 
		s.add(a1);
		s.add(a2);
		s.add(a3);
		//s.add(a4);
		
		q.setAns(s);
		sess.save(q);
		tx.commit();

	}
}
