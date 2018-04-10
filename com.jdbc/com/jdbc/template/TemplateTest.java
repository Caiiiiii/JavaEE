package com.jdbc.template;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TemplateTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbcApplicationContext.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
		jdbcTemplate.execute("create table account(" + 
									   "id int primary key auto_increment," +
									   "username varchar(50)," +
									   "balance double)");
		
		System.out.print("account 创建成功");
	}
}
