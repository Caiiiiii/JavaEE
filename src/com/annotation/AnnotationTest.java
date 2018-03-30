package com.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AnnotationXml.xml");
	
	@Test
	public void test(){
		UserController userController = (UserController) applicationContext.getBean("userController");
		userController.save();
	}
}
