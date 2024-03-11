package com;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class HQL_Language {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(User.class);
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		User suerUser = new User(1006, "Prakash", 99, "Pass");
		session.save(suerUser);
//		HQL Query....
		Query<User> createQuery = session.createQuery("from User",User.class);  //HQL Query Language
		List<User> list =  createQuery.list();
		list.stream().forEach(k -> System.out.println(k));
//		Native query is like SQL query.....
		System.out.println("********************************************************");
		List<User> createNativeQuery = session.createNativeQuery("select * from users ",User.class).list();
		createNativeQuery.stream().forEach(K -> System.out.println(K));


		session.beginTransaction().commit();
	}
	
	
}
		
