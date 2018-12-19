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
	 * Funktionen ber�knar alla vokaler i det man skriver in i konsolen.
	 */
	public static void main(String[] args) {
		countVowels(input());
	}

	/**
	 * 
	 * Den h�r funktionen k�rs i b�rjan n�r man startar koden vilket f�r
	 * anv�ndaren att skriva in ett ord/mening och som sedan skickar ut det till
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
	 * Funktionen h�r har en arraylist med alla vokaler f�rutom �, � och � �ven
	 * fast y inte �r en vokal i engelskan. Summan b�rjar vid noll och b�de word
	 * och arrayen kommer att checkas d�r de sedan j�mf�rs utan att man beh�ver
	 * t�nka p� stora och sm� bokst�ver. Allt l�ggs sedan in i summan som
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