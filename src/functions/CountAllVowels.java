package functions;

import java.util.Scanner;

public class CountAllVowels {

	public static void main(String[] args) {
		countVowels(input());
	}

	public static String input() {

		Scanner scanner = new Scanner(System.in);
		String word;
		System.out.println("Print in something");
		word = scanner.nextLine();
		return word;
	}

	public static void countVowels(String word) {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'y' };

		int sum = 0;

		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (("" + word.charAt(i)).equalsIgnoreCase("" + vowels[j]))
				sum++;
			}
		}
		System.out.println(sum);
	}
}