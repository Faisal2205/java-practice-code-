package com.kode.main.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private String firstName;
	private String SecondName;
	
	@Autowired
	private EmpSalary empSalary;

	public Employee(String firstName, String secondName) {
	
		this.firstName = firstName;
		SecondName = secondName;
	}
	
	public String toString()
	{
		return "firstName: "+firstName + " LastName: "+SecondName + " "+empSalary;
	}
}
