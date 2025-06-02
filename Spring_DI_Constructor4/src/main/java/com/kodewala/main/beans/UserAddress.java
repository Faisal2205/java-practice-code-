package com.kodewala.main.beans;

public class UserAddress {

	private String address;

	public UserAddress(String address) {
		this.address = address;
	}
	
	public String toString()
	{
		return " Address: "+address;
	}
	
}
