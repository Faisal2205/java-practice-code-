package com.kode.main.beans;

public class EmpSalary {

	private double salary;

	public EmpSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString()
	{
		return "Salary: "+salary;
	}
}
