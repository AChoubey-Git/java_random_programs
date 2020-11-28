//14.	How do you check if a given string is a palindrome? 
package strings_exp;

import java.util.Scanner;

public class StringPalindromCheck {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please Enter any String: ");
		String str = scanner.nextLine().toLowerCase();

		StringBuilder sb = new StringBuilder(str);
		StringBuilder tempstr = sb.reverse();
		String revStr = tempstr.toString();

		if(str.equals(revStr)) {
			System.out.println("Palindrome String");
		}
		else {
			System.out.println("Not a Palindrome String");
		}
		
		scanner.close();

	}

}
