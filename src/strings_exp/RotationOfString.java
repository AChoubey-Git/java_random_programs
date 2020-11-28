// 13.	How do you check if two strings are a rotation of each other? 
package strings_exp;

import java.util.Scanner;

public class RotationOfString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please Enter 1st String: ");
		String str1 = scanner.nextLine();
		System.out.print("Please Enter 2nd String: ");
		String str2 = scanner.nextLine();
		if(areRotations(str1, str2)) {
			System.out.println("two strings are a rotation of each other");
		}
		else {
			System.out.println("two strings are not rotation of each other");
		}
		scanner.close();
		
	}
	
	static boolean areRotations(String str1, String str2) 
    { 
         
        return (str1.length() == str2.length()) && 
               ((str1 + str1).indexOf(str2) != -1); 
    } 

}
