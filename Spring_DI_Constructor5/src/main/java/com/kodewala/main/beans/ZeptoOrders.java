package com.kodewala.main.beans;

public class ZeptoOrders {

	private String ordersName;
	private String orderDetails;
	
	public ZeptoOrders(String ordersName, String orderDetails) {
		this.ordersName = ordersName;
		this.orderDetails = orderDetails;
	}
	
	public String toString()
	{
		return " Model Name: "+ordersName+ " Details: "+orderDetails;
	}
	
}
