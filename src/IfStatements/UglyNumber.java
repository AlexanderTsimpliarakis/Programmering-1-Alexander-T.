package IfStatements;

import java.util.Scanner;

public class UglyNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type in a number: ");
		
		int x = input.nextInt();
		
		if (x % 12 == 0) {
			System.out.println("This is not an ugly number");
		} else if (x % 10 == 0) {
			System.out.println("This is not an ugly number");
		} else if (x % 9 == 0) {
			System.out.println("This is not an ugly number");
		} else if (x % 8 == 0) {
			System.out.println("This is not an ugly number");
		} else if (x % 6 == 0) {
			System.out.println("This is not an ugly number");
		} else if (x % 5 == 0) {
			System.out.println("This is not an ugly number");
		} else if (x % 4 == 0) {
			System.out.println("This is not an ugly number");
		} else if (x % 3 == 0) {
			System.out.println("This is not an ugly number");
		} else if (x % 2 == 0) {
			System.out.println("This is not an ugly number");
		} else if (x == 1) {
			System.out.println("This is not an ugly number");
		} else {
			System.out.println("This is an ulgy number");
		}

	}

}
