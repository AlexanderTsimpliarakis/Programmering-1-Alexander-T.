package IfStatements;

import java.util.Scanner;

public class NumberIsOdd {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Print a number: ");
		int x = input.nextInt();
		
		if (x % 2 != 0) {
			System.out.println("This number is odd");
		} else {
			System.out.println("This number is even");
		}

	}

}
