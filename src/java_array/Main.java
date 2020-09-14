package java_array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	private static Scanner scanner=new Scanner(System.in);
	private static NumberList numlist =new NumberList();
	private static NumberList sortlistofInt = new NumberList();
	final static int max=6;
	final static int k=2;
	

	public static void main(String[] args) {
    
		System.out.println("Enter numbers into ArrayList:");
		for(int i=0;i<max;i++) {
			addnumber();
		}
		numlist.printlist();
		numlist.copyltol();
		//sortlistofInt.sortlist();
		//Collections.sort(sortlistofInt);
		sortlistofInt.sortprintlist();
//		int size=numlist.fatchnum(1+1)-numlist.fatchnum(1);
//		System.out.println(size);
//		int count=check();
		System.out.println("number of pairs with difference "+k+" is :"+check());
	}
	
	public static void addnumber() {
		//System.out.print("Enter numbers into ArrayList:");
		numlist.addnumber(scanner.nextInt());
	}
	public static int check() {
		int count=0,diff1,diff2;
		for(int i=0;i<sortlistofInt.sizeof();i++) {
			for(int j=i+1;j<sortlistofInt.sizeof();j++) {
				
				diff1=numlist.fatchnum(i)-numlist.fatchnum(j);
				diff2=numlist.fatchnum(j)-numlist.fatchnum(i);
				if(diff1==k||diff2==k) {
					count++;
			}
			}
			
		}
		return count;
	}
	
	
}
