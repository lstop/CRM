package com.lstop.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private  static  SessionFactory sessionFactory;
	static {
		Configuration configuration = new Configuration();
		configuration.configure();
		sessionFactory = configuration.buildSessionFactory();	 
	}
	public static Session openSession() {
		return sessionFactory.openSession();
	}
	public static Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public static Transaction start() {
		
		return getCurrentSession().beginTransaction();
	}
	public static void close(Transaction transaction) {
		transaction.commit();
	}
}
