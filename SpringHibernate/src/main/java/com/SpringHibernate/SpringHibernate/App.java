package com.SpringHibernate.SpringHibernate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringHibernate.DTO.Students;
import com.SpringHibernate.DTO.Teacher;
import com.SpringHibernate.JPA.ServiceData;

/**
 * Hello world!
 *
 */
public class App 
{

	public static void main( String[] args )
    {
    	ApplicationContext cxt = new ClassPathXmlApplicationContext("Bean.xml");
    	ServiceData bean = cxt.getBean("productJPA",ServiceData.class);
    	createProduct(bean);
    	System.out.println("DB creation Done...");
    }
	public static void createProduct(ServiceData data) {

		
		Teacher t1 = new Teacher();
		t1.setTeacherId(1001);
		t1.setTeacherName("Radhika mam");
		t1.setSubjectName("Science");
		data.createData(t1);
	}
}
