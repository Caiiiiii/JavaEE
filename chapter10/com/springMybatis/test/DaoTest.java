package com.springMybatis.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springMybatis.dao.Customer;
import com.springMybatis.mapper.CustomerMapper;

public class DaoTest {
		@Test
		public void DaoTest(){
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("chapter10ApplicationContext.xml");

               CustomerMapper customerMapper = applicationContext.getBean(CustomerMapper.class);
               Customer customer = customerMapper.findCustomerById(1);
			
			//			CustomerDao  customerDao = (CustomerDao) applicationContext.getBean("customerDao");
            //			Customer customer = customerDao.findCustomerById(1);
            			System.out.print(customer);
		}

	
}
