package com.kodewala.main.reso;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.main.beans.Zepto;
import com.kodewala.main.beans.ZeptoOrders;

@Configuration
public class Configg {

	@Bean
	public Zepto createZepto()
	{
		Zepto zepto = new Zepto(101, zeptoOrders());
		return zepto;
	}
	
	@Bean
	public ZeptoOrders zeptoOrders()
	{
		ZeptoOrders zOrders =new ZeptoOrders("MSI", "MSI is a Laptop");
		return zOrders;
	}
}
