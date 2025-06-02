package com.kode.main.beans;

public class Employee {

	private String firstName;
	private String lastName;
	private EmployeeSalary empSalary;
	
	
	
	public Employee(String firstName, String lastName, EmployeeSalary empSalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.empSalary = empSalary;
	}



	public String toString() {
		return "FirstName: "+firstName + " LastName: "+ lastName+" "+empSalary;
	}
	
}
