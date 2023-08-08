package com.tiaa.w1q2;

import java.util.*;

public class BankManagement {

	public static void main(String[] args) {
		ArrayList<BankAccount> bankaccounts = new ArrayList<BankAccount>();
		Scanner scanner = new Scanner(System.in);
		
		// Add accounts
		char choice = 'y';
		
		while(choice != 'n') {
			System.out.println("Enter the details to create bank account: ");
			
	        System.out.print("Enter ID: ");
	        int id = scanner.nextInt();

	        System.out.print("Enter Name: ");
	        String name = scanner.next();

	        System.out.print("Enter Balance: ");
	        float balance = scanner.nextFloat();
	        
	        BankAccount bankAccount = new BankAccount(id, name, balance);
	        
	        bankaccounts.add(bankAccount);
	        
	        System.out.println("Enter 'n' to stop, 'y' to add more: ");
	        choice = scanner.next().charAt(0);
		}
		
		// Show All accounts
		for(int i=0; i<bankaccounts.size(); i++) {
			System.out.println(bankaccounts.get(i).toString());
		}
		
		// Fetch account to perform actions
		System.out.println("Enter the account id to be fetched!");
		int currId = scanner.nextInt();
		
		BankAccount currBankAccount = null;
		for(int i=0; i<bankaccounts.size(); i++) {
			if(bankaccounts.get(i).getId() == currId) {
				currBankAccount = bankaccounts.get(i);
			}
		}
		
		if(currBankAccount == null) {
			// If invalid id is entered
			System.out.println("Invalid bank account id entered");
		} else {
			System.out.println("Bank account found!");
			
			// Print Current Account selected
			System.out.println(currBankAccount.toString());
			
			// Deposit
			System.out.println("Enter amount to deposit: ");
			float depoBal = scanner.nextFloat();
			
			String depositstatement = currBankAccount.deposit(depoBal);
			System.out.println(depositstatement);
			
			// Withdraw
			System.out.println("Enter amount to withdraw: ");
			float withdrawBal = scanner.nextFloat();
			
			String withdrawstatement = currBankAccount.withdraw(withdrawBal);
			System.out.println(withdrawstatement);
			
		}
		
		scanner.close();
		System.exit(1);

	}

}
