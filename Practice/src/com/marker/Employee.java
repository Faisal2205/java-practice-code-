package com.marker;

public class Employee implements Cloneable {
	
	int emp_id;
	String name;
	
	public Employee(int emp_id, String name)
	{
		this.emp_id = emp_id;
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

}
