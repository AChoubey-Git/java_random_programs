//10.	How do you print the first non-repeated character from a string? 

package strings_exp;

import java.util.Scanner;

public class Non_Repeated_Char {
	static final int NO_OF_CHARS = 256;
	static char count[] = new char[NO_OF_CHARS];

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter any String: ");
		String givenstr = scanner.nextLine().toLowerCase();
		String str ="acds";
		int val = Integer.parseInt(str);
		System.out.println(val);
		char nonRepeaterChar = findNonRepeaterChar(givenstr);
		System.out.format("first non-repeated character from a string %s is %c ", givenstr, nonRepeaterChar);
		scanner.close();
	}
	private static char findNonRepeaterChar(String givenstr) {
		char resultChar = 0;
		char[] givenStrChar = givenstr.toCharArray();
		int len = givenStrChar.length;
		for (int i = 0; i < len; i++) {
			count[givenstr.charAt(i)]++;
		}
		for (int i = 0; i < len; i++) {
			if (count[givenstr.charAt(i)] == 1) {
				return givenstr.charAt(i);
			}
		}

		return resultChar;
	}
}
