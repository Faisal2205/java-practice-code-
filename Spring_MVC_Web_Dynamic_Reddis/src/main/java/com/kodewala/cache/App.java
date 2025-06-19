package com.kodewala.cache;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.kodewala.cache.config.RedisConfig;
import com.kodewala.cache.service.UserInfoService;

public class App {
	
	public void doConnection(String confirmation)
	{
	    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	    context.register(RedisConfig.class);
	    context.refresh();

	    UserInfoService userInfoService = context.getBean(UserInfoService.class);
	/*
	 * System.out.println(service.getProductById("1006")); // takes 2 sec
	 * 
	 * System.out.println(service.getProductById("1006")); // returns instantly
	 * (from Redis cache)
	 */

	System.out.println(" First Request : " + userInfoService.getConfirmationMessage(confirmation));

	System.out.println(" 2nd Request : " + userInfoService.getConfirmationMessage(confirmation));
	   context.close();
	}
}
