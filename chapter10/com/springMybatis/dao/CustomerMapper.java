package com.springMybatis.dao;

public interface CustomerMapper {
    public Customer findCustomerById(Integer id);
    public void addCustomer(Customer customer);
}
