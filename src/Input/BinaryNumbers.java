package Input;

import java.util.Scanner;

public class BinaryNumbers {

	public static void main(String[] args) {
		
		int x= inputScanner.nextLine();
		int y= inputScanner.nextLine();
		int z=x+y;

		System.out.println(x + "+" + y + "=" + z);

		System.out.println(Integer.toBinaryString(x) + "+" + Integer.toBinaryString(y)
		         + "=" + Integer.toBinaryString(z));
	}

}
