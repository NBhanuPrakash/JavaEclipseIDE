package com.SpringHibernate1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.configure;
import com.SpringHibernateDAO.ServiceRepo;
import com.SpringHibernateDTO.OrderItems;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
    {
    	ApplicationContext cxt = new AnnotationConfigApplicationContext(configure.class);
//    	ApplicationContext cxt = new ClassPathXmlApplicationContext("Bean.xml");
    	ServiceRepo bean = cxt.getBean("serviceRepo",ServiceRepo.class);
    	data(bean);
    	System.out.println("Data Connection Invoked...");
    }
    public static void data(ServiceRepo bean) {
    	OrderItems od1 = new OrderItems();
    	od1.setOrderId(1004);
    	od1.setOrderItemName("Fridge ");
    	od1.setItemPrice("50K");
    	bean.createData(od1);
    }
}
