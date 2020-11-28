package strings_exp;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please Enter any String: ");
		String str = scanner.nextLine();

		System.out.println(finddigits(str));
		scanner.close();
	}

	private static boolean finddigits(String str) {

		// Using Regex for validation.
		String pattern = "[0-9]+";

		return str.matches(pattern);
	}

}
