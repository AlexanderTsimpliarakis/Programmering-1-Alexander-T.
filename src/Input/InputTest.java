package Input;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Enter name; ");
		String name = inputScanner.nextLine();
		System.out.println("Hello " + name);
		
		System.out.println("Enter your age");
		int age = inputScanner.nextInt();
		
		if (age > 120) {
			System.out.println("Get off the computer grampa ");
			System.exit(0);
		} else if(age < 5) {
			System.out.println("You must be older ");
			System.exit(0);
		}else {
		System.out.println("So your age is: " + age);
		}
		System.out.println("Enter your weight: ");
		double weight = inputScanner.nextDouble();
		if (weight > 99) {
			System.out.println("Go and eat a sallad ");
		} else {
		System.out.println("So your weight is: " + weight);
		}
	}

}
