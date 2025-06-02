package com.challenge1;

import java.util.Scanner;

public class ArithmeticCalculator {
	public static void addition(int n1, int n2)
	{
		System.out.println("Addition = " + (n1+n2));
	}
	public static void substraction(int n1, int n2)
	{
		System.out.println("Substraction = " + (n1-n2));
	}
	public static void multiplication(int n1, int n2)
	{
		System.out.println("Multiplication = " + (n1*n2));
	}
	public static void division(int n1, int n2)
	{
		System.out.println("Division = " + (n1/n2));
	}
     public static void main(String[] args)
     {
    	 System.out.println("Welcome to the Arithmetic Calculator \n");
    	 System.out.print("Enter your First Number : ");
    	 Scanner sc1 = new Scanner(System.in);
    	 int no1 = sc1.nextInt();
    	 System.out.print("Enter your Second Number : ");
    	 Scanner sc2 = new Scanner(System.in);
    	 int no2 = sc2.nextInt();
    	 addition(no1,no2);
    	 substraction(no1,no2);
    	 multiplication(no1,no2);
    	 division(no1,no2);
     }
}
