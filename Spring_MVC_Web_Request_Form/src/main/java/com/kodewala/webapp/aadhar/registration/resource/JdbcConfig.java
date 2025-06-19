package com.kodewala.webapp.aadhar.registration.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JdbcConfig {

		@Bean
		public DriverManagerDataSource createDataSource()
		{
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
			dataSource.setUrl("jdbc:mysql://localhost:3306/Student_info");
			dataSource.setUsername("root");
			dataSource.setPassword("Password@123");
			
			return dataSource;
		}
		
		@Bean
		public JdbcTemplate createJdbcTemplate()
		{
			JdbcTemplate template = new JdbcTemplate();
			template.setDataSource(createDataSource());
			return template;
		}
		
}

