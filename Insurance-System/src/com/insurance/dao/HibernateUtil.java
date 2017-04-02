package com.insurance.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	
	static {
		try {
			sessionFactory = new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
		}catch(Throwable ex){
			System.err.println("SessionFactory creation failed:" + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static Session openSession() {
		return sessionFactory.openSession();
	}
}
