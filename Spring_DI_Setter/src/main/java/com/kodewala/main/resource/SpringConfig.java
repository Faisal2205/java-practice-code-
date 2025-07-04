package com.kodewala.main.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.main.beans.Address;
import com.kodewala.main.beans.Employee;
import com.kodewala.main.beans.SalaryInfo;

@Configuration
public class SpringConfig {

	@Bean
	public Employee createEmp()
	{
		Employee employee = new Employee();
		employee.setFirstName("Mohd");
		employee.setLastName("Faisal");
		employee.setEmail("mohdfaisal2216@gmail.com");
		employee.setAddress(createAdd());
		employee.setSalaryInfo(createSal());
		
		return employee;
	}
	
	@Bean
	public Address createAdd()
	{
		Address address = new Address();
		address.setLine1("23 main");
		address.setLine2("28 cross");
		address.setCity("Bangalore");
		address.setPinCode("560066");
		return address;
	}
	
	@Bean
	public SalaryInfo createSal()
	{
		SalaryInfo salaryInfo = new SalaryInfo();
		salaryInfo.setBaseSal(1500000.00);
		salaryInfo.setTotalSal(1800000.00);
		salaryInfo.setStock(200000.00);
		
		return salaryInfo;
	}
}
