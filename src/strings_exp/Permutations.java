//4.	How do you find all the permutations of a string? 

package strings_exp;
import java.util.Scanner;

public class Permutations {

	static void printPermutations(String str, String ans) {

		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			String ros = str.substring(0, i) + str.substring(i + 1);

			// Recurvise call
			printPermutations(ros, ans + ch);
		}
	}
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please Enter any String: ");
		String str = scanner.nextLine();

		printPermutations(str, "");

		scanner.close();
	}
}
