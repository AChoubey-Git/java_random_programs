package lesson.hackerrank;

import java.util.Scanner;

public class StringToken {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s=s.trim();
        String delimiter="[^a-zA-Z]+";
        String[] strtoken=s.split(delimiter);
        if(s.length()!=0) {
        	System.out.println(strtoken.length);
        }
        else {
        	System.out.println(0);
        }
        for(String a:strtoken) {
        	System.out.println(a);
        }
        scan.close();
    }

}
