package com.kodewala.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.main.beans.User;
import com.kodewala.main.beans.UserAddress;

@Configuration
public class Config {

	@Bean
	public User createUser()
	{
		User user = new User(101, "Mohd Faisal", createAdd());
			return user;
	}
	
	@Bean
	public UserAddress createAdd()
	{
		UserAddress userAddress = new UserAddress("29th main, 20th cross, Bangalore, India");
		return userAddress;
	}
}
