package com.example.paymentSystem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		PaymentProcessor processor1 = new PaymentProcessor(new CreditCardPayment());
		processor1.pay(1000.0000);
		PaymentProcessor processor2 = new PaymentProcessor(new PayPalPayment());
		processor2.pay(2500.0000);
		PaymentProcessor processor3 = new PaymentProcessor(new BankTransferPayment());
		processor3.pay(1300.0000);
	}

}
