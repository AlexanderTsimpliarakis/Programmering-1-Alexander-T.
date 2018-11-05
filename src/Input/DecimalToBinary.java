package Input;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Print in a number between 1 and 16: ");
		
		int x = input.nextInt();
		
		if (x == 1) {
			System.out.println(1);
		} else if (x == 2) {
			System.out.println(10);
		} else if (x == 3) {
			System.out.println(11);
		} else if (x == 4) {
			System.out.println(100);
		} else if (x == 5) {
			System.out.println(101);
		} else if (x == 6) {
			System.out.println(110);
		} else if (x == 7) {
			System.out.println(111);
		} else if (x == 8) {
			System.out.println(1000);
		} else if (x == 9) {
			System.out.println(1001);
		} else if (x == 10) {
			System.out.println(1010);
		} else if (x == 11) {
			System.out.println(1011);
		} else if (x == 12) {
			System.out.println(1100);
		} else if (x == 13) {
			System.out.println(1101);
		} else if (x == 14) {
			System.out.println(1110);
		} else if (x == 15) {
			System.out.println(1111);
		} else if (x == 16) {
			System.out.println(10000);
		
		

		}
	}
}
	
