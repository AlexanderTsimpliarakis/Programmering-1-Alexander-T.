package functions;

import java.util.Scanner;

/**
 * 
 * @author alexander.tsimpliar
 *
 */
public class CountAllVowels {

	/**
	 * 
	 * Funktionen beräknar alla vokaler i det man skriver in i konsolen.
	 */
	public static void main(String[] args) {
		countVowels(input());
	}

	/**
	 * 
	 * Den här funktionen körs i början när man startar koden vilket får
	 * användaren att skriva in ett ord/mening och som sedan skickar ut det till
	 * resten av koden med return.
	 */
	public static String input() {

		Scanner scanner = new Scanner(System.in);
		String word;
		System.out.println("Print in something");
		word = scanner.nextLine();
		return word;
	}

	/**
	 * 
	 * Funktionen här har en arraylist med alla vokaler förutom å, ä och ö även
	 * fast y inte är en vokal i engelskan. Summan börjar vid noll och både word
	 * och arrayen kommer att checkas där de sedan jämförs utan att man behöver
	 * tänka på stora och små bokstäver. Allt läggs sedan in i summan som
	 * printas ut till konsolen.
	 */
	public static void countVowels(String word) {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'y' };

		int sum = 0;

		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (("" + word.charAt(i)).equalsIgnoreCase("" + vowels[j]))
					sum++;
			}
		}
		System.out.println(sum);
	}
}