package com.Spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationFile {

	public static void main(String[] args) {

		ApplicationContext cxt = new AnnotationConfigApplicationContext(Config.class);
		Teacher bean = cxt.getBean("tec1",Teacher.class);
		System.out.println(bean.getTeacherId());
		System.out.println(bean.getTeacherName());
		System.out.println(bean.getStudents().getStudentId());
		System.out.println(bean.getStudents().getStudentName());
	}

}
