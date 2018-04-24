package com.dynamicsql.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.dynamicsql.dao.Customer;
import com.dynamicsql.dao.MybatisUtils;





public class MyBatisTest {
	@Test
	public void findCustomerByNameAndJobsTest(){
		
		SqlSession session =  MybatisUtils.getSqlSession();
		
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(1);
		ids.add(2);
		List<Customer> customers = session.selectList("com.dynamicsql.mapper"
				+".CustomerMapper.findCustomerByIds",ids);
		for(Customer customer : customers){
			System.out.println(customer);
		}
		
//		Customer customer = new Customer();		
//		customer.setId(3);
//		customer.setPhone("1331111234");
//		int rows = session.update("com.dynamicsql.mapper"
//				+".CustomerMapper.updateCustomer",customer);
//		
//		if(rows > 0){
//			System.out.println("成功修改"+rows+"条数据！");
//		}else{
//			System.out.println("执行修改失败");
//		}
//		session.commit();
		
//		customer.setUsername("jack");
//		customer.setJobs("teacher");
//		List<Customer> customers = session.selectList("com.dynamicsql.mapper"
//				+".CustomerMapper.findCustomerByNameAndJobs",customer);
//		
//		for(Customer customer2 :customers){
//			System.out.print(customer2);
//		}
		session.close();
	}
}
