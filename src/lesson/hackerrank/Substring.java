package lesson.hackerrank;

import java.util.Scanner;

public class Substring {

	public static String getSmallestAndLargest(String s, int k) {
        String str=s.substring(0,k);
    	String smallest = str;
        String largest = str;
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        //Input :welcometojava
        for(int i=k;i<s.length();i++) {
        	str=str.substring(1, k)+ s.charAt(i);
        	if(smallest.compareTo(str)>0) {
        		smallest=str; 
        	}
        	else if(largest.compareTo(str)<0) {
        		largest=str;
        	}
        	
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }

}
