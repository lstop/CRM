package com.lstop.service;

import java.util.List;

import com.lstop.exception.ContactException;
import com.lstop.pojo.Contact;

public interface ContactService {
	public void addLinkman(Contact contact) throws ContactException;
	public List<Contact> queryContact(int page,int perpage) throws ContactException;
	public int countContact() throws ContactException;
	public Contact reshowContact(long contact_id) throws ContactException;
}
