package com.kode.main.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kode.main.beans.Employee;
import com.kode.main.beans.EmployeeSalary;

@Configuration
public class Config {

	@Bean
	public Employee createEmp()
	{
		Employee employee = new Employee();
		employee.setEmpName("Faisal");
		employee.setEmpSal(createSal());
		return employee;
	}
	
	@Bean
	public EmployeeSalary createSal()
	{
		EmployeeSalary employeeSalary = new EmployeeSalary();
		employeeSalary.setSalary("1,500,000");
		return employeeSalary;
	}
}
