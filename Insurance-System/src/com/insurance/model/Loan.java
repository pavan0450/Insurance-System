package com.insurance.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "loan")
public class Loan {

	@Id
	@Column
	private String loan_number;
	@Column
	private double loan_amt;
	@Column

	private int time_period;
	@Column
	private double rate_of_interest;
	@Column
	private double emi;
	@Column
	private String loan_date;
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "policy_no")
	private LifeInsurance lifeinsurance;
	/**
	 * @return the policy_no
	 */
	
	/**
	 * @return the lifeinsurance
	 */
	public LifeInsurance getLifeinsurance() {
		return lifeinsurance;
	}
	/**
	 * @param lifeinsurance the lifeinsurance to set
	 */
	public void setLifeinsurance(LifeInsurance lifeinsurance) {
		this.lifeinsurance = lifeinsurance;
	}
	/**
	 * @return the loan_number
	 */
	public String getLoan_number() {
		return loan_number;
	}
	/**
	 * @param loan_number the loan_number to set
	 */
	public void setLoan_number(String loan_number) {
		this.loan_number = loan_number;
	}
	/**
	 * @return the loan_amt
	 */
	public double getLoan_amt() {
		return loan_amt;
	}
	/**
	 * @param loan_amt the loan_amt to set
	 */
	public void setLoan_amt(double loan_amt) {
		this.loan_amt = loan_amt;
	}
	/**
	 * @return the time_period
	 */
	public int getTime_period() {
		return time_period;
	}
	/**
	 * @param time_period the time_period to set
	 */
	public void setTime_period(int time_period) {
		this.time_period = time_period;
	}
	/**
	 * @return the rate_of_interest
	 */
	public double getRate_of_interest() {
		return rate_of_interest;
	}
	/**
	 * @param rate_of_interest the rate_of_interest to set
	 */
	public void setRate_of_interest(double rate_of_interest) {
		this.rate_of_interest = rate_of_interest;
	}
	/**
	 * @return the emi
	 */
	public double getEmi() {
		return emi;
	}
	/**
	 * @param emi the emi to set
	 */
	public void setEmi(double emi) {
		this.emi = emi;
	}
	/**
	 * @return the loan_date
	 */
	public String getLoan_date() {
		return loan_date;
	}
	/**
	 * @param loan_date the loan_date to set
	 */
	public void setLoan_date(String loan_date) {
		this.loan_date = loan_date;
	}
	/**
	 * @return the lifeinsurance
	 */
	
}
