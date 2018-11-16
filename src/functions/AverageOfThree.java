package functions;

import java.util.Scanner;

public class AverageOfThree {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Print in the first number: ");
		double x = scanner.nextDouble();
		System.out.print("Print in the second number: ");
		double y = scanner.nextDouble();
		System.out.print("Print in the third number: ");
		double z = scanner.nextDouble();
		
		System.out.print("The average is: ");
				System.out.print((x + y + z) / 3);
		

	}

}
