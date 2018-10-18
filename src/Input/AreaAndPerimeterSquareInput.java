package Input;

import java.util.Scanner;

public class AreaAndPerimeterSquareInput {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	      
	      System.out.print("Enter an integer: ");
	      int base = input.nextInt();
	      System.out.println("And another one: ");
	      int height = input.nextInt();
	      System.out.println("The perimeter is: " + (base + height));
	      System.out.println("The area is: " + base * height);

	}

}
