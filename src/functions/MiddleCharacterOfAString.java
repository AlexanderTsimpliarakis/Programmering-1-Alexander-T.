package functions;

import java.util.Scanner;

public class MiddleCharacterOfAString {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input your string");
		String inputTexts = in.nextLine();
		System.out.println("The character in the middle of the string is: " + middle(inputTexts) + "\n");

	}
		private static char middle(String inputText) {
			return inputText.charAt(inputText.length() / 2);
		}
	}
