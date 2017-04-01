package com.insurance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name= "healthinsurance")
@PrimaryKeyJoinColumn(name="policy_no")
public class HealthInsurance extends Policy {
	@Column
	private double sum_insured;

	/**
	 * @return the sum_insured
	 */
	public double getSum_insured() {
		return sum_insured;
	}

	/**
	 * @param sum_insured the sum_insured to set
	 */
	public void setSum_insured(double sum_insured) {
		this.sum_insured = sum_insured;
	}
	

}
