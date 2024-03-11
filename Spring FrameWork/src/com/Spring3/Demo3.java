package com.Spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo3 {

	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("Bean2.xml");
		Student bean = cxt.getBean("student",Student.class);
		System.out.println(bean.getId());
		System.out.println(bean.getName());
		System.out.println(bean.getAddress().getCity());
		System.out.println(bean.getAddress().getDoorNo());
		System.out.println(bean.getAddress().getState());

	}

}
