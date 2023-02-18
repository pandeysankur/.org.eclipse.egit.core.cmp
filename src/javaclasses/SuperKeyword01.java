package javaclasses;

public class SuperKeyword01 {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
	}

}

class Animal {
	void eat() {
		System.out.println("eating");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("eating bread");
		super.eat();
	}

}
