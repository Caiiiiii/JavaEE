package com.aop.ProxyFactoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.aop.jdk.UserDao;

public class ProxyFactoryBeanTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aopApplicationContext.xml");
		UserDao userDao = (UserDao) applicationContext.getBean("userDaoProxy");
		userDao.addUser();
		userDao.deleteUser();
	}
}
