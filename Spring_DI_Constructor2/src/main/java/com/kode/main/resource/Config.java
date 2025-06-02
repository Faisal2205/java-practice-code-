package com.kode.main.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kode.main.beans.Employee;
import com.kode.main.beans.EmployeeSalary;

@Configuration
public class Config {

	@Bean
	public Employee createEmp() {
		Employee employee = new Employee("Mohd", "Faisal", createSal());
		return employee;
	}
	
	@Bean
	public EmployeeSalary createSal() {
		EmployeeSalary employeeSalary = new EmployeeSalary(120000, 1500000);
		return employeeSalary;
	}
}
