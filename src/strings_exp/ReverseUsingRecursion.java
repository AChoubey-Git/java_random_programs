package strings_exp;

import java.util.Scanner;

public class ReverseUsingRecursion {

	public static String reverseStr(String str) {
		
		if(str.isEmpty()) {
			return str;
		}
		return reverseStr(str.substring(1)) + str.charAt(0);

	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please Enter any String: ");
		String str = scanner.nextLine();
		
		System.out.println("Reverse String: "+reverseStr(str));
		scanner.close();

	}

}
