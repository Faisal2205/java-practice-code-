package com.kodewala.main.resource;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JdbcConfig {
	
	@Bean
	public DriverManagerDataSource driverManagerDataSource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/Student_info");
		ds.setUsername("root");
		ds.setPassword("Password@123");
		
		return ds;
	}
	
	@Bean
	public JdbcTemplate createTemplate()
	{
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(driverManagerDataSource());
		
		return jdbcTemplate;
	}

}
