package com.insurance.service;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.insurance.dao.HibernateUtil;
import com.insurance.model.Customer;

public class UserService {
	
	public boolean addUser(Customer customer){
		Session session = HibernateUtil.openSession();
		if(isCustomerExists(customer)){
			return false;
		}
		Transaction txn = null;
		try{
			txn = session.getTransaction();
			txn.begin();
			session.saveOrUpdate(customer);
			txn.commit();
		}catch(Exception e){
			if(txn != null){
				txn.rollback();
			}
			e.printStackTrace();
		}finally{
			session.close();
		}
		return true; 
	}
	
	public boolean  isCustomerExists(Customer customer) {
		Session session = HibernateUtil.openSession();
		boolean result = false;
		Transaction txn=null;
		try{
			txn = session.getTransaction();
			txn.begin();
			Query query = session.createQuery("from Customer where email_id='"+customer.getEmail_id()+"'");
			Customer existing = (Customer)query.uniqueResult();
			txn.commit();
			if(existing != null){
				result = true;
			}
		}catch(Exception e){
			if(txn !=null){
				txn.rollback();
			}
		}finally{
			session.close();
		}
		
		return result;
	}
}
