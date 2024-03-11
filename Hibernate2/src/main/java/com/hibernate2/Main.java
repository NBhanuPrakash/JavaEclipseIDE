package com.hibernate2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

	try {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(User.class);
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		User u1 = new User(1001, "BHanu", 99, "Pass");
		Session session = sessionFactory.openSession();
		Transaction beginTransaction = session.beginTransaction();
		session.save(u1);
		beginTransaction.commit();
	} catch (Exception e) {
		e.printStackTrace();
	}
		
	}

}
