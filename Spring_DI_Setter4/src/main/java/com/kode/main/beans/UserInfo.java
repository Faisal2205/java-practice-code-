package com.kode.main.beans;

public class UserInfo {

	private String UserName;
	private int age;
	private String mobileNo;
	
	private UserAddress userAddress;
	
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public UserAddress getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(UserAddress userAddress) {
		this.userAddress = userAddress;
	}
	
	public String toString()
	{
		return "Name "+UserName+" Age: "+age + " MobileNo: "+mobileNo + " " + userAddress;
	}
	
	
}
