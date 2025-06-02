package com.example.paymentSystem;

public class PaymentProcessor {
	private PaymentMethod paymentMethod;
	
	public PaymentProcessor(PaymentMethod paymentMethod)
	{
		this.paymentMethod = paymentMethod;
	}
	public void pay(double amount)
	{
		paymentMethod.processPayment(amount);
	}
//	public void pay(double amount) {
//		// TODO Auto-generated method stub
//		paymentMethod.processPayment(amount);
//	}
}
