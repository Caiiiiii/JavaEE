package com.jdbc.template;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class updateAccountTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbcApplicationContext.xml");
		AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
		Account account = new Account();
		account.setId(1);
		account.setUsername("tom");
		account.setBalance(2000.00);
		
		int num = accountDao.updateAcount(account);
		if(num>0){
			System.out.println("�ɹ��޸���"+num+"������");
		}else{
			System.out.println("�޸�����ʧ�ܣ�");
		}
	}
}
