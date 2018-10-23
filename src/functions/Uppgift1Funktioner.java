package functions;

import java.util.Scanner;

public class Uppgift1Funktioner {

	public static void main(String[] args) {
		smallestAmongThree(input() );

	}
	public static int[] input() {
		Scanner scanner = new Scanner(System.in);
		int[] inputs = new int[3];
		System.out.print("Input the first number: ");
		inputs[0] = scanner.nextInt();
		System.out.print("Input the second number: ");
		inputs[1] = scanner.nextInt();
		System.out.print("Input the third number: ");
		inputs[2] = scanner.nextInt();
		return inputs;
	}
	
	public static void smallestAmongThree(int[] inputs) {
		int tempVar;
		if (inputs[0] < inputs[1]) {
			tempVar = inputs[0];
		} else {
			tempVar = inputs[1];
		}
		System.out.println("The smallest number is: ");
		if (tempVar < inputs[2]) {
			System.out.println(tempVar);
		} else {
			System.out.println(inputs[2]);
		}
		largestAmongThree(bigput() );

	}
	public static int[] bigput() {
		Scanner scanner = new Scanner(System.in);
		int[] inputs = new int[3];
		System.out.print("Input the first number: ");
		inputs[0] = scanner.nextInt();
		System.out.print("Input the second number: ");
		inputs[1] = scanner.nextInt();
		System.out.print("Input the third number: ");
		inputs[2] = scanner.nextInt();
		return inputs;
	}
	
	public static void largestAmongThree(int[] inputs) {
		int tempVar;
		if (inputs[0] < inputs[1]) {
			tempVar = inputs[1];
		} else {
			tempVar = inputs[0];
		}
		System.out.println("The largest number is: ");
		if (tempVar > inputs[2]) {
			System.out.println(tempVar);
		} else {
			System.out.println(inputs[2]);
		}
	}

}
