package com.aop.AspectJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.jdk.UserDao;

public class TestXmlAspectJ {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aspectJApplicationContext.xml");
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		userDao.addUser();
	}
	
}
