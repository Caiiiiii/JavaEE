package com.springMybatis.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springMybatis.dao.Customer;
import com.springMybatis.mapper.CustomerService;

public class TransactionTest {
     public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("chapter10ApplicationContext.xml");
		CustomerService customerService = applicationContext.getBean(CustomerService.class);
	    
		Customer customer = new Customer();
		customer.setUsername("zhangsan");
		customer.setJobs("manager");
		customer.setPhone("13233334444");
		customerService.addCustomer(customer);
	}
}
