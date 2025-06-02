package com.practice;

public class Practice {
	
	static int amount=100;
	
	static
	{
		System.out.println("abc");
		amount=200;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(amount);
	}

}
