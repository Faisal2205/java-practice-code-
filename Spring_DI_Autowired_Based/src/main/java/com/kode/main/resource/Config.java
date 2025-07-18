package com.kode.main.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kode.main.beans.EmpSalary;
import com.kode.main.beans.Employee;

@Configuration
public class Config {
	
	@Bean
	public Employee createEmp() {
		Employee employee = new Employee("Mohd","Faisal");
		return employee;
	}
	
	@Bean
	public EmpSalary createSal()
	{
		EmpSalary empSalary = new EmpSalary(1500000.00);
		return empSalary;
	}

}
