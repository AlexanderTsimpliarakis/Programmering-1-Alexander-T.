package Input;

import java.util.Scanner;

public class MultiplyTwoBinaryNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Print in a binary number with two digits: ");
		int x = input.nextInt();
		System.out.print("Print in another two digit binary number: ");
		int y = input.nextInt();
		int z = x + y;
		
			if (z == 20) {
				System.out.println(z - 20 + 100);
			}
			if (z == 22) {
				System.out.println(z + 1000 - 21);
			}
			else {
				System.out.println(x * y);
			}
				

	}

}
