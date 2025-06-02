package com.challenge1;

public class ExceptionExamples {
	public static void validateAge(int n) throws IllegalArgumentException
	{
		if(n<18)
		{
			throw new IllegalArgumentException ("Age must be 18 or above.");
		}
		else
		{
			System.out.print("Age is valid.");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			validateAge(16);
		}
		catch(IllegalArgumentException ex)
		{
			System.out.println("Cought Exception: " + ex.getMessage());
		}
		System.out.println("Program will continue...");
	}

}
