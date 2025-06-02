package com.banking.system;

public class CurrentAccount implements BankAccount {
	
	private double balance;
	
	public CurrentAccount(double balance)
	{
		this.balance = balance;
	}
	
	public void depositMoney(double amount)
	{
		balance+=amount;
		
		System.out.println("Deposited " + amount+" in Current Account. New Balance: "+balance);
	}
	
	public void withdrawMoney(double amount)
	{
		balance-=amount;
		System.out.println("Withdraw " + amount+" from Current Account. New Balance: "+balance);
	}
	
	public  double checkingBalance()
	{
		return balance;
	}

}
