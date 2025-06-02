package com.kodewala.main.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.main.beans.Employee;
import com.kodewala.main.beans.InsuranceInfo;
import com.kodewala.main.beans.SalaryInfo;

@Configuration
public class SpringConfig {

	@Bean("emp")
	public Employee createEmp()
	{
		Employee emp = new Employee();;
		emp.setName("kodewala");
		emp.setEmail("kw@kodewala.com");
		
		emp.setSalaryInfo(createSalaryInfo());
		emp.setInsuranceInfo(creatInsuranceInfo());
		return emp;
		
		
	}
	
	@Bean
	public SalaryInfo createSalaryInfo()
	{
		SalaryInfo salaryInfo = new SalaryInfo();
		salaryInfo.setBaseSal("1500000");
		salaryInfo.setTotalSal("1800000");
		
		return salaryInfo;
	}
	
	@Bean
	public InsuranceInfo creatInsuranceInfo()
	{
		InsuranceInfo insuranceInfo = new InsuranceInfo();
		insuranceInfo.setTotalCoverage("1000000");
		return insuranceInfo;
	}
}
