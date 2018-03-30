package com.assemble;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	@Test
	public void test1(){
		System.out.println(applicationContext.getBean("user1"));
		System.out.println(applicationContext.getBean("user2"));
	}
}
