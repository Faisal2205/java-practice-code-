package com.myntra.discount;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User vip = new VIP();
		User regular = new Regular();
		User guest = new Guest();
		
		double amount = 1000;
		System.out.println("Vip Discount: $"+vip.calculateDiscount(amount));
		System.out.println("Regular Discount: $"+regular.calculateDiscount(amount));
		System.out.println("Guest Discount: $"+guest.calculateDiscount(amount));
		
	}

}
