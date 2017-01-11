package com.ovalles.bank;

public class BankOfIsabel {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		System.out.println("Balance = $" + account.checkBalance()); 
		account.setAccountHolder("Isabel");
		System.out.println("The account is in " + account.getAccountHolder() + "'s name.");
	}

}
