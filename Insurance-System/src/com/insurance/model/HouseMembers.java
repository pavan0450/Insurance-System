package com.insurance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "housemembers")
public class HouseMembers {
	@Id
	@Column
    private String member_id;
	@Column
	private String name;
	@Column
	private String gender; 
	@Column
	private String dob; 
	@Column
	private String occupation; 

	@ManyToOne
	@JoinColumn(name = "policy_no")

	private HouseInsurance houseinsurance;

}
