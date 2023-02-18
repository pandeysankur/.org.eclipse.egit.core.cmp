package com.ObjectAndClasses;

public class AcMain {

	public static void main(String[] args) {
		Account ac1 = new Account();
		ac1.insert(123456789, "Ankur Kumar Pandey", 1000f);
		System.out.println("-------------------------");
		ac1.display();
		ac1.blanceCheck();
		System.out.println("-------------------------");
		ac1.deposit(1000f);
		ac1.blanceCheck();
		System.out.println("-------------------------");
		ac1.withdrow(500f);
		ac1.blanceCheck();
		System.out.println("-------------------------");

	}

}
