package test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.mybatis.po.Customer;

public class MybatisTest {
	@Test
 public void findCustomerByIdTest() throws Exception{
	 String resource = "mybatis-config.xml";
	 InputStream inputStream = Resources.getResourceAsStream(resource);
	 SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	 SqlSession sqlSession = sqlSessionFactory.openSession();
	 
//	 int rows = sqlSession.delete("com.mybatis.mapper.CustomerMapper.deleteCustomer",7);
//	 if(rows > 0){
//		 	System.out.println("成功删除"+rows+"条数据");
//	 	}else{
//	 		System.out.println("删除失败");
//	 	}
//	 sqlSession.commit();
	 
	 
//	 Customer customer = new Customer();
//	 customer.setId(7);
//	 customer.setUsername("rose");
//	 customer.setJobs("programmer");
//	 customer.setPhone("13311111111");
//	 int rows = sqlSession.update("com.mybatis.mapper.CustomerMapper.updateCustomer",customer);
//	 if(rows > 0){
//		 System.out.println("成功修改"+rows+"条数据");
//	 }else{
//		 System.out.println("修改失败");
//	 }
//	 sqlSession.commit();
	 
//	 Customer customer = new Customer();
//	 customer.setUsername("rose");
//	 customer.setJobs("student");
//	 customer.setPhone("13333533092");
//	 int row = sqlSession.insert("com.mybatis.mapper.CustomerMapper.addCustomer",customer);
//	 if(row > 0){
//		 System.out.println("成功插入"+row+"条数据");
//	 }else{
//		 System.out.println("插入失败");
//	 }
//	 sqlSession.commit();
	 
	 Customer customer = sqlSession.selectOne("com.mybatis.mapper.CustomerMapper.findCustomerById",1);
	 System.out.println(customer.toString());
	 	 List<Customer> customers = sqlSession.selectList("com.mybatis.mapper.CustomerMapper.findCustomerByName","j");
	 for(Customer costomer1 :customers){
		 System.out.println(costomer1);
	 }
	 
	 sqlSession.close();
 }
}
