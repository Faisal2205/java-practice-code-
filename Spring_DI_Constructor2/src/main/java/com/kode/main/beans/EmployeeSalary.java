package com.kode.main.beans;

public class EmployeeSalary {

	private double baseSal;
	private double totSal;
	
	
	
	public EmployeeSalary(double baseSal, double totSal) {
		this.baseSal = baseSal;
		this.totSal = totSal;
	}



	public String toString() {
		return "BaseSalary: "+baseSal+" TotalSalary: "+totSal;
	}
}
