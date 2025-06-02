package com.challenge1;

import java.util.Scanner;

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String message)
	{
		super(message);
	}
}

public class ExceptionExample {
	
	public static void validateAge(int n) throws InvalidAgeException
	{
		
		if(n>=18)
		{
			System.out.println("Congratulation You are Eligible.");
		}
		else
		{
			throw new InvalidAgeException("Age is must be 18 or above");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.print("Enter Your Age : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		try
		{
			validateAge(n);
		}
			
		catch(InvalidAgeException iae)
		{
			System.out.println("Caught Exception : "+ iae.getMessage());
		}
		
		System.out.println("The program will continue....");
	}

}
