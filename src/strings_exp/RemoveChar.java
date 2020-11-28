
//20.	How do you remove a given character from String? 
package strings_exp;

import java.util.Scanner;

public class RemoveChar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please Enter any String: ");
		String str = scanner.nextLine().toLowerCase();
		System.out.print("Enter a Character to Remove: ");
		String char1 = scanner.nextLine();
		char remChar = char1.charAt(0);
		
		str = str.replace(remChar,' ');
		System.out.println(str.replaceAll("\\s",""));
		scanner.close();

	}

}
