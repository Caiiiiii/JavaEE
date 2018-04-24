package com.mapping.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.mapping.dao.MybatisUtils;
import com.mapping.dao.Orders;
import com.mapping.dao.User;

public class MybatisAssociatdTest {
	@Test
    public void MybatisAssociatdTest(){
    	SqlSession session = MybatisUtils.getSqlSession();
    	
    	Orders orders = session.selectOne("com.mapping.mapper"
    			+".OrdersMapper.findOrdersWithProduct",1);
    	System.out.println(orders);
    			
    	
//    	User user = session.selectOne("com.mapping.mapper"
//    			+".UserMapper.findUserWithOrders",1);
//    	System.out.println(user);
    	
//    	Person person = session.selectOne("com.mapping.mapper"
//    	+".PersonMapper.findPersonById",1);
    	
//    	Person person = session.selectOne("com.mapping.mapper"
//    	    	+".PersonMapper.findPersonById2",1);
//    	System.out.println(person);
    	session.close();
    }
	

}
