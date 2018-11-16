package arrays;

import java.util.Scanner;

public class GetTheCharacter {

	public static void main(String[] args) {

		char[] alphaNumbers = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int[] valAlphaNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 15, 16, 17, 18, 19, 20, 21, 22, 23,
				24, 25, 26 };

		Scanner scanner = new Scanner(System.in);

		while (true) {
			int sum = 0;
			System.out.print("Print in a letter or word: ");
			String input = scanner.nextLine();
			char[] inputCharArray = input.toCharArray();

			if (input.equalsIgnoreCase("quit")) {
				System.out.println("Exiting program!");
				System.exit(0);
			}

			for (int i = 0; i < inputCharArray.length; i++) {
				for (int j = 0; j < alphaNumbers.length; j++) {
					if (inputCharArray[i] == alphaNumbers[j]) {
						sum += valAlphaNumbers[j];
					}
				}
			}

			System.out.println("The letter(s) is number " + sum);
		}
	}

}
