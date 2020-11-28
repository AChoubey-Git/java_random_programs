
//19.	How to find the maximum occurring character in given String? 

package strings_exp;

import java.util.Scanner;

public class MaximumOccurringCharacter {
	static final int NO_OF_CHARS = 256;
	static char count[] = new char[NO_OF_CHARS];

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please Enter any String: ");
		//User input:
		String str = scanner.nextLine();
		
		//convert String To Array of characters. 
		char[] arrayofChar = str.toLowerCase().toCharArray();
		
		String ResofdupChar = findDuplicatedChar(arrayofChar);
		char[] arrofdupChar = ResofdupChar.toCharArray();
		char maxCountChar = maxOccurChar(arrofdupChar);
		System.out.format("maximum occurring character in given String is : %c",maxCountChar);
		scanner.close();

	}

	/**
	 *  findDuplicatedChar is method that take
	 * @param arrayofChar as a parameter input by User and
	 * @return All the char's in form of a String called arrayofdupChar.
	 */

	public static String findDuplicatedChar(char[] arrayofChar) {
		String arrayofdupChar = "";
		int len = arrayofChar.length;
		for (int i = 0; i < len; i++) {
			for (int j = 1 + i; j < len; j++) {
				if (arrayofChar[i] == arrayofChar[j]) {
					arrayofdupChar += arrayofChar[j];
					break;
				}
			}
		}
		return arrayofdupChar;

	}
	
	/**
	 * maxOccurChar is a method that's take
	 * @param arrofdupChar as a parameter return from findDuplicatedChar method.
	 * @return the maximum occurring character .
	 */
	private static char maxOccurChar(char[] arrofdupChar) {

		char maxchar = 0;
		for (int i = 0; i < arrofdupChar.length; i++) {
			count[arrofdupChar[i]]++;
		}
		int Maxtemp = count[arrofdupChar[0]];
		
		for (int i = 0; i < arrofdupChar.length; i++) {
			if (count[arrofdupChar[i]] > Maxtemp) {
				Maxtemp = count[arrofdupChar[i]];
				maxchar = arrofdupChar[i];
			}
		}

		return maxchar;
	}

}
