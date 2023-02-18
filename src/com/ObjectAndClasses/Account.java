package com.ObjectAndClasses;

public class Account {
	int accountNo;
	String accountHolderName;
	float amount;

	void insert(int ac, String name, float amt) {
		accountNo = ac;
		accountHolderName = name;
		amount = amt;

	}

	void deposit(float amt) {
		amount = amount + amt;
		System.out.println("Deposited:: " + amt);
	}

	void withdrow(float amt) {
		if (amount < amt) {
			System.out.println("Insuffcient Balence!");
		} else {
			amount = amount - amt;
			System.out.println("Withdrawn::" + amt);
		}
	}

	void blanceCheck() {
		System.out.println("Balence Is : " + amount);
	}

	void display() {
		System.out.println("Account No-"+accountNo+" Account Holder Name-"+ accountHolderName + " Amount-" + amount);

	}

}
