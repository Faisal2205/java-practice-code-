package com.kodewala.main.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Value("kodewala")
	private String firstName;
	@Value("academy")
	private String lastName;
	
	
	
	
	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public void show()
	{
		System.out.println("FName: "+firstName+" Lname:"+ lastName);
	}
}
