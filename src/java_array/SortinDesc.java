package java_array;

import java.util.Arrays;
import java.util.Scanner;

public class SortinDesc {

	public static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intarray=getinteger(5);
		int[] sortarray=sortIntegers(intarray);
		printarray(sortarray);
		//System.out.println("Average number: "+getaverage(intarray));
	}
	public static int[] getinteger(int number) {
		System.out.println("Enter "+ number + "values into array.\r");
		int[] values = new int[number];
		for(int i=0;i<values.length;i++) {
			values[i]=scanner.nextInt();
		}
		return values;
		
	}
	public static void printarray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.println("The element in array index "+i+"is: "+array[i]);
		}
	}
	public static double getaverage(int[] array) {
		int sum=0;
		double avg;
		for(int i=0;i<array.length;i++) {
			sum =array[i]+sum;
		}
		avg=(sum/array.length);
		return avg;
	}
	//{12,3,33,5,11}={33,12,11,5,3}
	public static int[] sortIntegers(int[] array) {
//		int[]sortarray=new int[array.length];
//		for(int i=0;i<array.length;i++) {
//			sortarray[i]=array[i];
//		}
		int[]sortarray=Arrays.copyOf(array, array.length);
		boolean flag=true;
		int temp;
		while(flag) {
			flag=false;
			for(int i=0;i<sortarray.length-1;i++) {
				if(sortarray[i]>sortarray[i+1]) {
					temp=sortarray[i];
					sortarray[i]=sortarray[i+1];
					sortarray[i+1]=temp;
					flag=true;
				}
			}
		}
		return sortarray;
		
		
	}
//	public static int check() {
//		int count=0,diff1,diff2;
//		for(int i=0;i<numlist.sizeof();i++) {
//			for(int j=i+1;j<numlist.sizeof();j++) {
//				
//				diff1=numlist.fatchnum(i)-numlist.fatchnum(j);
//				diff2=numlist.fatchnum(j)-numlist.fatchnum(i);
//				if(diff1==k||diff2==k) {
//					count++;
//			}
//			}
//			
//		}
//		return count;
//	}

}

