package com.springMybatis.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.springMybatis.dao.Customer;
import com.springMybatis.mapper.CustomerMapper;
@Primary
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
