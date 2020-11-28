/**
 * 12.	How do you reverse words in a given sentence 
 * without using any library method? 
 */
package strings_exp;

import java.util.Scanner;

public class ReverseStringWithoutLib {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please Enter any String: ");
		
		String str = scanner.nextLine();

		System.out.format("String reverse from %s To %s ",
				str, ReverseStr(str));
		scanner.close();
	}

	/**
	 * ReverseStr is reverse the given string and return the RevString.
	 * @param str 
	 * @return RevString  
	 */
	private static String ReverseStr(String str) {
		String RevString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			RevString += str.charAt(i);
		}

		return RevString;
	}

}
