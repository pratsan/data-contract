package com.hcl.homeinsurance.property.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address_info")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idaddress_info", unique = true, nullable = false)
	private long addressId;

	@Column(name = "city", length = 45)
	private String city;

	@Column(name = "state", length = 45)
	private String state;

	@Column(name = "zip", length = 45)
	private String zipCode;
	
	@Column(name="user_id")
	private long userId;
	
	@Column(name="property_id")
	private long PropertyId;

}
