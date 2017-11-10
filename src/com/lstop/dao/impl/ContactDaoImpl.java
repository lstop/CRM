package com.lstop.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.lstop.dao.ContactDao;
import com.lstop.exception.ContactException;
import com.lstop.pojo.Contact;

public class ContactDaoImpl implements ContactDao {

	@Override
	public void insertLinkman(Contact contact,Session session) throws ContactException {
		session.save(contact);
	}

	@Override
	public List<Contact> selectContact(Session session,int page,int perpage) throws ContactException {
		String hql = "from Contact";
		Query<Contact> query = session.createQuery(hql,Contact.class);
		query.setFirstResult((page-1)*perpage);
		query.setMaxResults(perpage);
		List<Contact> list = query.list();
		return list;
	}

	@Override
	public int countContact(Session session) throws ContactException {
		String hql="from Contact";
		Query<Contact> query = session.createQuery(hql,Contact.class);
		return query.list().size();
	}

	@Override
	public Contact reshowContact(Session session, long contact_id) throws ContactException {
		String hql="from Contact where contact_id="+contact_id;
		Query<Contact> query = session.createQuery(hql,Contact.class);
		return query.list().get(0);
	}

}
