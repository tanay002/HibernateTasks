package manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainMethod 
{
public static void main(String[] args) {
	
	Configuration c=new AnnotationConfiguration().configure("manytomany/hibernate.cfg.xml");
	SessionFactory sf=c.buildSessionFactory();
	Session sess=sf.openSession();
	Transaction tx=sess.beginTransaction();
	
	Question q=new Question();
	q.setQname("Ways to Creat Object");
	Answer a=new Answer();
	a.setAnsName("New keyword");
	a.setSubmitBy("Rajat");
	
	Answer a1=new Answer();
	a1.setAnsName("Class.forName");
	a1.setSubmitBy("Manish");
	
	Answer a2=new Answer();
	a2.setAnsName("Deserializaion");
	a2.setSubmitBy("Tanay");
	
	List ls=new ArrayList();
	ls.add(a);
	ls.add(a1);
	ls.add(a2);
	
	q.setAns(ls);
	
	sess.save(q);
	
	tx.commit();
	
}
}
