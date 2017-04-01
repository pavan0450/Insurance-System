package com.insurance.model;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name= "houseinsurance")
@PrimaryKeyJoinColumn(name="policy_no")
public class HouseInsurance extends Policy{
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
	@Column
	private double building_cost;
	@Column
	private double appliances_cost;
	@Column
	private double jewellery_cost;
	@OneToMany(mappedBy = "houseinsurance", cascade = CascadeType.ALL)
	 private Set<HouseMembers> housemembers;
	/**
	 * @return the building_cost
	 */
	public double getBuilding_cost() {
		return building_cost;
	}
	/**
	 * @param building_cost the building_cost to set
	 */
	public void setBuilding_cost(double building_cost) {
		this.building_cost = building_cost;
	}
	/**
	 * @return the appliances_cost
	 */
	public double getAppliances_cost() {
		return appliances_cost;
	}
	/**
	 * @param appliances_cost the appliances_cost to set
	 */
	public void setAppliances_cost(double appliances_cost) {
		this.appliances_cost = appliances_cost;
	}
	/**
	 * @return the jewellery_cost
	 */
	public double getJewellery_cost() {
		return jewellery_cost;
	}
	/**
	 * @param jewellery_cost the jewellery_cost to set
	 */
	public void setJewellery_cost(double jewellery_cost) {
		this.jewellery_cost = jewellery_cost;
	}

}
