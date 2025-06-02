package com.kodewala.main.beans;

public class User {

	private int id;
	private String userName;
	
	private UserAddress address;

	public User(int id, String userName, UserAddress address) {
		this.id = id;
		this.userName = userName;
		this.address = address;
	}
	
	public String toString()
	{
		return "Id: "+id + " UserName: "+userName + address;
	}
}
