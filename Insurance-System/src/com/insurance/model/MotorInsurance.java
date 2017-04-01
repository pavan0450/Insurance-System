package com.insurance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name= "motorinsurance")
@PrimaryKeyJoinColumn(name="policy_no")
public class MotorInsurance extends Policy {
	@Column
	private double purchase_value;
	@Column
	private String vehicle_reg_no;
	@Column
	private String engine_no;
	/**
	 * @return the purchase_value
	 */
	public double getPurchase_value() {
		return purchase_value;
	}
	/**
	 * @param purchase_value the purchase_value to set
	 */
	public void setPurchase_value(double purchase_value) {
		this.purchase_value = purchase_value;
	}
	/**
	 * @return the vehicle_reg_no
	 */
	public String getVehicle_reg_no() {
		return vehicle_reg_no;
	}
	/**
	 * @param vehicle_reg_no the vehicle_reg_no to set
	 */
	public void setVehicle_reg_no(String vehicle_reg_no) {
		this.vehicle_reg_no = vehicle_reg_no;
	}
	/**
	 * @return the engine_no
	 */
	public String getEngine_no() {
		return engine_no;
	}
	/**
	 * @param engine_no the engine_no to set
	 */
	public void setEngine_no(String engine_no) {
		this.engine_no = engine_no;
	}

}
