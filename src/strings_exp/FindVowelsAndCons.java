package strings_exp;

import java.util.Scanner;

public class FindVowelsAndCons {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please Enter any String: ");
		String str1 = scanner.nextLine();
		String str = str1.toLowerCase();
		int v_counts = 0, c_counts = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
					|| str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				v_counts++;
			} else if (str.charAt(i) >= 'a' || str.charAt(i) <= 'z') {
				c_counts++;
			}
		}

		System.out.println("Vowels: " + v_counts);
		System.out.println("consonants : " + c_counts);
		scanner.close();
	}
}
