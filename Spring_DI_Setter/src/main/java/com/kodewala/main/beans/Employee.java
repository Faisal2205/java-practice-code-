package com.kodewala.main.beans;

public class Employee {

	private String firstName;
	private String lastName;
	private String email;
	
	private Address address;
	private SalaryInfo salaryInfo;
	
	

	public SalaryInfo getSalaryInfo() {
		return salaryInfo;
	}

	public void setSalaryInfo(SalaryInfo salaryInfo) {
		this.salaryInfo = salaryInfo;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String toString()
	{
		return "firstName= "+firstName +" lastName= "+lastName+" email= "+email+ " address= "+address+ " salary= "+salaryInfo;
	}
}
