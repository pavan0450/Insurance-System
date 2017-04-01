package com.insurance.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "policy")
@Inheritance(strategy=InheritanceType.JOINED)
public class Policy {
	
	
	@Id
	@Column
	private String policy_no; 
	@Column
	private String type;  
	@Column
	private String next_premium_date;
	@Column
	private String purchase_date; 
	@Column
	private double premium_amt; 
	@Column
	private String frequency; 
	@Column
	
	private String policy_exp_date;
	@Column
	private String policy_start_date;
	@ManyToOne
	@JoinColumn(name = "customer_code")
	private Customer customer;
	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}
	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the next_premium_date
	 */
	public String getNext_premium_date() {
		return next_premium_date;
	}
	/**
	 * @param next_premium_date the next_premium_date to set
	 */
	public void setNext_premium_date(String next_premium_date) {
		this.next_premium_date = next_premium_date;
	}
	/**
	 * @return the purchase_date
	 */
	public String getPurchase_date() {
		return purchase_date;
	}
	/**
	 * @param purchase_date the purchase_date to set
	 */
	public void setPurchase_date(String purchase_date) {
		this.purchase_date = purchase_date;
	}
	/**
	 * @return the premium_amt
	 */
	public double getPremium_amt() {
		return premium_amt;
	}
	/**
	 * @param premium_amt the premium_amt to set
	 */
	public void setPremium_amt(double premium_amt) {
		this.premium_amt = premium_amt;
	}
	/**
	 * @return the frequency
	 */
	public String getFrequency() {
		return frequency;
	}
	/**
	 * @param frequency the frequency to set
	 */
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	/**
	 * @return the policy_no
	 */
	public String getPolicy_no() {
		return policy_no;
	}
	/**
	 * @param policy_no the policy_no to set
	 */
	public void setPolicy_no(String policy_no) {
		this.policy_no = policy_no;
	}
	/**
	 * @return the policy_exp_date
	 */
	public String getPolicy_exp_date() {
		return policy_exp_date;
	}
	/**
	 * @param policy_exp_date the policy_exp_date to set
	 */
	public void setPolicy_exp_date(String policy_exp_date) {
		this.policy_exp_date = policy_exp_date;
	}
	/**
	 * @return the policy_start_date
	 */
	public String getPolicy_start_date() {
		return policy_start_date;
	}
	/**
	 * @param policy_start_date the policy_start_date to set
	 */
	public void setPolicy_start_date(String policy_start_date) {
		this.policy_start_date = policy_start_date;
	}
		  


}
