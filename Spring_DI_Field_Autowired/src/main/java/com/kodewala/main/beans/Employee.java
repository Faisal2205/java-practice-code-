package com.kodewala.main.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private int empId;
	private String empName;
	
	@Autowired
	private SalaryInfo salaryInfo;

	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	
	public String toString()
	{
		return "Employee_Id: "+empId + " Employee_Name: "+empName +" "+salaryInfo;
	}	
}
