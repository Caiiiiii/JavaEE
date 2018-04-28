package com.springMybatis.mapper;

import com.springMybatis.dao.Customer;

public interface CustomerMapper {
    public Customer findCustomerById(Integer id);
    public void addCustomer(Customer customer);
}
