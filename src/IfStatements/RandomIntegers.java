package IfStatements;

import java.util.Random;
import java.util.Scanner;

public class RandomIntegers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("Print in the minimal number: ");
		int x = input.nextInt();
		System.out.print("Print in the maximal number: ");
		int y = input.nextInt();
		
		 (int i = x; i < y; i++) {
			anyRandomInt(random);
		}

	}

}
