package com.online.payment.system;

public interface PaymentGateway {

	default void validateTransaction()
	{
		Log("Validate Transaction...");
		System.out.println("Transaction Validated!");
	}
	
	static void checkServiceStatus()
	{
		Log("Payment Service is Active.");
	}

	private static void Log(String message)
	{
		System.out.println("[LOG]" + message);
	}
	void processPayment(double amount);
}
