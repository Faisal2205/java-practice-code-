package com.myntra.discount;

class Guest extends User{

	
	public double calculateDiscount(double amount)
    {
  	  return 0.10*amount;
    }
}
