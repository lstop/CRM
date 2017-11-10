package com.lstop.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lstop.dao.CustomerDao;
import com.lstop.dao.impl.CustomerDaoImpl;
import com.lstop.exception.CustomerException;
import com.lstop.pojo.Customer;
import com.lstop.service.CustomerService;
import com.lstop.utils.HibernateUtils;

public class CustomerServiceImpl  implements CustomerService{
	CustomerDao customerDaoImpl = new CustomerDaoImpl();
	
	@Override
	public void addCustomer(Customer customer) throws CustomerException{
		
		Transaction transaction  =  HibernateUtils.start();
		Session session = HibernateUtils.getCurrentSession();
		customerDaoImpl.insertCustomer(customer,session);
		HibernateUtils.close(transaction);
	}

	@Override
	public List<Customer> queryCustomer(int page,int perpage) throws CustomerException {
		Transaction transaction  =  HibernateUtils.start();
		Session session = HibernateUtils.getCurrentSession();
		List<Customer> list = customerDaoImpl.selectCustomer(session,page,perpage);
		HibernateUtils.close(transaction);
		return list;
	}

	@Override
	public int countCustomer() throws CustomerException {
		Transaction transaction  =  HibernateUtils.start();
		Session session = HibernateUtils.getCurrentSession();
		int size = customerDaoImpl.countCustomer(session);
		HibernateUtils.close(transaction);
		return size;
	}

	@Override
	public Customer reshowCustomer(long cust_id) throws CustomerException {
		Transaction transaction  =  HibernateUtils.start();
		Session session = HibernateUtils.getCurrentSession();
		Customer customer = customerDaoImpl.reshowCustomer(session, cust_id);
		HibernateUtils.close(transaction);
		return customer;
	}
	
}
