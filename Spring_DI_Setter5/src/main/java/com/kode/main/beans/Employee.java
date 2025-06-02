package com.kode.main.beans;

public class Employee {

	private String empName;
	private EmployeeSalary empSal;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public EmployeeSalary getEmpSal() {
		return empSal;
	}
	public void setEmpSal(EmployeeSalary empSal) {
		this.empSal = empSal;
	}
	
	public String toString()
	{
		return "EmployeeName: "+ empName + " "+ empSal;
	}
}
