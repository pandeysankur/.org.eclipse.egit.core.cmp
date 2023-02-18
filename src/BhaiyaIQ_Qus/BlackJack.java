package BhaiyaIQ_Qus;

public class BlackJack {

	public static int blackjack(int a, int b) {
		if (a > 21 && b > 21) {
			return 0;
		} else if (a > 21) {
			return b;
		} else if (b > 21) {
			return a;
		}
		int sumA = 21 - a;
		int sumB = 21 - b;

		if (sumA > sumB) {
			return b;
		}
		return a;
	}
	public static void main(String[] args) {
		int jack = blackjack(8, 9);
		System.out.println(jack);

	}

}
