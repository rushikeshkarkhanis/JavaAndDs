package com.rk.model;

public class Account {

	private int deposit;
	private int balance = 10000;
	private int accountNumber;
	private int ifsc_code;
	private int branch_name;

	public int getBalance() {

		return balance;
	}

	public void withdraw(int amount) {

		balance = balance - amount;
	}

	public void deposit(int deposit) {

		balance = balance + deposit;
	}
}
