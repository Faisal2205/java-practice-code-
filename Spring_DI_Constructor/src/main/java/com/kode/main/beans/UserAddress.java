package com.kode.main.beans;

public class UserAddress {

	private String city;
	private String country;
	
	public UserAddress(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}
	
	public String toString()
	{
		return " City:" +city+ " Country: "+country;
	}
	
}
