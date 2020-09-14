package java_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static Scanner scanner=new Scanner(System.in);
	private static NumberList numlist =new NumberList();
	private static ArrayList<Integer> sortedlist = new ArrayList<Integer>();
	private static List<Integer> newlist=new ArrayList<Integer>();
	final static int max=6;
	static int k;
	static boolean flag;

	public static void main(String[] args) {
    
		// Entry of Integer values into ArrayList.
		System.out.println("Enter numbers into ArrayList:");
		for(int i=0;i<max;i++) {
			addnumber();
		}
		scanner.nextLine();
		System.out.println("Enter the difference value of pairs:  ");
		k=scanner.nextInt();
		scanner.nextLine();
		numlist.printlist();
		copyall();//copy the entire list into other list.
		flag=findDuplicate(newlist);// To find out the duplicated elements form the ArrayList  
		if(flag) {
			sortedlist=new ArrayList<>(new LinkedHashSet<>(newlist));//remove the duplicated elements from ArrayList. 
			//and saved into new ArrayList
		}
		else {
			sortedlist.addAll(numlist.getListofInt());
		}
		//System.out.println(sortedlist);//for Enquiry
		Collections.sort(sortedlist);
		//System.out.println(sortedlist.toString());
		System.out.println("number of pairs with difference "+k+" is :"+check());
	}
	
	@Override
	public String toString() {
		return "Main [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public static void addnumber() {
		numlist.addnumber(scanner.nextInt());
	}
	public static int check() {
		int count=0,diff1,diff2;
		for(int i=0;i<sortedlist.size();i++) {
			for(int j=i+1;j<sortedlist.size();j++) {
				
				diff1=sortedlist.get(i)-sortedlist.get(j);
				diff2=sortedlist.get(j)-sortedlist.get(i);
				if(diff1==k||diff2==k) {
					count++;
			}
			}	
		}
		return count;
	}
	
	public static void copyall() {
		newlist.addAll(numlist.getListofInt());
	}
	public static boolean findDuplicate( List<Integer> numlist2){
		boolean flag=false;
		for(int i=0;i<numlist2.size();i++) {
			for(int j=i+1;j<numlist2.size();j++) {
				if(numlist2.get(i)==numlist2.get(j)) {
					
					flag=true;
				}
			}
		}
		return flag;
	}
	
}
