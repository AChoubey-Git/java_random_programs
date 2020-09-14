//Java Strings Introduction
package lesson.hackerrank;

import java.io.*;
import java.util.*;

public class Intro {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        String capA,capB;
        /* Enter your code here. Print output to STDOUT. */
        /*
         * There are three lines of output:
         * For the first line, sum the lengths of A and B .
         * For the second line, write Yes if A is (When sorted) alphabetically/lexicographically,/lexicographically greater than B otherwise print No instead.
         * For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space
         * 
         */
        
        int sumoflen=A.length()+B.length();
        System.out.println(sumoflen);
        if(A.compareTo(B)>B.compareTo(A)) {
        	System.out.println("Yes");
        }
        else {
        	System.out.println("No");
        }
        capA=A.substring(0, 1).toUpperCase() + A.substring(1);
        capB=B.substring(0, 1).toUpperCase()+ B.substring(1);
        System.out.println(capA +" "+capB);
        
        sc.close();

	}

}
