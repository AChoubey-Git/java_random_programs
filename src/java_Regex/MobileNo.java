/*
 * TO validate 10 digit mobile numbers using the following rules:
 * 						Rules:
 * 1: Each number should contain exactly 10 digit.
 * 2: The first digit should be 7,8 and 9.>.. [7-9]
 *   
 *   
 *   pattern="[7-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][]"; 
 *   in short: [7-9][0-9]{9} OR [789][0-9]{9}
 *   
 * 3: 10 digit or 11 digit:
 * 		if it is 11 digit number then the first digit is '0';
 *  pattern = "0?[7-9][0-9]{9} ";
 *  
 *  4:10 digit or 12 digit:
 * 		if it is 12 digit number then the first digit is '91';
 * pattern = "(0|91)?[7-9][0-9]{9} ";
 * */
package java_Regex;

import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class MobileNo {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
	  boolean flag = true;
		while(flag){
			String MobileNo=in.next();
			try {
				boolean matcher= MobileNo.matches("(0|91)?[7-9][0-9]{9}");
				System.out.println("MobileNo:"+MobileNo+".."+matcher);
				flag=matcher;
			}
			catch(PatternSyntaxException e) {
				flag=false;
			}
			
		}
		in.nextLine();
		in.close();
	}
}
