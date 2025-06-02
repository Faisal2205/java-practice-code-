package com.kodewala.main.beans;

public class Employee {

	private String name;
	private String email;
	private SalaryInfo salaryInfo;
	private InsuranceInfo insuranceInfo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public SalaryInfo getSalaryInfo() {
		return salaryInfo;
	}
	public void setSalaryInfo(SalaryInfo salaryInfo) {
		this.salaryInfo = salaryInfo;
	}
	public InsuranceInfo getInsuranceInfo() {
		return insuranceInfo;
	}
	public void setInsuranceInfo(InsuranceInfo insuranceInfo) {
		this.insuranceInfo = insuranceInfo;
	}
}
