package com.One_to_Many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class One_to_Many {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Questions.class);
		cfg.addAnnotatedClass(Answers.class);
		
		SessionFactory buildSessionFactory = cfg.buildSessionFactory();
		
		Questions q1 = addQuesandAns();
		
		Session session = buildSessionFactory.openSession();
		Transaction beginTransaction = session.beginTransaction();
		session.save(q1);
		Query<Questions> createQuery = session.createQuery("from Questions",Questions.class);
		List<Questions> list = createQuery.list();
		list.stream().forEach(System.out::println);
		beginTransaction.commit();
		
	}

	private static Questions addQuesandAns() {
		Questions q1 = new Questions();
		q1.setQuesName("What is JDK");
		
		Answers ans1 = new Answers();
		ans1.setAnswerString("Java Devlopment Tool Kit");
		ans1.setPostedBy("Bhanu");
		
		Answers ans2 = new Answers();
		ans2.setAnswerString("Java RunTime Environment");
		ans2.setPostedBy("Ganesh");
		
		List<Answers> list = new ArrayList<>();
		list.add(ans1);
		list.add(ans2);
		
		q1.setAnswers(list);
		return q1;
	}

}
