package com.jdbc.template;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class deleteAccountTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbcApplicationContext.xml");
		AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
 	
		int num = accountDao.deleteAccount(1);
		if(num>0){
			System.out.println("�ɹ�ɾ����"+num+"������");
		}else{
			System.out.println("ɾ������ʧ�ܣ�");
		}
	}
}
