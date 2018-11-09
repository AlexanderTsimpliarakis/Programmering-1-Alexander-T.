package IfStatements;

import java.util.Scanner;

public class CompareTwoNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		if (x == y) {
			System.out.println("The numbers are the same");
		}
		else if (x < y) {
			System.out.print("This is not the same numbers");
			System.out.print("The first number is smaller than the second number");
		} else {
			System.out.print("This is not the same numbers");
			System.out.print("The second number is smaller than the first number");
		}

	}

}
