package javaclasses;

public class SuperKeyWord {

	public static void main(String[] args) {
		Main obj = new Main();
	}

}

class Languages {

	Languages(int version1, int version2) {

		if (version1 > version2) {
			System.out.println("The latest version is: " + version1);
		}

		else {
			System.out.println("The latest version is: " + version2);
		}

	}
}

class Main extends Languages {

	Main() {

		super(12, 12);
	}

}
