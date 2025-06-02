package com.kodewala.main.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {

	@Value("101")
	private int id;
	
	@Value("Faisal")
	private String userName;
	
	@Value("Password@123")
	private String password;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void show()
	{
		System.out.println("id: "+id + " userName: "+userName+" password: "+password);
	}
	
}
