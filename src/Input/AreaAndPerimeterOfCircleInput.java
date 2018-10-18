package Input;

import java.util.Scanner;

public class AreaAndPerimeterOfCircleInput {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	      
	      System.out.print("Enter an integer: ");
	      int radius = input.nextInt();
	      System.out.println("The perimeter is: " + (radius + radius) * 3.14);
	      System.out.println("The area is: " + 3.14 * radius * radius);

	}

}
