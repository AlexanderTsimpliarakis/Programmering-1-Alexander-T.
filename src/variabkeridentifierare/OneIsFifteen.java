package variabkeridentifierare;

import java.util.Scanner;

public class OneIsFifteen {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        System.out.print("Input the first integer number: ");
        int x = in.nextInt();  
		System.out.print("Input the second integer number: ");
        int y = in.nextInt(); 
        System.out.print("The result is: "+calculate(x, y));
		System.out.printf("\n");
    }

  public static boolean calculate(int x, int y)
   {
	if(x == 15 || y == 15)
		return true;
	return ((x + y) == 15 || Math.abs(x - y) == 15);
   }
}