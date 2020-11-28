
//9.	How do you count the occurrence of a given character in a string? 

package strings_exp;
import java.util.Scanner;

public class OccurrenceCheck {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter any String: ");
		String givenstr = scanner.nextLine().toLowerCase();
		System.out.print("Please enter serching Character: ");
		String givenchar = scanner.nextLine().toLowerCase();
		int occuranceOfChar;
		occuranceOfChar = checkOcuranceOfChar(givenstr, givenchar);
		System.out.format("Occurance of the  character %s is %d: ", givenchar, occuranceOfChar);
		scanner.close();

	}

	private static int checkOcuranceOfChar(String givenstr, String givenchar) {
		int count = 0;
		char strchar = givenchar.charAt(0);
		for (int i = 0; i < givenstr.length(); i++) {
			if (givenstr.charAt(i) == strchar) {
				count++;
			}
		}

		return count;
	}

}
