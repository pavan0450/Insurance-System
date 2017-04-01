package com.insurance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "nominee")
public class Nominee {
	@Id
	@Column
    private String nominee_id;
	@Column
	private String name;
	@Column
	private String address; 
	@Column
	private String phone; 
	@Column
	private String gender; 
	@Column
	private String relation_with_life_assured; 
	@Column
	private String country; 
	@Column
	private String state; 
	@Column
	private String city; 

	@ManyToOne
	@JoinColumn(name = "policy_no")

	private LifeInsurance lifeinsurance;

	/**
	 * @return the nominee_id
	 */
	public String getNominee_id() {
		return nominee_id;
	}

	/**
	 * @param nominee_id the nominee_id to set
	 */
	public void setNominee_id(String nominee_id) {
		this.nominee_id = nominee_id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the relation_with_life_assured
	 */
	public String getRelation_with_life_assured() {
		return relation_with_life_assured;
	}

	/**
	 * @param relation_with_life_assured the relation_with_life_assured to set
	 */
	public void setRelation_with_life_assured(String relation_with_life_assured) {
		this.relation_with_life_assured = relation_with_life_assured;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

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

}
