// 11.	How do you convert a given String into int like the atoi()? 
package strings_exp;

import java.util.Scanner;

public class StrToInt {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please Enter any String: ");
		String str = scanner.nextLine();
		System.out.println(myAtoi(str));
		scanner.close();

	}

	static int myAtoi(String str) {

		int res = 0;

		for (int i = 0; i < str.length(); ++i)
			res = res * 10 + str.charAt(i) - '0';

		return res;
	}

}
