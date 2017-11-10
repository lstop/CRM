package com.lstop.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lstop.dao.ContactDao;
import com.lstop.dao.impl.ContactDaoImpl;
import com.lstop.exception.ContactException;
import com.lstop.pojo.Contact;
import com.lstop.pojo.Customer;
import com.lstop.service.ContactService;
import com.lstop.utils.HibernateUtils;

public class ContactServiceImpl implements ContactService {
	ContactDao contactDao = new ContactDaoImpl();
	@Override
	public void addLinkman(Contact contact) throws ContactException {
		Transaction transaction = HibernateUtils.start();
		Session session = HibernateUtils.getCurrentSession();
		
		Customer customer = session.get(Customer.class, contact.getContact_cust_id());
		contact.setCustomer(customer);
		contactDao.insertLinkman(contact, session);
		HibernateUtils.close(transaction);
	}
	@Override
	public List<Contact> queryContact(int page,int perpage) throws ContactException {
		Transaction transaction = HibernateUtils.start();
		Session session = HibernateUtils.getCurrentSession();
		List<Contact> list = contactDao.selectContact(session,page,perpage);
		HibernateUtils.close(transaction);
		return list;
	}
	@Override
	public int countContact() throws ContactException {
		Transaction transaction = HibernateUtils.start();
		Session session = HibernateUtils.getCurrentSession();
		int size = contactDao.countContact(session);
		HibernateUtils.close(transaction);
		return size;
	}
	@Override
	public Contact reshowContact(long contact_id) throws ContactException {
		Transaction transaction = HibernateUtils.start();
		Session session = HibernateUtils.getCurrentSession();
		Contact contact = contactDao.reshowContact(session, contact_id);
		HibernateUtils.close(transaction);
		return contact;
	}

}
