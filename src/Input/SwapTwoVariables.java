package Input;

import java.util.Scanner;

public class SwapTwoVariables {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int c;
		System.out.println("Type in x variable");
		int x = input.nextInt();
		System.out.println("And y variable");
		int y = input.nextInt();
		if (x == y) {
			System.exit(0);
		}
		c = x;
		x = y;
		y = c;
		System.out.println("x: " + x);
		System.out.println("y: " + y);

	}

}
