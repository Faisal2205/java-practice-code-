package com.kodewala.main.beans;

public class Address {

	private String line1;
	private String line2;
	private String city;
	private String pinCode;
	
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	public String toString()
	{
		return "Line1= "+line1 +" Line2= "+line2+" City= "+city+ " pinCode= "+pinCode;
	}
}
