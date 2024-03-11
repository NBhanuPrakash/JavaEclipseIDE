package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hibernate {

	public static void main(String[] args) {

//		Step 1 Configuration
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(User.class);
		
//		Step -2 Session Factory
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
//		Step -3 Session
		
		Session session = sessionFactory.openSession();
		Transaction beginTransaction = session.beginTransaction();
//		User u1 = new User(1001, "GAnesh", 99, "Pass");
//		session.save(u1);
		User user = session.get(User.class, 2);
		user.setMarks(34);
//		session.remove(u1);
		System.out.println(user);
		beginTransaction.commit();

		
		
	}

}
