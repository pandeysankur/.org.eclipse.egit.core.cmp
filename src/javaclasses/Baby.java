package javaclasses;

public class Baby {
	void sound() {
		System.out.println("Baby Cry Sound");
	}

	void sound(String wrist) {
	if (wrist.equalsIgnoreCase("open")) {
		System.out.println("Cry for the Food");
	}
	else if (wrist.equalsIgnoreCase("close")) {
		System.out.println("Cry for the Poti");
	}	
	else {
		System.out.println("Nothing");
	}
	}
	void sound(Boolean slap) {
		if(slap==true) {
			System.out.println("Baby will be Cry");
		}
		if(slap==false) {
			System.out.println("Baby Happy With You & Smile ");
		}
	}
	void sound (Object normalSound) {
		System.out.println("Normal Sound");
	}
}


	


