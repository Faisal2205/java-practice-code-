package com.thread;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SharedData sharedData = new SharedData();
		
		PrintEvenNumber even = new PrintEvenNumber(sharedData);
		PrintOddNumber odd = new PrintOddNumber(sharedData);
		
		even.start();
		odd.start();
	}

}
