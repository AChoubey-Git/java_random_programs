package java_string_var2;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		/*
		  * 	................INSTRUCTIONS.................... 
		  * 	1. ENTER SIZEOF THE ARRAYLIST [VARIABLE] MAX;
		  * 	2. ENTER STRINGS  INTO ARRAYLIST [LIST_VARIABLE] STRLIST;
		  * 		USING STRLIST.ADD(STRING) FOR ADDING THE STRINGS INTO LIST;
		  * 
		  * 
		  * 
		  * 
		  * */
//		long start=System.currentTimeMillis();
		Scanner scanner= new Scanner(System.in);
		ArrayList<String> strlist =new ArrayList<String>();
		 int max;
		/*
		 * 		1. ENTER SIZEOF THE ARRAYLIST [VARIABLE] MAX;
		  * 	2. ENTER STRINGS  INTO ARRAYLIST [LIST_VARIABLE] STRLIST;
		 * 
		 * */
		 
		System.out.print("Enter the size of an Arraylist:");
		max=scanner.nextInt();
		System.out.format("Enter %d String into ArrayList:",max);
		scanner.nextLine();
		
		/*
		 * 	USING STRLIST.ADD(STRING) 
		 * 					FOR ADDING THE STRINGS INTO LIST;
		 * 
		 * */
		
		for(int i=0;i<max;i++) {
			strlist.add(scanner.nextLine());
		}
		/*		System.out.println(strlist); PRINTING ARRARYLIST
		 * 		
		 * */
		System.out.println(strlist);
		
		/*
		 * 	..........WORDCOUNT CLASS.........
		 * 		FUNCTIONS:
		 * 				COUNTWORD(STRING PARAMETER) : FOR COUNT THE DISTINCT CHARACTER 
		 * 					AND RETURN THE COUNT VALUE;
		 * 
		 * */
		for(int i=0;i<strlist.size();i++) {
			WordCount wordcount = new WordCount();
			System.out.println("String: ["+strlist.get(i)+"] & Count of similar word:"+wordcount.countword(strlist.get(i)));
		}
		scanner.close();
//		long end=System.currentTimeMillis();
//		float sec = (end - start) / 1000F;
//		System.out.println(sec);

	}
}

/*
 * 
 * ...........................OUTPUT....................
 * Enter the size of an Arraylist:2
		Enter 2 String into ArrayList:abaabc
		abaabcabedacdae
		[abaabc, abaabcabedacdae]
		abaabc
		baabc
		aabc
		abc
		bc
		c
		
		String: [abaabc] & Count of similar word:9
		abaabcabedacdae
		baabcabedacdae
		aabcabedacdae
		abcabedacdae
		bcabedacdae
		cabedacdae
		abedacdae
		bedacdae
		edacdae
		dacdae
		acdae
		cdae
		dae
		ae
		e
		
		String: [abaabcabedacdae] & Count of similar word:22

 * 
 * 
 * */
