package com.spring.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean("user")
	public User createUser()
	{
	    User user = new User();
	    user.setFirstName("Mohd");
	    user.setLastName("Faisal");
	    user.setEmail("mohdfaisal2216@gmail.com");
	    user.setPassword("Faisal@123");
	    
	    return user;
	}
	
	@Bean("employee")
	public Employee createEmployee()
	{
		Employee emp = new Employee();
		emp.setEmployeeName("Faisal");
		emp.setEmployeeSal(150000);
		
		return emp;
	}
}
