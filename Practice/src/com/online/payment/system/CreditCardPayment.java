package com.online.payment.system;

public class CreditCardPayment implements PaymentGateway {
	@Override
	public void processPayment(double amount)
	{
		System.out.println("Paid $" + amount + " via Credit Card.");
	}

}
