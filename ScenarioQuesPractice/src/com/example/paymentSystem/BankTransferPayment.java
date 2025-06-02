package com.example.paymentSystem;

public class BankTransferPayment implements PaymentMethod{
	public void processPayment(double amount)
    {
		System.out.println("Processing Bank Transfer Payment of $"+amount);
    }

}
