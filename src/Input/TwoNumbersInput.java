package Input;

import java.util.Scanner;

public class TwoNumbersInput {

	public static void main(String[] args) {
	     
		Scanner input = new Scanner(System.in);
	      
	      System.out.print("Enter an integer: ");
	      int x = input.nextInt();
	      System.out.println("And another one: ");
	      int y = input.nextInt();
	      System.out.println("The product is: " + x * y);

	}

}
