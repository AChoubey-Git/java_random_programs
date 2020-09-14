package lesson.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
	    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println(strAnagram(a, b));
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

	private static ArrayList<String> strAnagram(String a, String b) {
		// TODO Auto-generated method stub
		
		char[] str1 = a.toCharArray();
		char[] str2 = b.toCharArray();
		
		String strA = new String(sort(str1));
		String strB = new String(sort(str2));
		ArrayList<String> strlist = new ArrayList<String>();
		strlist.add(strA);
		strlist.add(strB);
		
		return strlist;
	}

	private static char[] sort(char[] str1) {
		
		char[] tempstr=str1;
		char temp;
		for(int i=0;i<tempstr.length;i++) {
			for(int j=0;j<tempstr.length;j++) {
				if(tempstr[j]>tempstr[i]) {
					temp=tempstr[i];
					tempstr[i]=tempstr[j];
					tempstr[j]=temp;
				}
			}
		}
		return tempstr;
	}

	private static boolean isAnagram(String a, String b) {
		char[] str1 = a.toLowerCase().toCharArray();
		char[] str2 = b.toLowerCase().toCharArray();
		
		
		String strA = new String(sort(str1));
		String strB = new String(sort(str2));
		int len=strA.length()>=strB.length()? strA.length():strB.length();
		boolean flag=false;
		if(strA.regionMatches(true, 0, strB, 0, len)) {
			flag=true;
		}
		else {
			flag=false;
		}
		
		return flag;
	}
}


