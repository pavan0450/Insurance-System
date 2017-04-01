package com.insurance.model;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Dao {
	
	public static void tableCreate(){
		AnnotationConfiguration cfg=new AnnotationConfiguration();  
	    Session session=cfg.configure("hibernate.cfg.xml").buildSessionFactory().openSession();  
	      
	    Transaction t=session.beginTransaction();  
	/*Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();  
	Transaction t=session.beginTransaction();  */

	/*Policy policy1=new Policy();  
	policy1.setType("type");  
	policy1.setNext_premium_date("String next_premium_date");

	policy1.setPurchase_date("String purchase_date");
	policy1.setPremium_amt(25.25);
	policy1.setFrequency(" operation, arg_list, result)setFrequency(String frequency");
	policy1.setPolicy_no("policyno");
	policy1.setPolicy_exp_date("String policy_exp_date");
	policy1.setPolicy_start_date("String policy_start_date");


	Policy policy2=new Policy();  
	policy2.setType("type");  
	policy2.setNext_premium_date("String next_premium_date");

	policy2.setPurchase_date("String purchase_date");
	policy2.setPremium_amt(25.50);
	policy2.setFrequency(" operation, arg_list, result)setFrequency(String frequency");
	policy2.setPolicy_no("policyno");
	policy2.setPolicy_exp_date("String policy_exp_date");
	policy2.setPolicy_start_date("String policy_start_date");



	HashSet<Policy> set=new HashSet<Policy>();  
	set.add(policy1);
	set.add(policy2);




	Customer customer1=new Customer();  
	customer1.setPolicies(set);
	customer1.setPincode("String pincode");
	customer1.setCity("String city");



	session.persist(customer1);  
*/

	t.commit();  
    session.close();  
	System.out.println("success");  

	}
}
