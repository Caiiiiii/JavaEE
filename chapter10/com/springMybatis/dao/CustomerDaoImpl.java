package com.springMybatis.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class CustomerDaoImpl extends SqlSessionDaoSupport implements CustomerDao{

	@Override
	public Customer findCustomerById(Integer id) {
		// TODO �Զ����ɵķ������
		return this.getSqlSession().selectOne("com.springMybatis.mapper"+".CustomerMapper.findCustomerById",id);
	}

}
