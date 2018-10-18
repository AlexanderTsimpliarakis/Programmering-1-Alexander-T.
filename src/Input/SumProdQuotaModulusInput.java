package Input;

import java.util.Scanner;

public class SumProdQuotaModulusInput {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	      
	      System.out.print("Enter an integer: ");
	      int x = input.nextInt();
	      System.out.println("And another one: ");
	      int y = input.nextInt();
	      System.out.println("The positive summary is: " + (x + y));
	      System.out.println("The negative summary is: " + (x - y));
	      System.out.println("The product is: " + x * y);
	      System.out.println("The quota is: " + x / y);
	      System.out.println("The modulus is: " + x % y);

	}

}
