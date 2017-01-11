package com.ovalles.bank;

public class BankAccount implements BankAccountInterface {
	private String accountHolder = "";
	private double balance;
	private boolean isDeactivated = false; 
	

	@Override
	public double checkBalance() {
		if(isDeactivated)
		return balance;
		else 
			return 0; 
	}

	@Override
	public void deposit(double amount) {
		if(isDeactivated) 
			balance += amount;
	}

	@Override
	public void withdraw(double amount) {
		if(isDeactivated)
			balance -= amount;
	}

	@Override
	public void deactivate() {
		isDeactivated = true; 
		
	}

	@Override
	public void activate() {
		isDeactivated = false; 
		
	}


	public String getAccountHolder() {
		return accountHolder;
	}


	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	
}
