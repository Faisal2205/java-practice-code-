package com.kodewala.main.resource;

import org.springframework.context.annotation.Bean;

import com.kodewala.main.beans.Employee;
import com.kodewala.main.beans.SalaryInfo;

public class Config {

	@Bean
	public Employee createEmp()
	{
		Employee employee = new Employee(101, "Faisal");
		return employee;
	}
	
	@Bean
	public SalaryInfo createSalary()
	{
		SalaryInfo salaryInfo = new SalaryInfo(1500000);
		return salaryInfo;
	}
}
