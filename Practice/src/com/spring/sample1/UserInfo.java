package com.spring.sample1;

public class UserInfo {

	private int id;
	private String name;
	private String mobileNo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public void userInfo()
	{
		System.out.println("Id: "+id + " User_Name: "+name+ " Mobile No: "+mobileNo);
	}
	
}
