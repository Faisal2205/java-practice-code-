package com.kodewala.main.beans;


public class SalaryInfo {

	private double salary;

	public SalaryInfo(double salary) {
		super();
		this.salary = salary;
	}
	
	public String toString()
	{
		return "Salary: "+salary;
	}
}
