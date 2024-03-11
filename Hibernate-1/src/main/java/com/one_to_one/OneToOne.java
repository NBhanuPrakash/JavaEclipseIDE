package com.one_to_one;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class OneToOne {

	public static void main(String[] args) {

		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(passportId.class);
		
		SessionFactory  sessionFactory =cfg.buildSessionFactory();
		
		Student st1 = new Student();
		st1.setNameString("Mahesh");
		passportId ps1 = new passportId();
		ps1.setNameString("Kumar");
		st1.setPassportId(ps1);
		
		Session session = sessionFactory.openSession();
		Transaction beginTransaction = session.beginTransaction();
		session.save(st1);
//		readTable(session, beginTransaction);
//		updateTable(session);
//		deleteTable(session);
		
		beginTransaction.commit();

		
	}

	private static void deleteTable(Session session) {
		Student load = session.load(Student.class, 2);
		session.delete(load);
	}

	private static void updateTable(Session session) {
		Student load = session.load(Student.class, 4);
		load.getPassportId().setNameString("Yadav");
	}

	private static void readTable(Session session, Transaction beginTransaction) {
		Query<Student> load = session.createQuery("from Student",Student.class);
		
		List<Student> list = load.list();
		list.stream().forEach(System.out::println);
	}

}
