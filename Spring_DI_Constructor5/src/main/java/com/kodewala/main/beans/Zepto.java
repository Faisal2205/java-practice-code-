package com.kodewala.main.beans;

public class Zepto {

	private int zeptoId;
	
	private ZeptoOrders orders;

	public Zepto(int zeptoId, ZeptoOrders orders) {
		this.zeptoId = zeptoId;
		this.orders = orders;
	}
	
	public String toString()
	{
		return "Id: "+zeptoId+orders;
	}
	
}
