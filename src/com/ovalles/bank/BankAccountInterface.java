package com.ovalles.bank;
public interface BankAccountInterface {
	public double checkBalance();
	public void deposit(double amount);
	public void withdraw(double amount);
	public void deactivate();
	public void activate();
}
