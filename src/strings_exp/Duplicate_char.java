package strings_exp;

import java.util.Scanner;

public class Duplicate_char {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please Enter any String: ");
		String str = scanner.nextLine();
		char[] arrayofChar = str.toLowerCase().toCharArray();
		int len  = arrayofChar.length;
		for (int i=0;i<len;i++) {
			for(int j=1+i;j<len;j++) {
				if(arrayofChar[i]==arrayofChar[j]) {
					System.out.print(arrayofChar[j]+" ");
					
					break;
				}
			}
		}
		scanner.close();
		
	}

}
