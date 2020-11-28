//1.	How do you reverse a given string in place? 

package strings_exp;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please Enter any String: ");
		String str = scanner.nextLine();

		StringBuilder sb = new StringBuilder(str);
		sb.reverse();

		System.out.println(sb.toString());

		scanner.close();

	}
}
