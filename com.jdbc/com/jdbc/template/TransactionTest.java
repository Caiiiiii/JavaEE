package com.jdbc.template;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionTest {

@Test
public void xmlTest(){
	 ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbcApplicationContext.xml");
		AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
		accountDao.transfer("aaa", "a", 100.0);
		System.out.print("×ªÕË³É¹¦");
}
}
