//18.	how to remove the duplicate character from String? 
package strings_exp;

import java.util.Scanner;

public class RemoveDuplChar {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please Enter any String: ");
		String str = scanner.nextLine();
		String resultStr;
		char[] arrayofChar = str.toLowerCase().toCharArray();
		int len = arrayofChar.length;
		for (int i = 0; i < len; i++) {
			for (int j = 1 + i; j < len; j++) {
				if (arrayofChar[i] == arrayofChar[j]) {
					arrayofChar[j] = ' ';
					break;
				}
			}
		}
		resultStr = new String(arrayofChar);
		resultStr = resultStr.replaceAll("\\s", "");
		System.out.println(resultStr);
		scanner.close();

	}

}
