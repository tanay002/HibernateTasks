package manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class FetchMethod 
{
public static void main(String[] args) {
	
	Configuration c=new AnnotationConfiguration().configure("manytomany/hibernate.cfg.xml");
	SessionFactory sf=c.buildSessionFactory();
	Session sess=sf.openSession();
	Question q=(Question) sess.get(Question.class,2); 
	
	System.out.println(q.getQname()+" "+q.getQid()+" "+q.getAns());
	
	Answer ans=(Answer) sess.get(Answer.class,2); 
	System.out.println(ans.getAid()+" "+ans.getAnsName()+" "+ans.getQue());
}
}
