package com.Spring6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Qualifier {

	public static void main(String[] args) {

		ApplicationContext cxt = new ClassPathXmlApplicationContext("Bean5.xml");
		Ceo bean = cxt.getBean("ceo",Ceo.class);
		System.out.println(bean.getCeoN());
		System.out.println((bean.getCeoPhN()));
		System.out.println(bean.getEmployee().getId());
		System.out.println(bean.getEmployee().getEmpString());
	}

}
