package com.challenge1;

import java.util.Scanner;

public class FloatingMultiplication {
	public static void main(String[] args)
	{
		System.out.println("Welcom to the Floating Multiplication \n");
		
		System.out.print("Enter First Number : ");
		Scanner firstNo = new Scanner(System.in);
		float first = firstNo.nextFloat();
		
		System.out.print("Enter Second Number : ");
		Scanner secondNo = new Scanner(System.in);
		float second =  secondNo.nextFloat();
		
		System.out.print("The Multiplication is : "+ (first*second));
			
	}

}
