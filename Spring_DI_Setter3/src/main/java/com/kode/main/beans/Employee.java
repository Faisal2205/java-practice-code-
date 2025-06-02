package com.kode.main.beans;

public class Employee {

	private String empName;
	private String email;
	
	private SalaryDetails salaryDetails;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public SalaryDetails getSalaryDetails() {
		return salaryDetails;
	}

	public void setSalaryDetails(SalaryDetails salaryDetails) {
		this.salaryDetails = salaryDetails;
	}
	
}
