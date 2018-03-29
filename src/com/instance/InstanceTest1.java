package com.instance;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest1 {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		@Test
		public void test1(){
			Bean1 bean1 = (Bean1)applicationContext.getBean("bean1");
			System.out.print(bean1);
		}
		
		@Test
		public void test2(){
			System.out.print(applicationContext.getBean("bean2"));
		}
		
		@Test
		public void test3(){
			System.out.print(applicationContext.getBean("bean3"));
		}
		
		
	
}
