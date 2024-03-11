package com.Demo1;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Datasource {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws SQLException {

		ApplicationContext cxt = new ClassPathXmlApplicationContext("Bean1.xml");
		JdbcTemplate jdbcTemplate = cxt.getBean("jdbcTemplate", JdbcTemplate.class);
//		staticOperations(jdbcTemplate);
//		Object[] inputArg = {2515,"female"};
		int id= 2515;
		String gender = "male";
//		int update = jdbcTemplate.update("insert into students values(?,?,?);", inputArg);
//		int update = jdbcTemplate.update("update students set gender=? where id=?",inputArg);
//		int update = jdbcTemplate.update("delete from students where id=?",inputArg);
//		Rowmapper rowmapper = new Rowmapper();
//		Student queryForObject = jdbcTemplate.queryForObject("select * from students where id=? and gender=?",rowmapper,id,gender );
//		System.out.println(queryForObject.toString());


//		System.out.println(update + " Rows are Inserted...");
	}

	private static void staticOperations(JdbcTemplate jdbcTemplate) {
		// int update = jdbcTemplate.update("insert into students values
		// (2517,'Ramesh','male');");
		// System.out.println(update+"row inserted")
//		int update = jdbcTemplate.update("update students set gender='female' where id=2515");
//		int update = jdbcTemplate.update("delete from students where id=2515");

				  List<Student> query = jdbcTemplate.query("select * from students", new Rowmapper());
				  query.stream().forEach(System.out::println);
//		System.out.println(update + " Rows are Inserted...");
		System.out.println("DB Connection Sucessfully");
	}

}
