package com.springProperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesFile {

	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("Bean6.xml");
		Car bean = cxt.getBean("car",Car.class);
		System.out.println(bean.getCarId());
		System.out.println(bean.getCarName());
		System.out.println(bean.getCustomers().getCustomerId());
		System.out.println(bean.getCustomers().getCustomerName());
	}

}
