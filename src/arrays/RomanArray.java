package arrays;

import java.util.Scanner;

public class RomanArray {

	public static void main(String[] args) {
		//char[] romNumbers = new char[7];
		
		char[] romNumbers = {'I', 'V', 'X', 'L', 'C', 'D', 'M' };
		int[] valRomNumbers = { 1, 5, 10, 50, 100, 500, 1000 };
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		char[] inputCharArray = input.toCharArray();
		
		System.out.println(inputCharArray);
		
		for (int i = 0; i < inputCharArray.length; i++){
			System.out.println(inputCharArray[i]);
			for (int j = 0; j < romNumbers.length; j++){
				System.out.println(romNumbers[j] + ": i = " + i + " :j = " + j);
			}
		}
		
		
	}

}
