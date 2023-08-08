package com.tiaa.w1q2;

public class BankAccount {
	
	private int id;
	private String name;
	private float balance;
	
	public BankAccount(int id, String name, float balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	public String withdraw(float amount) {
		if(this.balance < amount) {
			return "Insufficient balance";
		}
		
		if(amount % 100 != 0) {
			return "Withdraw in multiples of 100 only";
		}
		
		this.balance -= amount;
		
		return amount + " units withdrawn, updated balance = " + this.balance;
	}
	
	public String deposit(float amount) {
		if(amount < 0) {
			return "Negative balance cant be deposited";
		}
		
		if(amount % 100 != 0) {
			return "Deposit in multiples of 100 only";
		}
		
		this.balance += amount;
		
		return amount + " units deposited, updated balance = " + this.balance;
	}

}
