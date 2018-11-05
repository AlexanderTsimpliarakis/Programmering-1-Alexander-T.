package IfStatements;

import java.util.Scanner;

public class RandomIntegers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Print in the minimal number: ");
		int x = input.nextInt();
		System.out.print("Print in the maximal number: ");
		int y = input.nextInt();
		
		if (x > y) {
			System.out.println("Invalid");
		}
		
		
		

	}

}
