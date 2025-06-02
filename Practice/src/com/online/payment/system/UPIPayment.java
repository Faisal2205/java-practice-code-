package com.online.payment.system;

public class UPIPayment implements PaymentGateway{
	@Override
	public void processPayment(double amount)
	{
		System.out.println("Paid $" + amount + " via UPI Payment.");
	}

}
