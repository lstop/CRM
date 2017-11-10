package com.lstop.dao;

import java.util.List;

import org.hibernate.Session;

import com.lstop.exception.CustomerException;
import com.lstop.pojo.Customer;

public interface CustomerDao {

	public void insertCustomer(Customer customer,Session session) throws CustomerException;
	public List<Customer> selectCustomer(Session session,int page,int perpage) throws CustomerException;
	public int countCustomer(Session session) throws CustomerException;
	public Customer reshowCustomer(Session session,long cust_id) throws CustomerException;
}
