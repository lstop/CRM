package com.lstop.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.lstop.dao.CustomerDao;
import com.lstop.exception.CustomerException;
import com.lstop.pojo.Customer;


public class CustomerDaoImpl  implements CustomerDao{
	@Override
	public void insertCustomer(Customer customer ,Session session) throws CustomerException{
		// TODO Auto-generated method stub
		session.save(customer);	
	}

	@Override
	public List<Customer> selectCustomer(Session session,int page,int perpage) throws CustomerException {
		String hql = "from Customer";
		Query<Customer> query = session.createQuery(hql,Customer.class);
		query.setFirstResult((page-1)*perpage);
		query.setMaxResults(perpage);
		List<Customer> list = query.list();
		return list;
	}

	@Override
	public int countCustomer(Session session) throws CustomerException {
		String hql="from Customer";
		Query<Customer> query = session.createQuery(hql,Customer.class);
		return query.list().size();
	}

	@Override
	public Customer reshowCustomer(Session session,long cust_id) throws CustomerException {
		String hql = "from Customer where cust_id="+cust_id;
		Query<Customer> query = session.createQuery(hql,Customer.class);
		return query.list().get(0);
	}
	
}
