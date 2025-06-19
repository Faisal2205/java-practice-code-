package com.kodewala.aadhar.registration.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UserInfo {

	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private String mobile;
	
	@Column
	private String address;
	
	@Column
	@Id
	private String confirmationNumber;
	
	
	
	public String getConfirmationNumber() {
		return confirmationNumber;
	}
	public void setConfirmationNumber(String confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
