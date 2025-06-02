package com.spring.sample;

public class Employee {

	private String employeeName;
	private int employeeSal;
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeSal() {
		return employeeSal;
	}
	public void setEmployeeSal(int employeeSal) {
		this.employeeSal = employeeSal;
	}
	
	public void empDetails()
	{
	System.out.println("Name: "+ employeeName + " and Salary: " + employeeSal);
	}
}
