package java_array;

import java.util.ArrayList;
import java.util.Collections;

public class NumberList {

	private ArrayList<Integer> listofInt = new ArrayList<Integer>();
	private ArrayList<Integer> sortlistofInt = new ArrayList<Integer>();
	public void addnumber(int num) {
		listofInt.add(num);
	}
	
	public void printlist() {
		for(int i=0;i<listofInt.size();i++) {
			System.out.print(listofInt.get(i)+" ");
		}
		System.out.println("\r");
	}
	public void sortprintlist() {
		for(int i=0;i<sortlistofInt.size();i++) {
			System.out.print(sortlistofInt.get(i)+" ");
		}
		System.out.println("\r");
	}
	public int sizeof() {
		return sortlistofInt.size();
	}
	public int fatchnum(int index) {
		return sortlistofInt.get(index);
	}
	public void copyltol() {
		Collections.copy(sortlistofInt, listofInt);
	}
	
	public ArrayList<Integer> sortlist(){
		Collections.sort(sortlistofInt);
		return (sortlistofInt);
		
	}
}
