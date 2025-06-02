package com.kode.main.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kode.main.beans.Employee;
import com.kode.main.beans.SalaryDetails;

@Configuration
public class SpringConfig {

	@Bean("employee")
	public Employee createEmp()
	{
		Employee employee = new Employee();
		employee.setEmpName("Faisal");
		employee.setEmail("abcd@gmail.com");
		employee.setSalaryDetails(createSal());
		
		return employee;
	}
	
	@Bean
	public SalaryDetails createSal()
	{
		SalaryDetails salaryDetails= new SalaryDetails();
		salaryDetails.setBaseSalary(1500000);
		salaryDetails.setTotalSalary(1800000);
		return salaryDetails;
		
	}
	
}
