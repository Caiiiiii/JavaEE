package com.springMybatis.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerMapper customerMapper;
	@Override
	public void addCustomer(Customer customer) {
		// TODO �Զ����ɵķ������
		this.customerMapper.addCustomer(customer);
	}

}
