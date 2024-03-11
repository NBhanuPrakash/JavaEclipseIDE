package com.Many_to_One;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Students.class);
		cfg.addAnnotatedClass(Teacher.class);
		
		SessionFactory buildSessionFactory = cfg.buildSessionFactory();
		
		Teacher t1 = new Teacher();
		t1.setTeacherName("Radhika");
		
		Students st1 = new Students();
		st1.setName("Bhanu");
		st1.setBooks("Biology");
		st1.setTeacher(t1);
		
		Students st2 = new Students();
		st2.setName("Ganesh");
		st2.setBooks("Biology");
		st2.setTeacher(t1);
		
//		List<Students> list = new ArrayList<>();
//		list.add(st1);
//		list.add(st2);
		
		Session session = buildSessionFactory.openSession();
		Transaction beginTransaction = session.beginTransaction();
		

		session.save(st1);
		session.save(st2);
		beginTransaction.commit();
		
	}

}
