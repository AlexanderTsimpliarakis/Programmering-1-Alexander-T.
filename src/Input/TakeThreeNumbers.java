package Input;

import java.util.Scanner;

public class TakeThreeNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	      
	      System.out.print("Enter an integer: ");
	      int x = input.nextInt();
	      System.out.println("And another one: ");
	      int y = input.nextInt();
	      System.out.print("And the last one: ");
	      int z = input.nextInt();
	      System.out.println("The aveerage value of the three numbers is: " + (x + y + z / 3));

	}

}
