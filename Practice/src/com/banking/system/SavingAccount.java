package com.banking.system;

public class SavingAccount implements BankAccount {
	
	private double balance;
	
	public SavingAccount(double balance)
	{
		this.balance = balance;
	}

//	public SavingAccount(double balance2) {
//		// TODO Auto-generated constructor stub
//	}

	public void depositMoney(double amount)
	{
		balance += amount;
		System.out.println("Deposited " + amount+" in Saving Account. New Balance: "+balance);
	}
	
	public void withdrawMoney(double amount)
	{
		if(balance-amount>=MIN_BALANCE)
		{
		   balance-=amount;
		   System.out.println("Withdraw " + amount+" from Saving Account. New Balance: "+balance);
		}
		else
		{
			System.out.println("Insufficient Balance...");
		}
	}
	
	@Override
	public  double checkingBalance()
	{
		return balance;
	}
}
