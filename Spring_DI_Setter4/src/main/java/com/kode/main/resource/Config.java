package com.kode.main.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kode.main.beans.UserAddress;
import com.kode.main.beans.UserInfo;

@Configuration
public class Config {

	@Bean
	public UserInfo createUser()
	{
		UserInfo userInfo = new UserInfo();
		
		userInfo.setAge(24);
		userInfo.setMobileNo("8707566125");
		userInfo.setUserName("Faisal");
		userInfo.setUserAddress(createAdd());
		return userInfo;
	}
	
	@Bean
	public UserAddress createAdd()
	{
		UserAddress userAddress = new UserAddress();
		userAddress.setAddress1("23 main 27 cross");
		userAddress.setAddress2("BTM");
		userAddress.setCity("Bangalore");
		return userAddress;
	}
	
}
