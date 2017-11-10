package com.lstop.dao;

import java.util.List;

import org.hibernate.Session;

import com.lstop.exception.ContactException;
import com.lstop.pojo.Contact;

public interface ContactDao {
	public void insertLinkman(Contact contact,Session session) throws ContactException;
	public List<Contact> selectContact(Session session,int page,int perpage) throws ContactException;
	public int countContact(Session session) throws ContactException;
	public Contact reshowContact(Session session,long contact_id) throws ContactException;
}
