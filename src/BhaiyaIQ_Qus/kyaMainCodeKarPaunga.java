package BhaiyaIQ_Qus;

public class kyaMainCodeKarPaunga {

	public static void main(String[] args) {

		String str1 = "kya main code kar paunga";
		char[] arr = str1.toCharArray();

		int wordCount = 1;

		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == ' ') {
				wordCount++;
			}
		}

		System.out.println("Word count is = " + wordCount);
	}

}
