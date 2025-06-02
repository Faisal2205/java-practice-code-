package com.kode.main.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kode.main.beans.UserAddress;
import com.kode.main.beans.UserInfo;

@Configuration
public class Config {

	@Bean
	public UserInfo user()
	{
		UserInfo userInfo = new UserInfo("faisal@123", "Abcd@1234", address());
		return userInfo;	
	}
	@Bean
	public UserAddress address() {
		UserAddress userAddress = new UserAddress("Bangalore", "India");
		return userAddress;
	}
}
