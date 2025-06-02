package com.online.payment.system;

public class PaymentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PaymentGateway.checkServiceStatus();
		
		PaymentGateway cc = new CreditCardPayment();
		cc.validateTransaction();
		cc.processPayment(1000.00);
		
		PaymentGateway upi = new UPIPayment();
		upi.validateTransaction();
		upi.processPayment(3000.00);

	}

}
