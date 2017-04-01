package com.insurance.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name= "lifeinsurance")
@PrimaryKeyJoinColumn(name="policy_no")
public class LifeInsurance extends Policy {
	
	@Column
	private double life_cover;
	@Column
	private String premium_paying_term;
	
	 @OneToMany(mappedBy = "lifeinsurance", cascade = CascadeType.ALL)
	 private Set<Nominee> nominees;
	/**
	 * @return the life_cover
	 */
	public double getLife_cover() {
		return life_cover;
	}
	/**
	 * @param life_cover the life_cover to set
	 */
	public void setLife_cover(double life_cover) {
		this.life_cover = life_cover;
	}
	/**
	 * @return the premium_paying_term
	 */
	public String getPremium_paying_term() {
		return premium_paying_term;
	}
	/**
	 * @param premium_paying_term the premium_paying_term to set
	 */
	public void setPremium_paying_term(String premium_paying_term) {
		this.premium_paying_term = premium_paying_term;
	}

}
