package com.Spring4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DepInjection {

	public static void main(String[] args) {


		ApplicationContext cxt = new ClassPathXmlApplicationContext("Bean3.xml");
		Class bean = cxt.getBean("class",Class.class);
		System.out.println("CLass Name         : "+bean.getClassNameString());
		System.out.println("CLass Teacher Name : "+bean.getTeacher().getTeacherName());
		System.out.println("CLass Teacher ID   : "+bean.getTeacher().getTeacherId());
		System.out.println("CLass Student Name : "+bean.getStudents().getStudentName());
		System.out.println("Class Book Name    : "+bean.getStudents().getBooks().getBookNameString());
		System.out.println("Class Book Author  : "+bean.getStudents().getBooks().getBookAuthor());
		
		
		
	}


}
