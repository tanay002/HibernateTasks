Configuration cf=new AnnotationConfiguration();	
		cf.configure("com/annotation3persistsave/hibernate.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
	//	Session sess=sf.getCurrentSession();
		Session sess=sf.openSession();
		Transaction tx= sess.beginTransaction();

		 EmployeePer e=new EmployeePer();
		 e.setEid(1);
		 e.setEadd("pune");
		 e.setEname("Ranchi");
		//sess.save(e);
		tx.commit();   
		sess.persist(e);
		//sess.close();
		System.out.println("Done....!");