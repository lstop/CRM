package com.lstop.service;

import java.util.List;

import com.lstop.exception.CustomerException;
import com.lstop.pojo.Customer;
public interface CustomerService {
	public void addCustomer(Customer customer) throws CustomerException;
	public List<Customer> queryCustomer(int page,int perpage) throws CustomerException;
	public int countCustomer() throws CustomerException;
	public Customer reshowCustomer(long cust_id) throws CustomerException;
}
