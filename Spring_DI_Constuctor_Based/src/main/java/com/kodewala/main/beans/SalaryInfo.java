package com.kodewala.main.beans;

public class SalaryInfo {

	private int baseSal;

	public SalaryInfo(int baseSal) {
		this.baseSal = baseSal;
	}
	
	@Override
	public String toString()
	{
		return " Employee_Salary: " + baseSal;
	}
	
}
