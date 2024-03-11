package com.Demo2;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Demo2 {
	public static void main(String[] args) {
		ApplicationContext cxt = new AnnotationConfigApplicationContext(configBhanu.class);
		JdbcTemplate jdbcTemplate = cxt.getBean("jdbcTemplate",JdbcTemplate.class);
		List<Worker> query = jdbcTemplate.query("select * from worker", new Rowmapper1());
		query.stream().forEach(System.out::println);
		System.out.println("DB COnnection..");
	}

}
