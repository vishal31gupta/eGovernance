package org.eGovernance.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

import org.bson.types.ObjectId;

import lombok.Data;

@Document
public @Data class UserDetails {

	
	@Id 
	private String id;
	private String firstName;
	private String lastName;
	private String userName;
	private String hNo;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private int pin;
	private String email;
	private int mobileNo;
	private String password;
	private String role;
	private boolean activeFlg;
	
	
}
