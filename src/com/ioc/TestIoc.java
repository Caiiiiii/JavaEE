package com.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//	UserDao userdao ;
	

//	public void test(){
//		userdao = (UserDao) applicationContext.getBean("userDao");
//		userdao.say();
//	}
	
	@Test
	public void test2(){
		UserService userservice = (UserService)applicationContext.getBean("userService");
		userservice.say();
	}
}
