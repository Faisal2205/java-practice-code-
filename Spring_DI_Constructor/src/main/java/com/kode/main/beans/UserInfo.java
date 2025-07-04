package com.kode.main.beans;

public class UserInfo {

	private String userName;
	private String password;
	
	private UserAddress userAddress;
	
	public UserInfo(String userName, String password, UserAddress userAddress) {
		this.userName = userName;
		this.password = password;
		this.userAddress = userAddress;
	}

	public String toString()
	{
		return "Username: "+userName + " Password: "+password + userAddress;
	}
}
