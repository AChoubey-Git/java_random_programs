package java_array;

import java.util.Scanner;

public class Array_1 {
	
	public static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intarray=getinteger(5);
		
//		int[] intarray=new int[10];
//		for(int i=0;i<intarray.length;i++) {
//			intarray[i]=i*10;
//		}
		printarray(intarray);
		System.out.println("Average number: "+getaverage(intarray));
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

}
