package com.banking.system;

public interface BankAccount {
	
	public static final double MIN_BALANCE=1000;

	public abstract void depositMoney(double amount);
	public abstract void withdrawMoney(double amount);
	public abstract double checkingBalance();
	
}
