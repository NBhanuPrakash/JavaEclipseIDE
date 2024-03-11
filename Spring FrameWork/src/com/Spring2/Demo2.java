package com.Spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo2 {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("Bean1.xml");
		User bean = ctx.getBean("u1",User.class);
		System.out.println(bean.getId());
		System.out.println(bean.getNameString());
	}

}
