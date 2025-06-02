package com.oops.concept;

class Employee extends Person {
	
	int employeeId;
	Car car;
	
	public Employee(int employeeId,Car car,String name, String age)
	{
		super(name,age);
		this.employeeId=employeeId;
		this.car=car;
	}
 
	void showEmployeeDetails()
	{
		introduce();
		System.out.println("Employee Id: "+employeeId);
		car.showCarDetails();
	}
}
