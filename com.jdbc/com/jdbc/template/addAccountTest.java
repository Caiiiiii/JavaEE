package com.jdbc.template;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class addAccountTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbcApplicationContext.xml");
		AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
		Account account = new Account();
		account.setUsername("tom");
		account.setBalance(1111.11);
		
		int num = accountDao.addAcount(account);
		if(num>0){
			System.out.println("成功插入"+num+"条数据");
		}else{
			System.out.println("插入数据失败！");
		}
	}
}
