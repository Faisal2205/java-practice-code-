package com.banking.system;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingAccount saving = new SavingAccount(15000.00);
		CurrentAccount current = new CurrentAccount(150000.00);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Saving Account--> Enter Your Deposit Amount: ");
		double deposit = scanner.nextDouble();
		saving.depositMoney(deposit);
		
		System.out.println();
		System.out.println(saving.checkingBalance());
		
		System.out.print("Saving Account--> Enter Your Withdraw Amount: ");
		double withdraw = scanner.nextDouble();	
		saving.withdrawMoney(withdraw);
		
		System.out.println();
		System.out.println(saving.checkingBalance());
	}

}
