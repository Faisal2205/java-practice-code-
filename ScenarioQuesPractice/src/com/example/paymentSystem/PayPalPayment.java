package com.example.paymentSystem;

public class PayPalPayment implements PaymentMethod {
	public void processPayment(double amount)
    {
		System.out.println("Processing PayPal Payment of $"+amount);
    }

}
