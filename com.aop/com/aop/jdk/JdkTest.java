package com.aop.jdk;

import org.junit.Test;

public class JdkTest {
	
	@Test
	public void test(){
		JdkProxy jdkProxy = new JdkProxy();
		
		UserDao userDao = new UserDaoImpl();
		
		UserDao userDao1 = (UserDao) jdkProxy.createProxy(userDao);
		
		userDao1.addUser();
		userDao1.deleteUser();
	}
}
