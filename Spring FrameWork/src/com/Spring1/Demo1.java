package com.Spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1 {
	

	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("Bean.xml");
		try {
//			manualTouch1(cxt);
//			manualTouch2(cxt);
			Car car = cxt.getBean("car", Car.class);
			car.multimedia();
			car.routeMapping();
			System.out.println(car);
			
			Car car2 = cxt.getBean("car",Car.class);
			System.out.println(car2);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			((AbstractApplicationContext) cxt).close();
		}
		
		
		
	}

	private static void manualTouch2(ApplicationContext cxt) {
		Person2 bean = (Person2) cxt.getBean("p2");
		bean.multimedia();
		bean.routeMapping();
	}

	private static void manualTouch1(ApplicationContext cxt) {
		Person1 bean = (Person1) cxt.getBean("p1");
		bean.multimedia();
		bean.routeMapping();
	}
}
