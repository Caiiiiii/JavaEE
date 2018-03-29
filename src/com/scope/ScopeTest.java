package com.scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	

	public void test(){
		System.out.print(applicationContext.getBean("scope"));
	}
	
	@Test
	public void test2(){
		System.out.println(applicationContext.getBean("scope2"));
		System.out.println(applicationContext.getBean("scope2"));
	}
}
