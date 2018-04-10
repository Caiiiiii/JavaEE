package com.jdbc.template;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class findAccountByIdTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbcApplicationContext.xml");
		AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
		Account account = accountDao.findAccountById(8);
		System.out.println(account);
		
		List<Account> account1 = accountDao.findAllAccount();
		for(Account act :account1){
			System.out.println(act);
		}
	}
}
