package com.rk.customer;

import java.util.Scanner;

import com.rk.model.Account;

public class AccountHolder implements Runnable {

	private Account account;

	@SuppressWarnings("unused")
	public static String name;
	@SuppressWarnings("unused")
	private int amount;

	private String yesno;
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);

	public AccountHolder(Account account) {
		this.account = account;
	}

	public void getDetails() {

		System.out.println("Please enter your name");
		name = sc.nextLine();

		System.out.println("Please enter the amount");
		amount = sc.nextInt();
	}

	@SuppressWarnings("resource")
	private synchronized void makeWithDraw(int withDrawAmount) {

		if (account.getBalance() >= withDrawAmount) {
			System.out.println(Thread.currentThread().getName() + "\tis withdrawing from Acccount\t" + withDrawAmount);
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
			}
			account.withdraw(withDrawAmount);
			System.out.println(Thread.currentThread().getName() + "\tWithDrawed\t" + withDrawAmount);

			System.out.println("Do you want to check balance");
			Scanner sc1 = new Scanner(System.in);
			yesno = sc1.nextLine();
			if (yesno.equalsIgnoreCase("y")) {
				System.out.println("Current balance is \t" + account.getBalance());
				System.out.println("Do you want to make transaction again");
				Scanner sc2 = new Scanner(System.in);
				String yn = sc2.nextLine();
				if (yn.equalsIgnoreCase("y")) {
					getDetails();
					makeWithDraw(withDrawAmount);
				} else {
					System.exit(0);
				}
				System.exit(0);
			} else {
				System.exit(0);
			}
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
			}
		} else {
			System.out.println("No funds \t" + withDrawAmount + "   " + Thread.currentThread().getName());
			System.out.println("Current balance is \t" + account.getBalance());
		}
	}

	@Override
	public void run() {

		for (int i = 0; i <= 1; i++) {

			makeWithDraw(amount);

			if (account.getBalance() < 0) {

				System.out.println("account is overdrawen");
			}
		}

	}
}
