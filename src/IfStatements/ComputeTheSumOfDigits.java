/*package IfStatements;

import java.util.Scanner;

public class ComputeTheSumOfDigits {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Print a two digit number: ");
		int x = input.nextInt();
		int y;
		if ( x >= 10 && x <= 19 ) {
			y = 1;
		} else if ( x >= 20 && x <= 29 ) {
			y = 2;
		} else if ( x >= 30 && x <= 39 ) {
			y = 3;
		} else if ( x >= 40 && x <= 49 ) {
			y = 4;
		} else if ( x >= 50 && x <= 59 ) {
			y = 5;
		} else if ( x >= 60 && x <= 69 ) {
			y = 6;
		} else if ( x >= 70 && x <= 79 ) {
			y = 7;
		} else if ( x >= 80 && x <= 89 ) {
			y = 8;
		} else if ( x >= 90 && x <= 99 ) {
			y = 9;
		}else {
			y = 0;
		}
		
		int z = x % 10;
		
		System.out.println(y + z);
		


	}

}

*/
package IfStatements;

import java.util.Scanner;

public class ComputeTheSumOfDigits {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Print a two digit number: ");
		int x = input.nextInt();
		String sX = "" + x;
		int sum = 0;
		for (int i = 0; i < sX.length(); i++) {
			sum += Character.getNumericValue(sX.charAt(i));
		}

		System.out.println(sum);

	}

}