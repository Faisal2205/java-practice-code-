package com.kodewala.main.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.main.beans.Employee;
import com.kodewala.main.beans.SalaryInfo;

@Configuration
public class SpringConfig {
	
	@Bean
	public Employee createEmp()
	{
		Employee employee = new Employee("Faisal",createEmpSal());
		return employee;
	}
	
	public SalaryInfo createEmpSal()
	{
		SalaryInfo salaryInfo = new SalaryInfo(120000);
		return salaryInfo;
	}

}
